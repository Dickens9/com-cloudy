package com.cache.delivery.enumdata;

/**
 * 
 * @author	yanzhenluan
 * @date	2014-12-4
 * @Description 服务交付  出团交接资料
 */
public enum SetOutHandoverMaterial {
	TOURIST_NAMELIST("TOURIST_NAMELIST" , "游客名单"),
	ARRANGEMENT("ARRANGEMENT","行程单"),
	ROOM_NAMELIST("ROOM_NAMELIST","分房名单"),
	SEAT_NAMELIST("SEAT_NAMELIST","分座名单"),
	DEBIT_BILL("DEBIT_BILL","借款单");
	
	
	private String key;
	private String value;
	
	SetOutHandoverMaterial(String key, String value){
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
