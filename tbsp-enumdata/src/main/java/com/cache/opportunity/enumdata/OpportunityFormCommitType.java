package com.cache.opportunity.enumdata;

public enum OpportunityFormCommitType {

	ADD("ADD", "新增"), COMMIT("COMMIT", "提交");
	private String code;
	private String value;

	private OpportunityFormCommitType(String code, String value) {
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