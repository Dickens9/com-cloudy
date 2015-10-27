package com.cache.resource.enumdata;

public enum TrainType {

	G("G", "高铁"),
	D("D", "动车"),
	Z("Z", "直达"), 
	T("T", "特快"), 
	K("K", "快速"),
	KTT("KTT", "广九直通车");

	private String key;
	private String value;

	private TrainType(String key, String value) {
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
