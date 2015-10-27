/**
 * 
 */
package com.cache.delivery.enumdata;

/**
 * @author laiminzhan 分合团标志
 *  
 */
public enum ReGroupFlag {
	NORMAL("NORMAL", "正常"), JOINED("JOINED", "被合团"), JOINED_AS("JOINED_AS", "已合团"), SEPERATED("SEPERATED",
			"被分团"), SEPERATED_AS("SEPERATED_AS", "已分团");

	private String key;
	private String value;

	private ReGroupFlag(String key, String value) {
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
