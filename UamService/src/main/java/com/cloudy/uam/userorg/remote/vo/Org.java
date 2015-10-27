package com.cloudy.uam.userorg.remote.vo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 组织VO
 * @author linjiarong
 * @date 2014年11月5日 下午11:34:16
 * @version 0.0.1
 * 
 */
public class Org implements Serializable {

	/**
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = 2864215787935283495L;

	/** 组织UUID */
	private String id;
	
	/** 组织代码 */
	private String orgCode;

	/** 名称 **/
	private String orgName;
	
	/** 组织短名称 */
	private String orgShortName;
	
	/** 类型OrgType：公司 部门   */
	private String orgType;
	
	/** 部门类型DepTypeHierarchy：产品线，销售线，营业线，财务线，供应商线，运营线，管理线 */
	private String depType;
	
	/** 部门层级DepTypeHierarchy： */
	private String depHierarchy;

	/**
	 * 渠道属性Channel： 门店（直营、加盟），B2C….，网络成员；部门层次为网点的必须指定渠道属性：
	 **/
	private String channel;
	
	/** 地址 */
	private String address;
	
	/** 电话 */
	private String phone;
	
	/** 传真 */
	private String fax;
	
	/** 是否内置 */
	private String isInternal;

	/** parent_id **/
	private String parentId;

	/** parent_ids **/
	private String parentIds;

	/** 是否直营 **/
	private String isOwned;

	/** 图标 **/
	private String icon;

	/** 顺序 **/
	private String orderby;
	
	/** 是否可用 AvailableStatus  **/
	private String available;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
	private Date createDate;

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
	 * @return orgCode 
	 */
	public String getOrgCode() {
		return orgCode;
	}

	/** 
	 * @param orgCode 要设置的 orgCode 
	 */
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	/** 
	 * @return orgName 
	 */
	public String getOrgName() {
		return orgName;
	}

	/** 
	 * @param orgName 要设置的 orgName 
	 */
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	/** 
	 * @return orgShortName 
	 */
	public String getOrgShortName() {
		return orgShortName;
	}

	/** 
	 * @param orgShortName 要设置的 orgShortName 
	 */
	public void setOrgShortName(String orgShortName) {
		this.orgShortName = orgShortName;
	}

	/** 
	 * @return orgType 
	 */
	public String getOrgType() {
		return orgType;
	}

	/** 
	 * @param orgType 要设置的 orgType 
	 */
	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}

	/** 
	 * @return depType 
	 */
	public String getDepType() {
		return depType;
	}

	/** 
	 * @param depType 要设置的 depType 
	 */
	public void setDepType(String depType) {
		this.depType = depType;
	}

	/** 
	 * @return depHierarchy 
	 */
	public String getDepHierarchy() {
		return depHierarchy;
	}

	/** 
	 * @param depHierarchy 要设置的 depHierarchy 
	 */
	public void setDepHierarchy(String depHierarchy) {
		this.depHierarchy = depHierarchy;
	}

	/** 
	 * @return channel 
	 */
	public String getChannel() {
		return channel;
	}

	/** 
	 * @param channel 要设置的 channel 
	 */
	public void setChannel(String channel) {
		this.channel = channel;
	}

	/** 
	 * @return isInternal 
	 */
	public String getIsInternal() {
		return isInternal;
	}

	/** 
	 * @param isInternal 要设置的 isInternal 
	 */
	public void setIsInternal(String isInternal) {
		this.isInternal = isInternal;
	}

	/** 
	 * @return parentId 
	 */
	public String getParentId() {
		return parentId;
	}

	/** 
	 * @param parentId 要设置的 parentId 
	 */
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	/** 
	 * @return parentIds 
	 */
	public String getParentIds() {
		return parentIds;
	}

	/** 
	 * @param parentIds 要设置的 parentIds 
	 */
	public void setParentIds(String parentIds) {
		this.parentIds = parentIds;
	}

	/** 
	 * @return isOwned 
	 */
	public String getIsOwned() {
		return isOwned;
	}

	/** 
	 * @param isOwned 要设置的 isOwned 
	 */
	public void setIsOwned(String isOwned) {
		this.isOwned = isOwned;
	}

	/** 
	 * @return icon 
	 */
	public String getIcon() {
		return icon;
	}

	/** 
	 * @param icon 要设置的 icon 
	 */
	public void setIcon(String icon) {
		this.icon = icon;
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
	 * @return address 
	 */
	public String getAddress() {
		return address;
	}

	/** 
	 * @param address 要设置的 address 
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/** 
	 * @return phone 
	 */
	public String getPhone() {
		return phone;
	}

	/** 
	 * @param phone 要设置的 phone 
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/** 
	 * @return fax 
	 */
	public String getFax() {
		return fax;
	}

	/** 
	 * @param fax 要设置的 fax 
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}
}
