package com.cache.sales.enumdata;

/**
 * 发票状态：
 * 已开,作废,回收,注销
 * @author shaominglei
 *
 */
public enum InvoiceStatus {
	INVOICE_STATUS("INVOICE_STATUS","发票状态"),
	InvoiceOk("InvoiceOk","已开"),
	InvoiceCancel("InvoiceCancel","作废"),
	InvoiceRecover("InvoiceRecover","回收"),
	Invoicelogout("InvoiceLogout","注销");


	private String key;
	private String value;

	private InvoiceStatus(String key, String value) {
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
