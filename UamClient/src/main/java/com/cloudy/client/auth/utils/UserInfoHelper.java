package com.cloudy.client.auth.utils;
import org.apache.shiro.SecurityUtils;

import com.cloudy.uam.userorg.remote.vo.User;

public class UserInfoHelper
{
  public static String getCurrentUserId()
  {
    User user = (User)SecurityUtils.getSubject().getPrincipal();

    if (user == null) return null;
    return user.getId();
  }

  public static String getCurrentUserName()
  {
    User user = (User)SecurityUtils.getSubject().getPrincipal();

    if (user == null) return null;
    return user.getUsername();
  }
}
