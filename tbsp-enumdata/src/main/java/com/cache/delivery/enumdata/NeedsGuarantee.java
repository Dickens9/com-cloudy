package com.cache.delivery.enumdata;

/**
 * 
 * @author	yanzhenluan
 * @date	2014-11-20
 * @Description 服务交付  是否需要收取担保金
 */
public enum NeedsGuarantee {
	Y("Y","是"),
	N("N","否");
	
	
	
	private String key;
	private String value;
	
	NeedsGuarantee(String key, String value){
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
