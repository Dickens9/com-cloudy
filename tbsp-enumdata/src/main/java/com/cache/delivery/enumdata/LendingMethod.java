package com.cache.delivery.enumdata;

/**
 * 
 * @author	linyulong
 * @date	2014-12-9
 * @Description 借支放款方式
 */
public enum LendingMethod {
	CASH("CASH" , "现金"),
	BANK_TRANSFER("BANK_TRANSFER" , "银行转账");

	private String key;
	private String value;
	
	LendingMethod(String key, String value){
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
