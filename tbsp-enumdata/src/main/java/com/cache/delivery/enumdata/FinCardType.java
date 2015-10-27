/**
 * 
 */
package com.cache.delivery.enumdata;

/**
 * 大卡类型
 */
public enum FinCardType {
	ORDER("ORDER", "订单大卡"), 
	GROUP("GROUP", "团队大卡"),
	DISTRIBUTION("DISTRIBUTION", "代销大卡本");

	private String key;
	private String value;

	private FinCardType(String key, String value) {
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
