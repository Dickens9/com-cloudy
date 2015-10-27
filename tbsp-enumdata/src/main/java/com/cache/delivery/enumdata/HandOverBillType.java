package com.cache.delivery.enumdata;

/**
 * 
 * @author	yanzhenluan
 * @date	2014-12-4
 * @Description 服务交付  团队交接单类型
 */
public enum HandOverBillType {
	SETOUT("SETOUT" , "出团交接单"),
	RETURN("RETURN","回团交接单");
	
	
	private String key;
	private String value;
	
	HandOverBillType(String key, String value){
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
