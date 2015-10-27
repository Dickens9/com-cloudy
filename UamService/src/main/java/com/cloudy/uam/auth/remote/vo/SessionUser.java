package com.cloudy.uam.auth.remote.vo;

import java.io.Serializable;
import java.util.List;

/** 
 * 当前登陆用户 信息
 *
 * @author linjiarong
 * @date 2014年11月5日 下午10:56:03 
 * @version 0.0.1
 *  
 */
public class SessionUser implements Serializable{
	
	/** 
	 * @Fields serialVersionUID 
	 */ 
	private static final long serialVersionUID = 7624884432830922018L;

	public static final String SESSION_USER = "SESSION_USER";
	
	/** 用户UUID */
	private String id;
	
	/** 登陆名  登陆ID*/
	private String username;
	
	/** 真实姓名 */
	private String realName;
	
	/** 员工编号：针对正式员工和临时员工，HR/OA编号为必填 */
	private String employeeCode;
	
	/** 员工类型 */
	private String employeeType;
	
	/** 性别  */
	private String sex;

	/** email */
	private String email;
	
	/** 手机号 */
	private String mobile;

	/** 服务部门ID */
	private String serviceDepId;
	
	/** 服务部门代码 */
	private String serviceDepCode;
	
	/** 服务部门名 */
	private String serviceDepName;
	
	/** 部门分类 */
	private String serviceDepType;
	
	/** 组织类型 */
	private String serviceDepOrgType;
	
	/** 部门层次 */
	private String serviceDepHierarchy;
	
	/** 渠道属性 */
	private String serviceDepChannel;
	
	/** 地址 */
	private String serviceDepAddress;
	
	/** 电话 */
	private String serviceDepPhone;
	
	/** 传真 */
	private String serviceDepFax;
	
	/** 所在部门是否直营 */
	private String serviceDepIsOwned;
	
	/** 服务公司ID */
	private String serviceCompanyId;
	
	/** 服务公司代码 */
	private String serviceCompanyCode;
	
	/** 服务公司名 */
	private String serviceCompanyName;
	
	/** 地址 */
	private String serviceCompanyAddress;
	
	/** 电话 */
	private String serviceCompanyPhone;
	
	/** 传真 */
	private String serviceCompanyFax;
	
	/** 所在公司是否直营 */
	private String serviceCompanyIsOwned;
	
	/** 服务岗位ID */
	private String serviceJobId;
	
	/** 服务岗位代码 */
	private String serviceJobCode;
	
	/** 服务岗位名 */
	private String serviceJobName;
	
	/** 用户角色列表 保存角色CODE*/
	private List<String> roles;
	
	/** 用户权限列表 ,保存资源代码RESOURCE_CODE*/
	private List<String> permissions;
	
	/** casSessionId */
	private String ssoSessionId;
	
	/** 
	 * @return id 
	 */
	public String getId() {
		return id;
	}

	/** 
	 * @param id 要设置的 id 
	 */
	public void setId(String id) {
		this.id = id;
	}

	/** 
	 * @return username 
	 */
	public String getUsername() {
		return username;
	}

	/** 
	 * @param username 要设置的 username 
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/** 
	 * @return realName 
	 */
	public String getRealName() {
		return realName;
	}

	/** 
	 * @param realName 要设置的 realName 
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}

	/** 
	 * @return email 
	 */
	public String getEmail() {
		return email;
	}

	/** 
	 * @param email 要设置的 email 
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/** 
	 * @return mobile 
	 */
	public String getMobile() {
		return mobile;
	}

	/** 
	 * @param mobile 要设置的 mobile 
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/** 
	 * @return serviceCompany 
	 */
	public String getServiceCompanyId() {
		return serviceCompanyId;
	}

	/** 
	 * @param serviceCompany 要设置的 serviceCompany 
	 */
	public void setServiceCompanyId(String serviceCompanyId) {
		this.serviceCompanyId = serviceCompanyId;
	}


	/** 
	 * @return serviceJobId 
	 */
	public String getServiceJobId() {
		return serviceJobId;
	}

	/** 
	 * @param serviceJobId 要设置的 serviceJobId 
	 */
	public void setServiceJobId(String serviceJobId) {
		this.serviceJobId = serviceJobId;
	}

	/** 
	 * @return serviceJobName 
	 */
	public String getServiceJobName() {
		return serviceJobName;
	}

	/** 
	 * @param serviceJobName 要设置的 serviceJobName 
	 */
	public void setServiceJobName(String serviceJobName) {
		this.serviceJobName = serviceJobName;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public List<String> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<String> permissions) {
		this.permissions = permissions;
	}

	public String getSsoSessionId() {
		return ssoSessionId;
	}

	public void setSsoSessionId(String ssoSessionId) {
		this.ssoSessionId = ssoSessionId;
	}

	public String getServiceCompanyName() {
		return serviceCompanyName;
	}

	public void setServiceCompanyName(String serviceCompanyName) {
		this.serviceCompanyName = serviceCompanyName;
	}

	public String getServiceDepId() {
		return serviceDepId;
	}

