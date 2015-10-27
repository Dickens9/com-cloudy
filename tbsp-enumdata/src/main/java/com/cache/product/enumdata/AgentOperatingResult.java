package com.cache.product.enumdata;


public enum AgentOperatingResult {
	/**
	 * 操作成功
	 */
	SUCCESS("Success", "操作成功"),
	/**
	 * 额度小于零
	 */
	LESS_THAN_ZERO("LessThanZero", "额度小于零"),
	/**
	 * 结算类型是单清
	 */
	IS_SINGLE_CLEAR("IsSingleclear", "结算类型是单清"),
	/**
	 * 客户/企业ID为空
	 */
	ORG_ID_IS_NULL("OrgIdIsNull", "客户/企业ID为空"),
	/**
	 * 信用额度不存在或被删除
	 */
	NOT_EXIST("NotExist", "信用额度不存在或被删除"),
	/**
	 * 信用额度已无效
	 */
	INVALID("Invalid", "信用额度已无效"),
	/**
	 * 剩余额度不够
	 */
	INSUFFICIENT_AMOUNT("InsufficientAmount", "剩余额度不够"),
	/**
	 * 释放额度大于已用额度
	 */
	GREATER_USED_CREDIT_AMOUNT("GreaterUsedCreditAmount", "释放额度大于已用额度"),
	/**
	 * 操作类型不存在
	 */
	OPERATING_TYPE_NOT_EXIST("OperatingTypeNotExist", "操作类型不存在")
	;
	
	private String code;
	
	private String value;

	
	private AgentOperatingResult(String code, String value) {
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