package com.cache.sales.enumdata;
/**
 * 欠位单类型：
 * 要约、合同、变更单
 * @author luozq
 *
 */
public enum IndebtType {
	INDEBT_TYPE("INDEBT_TYPE","欠位单类型"),
	Offer("Offer","要约"),
	Contract("Contract","合同"),
	ChangeOrder("ChangeOrder","变更单");
	
	private String key;
	private String value;

	private IndebtType(String key, String value) {
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
