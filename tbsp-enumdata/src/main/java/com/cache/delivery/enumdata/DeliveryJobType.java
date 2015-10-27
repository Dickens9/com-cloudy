package com.cache.delivery.enumdata;

/**
 * 
 * @author	zhangweijun
 * @date	2014-11-20
 * @Description 接待计划job执行类型
 */
public enum DeliveryJobType {
	OP_PLAN_INIT("OP_PLAN_INIT" , "接待计划初始化"),
	FIN_CARD_INIT("FIN_CARD_INIT","大卡成本收入项初始化");
	
	
	private String key;
	private String value;
	
	DeliveryJobType(String key, String value){
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
