package com.cloudy.client.userorg.remote.impl;

import java.util.List;
import java.util.Map;

import com.cloudy.uam.userorg.remote.UamUserOrgService;
import com.cloudy.uam.userorg.remote.vo.CompanyShop;
import com.cloudy.uam.userorg.remote.vo.Job;
import com.cloudy.uam.userorg.remote.vo.Org;
import com.cloudy.uam.userorg.remote.vo.User;
import com.cloudy.uam.userorg.remote.vo.UserOrgJob;

public class UamUserOrgServiceClient
  implements UamUserOrgService
{
  private UamUserOrgService uamUserOrgServiceServer;

  public User getUserById(String userId)
  {
    return this.uamUserOrgServiceServer.getUserById(userId);
  }

  public User getUserByUsername(String username)
  {
    return this.uamUserOrgServiceServer.getUserByUsername(username);
  }

  public Org getOrgByCode(String code)
  {
    return this.uamUserOrgServiceServer.getOrgByCode(code);
  }

  public Job getJobById(String id)
  {
    return this.uamUserOrgServiceServer.getJobById(id);
  }

  public List<User> getUserByJobId(String jobId)
  {
    return this.uamUserOrgServiceServer.getUserByJobId(jobId);
  }

  public List<User> getUserByBelongOrgId(String orgId)
  {
    return this.uamUserOrgServiceServer.getUserByBelongOrgId(orgId);
  }

  public List<User> getUserByServiceOrgId(String orgId)
  {
    return this.uamUserOrgServiceServer.getUserByServiceOrgId(orgId);
  }

  public List<User> getUserByOrgIdAndJobId(String orgId, String jobId)
  {
    return this.uamUserOrgServiceServer.getUserByOrgIdAndJobId(orgId, jobId);
  }

  public Org getOrgById(String orgId)
  {
    return this.uamUserOrgServiceServer.getOrgById(orgId);
  }

  public List<Org> getOrgByParentId(String parentId)
  {
    return this.uamUserOrgServiceServer.getOrgByParentId(parentId);
  }

  public List<Org> getOrgByParentCode(String parentCode)
  {
    return this.uamUserOrgServiceServer.getOrgByParentCode(parentCode);
  }

  public Org getComapnyByOrgId(String orgId)
  {
    return this.uamUserOrgServiceServer.getComapnyByOrgId(orgId);
  }

  public List<UserOrgJob> getUserOrgJobByUserId(String userId)
  {
    return this.uamUserOrgServiceServer.getUserOrgJobByUserId(userId);
  }

  public List<Org> getSubCompanyByCompanyId(String companyOrgId, String isOwned)
  {
    return this.uamUserOrgServiceServer.getSubCompanyByCompanyId(companyOrgId, isOwned);
  }

  public List<Org> getShopByCompanyId(String companyOrgId, String type)
  {
    return this.uamUserOrgServiceServer.getShopByCompanyId(companyOrgId, type);
  }

  public List<Job> getAllJob()
  {
    return this.uamUserOrgServiceServer.getAllJob();
  }

  public List<UserOrgJob> findUserSelectList(Map<String, String> params) {
    return this.uamUserOrgServiceServer.findUserSelectList(params);
  }

  public List<CompanyShop> getAllCompanyShop()
  {
    return this.uamUserOrgServiceServer.getAllCompanyShop();
  }

  public List<Org> getAllSubCompany()
  {
    return this.uamUserOrgServiceServer.getAllSubCompany();
  }

  public void setUamUserOrgServiceServer(UamUserOrgService uamUserOrgServiceServer)
  {
    this.uamUserOrgServiceServer = uamUserOrgServiceServer;
  }

  public Job getJobByCode(String code)
  {
    return this.uamUserOrgServiceServer.getJobByCode(code);
  }

  public Org getParentOrgByDepHierarchy(String orgId, String depHierarchy)
  {
    return this.uamUserOrgServiceServer.getParentOrgByDepHierarchy(orgId, depHierarchy);
  }
  public boolean changePassword(User user) {
    return this.uamUserOrgServiceServer.changePassword(user);
  }
}