package com.cloudy.client.auth.repository;

import java.io.Serializable;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.CachingSessionDAO;

public class NoneSessionRepository extends CachingSessionDAO
{
  protected void doUpdate(Session session)
  {
  }

  protected void doDelete(Session session)
  {
  }

  protected Serializable doCreate(Session session)
  {
    return "NOCACHE";
  }

  protected Session doReadSession(Serializable sessionId)
  {
    return null;
  }
}
