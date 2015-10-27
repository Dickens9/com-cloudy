package com.cache.resource.enumdata;

/**
 * 
 * @Description: 导游级别  
 * @author suxiaojing
 * @date 2014-11-19 
 */
public enum InnerGrade {
	NOVICE("NOVICE","见习"),
	JUNIOR("JUNIOR","初级"),
	MEDIUM("MEDIUM","中级"),
	SENIOR("TRANSLATOR","高级"),
	GOLD("GOLD","金牌"),
	SUPERGOLD("SUPERGOLD","鼎金");
	
	private String key;
	private String value;
	
	InnerGrade (String key, String value){
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
