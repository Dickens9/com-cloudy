package com.cache.sales.enumdata;

/**
 * 资料类型：
 * 合同,要约
 * @author hemeng
 *
 */
public enum DocumentType {
	DICT_TYPE("DOCUMENT_TYPE","资料类型"),
	contract("contract","合同"),
	offer("offer","要约");

	private String key;
	private String value;

	private DocumentType(String key, String value) {
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
