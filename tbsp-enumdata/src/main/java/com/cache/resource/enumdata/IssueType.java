/**
 * Copyright © 2014, IBM and/or GZL, All rights reserved.
 */
package com.cache.resource.enumdata;

/**
 * 出票类型
 * @author can
 * @since 0.0.1
 */
public enum IssueType {
	
	Manual("Manual","手工"),
	Interface("Interface","接口"),
	System("System","系统");
	
	private String key;
	private String value;
	
	private IssueType(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
