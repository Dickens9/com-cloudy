package com.cache.delivery.enumdata;

/**
 * 
 * @author	linyulong
 * @date	2014-11-23
 * @Description 接待计划job执行状态
 */
public enum DeliveryApproveStatus {
	TO_APPROVE("TO_APPROVE" , "待审核"),
	APPROVED("APPROVED","审核通过"),	
	DISAPPROVED("DISAPPROVED","审核不通过");
	private String key;
	private String value;

	DeliveryApproveStatus(String key, String value){
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
