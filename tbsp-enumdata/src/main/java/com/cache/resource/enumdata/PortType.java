package com.cache.resource.enumdata;

public enum PortType {

	Station("Station", "火车站"), 
	AirPort("AirPort", "机场"),
	Port("Port", "口岸");

	private String key;
	private String value;

	private PortType(String key, String value) {
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
