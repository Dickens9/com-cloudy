package com.cache.resource.enumdata;

public enum PlaneTicketType {
	
	ONE_WAY("01","单程"),
	ROUND_TRIP("02","往返"),
	MULTI_CITY("03","联程");

	private String key;
	private String value;
	
	PlaneTicketType(String key, String value){
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
