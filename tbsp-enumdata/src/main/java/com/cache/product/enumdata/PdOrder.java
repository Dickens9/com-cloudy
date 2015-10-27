/**
 * 
 */
package com.cache.product.enumdata;

/**
 * 产品排序级别
 * 
 * @author Kevin
 * @date 2014年12月5日
 * @version 1.0.0
 * 
 */
public enum PdOrder {
	
	First("1", "一"),
	Second("2", "二"),
	Three("3", "三"),
	Four("4", "*"),
	Def("100", "默认");
	
	private String code;
	private String value;
	
	private PdOrder(String code, String value){
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
