package com.cache.opportunity.enumdata;

public enum PropertyType {
	text("text", "文本框"),
	radio("radio", "单选按钮"),
	checkbox("checkbox", "复选框"),
	textarea("textarea", "文本域")
	;
	private String code;
	private String value;
	
	private PropertyType(String code, String value) {
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