package com.cache.resource.enumdata;

public enum Sex {
	
	Female("Female","女"),
	Male("Male","男");
	
	private String key;
	private String value;
	private Sex(String key,String value){
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
