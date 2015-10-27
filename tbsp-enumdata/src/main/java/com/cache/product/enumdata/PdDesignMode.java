/**
 * 
 */
package com.cache.product.enumdata;

/**
 * 产品设计模式
 * 
 * @author Kevin
 * @date 2014年12月5日
 * @version 1.0.0
 * 
 */
public enum PdDesignMode {
	PD_DESIGN_MODE("PD_DESIGN_MODE", "产品设计模式"),
	Standard("Standard", "标准"),
	Customized("Customized", "定制");
	
	private String code;
	private String value;
	
	private PdDesignMode(String code, String value){
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
