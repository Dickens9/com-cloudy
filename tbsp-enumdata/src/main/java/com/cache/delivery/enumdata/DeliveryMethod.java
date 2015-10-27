package com.cache.delivery.enumdata;

/**
 * 
 * 配送方式 
 * @author suxiaojing
 * @date 2015-1-12 
 */
public enum DeliveryMethod {

	DELIVERY_METHOD("DELIVERY_METHOD","配送方式"),
	EMAIL("EMAIL","邮件"),
	MESSAGE("MESSAGE","短信"),
	POST("POST" , "邮送"),
	BYSELF("BYSELF" , "自取");
	
	private String key;
	private String value;
	
	DeliveryMethod(String key, String value){
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
