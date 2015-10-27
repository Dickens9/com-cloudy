package com.cache.sales.enumdata;
/**
 * 
 * 退款类型：
 * 正常退款、理赔款
 *
 */
public enum RefundType {
	REFUND_TYPE("REFUND_TYPE","退款类型"),
	NormalRefund("NormalRefund","正常退款"),
	ClaimMoney("ClaimMoney","理赔款");
	
	private String key;
	private String value;

	private RefundType(String key, String value) {
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
