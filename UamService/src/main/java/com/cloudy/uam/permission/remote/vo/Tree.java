package com.cloudy.uam.permission.remote.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public 	class Tree implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 182253296821553619L;
	private String id;
	private String name;
	private String text;
	private String type;

	private boolean isExpand;
	
	public boolean getIsExpand() {
		return isExpand;
	}

	public void setIsExpand(boolean isExpand) {
		this.isExpand = isExpand;
	}

	private List<Tree> children;
	
	public List<Tree> getChildren() {
		return children;
	}

	public void setChildren(List<Tree> children) {
		this.children = children;
	}

	private String icon;
	
	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}