package com.cache.delivery.enumdata;
/**
 * @author LT
 */
public enum NotificationMethod {
	PHONE("PHONE", "电话"), MESSAGE("MESSAGE", "短信");

	private String key;
	private String value;

	private NotificationMethod(String key, String value) {
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
