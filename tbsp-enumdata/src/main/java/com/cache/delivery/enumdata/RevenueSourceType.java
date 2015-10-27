/**
 * 
 */
package com.cache.delivery.enumdata;

/**
 * 大卡收入来源类型
 */
public enum RevenueSourceType {
	ORDER_EXPENSEITEMS("ORDER_EXPENSEITEMS", "订单费用明细"),
	MANUAL("MANUAL", "手工录入收入");

	private String key;
	private String value;

	private RevenueSourceType(String key, String value) {
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
