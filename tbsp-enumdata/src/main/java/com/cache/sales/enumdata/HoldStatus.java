package com.cache.sales.enumdata;

public enum HoldStatus {

	HOLD_STATUS("HOLD_STATUS","占位状态"),
	HasHold("HasHold", "已占位"), 
	HasClear("HasClear", "已清位"), 
	Used("Used", "已使用");

	private String key;
	private String value;

	private HoldStatus(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return this.key;
	}

	public String getValue() {
		return this.value;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
