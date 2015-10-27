package com.cache.settlement.enumdata;

public enum EASCurrencyNumber {
	
	RMB("1","RMB"),
	HKD("2","HKD"),
	USD("3","USD"),
	EUR("4","EUR"),
	JPY("5","JPY"),
	AUD("6","AUD"),
	NZD("7","NZD"),
	MOP("8","MOP"),
	GBP("9","GBP");
	
	private String key;
	private String value;
	
	EASCurrencyNumber(String key, String value){
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
