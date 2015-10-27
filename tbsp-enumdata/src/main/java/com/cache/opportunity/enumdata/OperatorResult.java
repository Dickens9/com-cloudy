package com.cache.opportunity.enumdata;

public enum OperatorResult {
	Pass("Pass", "通过"),
	Negative("Negative", "不通过");
	
	private String code;
	private String value;
	
	private OperatorResult(String code, String value) {
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