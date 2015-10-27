package com.cache.delivery.enumdata;

/**
 * 派车用途
 * @author swg
 * @date 2014年12月17日 下午3:33:03
 */
public enum VehicleAppPurpose {
      
	PICK_UP ("PICK_UP ","接团"),
	
	SEE_OFF("SEE_OFF","送团");

	private String key;
	private String value;
	
	VehicleAppPurpose(String key, String value){
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
