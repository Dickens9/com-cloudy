package com.cache.delivery.enumdata;

/**
 * 
 * @author	linyulong
 * @date	2014-12-9
 * @Description 还款方式
 */
public enum ReimburseMethod {
	RETURN("RETURN" , "退还现金"),
	REIMBURSE("REIMBURSE" , "报账");

	private String key;
	private String value;
	
	ReimburseMethod(String key, String value){
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
