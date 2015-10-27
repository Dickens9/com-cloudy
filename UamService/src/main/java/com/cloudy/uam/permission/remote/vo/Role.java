/**   
 * TODO(用一句话描述该文件做什么) 
 * @author linjiarong 
 * @date 2014年11月5日 下午11:38:07 
 * @version 0.0.1
 */
package com.cloudy.uam.permission.remote.vo;

import java.io.Serializable;

/** 
 *
 * @author linjiarong
 * @date 2014年11月5日 下午11:38:07 
 * @version 0.0.1
 *  
 */
public class Role implements Serializable{
	/** 
	 */ 
	private static final long serialVersionUID = -6229881356676041485L;
	private String id;
	/** 角色名称 **/
	private java.lang.String roleName;
	/** 描述 **/
	private java.lang.String description;
	/** 顺序 **/
	private java.lang.String orderby;
	
	/** 是否可用 **/
	private java.lang.String available;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public java.lang.String getRoleName() {
		return roleName;
	}
	public void setRoleName(java.lang.String roleName) {
		this.roleName = roleName;
	}
	public java.lang.String getDescription() {
		return description;
	}
	public void setDescription(java.lang.String description) {
		this.description = description;
	}
	public java.lang.String getOrderby() {
		return orderby;
	}
	public void setOrderby(java.lang.String orderby) {
		this.orderby = orderby;
	}
	public java.lang.String getAvailable() {
		return available;
	}
	public void setAvailable(java.lang.String available) {
		this.available = available;
	}
	
}
