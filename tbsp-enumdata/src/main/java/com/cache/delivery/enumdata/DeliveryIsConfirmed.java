package com.cache.delivery.enumdata;

/**
 * 
 * @author	zhangweijun
 * @date	2014-11-20
 * @Description 服务交付是否确认
 */
public enum DeliveryIsConfirmed {
	YES("1" , "是"),
	NO("0","否");
	
	
	private String key;
	private String value;
	
	DeliveryIsConfirmed(String key, String value){
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
