package com.cache.opportunity.enumdata;

public enum ConsultationStatus {
	
	DRAFT("Draft", "草稿"), 
	ASSIGNED("Assigned", "待分派"), 
	ASSIGNEDGP("AssignedGP", "已分派到组"), 
	ASSIGNEDPOP("AssignedPOP", "已分派到人"),
	CANCELED("Canceled", "已取消"),
	GERENATEOP("GerenateOP", "已生成商机");
	
	private String code;
	private String value;

	private ConsultationStatus(String code, String value) {
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