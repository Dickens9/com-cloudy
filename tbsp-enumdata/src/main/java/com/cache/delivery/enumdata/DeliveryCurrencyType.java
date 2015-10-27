package com.cache.delivery.enumdata;

/**
 * 
 * @author	yanzhenluan
 * @date	2014-11-20
 * @Description 服务交付  币种
 */
public enum DeliveryCurrencyType {
	CNY("CNY" , "人民币"),
	USD("USD","美元"),
	HKD("CONFIRMED","港币"),
	EUR("EUR","欧元");
	
	
	private String key;
	private String value;
	
	DeliveryCurrencyType(String key, String value){
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
