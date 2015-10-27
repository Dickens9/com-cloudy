/**
 * @author: alvin
 * @version: 1.0
 * @since 2014-09-24
 */
package com.cloudy.uam.permission.remote.vo;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class Menu implements Serializable {
	
	private static final long serialVersionUID = -560660971240936271L;
	/** 名称 **/
	private String menuName;
	/** 父ID **/
	private String parentId;
	
	/** 父IDS **/
	private String parentIds;
	
	/** 资源ID **/
	private Resource resource;
	/** 图标 **/
	private String icon;
	/** 顺序 **/
	private String orderby;
	
	private String url;

	/** 应用、模块、菜单 **/
	private String type;
	
	private List<Menu> children;
	
	/** 编码**/
	private String code;
	
	private String id;
	
	@JsonIgnore
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMenuName() {
		return menuName;
	}
	@JsonIgnore
	public String getParentId() {
		return parentId;
	}
	
	@JsonIgnore
	public String getParentIds() {
		return parentIds;
	}



	public String getIcon() {
		return icon;
	}
	@JsonIgnore
	public String getOrderby() {
		return orderby;
	}



	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public void setParentIds(String parentIds) {
		this.parentIds = parentIds;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public void setOrderby(String orderby) {
		this.orderby = orderby;
	}


	@JsonIgnore
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
	 * @return children 
	 */
	public List<Menu> getChildren() {
		return children;
	}

	/** 
	 * @param children 要设置的 children 
	 */
	public void setChildren(List<Menu> children) {
		this.children = children;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}