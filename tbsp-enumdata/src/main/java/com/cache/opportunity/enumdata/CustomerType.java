package com.cache.opportunity.enumdata;

import java.util.UUID;

public enum CustomerType {

	QYYH("QYYH", "企业用户"),
	GRYH("GRYH", "个人用户");
	private String code;
	private String value;
	private CustomerType(String code, String value) {
		this.code = code;
		this.value = value;
	}
	public String getCode() {
		return code;
	}
	public String getValue() {
		return value;
	}
	public static String getNextID() {
		return UUID.randomUUID().toString();
	}

	public static void main(String[] args) {
		System.out.println(getNextID().replaceAll("-", ""));
		System.out.println(getNextID().replaceAll("-", "").length());
	}
}