/**
 * 
 */
package com.cache.delivery.enumdata;

/**
 * @author David 大卡状态
 */
public enum FinCardCalculateMode {
	ADD("ADD", "加法"), SUBTRAC("SUBTRAC", "减法");

	private String key;
	private String value;

	private FinCardCalculateMode(String key, String value) {
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
