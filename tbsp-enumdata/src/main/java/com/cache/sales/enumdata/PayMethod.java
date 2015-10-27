package com.cache.sales.enumdata;

/***
 * 支付方式：现金Cash、银行卡BankCards、信用卡CreditCard、公司卡BusinessCard、
 * 第三方支付ThirdPartPayment、汇款Remittance、支票Check、现金等 价物CashEquivaletns
 * 
 * @author lzq
 *
 */
public enum PayMethod {
	/**支付方式**/
	PAYMETHOD("PAYMETHOD","支付方式"),
	Cash("Cash","现金"),
	BankCards("BankCards","银行卡"),
	CreditCard("CreditCard","信用卡"),
	BusinessCard("BusinessCard","公司卡"),
	ThirdPartPayment("ThirdPartPayment","第三方支付"),
	Remittance("Remittance","汇款"),
	Check("Check","支票"),
	CashEquivaletns("CashEquivaletns","现金等 价物");
	
	private String key;
	private String value;

	private PayMethod(String key, String value) {
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
