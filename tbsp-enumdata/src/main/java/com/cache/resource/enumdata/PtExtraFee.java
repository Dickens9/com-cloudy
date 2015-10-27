package com.cache.resource.enumdata;

public enum PtExtraFee {

	BAF800U("BAF800+", ""),
	BAF800("BAF800", ""),
	AirportTax("AirportTax", "");
	
	private String key;
	private String value;
	private PtExtraFee(String key,String value){
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
