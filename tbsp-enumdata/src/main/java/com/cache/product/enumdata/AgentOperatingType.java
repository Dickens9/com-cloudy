package com.cache.product.enumdata;

public enum AgentOperatingType {

	/**
	 * 扣减
	 */
	Deduction("Deduction", "扣减"),
	/**
	 * 释放
	 */
	Release("Release", "释放");
	
	private String code;
	private String value;
	
	private AgentOperatingType(String code, String value) {
		this.code = code;
		this.value = value;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}