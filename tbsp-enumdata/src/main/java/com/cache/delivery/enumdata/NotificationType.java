package com.cache.delivery.enumdata;

public enum NotificationType {
	SET_OUT("SET_OUT", "出团通知"), CANCELLATION("CANCELLATION", "取消团通知");

	private String key;
	private String value;

	private NotificationType(String key, String value) {
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