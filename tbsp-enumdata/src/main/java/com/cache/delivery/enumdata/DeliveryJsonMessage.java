package com.cache.delivery.enumdata;

/**
 * ajax返回状态
 * @author suxiaojing 
 */
public enum DeliveryJsonMessage {
	SUCCESS("SUCCESS", "成功"), FAILURE("FAILURE", "操作失败!"), FAILURE_CLAIM("FAILURE_CLAIM","该申请单已被认领,不能做此操作!");

	private String key;
	private String value;

	private DeliveryJsonMessage(String key, String value) {
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
