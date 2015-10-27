/**
 * 
 */
package com.cache.sales.enumdata;

/**
 * 经销商结算状态
 * @author hzy
 *
 */
public enum AccountingStatus {
	DICT_TYPE("ACCOUNTING_STATUS","经销商结算状态"),
	/**未确认*/
	READY("READY", "未确认"), 
	/**已确认*/
	DONE("DONE", "已确认");

	private String key;
	private String value;

	private AccountingStatus(String key, String value) {
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
