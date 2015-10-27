package com.cache.resource.enumdata;

public enum CabinType {
	
	EC("EC","经济舱"),
	FC("FC","头等舱"),
	BC("BC","商务舱");
	
	private String key;
	private String value;
	private CabinType(String key,String value){
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
