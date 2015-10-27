package com.cache.opportunity.enumdata;

public enum AssignmentStatus {
	ASSIGN_GROUP("ASSIGN_GROUP", "指定到组"),
	ASSIGN_PERSON("ASSIGN_PERSON", "指定到人"),
	ASSIGN_LEADER("ASSIGN_LEADER", "待经理审核")
	;
	
	private String code;
	
	private String value;
	
	private AssignmentStatus(String code, String value) {
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