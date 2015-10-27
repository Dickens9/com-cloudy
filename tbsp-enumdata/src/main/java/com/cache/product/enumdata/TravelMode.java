/**
 * 
 */
package com.cache.product.enumdata;

/**
 * 旅行方式
 * 
 * @author Kevin
 * @date 2014年12月5日
 * @version 1.0.0
 * 
 */
public enum TravelMode {
	TRAVEL_MODE("TRAVEL_MODE", "旅行方式"),
	TEAM("TEAM", "团队出行"),
	SELF("SELF", "自助出行");
	
	private String code;
	private String value;
	
	private TravelMode(String code, String value){
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
