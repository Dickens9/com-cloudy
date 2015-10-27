package com.cloudy.client.auth.remote.impl;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import com.cloudy.common.exception.BusinessException;
import com.cloudy.uam.auth.remote.UamCrossAppSessionService;
import com.cloudy.uam.auth.remote.UamSessionService;
import com.cloudy.uam.auth.remote.vo.SessionUser;
import com.cloudy.uam.userorg.remote.UamUserOrgService;
import com.cloudy.uam.userorg.remote.vo.Job;
import com.cloudy.uam.userorg.remote.vo.Org;
import com.cloudy.uam.userorg.remote.vo.UserOrgJob;

public class UamSessionServiceClient
  implements UamSessionService
{
  private UamUserOrgService uamUserOrgServiceClient;
  private UamCrossAppSessionService uamCrossAppSessionServiceServer;

  public SessionUser getSessionUser()
  {
    Subject subject = SecurityUtils.getSubject();
    SessionUser sessionUser = (SessionUser)subject.getSession().getAttribute("SESSION_USER");
    if (sessionUser == null) {
      sessionUser = (SessionUser)subject.getPrincipal();
      subject.getSession().setAttribute("SESSION_USER", sessionUser);
    }
    return sessionUser;
  }

  public void putIntoSession(String key, Object value)
  {
    Subject subject = SecurityUtils.getSubject();
    subject.getSession().setAttribute(key, value);
  }

  public Object getFromSession(String key)
  {
    Subject subject = SecurityUtils.getSubject();
    return subject.getSession().getAttribute(key);
  }

  public void removeFromSession(String key)
  {
    Subject subject = SecurityUtils.getSubject();
    subject.getSession().removeAttribute(key);
  }

  public void logout()
    throws BusinessException
  {
    Subject subject = SecurityUtils.getSubject();
    subject.logout();
  }

  public void changSessionOrgAndJob(String orgId, String jobId)
  {
    SessionUser sessionUser = getSessionUser();
    if (checkCanChange(sessionUser.getId(), orgId, jobId)) {
      Job job = this.uamUserOrgServiceClient.getJobById(jobId);
      Org org = this.uamUserOrgServiceClient.getOrgById(orgId);

      sessionUser.setServiceJobId(jobId);
      sessionUser.setServiceJobName(job.getJobName());
      sessionUser.setServiceDepId(orgId);
      sessionUser.setServiceDepName(org.getOrgName());

      this.uamCrossAppSessionServiceServer.putObjectInto("SESSION_USER", sessionUser);
    }
    else {
      throw new BusinessException("用户不具有此岗位");
    }
  }

  private boolean checkCanChange(String userId, String orgId, String jobId)
  {
    List<UserOrgJob> userOrgJobs = this.uamUserOrgServiceClient.getUserOrgJobByUserId(userId);
    boolean result = false;
    for (UserOrgJob uoj : userOrgJobs) {
      if ((uoj.getJobId().equals(jobId)) && (uoj.getOrgId().equals(orgId))) {
        result = true;
        break;
      }
    }
    return result;
  }

  public void setUamUserOrgServiceClient(UamUserOrgService uamUserOrgServiceClient) {
    this.uamUserOrgServiceClient = uamUserOrgServiceClient;
  }

  public void setUamCrossAppSessionServiceServer(UamCrossAppSessionService uamCrossAppSessionServiceServer)
  {
    this.uamCrossAppSessionServiceServer = uamCrossAppSessionServiceServer;
  }
}