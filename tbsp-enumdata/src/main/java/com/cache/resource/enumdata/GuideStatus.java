package com.cache.resource.enumdata;

public enum GuideStatus {
	
	Free("Free","空闲"),
	Work("Work","带团"),
	Training("Training","培训");
	
	private String key;
	private String value;
	private GuideStatus(String key,String value){
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
