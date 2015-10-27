package com.cache.delivery.enumdata;

/**
 * 
 * @Description: 导游类型  
 * @author suxiaojing
 * @date 2014-11-19 
 */
public enum TourGuideType {

	ALL_IN_ONE("ALL_IN_ONE","全陪"),
	SEE_OFF("SEE_OFF","送团"),
	PICK_UP("PICK_UP","接团"),
	LOCAL_GUIDE("LOCAL_GUIDE","地陪");
	
	private String key;
	private String value;
	
	TourGuideType (String key, String value){
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
