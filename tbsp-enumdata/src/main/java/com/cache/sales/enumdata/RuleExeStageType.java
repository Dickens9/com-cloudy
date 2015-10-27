package com.cache.sales.enumdata;

/**
 * 促销规则执行阶段类型
 * @author zyb
 *
 */
public enum RuleExeStageType {
	ORDER_SUBMIT("ORDER_SUBMIT","订单提交"),
	ORDER_ADD_RECORD("ORDER_ADD_RECORD","订单补录");

	private String key;
	private String value;
	private RuleExeStageType(String key, String value) {
		this.key = key;
		this.value = value;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
