package com.cache.sales.enumdata;

public enum VisaResStatus {

	VISA_RES_STATUS("VISA_RES_STATUS","签证资料收取状态"),
	HasReceived("HasReceived", "已收取"), 
	NoReceived("NoReceived", "未收取"),
	Refunded("Refunded","已退回");

	private String key;
	private String value;

	private VisaResStatus(String key, String value) {
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
