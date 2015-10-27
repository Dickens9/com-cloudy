package com.cache.sales.enumdata;

/**
 * 订单结算状态：
 * 已结算、未结算
 * @author shaominglei
 *
 */
public enum STStatus {
	ST_STATUS("ST_STATUS","订单结算状态"),
	Settled("Settled", "已结算"), 
	UnSettled("UnSettled", "未结算");

	private String key;
	private String value;

	private STStatus(String key, String value) {
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
