package com.ibm.uam.enumdata;
/**
 * 
 * 性别 
 *
 * @author linjiarong
 * @date 2014年11月24日 下午6:38:55 
 * @version 0.0.1
 *
 */
public enum Sex {
	DICT_TYPE("UAM_SEX","性别"),
	MALE("MALE","男"),
	FEMALE("FEMALE","女");

	private String code;
	private String value;
	
	private Sex(String code, String value) {
		this.code = code;
		this.value = value;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
