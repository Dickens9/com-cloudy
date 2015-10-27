package com.cache.opportunity.enumdata;

public enum OperatorType {

	Update("Update", "修改"),
	Delete("Delete", "删除"),
	Approval("Approval", "评估");
	
	private String code;
	private String value;
	
	private OperatorType(String code, String value) {
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