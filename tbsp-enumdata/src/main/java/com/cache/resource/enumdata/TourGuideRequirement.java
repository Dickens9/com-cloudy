package com.cache.resource.enumdata;

/**
 * 
 * @Description: 导游要求  
 * @author suxiaojing
 * @date 2014-11-19 
 */
public enum TourGuideRequirement {
	TOUR_CONDUCTOR("TOUR_CONDUCTOR","领队直踩"),
	LOCAL_GUIDE("LOCAL_GUIDE","上地陪"),
	DRIVER("DRIVER","司机兼导游"),
	TRANSLATOR("TRANSLATOR","翻译");
	
	private String key;
	private String value;
	
	TourGuideRequirement(String key, String value){
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
