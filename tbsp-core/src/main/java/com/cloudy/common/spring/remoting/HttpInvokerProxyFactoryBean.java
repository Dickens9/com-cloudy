package com.cloudy.common.spring.remoting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.cloudy.uam.permission.remote.UamPermissionService;
import com.cloudy.uam.permission.remote.vo.App;

public class HttpInvokerProxyFactoryBean extends org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean
{

  @Autowired
  @Qualifier("uamPermissionServiceClient")
  private UamPermissionService uamPermissionService;
  private String appName;

  public String getAppName()
  {
    return this.appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public void afterPropertiesSet()
  {
    App app = this.uamPermissionService.getAppByAppName(this.appName);
    String serviceUrl = super.getServiceUrl();
    super.setServiceUrl(app.genAbsoluteUrl() + serviceUrl);
    super.afterPropertiesSet();
  }
}