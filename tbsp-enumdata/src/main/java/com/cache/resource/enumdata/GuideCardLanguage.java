package com.cache.resource.enumdata;

/**
 * 
 * @Description: 导游语种  
 * @author suxiaojing
 * @date 2014-11-19 
 */
public enum GuideCardLanguage {

	CANTONESE("CANTONESE","粤语"),
	CHINESE("CHINESE","普通话"),
	ENGLISH("ENGLISH","英语"),
	KOREAN("KOREAN","韩文"),
	JAPANESE("JAPANESE","日语"),
	GERMAN("GERMAN","德语"),
	ARABIC("ARABIC","阿拉伯语");
	
	private String key;
	private String value;
	
	GuideCardLanguage (String key, String value){
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
