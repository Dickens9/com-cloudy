/**
 * Copyright © 2014, IBM and/or GZL, All rights reserved.
 */
package com.cache.resource.enumdata;

/**
 * 保险类型
 * @author can
 * @since 0.0.1
 */
public enum InsuranceType {

	Cost("Cost","成本型"),
	Sale("Sale","代售型");
	
	private String key;
	private String value;
	
	private InsuranceType(String key, String value) {
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

	
