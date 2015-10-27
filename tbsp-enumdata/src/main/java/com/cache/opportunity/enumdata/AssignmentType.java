package com.cache.opportunity.enumdata;

public enum AssignmentType {

	CONS("Consultation", "咨询单"),
	OPPO("Opportunity", "商机单");
	
	private String code;
	
	private String value;
	
	private AssignmentType(String code, String value) {
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