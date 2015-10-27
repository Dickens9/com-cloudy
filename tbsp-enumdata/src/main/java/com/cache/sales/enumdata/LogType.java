package com.cache.sales.enumdata;

/**
 * 操作日志类型
 * @author tanzq
 *
 */
public enum LogType {
	REFUND_TYPE("REFUND_TYPE","refund"),
	OFFER_TYPE("OFFER_TYPE","offer"),
	CHANGE_TYPE("CHANGE_TYPE","change"),
	INDEBT_TYPE("INDEBT_TYPE","indebt"),
	CONTRACT_TYPE("CONTRACT_TYPE","contract");

	private String key;
	private String value;
	private LogType(String key, String value) {
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
