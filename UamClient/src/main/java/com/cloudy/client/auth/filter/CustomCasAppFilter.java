package com.cloudy.client.auth.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.cas.CasFilter;
import org.apache.shiro.cas.CasToken;

public class CustomCasAppFilter extends CasFilter
{
  private static final String TICKET_PARAMETER = "ticket";

  protected AuthenticationToken createToken(ServletRequest request, ServletResponse response)
    throws Exception
  {
    HttpServletRequest httpRequest = (HttpServletRequest)request;
    String ticket = httpRequest.getParameter("ticket");
    return new CasToken(ticket);
  }
}