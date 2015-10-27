package com.cache.sales.enumdata;

public enum PaymentStatus {
	PAYMENT_STATUS("PAYMENT_STATUS","订单支付状态"),
	NoPayment("NoPayment","未支付"),
	PendingPayment("PendingPayment", "等待付款"), 
	PartialPayment("PartialPayment", "部分付款"),
	Paid("Paid", "已付款"),
	PendingRefund("PendingRefund", "待退款"),
	PartialRefund("PartialRefund", "部分退款"),
	Refunded("Refunded", "已退款");

	private String key;
	private String value;

	private PaymentStatus(String key, String value) {
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
