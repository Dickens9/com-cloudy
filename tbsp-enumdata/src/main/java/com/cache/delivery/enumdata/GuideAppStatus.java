package com.cache.delivery.enumdata;

/**
 * 
 * @Description: 导游申请状态
 * @author suxiaojing
 * @date 2014-11-19 
 */
public enum GuideAppStatus {
	
	DRAFT("DRAFT","草稿"),
	SUBMITTED("SUBMITTED","已提交"),
	CLAIM("CLAIM" , "已认领"),
	UNASSIGNED("UNASSIGNED" , "未指派"),
	ASSIGNED("ASSIGNED" , "已指派"),
	FINISHED("FINISHED" , "已完成");
	
	private String key;
	private String value;
	
	GuideAppStatus(String key, String value){
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
