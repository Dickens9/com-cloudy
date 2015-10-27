
package com.cache.settlement.enumdata;

/**
 * @ClassName: EntryDc 
 * @author zhanglc
 * @date 2015年1月26日 下午4:01:05
 */
public enum EntryDc {
	
	BORROWER("1","借方"),
	LENDERs("-1","贷方");

	private String key;
	private String value;
	
	EntryDc(String key, String value){
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
