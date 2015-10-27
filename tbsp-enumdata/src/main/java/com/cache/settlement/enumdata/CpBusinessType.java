
package com.cache.settlement.enumdata;

/** 
 * @ClassName: CpType 
 * @author shengjie
 * @date 2015年1月16日 下午5:43:32  
 */
public enum CpBusinessType {
	
	Purchase("Purchase","采购付款"),
	FinCard("FinCard","大卡付款"),
	Cost("Cost","成本付款");

	private String key;
	private String value;
	
	CpBusinessType(String key, String value){
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
