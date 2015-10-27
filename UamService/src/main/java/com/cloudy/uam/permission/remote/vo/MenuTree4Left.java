package com.cloudy.uam.permission.remote.vo;

import java.io.Serializable;
import java.util.List;

public class MenuTree4Left implements Serializable{
	private static final long serialVersionUID = -6571409911026626105L;
	private String id;
	private String menuName;
	private String parentId;
	private String url;
	private String icon;
	private List<MenuTree4Left> subMenuList;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public List<MenuTree4Left> getSubMenuList() {
		return subMenuList;
	}
	public void setSubMenuList(List<MenuTree4Left> subMenuList) {
		this.subMenuList = subMenuList;
	}

}
