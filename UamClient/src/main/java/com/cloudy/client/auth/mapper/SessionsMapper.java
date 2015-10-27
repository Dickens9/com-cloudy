package com.cloudy.client.auth.mapper;

import com.cloudy.client.auth.entity.Sessions;

public abstract interface SessionsMapper
{
  public abstract int deleteByPrimaryKey(String paramString);

  public abstract int insert(Sessions paramSessions);

  public abstract int insertSelective(Sessions paramSessions);

  public abstract Sessions selectByPrimaryKey(String paramString);

  public abstract int updateByPrimaryKeySelective(Sessions paramSessions);

  public abstract int updateByPrimaryKeyWithBLOBs(Sessions paramSessions);

  public abstract int updateByPrimaryKey(Sessions paramSessions);
}