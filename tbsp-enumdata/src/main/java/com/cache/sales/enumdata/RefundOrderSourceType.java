package com.cache.sales.enumdata;

public enum RefundOrderSourceType {

	PendRefund_Type("pendRefund","待退款提交"),
	Submit_type("submit", "手工生成");


	private String key;
	private String value;

	private RefundOrderSourceType(String key, String value) {
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
