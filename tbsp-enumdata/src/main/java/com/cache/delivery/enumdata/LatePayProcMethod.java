/**
 * 
 */
package com.cache.delivery.enumdata;

/**
 * @author David 超时未缴款处理方式
 */
public enum LatePayProcMethod {
	PUT_OFF("PUT_OFF", "申请缓交"), WHOLE_CANCEL("WHOLE_CANCEL", "整单取消"),QUIT_TOUR_GROUP("QUIT_TOUR_GROUP","退团");
	
	private String key;
	private String value;

	private LatePayProcMethod(String key, String value) {
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
