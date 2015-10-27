package com.cache.resource.enumdata;

public enum ClassType {
	
	HSC("HSC","硬卧"),
	SSC("SSC","软卧"),
	SCS("SCS","二等座"),
	FCS("FCS","一等座"),
	SPS("SPS","特等座"),
	ASSC("ASSC","高级软卧"),
	SS("SS","软座"),
	HS("HS","硬座"),
	NS("NS","无座");
	
	private String key;
	private String value;
	private ClassType(String key,String value){
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
