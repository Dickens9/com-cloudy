package com.cache.resource.enumdata;

public enum CenterStatus {
	
	Draft("Draft","未提交"),
	Passed("Passed","已通过"),
	Returned("Returned","已退回");
	
	private String key;
	private String value;
	
	private CenterStatus(String key,String value){
		this.key = key;
		this.value = value;
	}

	public String getKey(){
		return this.key;
	}
	
	public String getValue(){
		return this.value;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
