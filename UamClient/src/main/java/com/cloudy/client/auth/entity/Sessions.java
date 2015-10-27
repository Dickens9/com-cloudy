package com.cloudy.client.auth.entity;

public class Sessions
{
  private String id;
  private String session;
  private String sessionclob;

  public String getId()
  {
    return this.id;
  }

  public void setId(String id) {
    this.id = ((id == null) ? null : id.trim());
  }

  public String getSession() {
    return this.session;
  }

  public void setSession(String session) {
    this.session = ((session == null) ? null : session.trim());
  }

  public String getSessionclob() {
    return this.sessionclob;
  }

  public void setSessionclob(String sessionclob) {
    this.sessionclob = ((sessionclob == null) ? null : sessionclob.trim());
  }
}
