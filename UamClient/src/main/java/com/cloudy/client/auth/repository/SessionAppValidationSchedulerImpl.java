package com.cloudy.client.auth.repository;

import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.AbstractValidatingSessionManager;
import org.apache.shiro.session.mgt.DefaultSessionKey;
import org.apache.shiro.session.mgt.SessionKey;
import org.apache.shiro.session.mgt.SessionValidationScheduler;
import org.apache.shiro.session.mgt.ValidatingSessionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.ReflectionUtils;

public class SessionAppValidationSchedulerImpl
  implements SessionValidationScheduler, Runnable
{

  @Autowired
  private JdbcTemplate jdbcTemplate;
  private static final Logger log = LoggerFactory.getLogger(SessionAppValidationSchedulerImpl.class);
  ValidatingSessionManager sessionManager;
  private ScheduledExecutorService service;
  private long interval = 3600000L;
  private boolean enabled = false;

  public ValidatingSessionManager getSessionManager()
  {
    return this.sessionManager;
  }

  public void setSessionManager(ValidatingSessionManager sessionManager) {
    this.sessionManager = sessionManager;
  }

  public long getInterval() {
    return this.interval;
  }

  public void setInterval(long interval) {
    this.interval = interval;
  }

  public boolean isEnabled() {
    return this.enabled;
  }

  public void enableSessionValidation()
  {
    if (this.interval > 0L) {
      this.service = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() {
        public Thread newThread(Runnable r) {
          Thread thread = new Thread(r);
          thread.setDaemon(true);
          return thread;
        }
      });
      this.service.scheduleAtFixedRate(this, this.interval, this.interval, TimeUnit.MILLISECONDS);
      this.enabled = true;
    }
  }

  public void run() {
    if (log.isDebugEnabled()) {
      log.debug("Executing session validation...");
    }
    long startTime = System.currentTimeMillis();

    String sql = "select session from sessions limit ?,?";
    int start = 0;
    int size = 20;
    List<String> sessionList = this.jdbcTemplate.queryForList(sql, String.class, new Object[] { Integer.valueOf(start), Integer.valueOf(size) });
    while (sessionList.size() > 0) {
      for (String sessionStr : sessionList)
        try {
          Session session = null;
          Method validateMethod = ReflectionUtils.findMethod(AbstractValidatingSessionManager.class, "validate", new Class[] { Session.class, SessionKey.class });
          validateMethod.setAccessible(true);
          ReflectionUtils.invokeMethod(validateMethod, this.sessionManager, new Object[] { session, new DefaultSessionKey(session.getId()) });
        }
        catch (Exception e)
        {
        }
      start += size;
      sessionList = this.jdbcTemplate.queryForList(sql, String.class, new Object[] { Integer.valueOf(start), Integer.valueOf(size) });
    }

    long stopTime = System.currentTimeMillis();
    if (log.isDebugEnabled())
      log.debug("Session validation completed successfully in " + (stopTime - startTime) + " milliseconds.");
  }

  public void disableSessionValidation()
  {
    this.service.shutdownNow();
    this.enabled = false;
  }
}
