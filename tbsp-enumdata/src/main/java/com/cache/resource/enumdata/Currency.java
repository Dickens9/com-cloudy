package com.cache.resource.enumdata;

public enum Currency {
	
	DICT_TYPE("CURRENCY","币种"),
	CNY("CNY","人民币"),
	USD("USD","美元"),
	HKD("HKD","港币"),
	EUR("EUR","欧元");
	
	private String key;
	private String value;
	private Currency(String key,String value){
		this.key = key;
		this.value = value;
	}

	public String getKey(){
		return this.key;
	}
	
	public String getValue(){
		return this.value;
	}
}
