package com.cloudy.uam.userorg.remote;

import java.util.List;
import java.util.Map;

import com.cloudy.uam.userorg.remote.vo.CompanyShop;
import com.cloudy.uam.userorg.remote.vo.Job;
import com.cloudy.uam.userorg.remote.vo.Org;
import com.cloudy.uam.userorg.remote.vo.User;
import com.cloudy.uam.userorg.remote.vo.UserOrgJob;
/**
 * 
 * UAM平台用户组织信息接口 
 *
 * @author linjiarong
 * @date 2014年11月27日 上午9:02:49 
 * @version 0.0.1
 *
 */
public interface UamUserOrgService {
	
	/**
	 * 
	 * 根据用户UUID获取用户
	 * @since 2014年11月28日
	 * @param userId
	 * @return 
	 * @return User    返回类型
	 */
	public User getUserById(String userId);
	
	/**
	 * 
	 * 根据用户登陆账号获取用户
	 * @since 2014年11月28日
	 * @param username
	 * @return 
	 * @return User    返回类型
	 */
	public User getUserByUsername(String username);
	
	/**
	 * 
	 * 获取岗位下的所有用户
	 * @param jobId
	 * @return 
	 * @return List<User>    返回类型
	 */
	public List<User> getUserByJobId(String jobId);
	
	/**
	 * 
	 * 获取归属组织下的所有用户
	 * @param orgId
	 * @return 
	 * @return List<User>    返回类型
	 */
	public List<User> getUserByBelongOrgId(String orgId);
	
	/**
	 * 
	 * 获取服务组织下的所有用户
	 * @param orgId
	 * @return 
	 * @return List<User>    返回类型
	 */
	public List<User> getUserByServiceOrgId(String orgId);

	/**
	 * 
	 * 根据服务组织与岗位获取用户
	 * @param orgId 服务部门
	 * @param jobId
	 * @return 
	 * @return List<User>    返回类型
	 */
	public List<User> getUserByOrgIdAndJobId(String orgId, String jobId);
	
	/**
	 * 
	 * 根据orgId获取组织
	 * @param orgId
	 * @return 
	 * @return Org    返回类型
	 */
	public Org getOrgById(String orgId);
	
	/**
	 * 
	 * 根据组织编码获取组织
	 * @param code
	 * @return 
	 * @return Org    返回类型
	 */
	public Org getOrgByCode(String code);
	
	/**
	 * 
	 * 根据ParentId获取组织
	 * @param parentId
	 * @return 
	 * @return List<Org>    返回类型
	 */
	public List<Org> getOrgByParentId(String parentId);
	
	/**
	 * 
	 * 根据ParentCode获取组织
	 * @param parentCode
	 * @return 
	 * @return List<Org>    返回类型
	 */
	public List<Org> getOrgByParentCode(String parentCode);
	
	/**
	 * 根据组织部门层次结构查找上级组织
	 * @param orgId 当前组织ID
	 * @param depHierarchy 上级组织的部门层次
	 * @return
	 */
	public Org getParentOrgByDepHierarchy(String orgId, String depHierarchy);
	
	/**
	 * 
	 * 根据部门orgId获取公司组织
	 * @since 2014年11月27日
	 * @param orgId
	 * @return 
	 * @return Org    返回类型
	 */
	public Org getComapnyByOrgId(String orgId);
	
	
	/**
	 * 
	 * 根据岗位ID获取岗位
	 * @param id
	 * @return 
	 * @return Job    返回类型
	 */
	public Job getJobById(String id);
	
	/**
	 * 
	 * 根据岗位代码获取岗位
	 * @param id
	 * @return 
	 * @return Job    返回类型
	 */
	public Job getJobByCode(String code);
	
	/**
	 * 获取所有岗位
	 * @return 
	 * @return Job    返回类型
	 */
	public List<Job> getAllJob();
		
	/**
	 * 
	 * 获取用户的所有岗位
	 * @param id 用户UUID
	 * @return 
	 * @return Job    返回类型
	 */
	public List<UserOrgJob> getUserOrgJobByUserId(String userId);
	

	/**
	 * 
	 * 获取除本公司的所有分子公司列表：
	 * 根据登陆人所在公司的父组织编码，查找下一级属于公司的，公司属性为直属的、只找一层
	 * 获取除本公司的所有网络成员列表：
	 * 根据登陆人所在公司的父组织编码，查找下一级属于公司的，公司属性为非直属的、只找一层
	 * @param isOwned 直营，非直营  值来自数据字典YesNoStatus，结果为null时返回所有类型的
	 * @param companyOrgId
	 * @return 
	 * @return List<Org>    返回类型
	 */
	public List<Org> getSubCompanyByCompanyId(String companyOrgId, 
											  String isOwned);
	
	/**
	 *  
	 * 获取本公司的所有门店列表：
	 * 根据登陆人所在公司，获取公司下的服务线为销售线条的部门，取下一级所有组织类型为直营的网点
	 * 获取除本公司的所有加盟门店列表：
	 * 根据登陆人所在公司，获取公司下的服务线为销售线条的部门，取下一级所有组织类型为非直营的网点
	 * @param isOwned 直营，非直营  值来自数据字典YesNoStatus，结果为null时返回所有类型的
	 * @param companyOrgId
	 * @return 
	 * @return List<Org>    返回类型
	 */
	public List<Org> getShopByCompanyId(String companyOrgId, String isOwned);
		
	/**
	 * 
	 * 获取所有分子公司门店信息,除总部外
	 * @since 2014年11月27日
	 * @return 
	 * @return List<CompanyShop>    返回类型
	 */
	public List<CompanyShop> getAllCompanyShop();
		
	/**
	 * 获取所有分子公司信息,除总部外
	 * @since 2014年11月27日
	 * @return 
	 * @return List<Org>    返回类型
	 */
	public List<Org> getAllSubCompany();
	/**
	 * 
	 * TODO(这里用一句话描述这个方法的作用)
	 * @param params
	 * @return 
	 * @return List<UserOrgJobVo>    返回类型
	 */
	public List<UserOrgJob> findUserSelectList(Map<String, String> params);

	public boolean changePassword(User user);
	
	
}
