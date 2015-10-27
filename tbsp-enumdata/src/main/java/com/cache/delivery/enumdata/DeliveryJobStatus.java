package com.cache.delivery.enumdata;

/**
 * 
 * @author	zhangweijun
 * @date	2014-11-20
 * @Description 接待计划job执行状态
 */
public enum DeliveryJobStatus {
	INITED("INITED" , "初始化"),
	EXECUTING("EXECUTING","执行中"),
	SUCCEED("SUCCEED","执行成功"),
	FAILED("FAILED" , "执行失败");
	
	
	private String key;
	private String value;
	
	DeliveryJobStatus(String key, String value){
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
