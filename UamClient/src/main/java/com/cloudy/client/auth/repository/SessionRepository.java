package com.cloudy.client.auth.repository;

import java.io.Serializable;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.ValidatingSession;
import org.apache.shiro.session.mgt.eis.CachingSessionDAO;

import com.cloudy.client.auth.entity.Sessions;
import com.cloudy.client.auth.mapper.SessionsMapper;

public class SessionRepository extends CachingSessionDAO
{
  private SessionsMapper sessionsMapper;
  private Map<String, Sessions> cache;

  public SessionRepository()
  {
    this.cache = new HashedMap();
  }

  protected Serializable doCreate(Session session) {
    Serializable sessionId = generateSessionId(session);
    assignSessionId(session, sessionId);

    Sessions sessions = new Sessions();
    sessions.setId(sessionId.toString());
    sessions.setSessionclob(SerializableUtils.serialize(session));

    this.cache.put(sessionId.toString(), sessions);

    return session.getId();
  }

  protected void doUpdate(Session session) {
    if ((session instanceof ValidatingSession) && (!((ValidatingSession)session).isValid())) {
      return;
    }

    Sessions sessions = new Sessions();
    sessions.setId(session.getId().toString());
    sessions.setSessionclob(SerializableUtils.serialize(session));

    this.cache.put(sessions.getId(), sessions);
  }

  protected void doDelete(Session session)
  {
    this.cache.remove(session.getId().toString());
  }

  protected Session doReadSession(Serializable sessionId)
  {
    Sessions sessions = (Sessions)this.cache.get(sessionId.toString());
    if ((sessions == null) || (sessions.getSessionclob() == null)) return null;

    return SerializableUtils.deserialize(sessions.getSessionclob());
  }
}
