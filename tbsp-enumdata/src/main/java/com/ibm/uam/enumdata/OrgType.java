package com.ibm.uam.enumdata;

public enum OrgType {
	
	DICT_TYPE("UAM_ORG_TYPE","组织类型"),
	COM("COM","公司"),
	DEP("DEP","部门");

	private String code;
	private String value;
	
	
	private OrgType(String code, String value) {
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
