package com.cache.delivery.enumdata;

public enum InsuranceType {
	GROUP_INSURANCE("GROUP_INSURANCE" , "团险"),
	A_INSURANCE("A_INSURANCE","个险");
	private String key;
	private String value;

	InsuranceType(String key, String value){
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
