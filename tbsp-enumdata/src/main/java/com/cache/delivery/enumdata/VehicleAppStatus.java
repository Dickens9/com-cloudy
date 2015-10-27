package com.cache.delivery.enumdata;

public enum VehicleAppStatus {
	DRAFT("DRAFT","草稿"),
	TO_APPOINT("TO_APPOINT","待派单"),
	TO_BE_ASSIGNED("TO_BE_ASSIGNED" , "待指派"),
	ASSIGNED("ASSIGNED" , "已指派");
	private String key;
	private String value;
	
	VehicleAppStatus(String key, String value){
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
