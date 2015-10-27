package com.ibm.uam.enumdata;

public enum TemplateVariableType {
	SingleSql("SINGLE_SQL","单值SQL"),
	Fixed("FIXED", "固定值"),
	ListSql("LIST_SQL", "列表SQL");
	
	private String code;
	
	private String value;
	
	private TemplateVariableType(String code, String value) {
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
