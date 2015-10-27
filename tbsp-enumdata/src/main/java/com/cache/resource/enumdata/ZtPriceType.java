/**
 * Copyright © 2014, IBM and/or GZL, All rights reserved.
 */
package com.cache.resource.enumdata;

/**
 * 组团价格类型
 * @author can
 * @since 0.0.1
 */
public enum ZtPriceType {

	Adult("Adult","成人价"),
	Child("Child","儿童价"),
	Old("Old","老人价"),
	Baby("Baby","婴儿价");

	private String key;
	private String value;
	
	ZtPriceType(String key, String value){
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
