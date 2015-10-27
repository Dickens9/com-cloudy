package com.cache.sales.enumdata;

/**
 * 模板类型：
 * 合同,要约,欠位,退款单
 * @author hemeng
 *
 */
public enum TemplateType {
	TEMPLATE_TYPE("TEMPLATE_TYPE","模板类型"),
	Contract("Contract","合同"),
	Offer("Offer","要约"),
	Indebt("Indebt","欠位"),
	Refund("Refund","退款单")
	;

	private String key;
	private String value;

	private TemplateType(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return this.key;
	}

	public String getValue() {
		return this.value;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
