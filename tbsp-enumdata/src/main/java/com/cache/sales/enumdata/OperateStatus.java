package com.cache.sales.enumdata;

public enum OperateStatus {
	OPERATE_STATUS("OPERATE_STATUS","订单操作状态"),
	Processed("Processed", "已处理"), 
	Untreated("Untreated", "未处理");
	

	private String key;
	private String value;

	private OperateStatus(String key, String value) {
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
