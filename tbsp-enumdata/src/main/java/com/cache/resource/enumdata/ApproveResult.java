package com.cache.resource.enumdata;

public enum ApproveResult {

	Passed("Passed","通过"),
	Returned("Returned","拒绝");
	
	private String key;
	private String value;
	private ApproveResult(String key,String value){
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
