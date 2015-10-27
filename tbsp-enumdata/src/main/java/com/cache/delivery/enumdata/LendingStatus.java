package com.cache.delivery.enumdata;

/**
 * 
 * @author	linyulong
 * @date	2014-12-9
 * @Description 借支状态
 */
public enum LendingStatus {
	TO_LEND("TO_LEND" , "待放款"),
	LENT("LENT" , "已放款"),
	REIMBURSED("REIMBURSED" , "已报账");

	private String key;
	private String value;
	
	LendingStatus(String key, String value){
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
