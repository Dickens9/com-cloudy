/**
 * 
 */
package com.cache.product.enumdata;

/**
 * 餐别
 * 
 * @author Kevin
 * @date 2015年1月20日
 * @version 1.0.0
 * 
 */
public enum MealType {
	MEAL_TYPE("MEAL_TYPE", "餐别"),
	BREAKFAST("BREAKFAST", "早餐"),
	LUNCH("LUNCH", "午餐"),
	DINNER("DINNER", "晚餐"),
	SNACK("SNACK", "加餐");
	private MealType(String code, String value){
		this.code = code;
		this.value = value;
	}
	private String code;
	private String value;
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
