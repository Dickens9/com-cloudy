package com.cloudy.uam.basedata.remote.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Dict implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4332725464384683869L;

	/** 编码 **/
	private java.lang.String code;
	
	/** 名称 **/
	private java.lang.String name;
	
	/** parent_id **/
	private java.lang.String parentId;
	
	/** 是否默认 **/
	private java.lang.String isDefault;
	
	/** 顺序 **/
	private java.lang.String orderby;
	
	private List<Dict> children = new ArrayList<Dict>();
	
	private String type;
	
	private String id;
	
	private String available;
	
	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 
	 * 请使用getName取代
	 * @since 2014年12月3日
	 * @return 
	 * @return java.lang.String    返回类型
	 */
	@Deprecated
	public java.lang.String getDictName() {
		return name;
	}
	
	/**
	 * 请使用setName取代 
	 * @since 2014年12月3日
	 * @param dictName 
	 * @return void    返回类型
	 */
	@Deprecated
	public void setDictName(java.lang.String dictName) {
		this.name = dictName;
	}
	
	public java.lang.String getName() {
		return name;
	}

	public void setName(java.lang.String dictName) {
		this.name = dictName;
	}

	public java.lang.String getCode() {
		return code;
	}

	public void setCode(java.lang.String code) {
		this.code = code;
	}

	public java.lang.String getParentId() {
		return parentId;
	}

	public void setParentId(java.lang.String parentId) {
		this.parentId = parentId;
	}

 

	public java.lang.String getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(java.lang.String isDefault) {
		this.isDefault = isDefault;
	}

	public java.lang.String getOrderby() {
		return orderby;
	}

	public void setOrderby(java.lang.String orderby) {
		this.orderby = orderby;
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
	public List<Dict> getChildren() {
		return children;
	}

	/** 
	 * @param children 要设置的 children 
	 */
	public void setChildren(List<Dict> children) {
		this.children = children;
	}
}