	public void setServiceDepId(String serviceDepId) {
		this.serviceDepId = serviceDepId;
	}

	public String getServiceDepName() {
		return serviceDepName;
	}

	public void setServiceDepName(String serviceDepName) {
		this.serviceDepName = serviceDepName;
	}

	public String getServiceDepType() {
		return serviceDepType;
	}

	public void setServiceDepType(String serviceDepType) {
		this.serviceDepType = serviceDepType;
	}

	public String getServiceDepHierarchy() {
		return serviceDepHierarchy;
	}

	public void setServiceDepHierarchy(String serviceDepHierarchy) {
		this.serviceDepHierarchy = serviceDepHierarchy;
	}

	public String getServiceDepChannel() {
		return serviceDepChannel;
	}

	public void setServiceDepChannel(String serviceDepChannel) {
		this.serviceDepChannel = serviceDepChannel;
	}
	
	@Deprecated
	public String getServiceOrgId(){
		return getServiceDepId();
	}
	
	@Deprecated
	public String getServiceOrgName(){
		return getServiceDepName();
	}

	/** 
	 * @return employeeCode 
	 */
	public String getEmployeeCode() {
		return employeeCode;
	}

	/** 
	 * @param employeeCode 要设置的 employeeCode 
	 */
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	/** 
	 * @return employeeType 
	 */
	public String getEmployeeType() {
		return employeeType;
	}

	/** 
	 * @param employeeType 要设置的 employeeType 
	 */
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	/** 
	 * @return sex 
	 */
	public String getSex() {
		return sex;
	}

	/** 
	 * @param sex 要设置的 sex 
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/** 
	 * @return serviceDepAddress 
	 */
	public String getServiceDepAddress() {
		return serviceDepAddress;
	}

	/** 
	 * @param serviceDepAddress 要设置的 serviceDepAddress 
	 */
	public void setServiceDepAddress(String serviceDepAddress) {
		this.serviceDepAddress = serviceDepAddress;
	}

	/** 
	 * @return serviceDepPhone 
	 */
	public String getServiceDepPhone() {
		return serviceDepPhone;
	}

	/** 
	 * @param serviceDepPhone 要设置的 serviceDepPhone 
	 */
	public void setServiceDepPhone(String serviceDepPhone) {
		this.serviceDepPhone = serviceDepPhone;
	}

	/** 
	 * @return serviceDepFax 
	 */
	public String getServiceDepFax() {
		return serviceDepFax;
	}

	/** 
	 * @param serviceDepFax 要设置的 serviceDepFax 
	 */
	public void setServiceDepFax(String serviceDepFax) {
		this.serviceDepFax = serviceDepFax;
	}

	/** 
	 * @return serviceCompanyAddress 
	 */
	public String getServiceCompanyAddress() {
		return serviceCompanyAddress;
	}

	/** 
	 * @param serviceCompanyAddress 要设置的 serviceCompanyAddress 
	 */
	public void setServiceCompanyAddress(String serviceCompanyAddress) {
		this.serviceCompanyAddress = serviceCompanyAddress;
	}

	/** 
	 * @return serviceCompanyPhone 
	 */
	public String getServiceCompanyPhone() {
		return serviceCompanyPhone;
	}

	/** 
	 * @param serviceCompanyPhone 要设置的 serviceCompanyPhone 
	 */
	public void setServiceCompanyPhone(String serviceCompanyPhone) {
		this.serviceCompanyPhone = serviceCompanyPhone;
	}

	/** 
	 * @return serviceCompanyFax 
	 */
	public String getServiceCompanyFax() {
		return serviceCompanyFax;
	}

	/** 
	 * @param serviceCompanyFax 要设置的 serviceCompanyFax 
	 */
	public void setServiceCompanyFax(String serviceCompanyFax) {
		this.serviceCompanyFax = serviceCompanyFax;
	}

	public String getServiceDepCode() {
		return serviceDepCode;
	}

	public void setServiceDepCode(String serviceDepCode) {
		this.serviceDepCode = serviceDepCode;
	}

	public String getServiceDepIsOwned() {
		return serviceDepIsOwned;
	}

	public void setServiceDepIsOwned(String serviceDepIsOwned) {
		this.serviceDepIsOwned = serviceDepIsOwned;
	}

	public String getServiceCompanyIsOwned() {
		return serviceCompanyIsOwned;
	}

	public void setServiceCompanyIsOwned(String serviceCompanyIsOwned) {
		this.serviceCompanyIsOwned = serviceCompanyIsOwned;
	}

	public String getServiceCompanyCode() {
		return serviceCompanyCode;
	}

	public void setServiceCompanyCode(String serviceCompanyCode) {
		this.serviceCompanyCode = serviceCompanyCode;
	}

	public String getServiceJobCode() {
		return serviceJobCode;
	}

	public void setServiceJobCode(String serviceJobCode) {
		this.serviceJobCode = serviceJobCode;
	}

	public String getServiceDepOrgType() {
		return serviceDepOrgType;
	}

	public void setServiceDepOrgType(String serviceDepOrgType) {
		this.serviceDepOrgType = serviceDepOrgType;
	}
	
}
