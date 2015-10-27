/**
 * 
 */
package com.cache.product.enumdata;

/**
 * 行程安排类型
 * 
 * @author Kevin
 * @date 2014年12月4日
 * @version 1.0.0
 * 
 */
public enum TravelPlanType {
	
	Single("Single","单项"),
	Traffic("Traffic", "交通"),
	Hotel("Hotel", "住宿"),
	Scenic("Scenic", "景点"),
	Dining("Dining", "餐饮"),
	CruiseRoom("CruiseRoom", "游轮舱房"),
	ToService("ToService","地接服务");
	
	private String code;
	private String value;
	
	private TravelPlanType(String code, String value){
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
