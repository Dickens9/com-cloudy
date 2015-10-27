package com.cache.sales.enumdata;

public enum OrderLockStatus {
	ORDER_LOCK_STATUS("ORDER_LOCK_STATUS","订单锁定状态"),
	Locked("Locked", "已锁定"), 
	Unlocked("Unlocked", "未锁定");
	

	private String key;
	private String value;

	private OrderLockStatus(String key, String value) {
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
