package com.cache.delivery.enumdata;

/**
 * 分团方式
 * 
 * @author David
 *
 */
public enum SeperateMethod {
	BY_ORDER("BY_ORDER", "按订单分团"), BY_TOURIST("BY_TOURIST", "按游客分团");

	private String key;
	private String value;

	SeperateMethod(String key, String value) {
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
