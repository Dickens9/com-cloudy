package com.cache.delivery.enumdata;

/**
 * 
 * @author	zhangweijun
 * @date	2014-11-20
 * @Description 接待计划状态
 */
public enum ReceptionPlanStatus {
	INIT("INIT" , "初始化"),
	DRAFT("DRAFT","草稿"),
	SUBMITTED("SUBMITTED","已提交"),
	CONFIRM("CONFIRM" , "确认接收"),
	ARRANGEMENT("ARRANGEMENT" , "已安排");
	
	
	private String key;
	private String value;
	
	ReceptionPlanStatus(String key, String value){
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
