package com.cache.opportunity.enumdata;

public enum ProposalStatus {
	/**
	 * 草稿
	 */
	DRAFT("Draft", "草稿"),
	/**
	 * 待审核
	 */
	PENDING("Pending", "待审核"),
	/**
	 * 已驳回
	 */
	REJECT("Reject", "已驳回"),
	/**
	 * 审核通过
	 */
	PEDING_PASS("Pass", "审核通过"),
	/**
	 * 已确认
	 */
	Confirm("Confirm", "已确认")
	;
	
	private String code;
	private String value;

	private ProposalStatus(String code, String value) {
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