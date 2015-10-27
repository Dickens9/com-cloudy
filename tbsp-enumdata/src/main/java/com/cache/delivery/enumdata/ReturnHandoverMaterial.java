package com.cache.delivery.enumdata;

/**
 * 
 * @author	linyulong
 * @date	2014-12-4
 * @Description 回团资料
 */
public enum ReturnHandoverMaterial {
	TRAVEL_LOG("TRAVEL_LOG" , "陪同日志"),
	INVOICE("INVOICE","发票"),
	TOURIST_FEEDBACK("TOURIST_FEEDBACK" , "游客意见表");
	
	
	private String key;
	private String value;
	
	ReturnHandoverMaterial(String key, String value){
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
