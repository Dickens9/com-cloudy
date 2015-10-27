package com.cloudy.client.permission.remote.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.cloudy.uam.permission.remote.UamPermissionService;
import com.cloudy.uam.permission.remote.vo.App;
import com.cloudy.uam.permission.remote.vo.Menu;
import com.cloudy.uam.permission.remote.vo.MenuTree4Left;
import com.cloudy.uam.permission.remote.vo.Resource;
import com.cloudy.uam.permission.remote.vo.Role;

public class UamPermissionServiceClient
  implements UamPermissionService
{
  private UamPermissionService uamPermissionServiceServer;

  @Value("${uam.permission.currentAppName:tbsp-uam-web}")
  private String currentAppName;

  public List<Menu> findMenuByCode(String code)
  {
    return this.uamPermissionServiceServer.findMenuByCode(code);
  }

  public Menu findMenuById(String id) {
    return this.uamPermissionServiceServer.findMenuById(id);
  }

  public List<Resource> getToolbar(String jobId, String resourceCode) {
    return this.uamPermissionServiceServer.getToolbar(jobId, resourceCode);
  }

  public boolean hasPermission(String jobId, String resourceCode)
  {
    return this.uamPermissionServiceServer.hasPermission(jobId, resourceCode);
  }

  public List<Resource> getResourceByRoleId(String roleId)
  {
    return this.uamPermissionServiceServer.getResourceByRoleId(roleId);
  }

  public List<Role> getRoleByJobId(String jobId) {
    return this.uamPermissionServiceServer.getRoleByJobId(jobId);
  }

  public Menu getMenuByJobAndMenuCode(String jobId, String code) {
    return this.uamPermissionServiceServer.getMenuByJobAndMenuCode(jobId, code);
  }

  public Menu getMenuByJobAndMenuId(String jobId, String menuId) {
    return this.uamPermissionServiceServer.getMenuByJobAndMenuId(jobId, menuId);
  }

  public List<Menu> getMenuByJobId(String jobId) {
    return this.uamPermissionServiceServer.getMenuByJobId(jobId);
  }

  public Resource getResourceByCode(String resourceCode) {
    return this.uamPermissionServiceServer.getResourceByCode(resourceCode);
  }

  public List<Resource> getResourceByJobId(String jobId) {
    return this.uamPermissionServiceServer.getResourceByJobId(jobId);
  }

  public List<MenuTree4Left> getMenuTree(String userId, String jobId)
  {
    return this.uamPermissionServiceServer.getMenuTree(userId, jobId);
  }

  public void setUamPermissionServiceServer(UamPermissionService uamPermissionServiceServer)
  {
    this.uamPermissionServiceServer = uamPermissionServiceServer;
  }

  public App getAppByAppName(String appName)
  {
    return this.uamPermissionServiceServer.getAppByAppName(appName);
  }

  public App getAppById(String appId)
  {
    return this.uamPermissionServiceServer.getAppById(appId);
  }

  public List<App> getAllApp() {
    return this.uamPermissionServiceServer.getAllApp();
  }

/*  public String getResourceUrlByJobId(String jobId) {
    return this.uamPermissionServiceServer.getResourceUrlByJobId(jobId);
  }

  public Menu findOneMenuByReosurceId(String resourceId) {
    return this.uamPermissionServiceServer.findOneMenuByReosurceId(resourceId);
  }
  public List<Menu> findMenuByResourcceCode4NativeBar(String resourceCode) {
    return this.uamPermissionServiceServer.findMenuByResourcceCode4NativeBar(resourceCode);
  }
*/
  public App getCurrentApp() {
    return getAppByAppName(this.currentAppName);
  }
}