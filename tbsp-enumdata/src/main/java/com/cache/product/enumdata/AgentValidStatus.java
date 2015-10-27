package com.cache.product.enumdata;

public enum AgentValidStatus {
	Y("Y", "是"), N("N", "否");

	private AgentValidStatus(String code, String value) {
		this.code = code;
		this.value = value;
	}

	private String code;
	private String value;

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