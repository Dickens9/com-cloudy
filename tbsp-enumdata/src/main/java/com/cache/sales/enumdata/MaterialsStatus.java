package com.cache.sales.enumdata;

public enum MaterialsStatus {
	UN_USE_TYPE("UN_USE_TYPE","0"),
	USED_TYPE("USED_TYPE","1"),
	BACK_TYPE("BACK_TYPE","2");
	private String key;
	private String value;
	private MaterialsStatus(String key, String value) {
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
