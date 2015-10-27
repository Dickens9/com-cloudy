package com.cache.delivery.enumdata;

public enum VisaMaterialStatus {
	TO_COLLECTE("TO_COLLECTE","未到料"),
	COLLECTED("COLLECTED","已到料"),
	QUALIFIED("QUALIFIED" , "资料合格"),
	RETURNED("RETURNED" , "已退还");
	private String key;
	private String value;
	
	VisaMaterialStatus(String key, String value){
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
