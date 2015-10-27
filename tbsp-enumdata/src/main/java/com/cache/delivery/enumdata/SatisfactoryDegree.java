package com.cache.delivery.enumdata;

/**
 * 
 * @author	linyulong
 * @date	2014-12-4
 * @Description 满意度
 */
public enum SatisfactoryDegree {
	VERY_SATISFIED("VERY_SATISFIED" , "非常满意"),
	SATISFIED("SATISFIED" , "满意"),
	JUST_SO_SO("JUST_SO_SO" , "一般"),
	UNSATISFIED("UNSATISFIED","不满意"),
	QUITE_UNSATISFIED("QUITE_UNSATISFIED" , "非常不满意");
	
	private String key;
	private String value;
	
	SatisfactoryDegree(String key, String value){
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
