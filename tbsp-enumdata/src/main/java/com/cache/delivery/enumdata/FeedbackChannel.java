package com.cache.delivery.enumdata;

/**
 * 
 * @author	linyulong
 * @date	2014-11-23
 * @Description 接待计划job执行状态
 */
public enum FeedbackChannel {
	TOURIST_FEEDBACK("TOURIST_FEEDBACK" , "游客意见"),
	GROUP_VISIT("GROUP_VISIT","游客回访");	
	private String key;
	private String value;
	
	FeedbackChannel(String key, String value){
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
