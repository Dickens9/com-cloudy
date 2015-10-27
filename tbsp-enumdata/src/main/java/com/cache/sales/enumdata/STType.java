package com.cache.sales.enumdata;
/**
 * 结算方式：
 * 单结、月结
 *
 */
public enum STType {
	ST_TYPE("ST_TYPE","结算方式"),
	SignleJunction("SignleJunction", "单结"), 
	Monthly("Monthly", "月结");
	
	private String key;
	private String value;

	private STType(String key, String value) {
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
