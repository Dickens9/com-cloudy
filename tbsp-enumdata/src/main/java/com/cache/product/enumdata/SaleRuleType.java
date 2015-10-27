/**
 * 
 */
package com.cache.product.enumdata;

/**
 * 销售规则
 * 
 * @author Kevin
 * @date 2015年1月14日
 * @version 1.0.0
 * 
 */
public enum SaleRuleType {
	
	MUST("MUST", "必须买"),
	OPTIONAL("OPTIONAL", "可选买"),
	CANNOT("CANNOT", "可选买");
	private String code;
	private String value;
	private SaleRuleType(String code, String value){
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
