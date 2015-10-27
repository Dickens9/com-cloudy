package com.cloudy.client.auth.remote.impl;

import org.apache.shiro.SecurityUtils;

import com.cloudy.uam.auth.remote.UamCrossAppSessionService;
import com.cloudy.uam.auth.remote.vo.SessionUser;

public class UamCrossAppSessionServiceClient
  implements UamCrossAppSessionService
{
  private UamCrossAppSessionService uamCrossAppSessionServiceServer;

  public Object getObjectFrom(String key)
  {
    return getObjectFrom(extractSsoSessionId(), key);
  }

  public Object getObjectFrom(String sessionId, String key)
  {
    return this.uamCrossAppSessionServiceServer.getObjectFrom(sessionId, key);
  }

  public void putObjectInto(String key, Object object)
  {
    this.uamCrossAppSessionServiceServer.putObjectInto(extractSsoSessionId(), key, object);
  }

  public void putObjectInto(String sessionId, String key, Object object)
  {
    this.uamCrossAppSessionServiceServer.putObjectInto(sessionId, key, object);
  }

  public void setUamCrossAppSessionServiceServer(UamCrossAppSessionService uamCrossAppSessionServiceServer)
  {
    this.uamCrossAppSessionServiceServer = uamCrossAppSessionServiceServer;
  }

  private String extractSsoSessionId()
  {
    SessionUser sessionUser = (SessionUser)SecurityUtils.getSubject().getPrincipal();
    return sessionUser.getSsoSessionId();
  }
}