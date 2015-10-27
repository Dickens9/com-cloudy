/**   
 * TODO(用一句话描述该文件做什么) 
 * @author linjiarong 
 * @date 2014年11月5日 下午11:20:22 
 * @version 0.0.1
 */
package com.cloudy.uam.permission.remote.vo;

import java.io.Serializable;
import java.util.List;

/** 
 * 权限资源VO对象
 *
 * @author linjiarong
 * @date 2014年11月5日 下午11:20:22 
 * @version 0.0.1
 *  
 */
public class Resource implements Serializable{
	/** UUID */
	private String id;
	/** 资源名称 */
	private String resourceName;
	
	/** 资源编码 */
	private String resourceCode;

	/** URL，记录当前应用下的相对地址 */
	private String url;
	
	/** 父ID */
	private String parentId;
	
	/** 父IDS */
	private String parentIds;
	
	/** 图标 */
	private String icon;
	
	/** 顺序 */
	private String orderby;
	
	/** 所属应用 */
	private App app;
	
	/**
	 * 
	 * 根据APP与URL生成绝对URL
	 * @return 
	 * @return String    返回类型
	 */
	public String getAbsoluteUrl(){
		//TODO 林喜荣
		return null;
	}

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
	 * @return resourceName 
	 */
	public String getResourceName() {
		return resourceName;
	}

	/** 
	 * @param resourceName 要设置的 resourceName 
	 */
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	 
	/** 
	 * @return url 
	 */
	public String getUrl() {
		return url;
	}

	/** 
	 * @param url 要设置的 url 
	 */
	public void setUrl(String url) {
		this.url = url;
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
	 * @return app 
	 */
	public App getApp() {
		return app;
	}

	/** 
	 * @param app 要设置的 app 
	 */
	public void setApp(App app) {
		this.app = app;
	}

	/** 
	 * @return resourceCode 
	 */
	public String getResourceCode() {
		return resourceCode;
	}

	/** 
	 * @param resourceCode 要设置的 resourceCode 
	 */
	public void setResourceCode(String resourceCode) {
		this.resourceCode = resourceCode;
	}
	
}
