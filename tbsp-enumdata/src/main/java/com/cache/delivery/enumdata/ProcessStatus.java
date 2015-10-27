package com.cache.delivery.enumdata;
/**
 * @author LT
 */
public enum ProcessStatus {
	NOT_APPLIED("NOT_APPLIED", "未申请"), APPLIED("APPLIED", "已申请"), PROCESSED("PROCESSED", "已处理");

	private String key;
	private String value;

	private ProcessStatus(String key, String value) {
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
