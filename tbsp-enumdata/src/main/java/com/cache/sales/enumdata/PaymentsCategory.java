/**
 * 
 */
package com.cache.sales.enumdata;

/**
 * 款项类别：收款，退款
 * 
 * @author hzy
 *
 */
public enum PaymentsCategory {
	/**款项类别*/
	PAYMENTS_CATEGORY("PAYMENTS_CATEGORY", "款项类别"), 
	/**收款*/
	Receivables("Receivables", "收款"), 
	/**退款*/
	Refund("Refund", "退款");

	private String key;
	private String value;

	private PaymentsCategory(String key, String value) {
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
