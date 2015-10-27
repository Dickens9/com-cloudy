package com.cache.resource.enumdata;

public enum DestinationType {
	
	DICT_TYPE("DESTINATION_TYPE","目的地类型"),
	CONTINENT("CONTINENT","大洲"),
	COUNTRY("COUNTRY","国家"),
	PROVINCE("PROVINCE","省份"),
	CITY("CITY","城市"),
	AREA("AREA","地区"),
	NONE("NONE","非标准行政区");

	private String key;
	private String value;
	private DestinationType(String key,String value){
		this.key = key;
		this.value = value;
	}

	public String getKey(){
		return this.key;
	}
	
	public String getValue(){
		return this.value;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
