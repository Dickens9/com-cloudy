package com.cloudy.client.auth.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cloudy.common.utils.SpringUtils;
import com.cloudy.uam.auth.remote.UamSessionService;

public class ShiroSingleSignOutListener
  implements HttpSessionListener
{
  private Logger logger;

  public ShiroSingleSignOutListener()
  {
    this.logger = LoggerFactory.getLogger(super.getClass());
  }

  public void sessionCreated(HttpSessionEvent se)
  {
  }

  public void sessionDestroyed(HttpSessionEvent se)
  {
    this.logger.debug("ShiroSingleSignOut sessionid:" + se.getSession().getId());
    ((UamSessionService)SpringUtils.getBean(UamSessionService.class)).logout();

    this.logger.debug(SecurityUtils.getSubject().getSession().getId().toString());
  }
}