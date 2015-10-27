package com.cache.delivery.enumdata;

public enum VisaAppStatus {
	TO_COLLECT("TO_COLLECT","待收料"),
	TO_QUALIFY("TO_QUALIFY","资料待核查"),
	TO_APPLY("TO_APPLY","待送签"),
	APPLIED("APPLIED","已送签"),
	ISSUED("ISSUED","已出签"),
	WRITTEN_OFF("WRITTEN_OFF","已销签");

	
	private String key;
	private String value;
	
	VisaAppStatus(String key, String value){
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
