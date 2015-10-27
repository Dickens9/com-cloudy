package com.cache.delivery.enumdata;

public enum VisaAppResult {
	ISSUED("ISSUED","正常出签"),
	REFUSED("REFUSED","拒签");

	
	
	private String key;
	private String value;
	
	VisaAppResult(String key, String value){
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
