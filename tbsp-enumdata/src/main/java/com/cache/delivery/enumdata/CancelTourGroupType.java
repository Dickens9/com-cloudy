/**
 * 
 */
package com.cache.delivery.enumdata;

/**
 * 旅行团的取消类型
 */
public enum CancelTourGroupType {
	CANCELED("CANCELED", "取消团"), 
	NOT_ENOUGH_TOURIST("NOT_ENOUGH_TOURIST", "不成团"),
	
	;

	private String key;
	private String value;

	private CancelTourGroupType(String key, String value) {
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
