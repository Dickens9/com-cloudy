package com.cloudy.uam.permission.remote;

import java.util.List;

import com.cloudy.uam.permission.remote.vo.App;
import com.cloudy.uam.permission.remote.vo.Menu;
import com.cloudy.uam.permission.remote.vo.MenuTree4Left;
import com.cloudy.uam.permission.remote.vo.Resource;
import com.cloudy.uam.permission.remote.vo.Role;


/**
 * 
 * TODO RUIGUO 权限信息接口
 * @author RUIGUO
 * @date 2014年10月23日 下午4:46:05 
 * @version 1.0.0
 * 
 */
public interface UamPermissionService {
	
	
	/**
	 *nativagetag使用
	 *根据菜单CODE查询菜单 
	 * @param code
	 * @param currentPageName
	 * @return 
	 * @return List<Menu>    返回类型
	 */
	public List<Menu> findMenuByCode(String code);
	/**
	 * 
	 * nativagetag使用
	 * 根据id查询菜单
	 * @param id
	 * @return 
	 * @return Menu    返回类型
	 */
	public Menu findMenuById(String id);
	
	/**
	 * 根据菜单CODE查询菜单
	 * 主要用于其他门户，如供应商只能访问特定应用，所以做menucode限定
	 * @param jobId
	 * @param code
	 * @return 
	 * @return List<Menu>    返回类型
	 */
	public Menu getMenuByJobAndMenuCode(String jobId, String code);
	
	/**
	 * 
	 * 根据MENU UUID及岗位取Menu
	 * 主要用于其他门户，如供应商只能访问特定应用，所以做menuid限定
	 * @param jobId
	 * @param menuId
	 * @return 
	 * @return Menu    返回类型
	 */
	public Menu getMenuByJobAndMenuId(String jobId, String menuId);
	
	/**
	 * 
	 * 根据用户岗位获取用户有权限访问的菜单
	 * @param jobId
	 * @return 
	 * @return List<Menu>    返回类型
	 */
	public List<Menu> getMenuByJobId(String jobId);
	
	
	/**
	 * 
	 * 根据用户岗位及Toolbar Code，获取Tooble的相关权限资源
	 * @param jobId
	 * @param resourceCode
	 * @return 
	 * @return List<Resource>    返回类型
	 */
	public List<Resource> getToolbar(String jobId, String resourceCode);
	
	/**
	 * 
	 * 判断jobId是否有resCode对应的权限
	 * @param jobId
	 * @param resourceCode
	 * @return 
	 * @return boolean    返回类型
	 */
	public boolean hasPermission(String jobId, String resourceCode);
	
	/**
	 * 
	 * 根据资源代码查询资源
	 * @param resourceCode
	 * @return 
	 * @return Resource    返回类型
	 */
	public Resource getResourceByCode(String resourceCode);
	
	
	/**
	 * 
	 * 根据角色ID查询资源
	 * @param roleId
	 * @return 
	 * @return List<Resource>    返回类型
	 */
	public List<Resource> getResourceByRoleId(String roleId);
	
	/**
	 * 
	 * 根据岗位获取Resource
	 * @param jobId
	 * @return 
	 * @return List<Resource>    返回类型
	 */
	public List<Resource> getResourceByJobId(String jobId);
	
	/**
	 * 
	 * 根据岗位获取岗位所具有 的角色
	 * @param jobId
	 * @return 
	 * @return List<Role>    返回类型
	 */
	public List<Role> getRoleByJobId(String jobId);
	
    /**
     * 左边菜单树
     * @param userId
     * @param jobId
     * @return 
     * @return List<MenuTree>    返回类型
     */
    public List<MenuTree4Left> getMenuTree(String userId, String jobId);
    
    /**
     * 
     * 根据AppName查找App
     * @param appName
     * @return 
     * @return App    返回类型
     */
    public App getAppByAppName(String appName);
    
    /**
     * 
     * 获取所有App
     * @param appName
     * @return 
     * @return App    返回类型
     */
    public List<App> getAllApp();
    
    /**
     * 
     * 根据AppName查找App
     * @since 2014.12.08
     * @param appName
     * @return 
     * @return App    返回类型
     */
    public App getAppById(String appId);
    
}
