package com.cache.resource.enumdata;

/**
 * 票券性质
 * @author zhanglc
 * @since 0.0.1
 */
public enum TicketsProperty {

	Term("Term","期票"),
	Single("Single","单日票");
	
	private String key;
	private String value;
	
	private TicketsProperty(String key, String value) {
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
