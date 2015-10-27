
package com.cache.settlement.enumdata;

/** 
 * @ClassName: CpType 
 * @author shengjie
 * @date 2015年1月16日 下午5:43:32  
 */
public enum CpType {
	
	Collection("Collection","收款"),
	Payment("Payment","付款");

	private String key;
	private String value;
	
	CpType(String key, String value){
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
