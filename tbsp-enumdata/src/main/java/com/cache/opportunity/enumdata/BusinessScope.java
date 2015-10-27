package com.cache.opportunity.enumdata;

public enum BusinessScope {
	CJY("CJY", "出境游"),
	GNY("GNY", "国内游"),
	GAT("GAT", "港澳台")
	;
	private String code;
	private String value;

	private BusinessScope(String code, String value) {
		this.code = code;
		this.value = value;
	}

	public String getCode() {
		return code;
	}

	public String getValue() {
		return value;
	}
	
	
}