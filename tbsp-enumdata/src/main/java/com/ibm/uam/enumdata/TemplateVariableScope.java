package com.ibm.uam.enumdata;

public enum TemplateVariableScope {
	GLOBAL("GLOBAL","全局");
	
	private String code;
	
	private String value;
	
	private TemplateVariableScope(String code, String value) {
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
