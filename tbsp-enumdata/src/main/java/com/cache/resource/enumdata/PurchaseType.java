
package com.cache.resource.enumdata;

/** 
 * 采购方式
 * @ClassName: PurchaseType 
 * @author shengjie
 * @date 2015年1月16日 下午4:00:33  
 */
public enum PurchaseType {
	
	Prepaid("Prepaid","预付采购"),
	Reserve("Reserve","针对性采购"),
	Postpay("Postpay","后付采购");
	
	private String key;
	private String value;
	private PurchaseType(String key,String value){
		this.key = key;
		this.value = value;
	}

	public String getKey(){
		return this.key;
	}
	
	public String getValue(){
		return this.value;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
