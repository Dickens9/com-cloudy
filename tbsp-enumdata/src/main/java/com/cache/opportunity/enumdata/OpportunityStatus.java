package com.cache.opportunity.enumdata;

public enum OpportunityStatus {
	DRAFT("Draft", "草稿"),
	PendingDirector("PendingDirector", "待经理审核"),
	DirectorPass("DirectorPass", "经理审核通过"),
	DirectorNegative("DirectorNegative", "经理审核不通过"),
	ASSIGNED("Assigned", "待计调分派"),
	PendingOfTune("PendingOfTune", "待计调审核"),
	OfTunePass("OfTunePass", "计调审核通过"),
	OfTuneNegative("OfTuneNegative", "计调审核不通过"),
	ProgramConfirmed("ProgramConfirmed", "待方案确认"),
	GeneratedOrders("GeneratedOrders", "已生成订单")
	;
	
	private String code;
	private String value;

	private OpportunityStatus(String code, String value) {
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
