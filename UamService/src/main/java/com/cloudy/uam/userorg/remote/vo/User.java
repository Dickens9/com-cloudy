package com.cloudy.uam.userorg.remote.vo;

import java.io.Serializable;
import java.util.Date;

/** 
 * 用户信息VO
 *
 * @author linjiarong
 * @date 2014年11月5日 下午11:34:34 
 * @version 0.0.1
 *  
 */
public class User implements Serializable{

	/** 
	 * @Fields serialVersionUID
	 */ 
	private static final long serialVersionUID = 698312985610179011L;
	
	/** 用户 UUID */
	private String id;
	
	/** 员工编号：针对正式员工和临时员工，HR/OA编号为必填 */
	private String employeeCode;
	
	/** 员工类型 EmployeeType */
	private String employeeType;
	
	/** 性别 Sex */
	private String sex;
	
	/** 用户名称, 登陆名 **/
	private String username;
	
	/** 真实姓名 **/
	private String realName;

	/** email **/
	private String email;
	
	/** 手机号 **/
	private String mobile;
	
	/** 密码 **/
	private String password;
	
	/**
	 * 状态：0-锁定 1-激活   UserStatus
	 **/
	private String status;
	
	/** 顺序 **/
	private String orderby;
	
	/** 是否可用  AvailableStatus*/
	private String available;
	
	/** 创建时间 */
	private Date createDate;
	
	/**归属组织id*/
	private String orgId;
	
	/**归属组织名称*/
	private String orgName;

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
	 * @return mobile Phone Number 
	 */
	public String getMobile() {
		return mobile;
	}

	/** 
	 * @param mobile 要设置的 mobile Phone Number 
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/** 
	 * @return password 
	 */
	public String getPassword() {
		return password;
	}

	/** 
	 * @param password 要设置的 password 
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/** 
	 * @return status 
	 */
	public String getStatus() {
		return status;
	}

	/** 
	 * @param status 要设置的 status 
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/** 
	 * @return orderby 
	 */
	public String getOrderby() {
		return orderby;
	}

	/** 
	 * @param orderby 要设置的 orderby 
	 */
	public void setOrderby(String orderby) {
		this.orderby = orderby;
	}

	/** 
	 * @return available 
	 */
	public String getAvailable() {
		return available;
	}

	/** 
	 * @param available 要设置的 available 
	 */
	public void setAvailable(String available) {
		this.available = available;
	}

	/** 
	 * @return createDate 
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/** 
	 * @param createDate 要设置的 createDate 
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
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

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	

}
