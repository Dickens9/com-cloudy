/**
 * 
 */
package com.cache.delivery.enumdata;

/**
 * @author David 大卡状态
 */
public enum FinCardStatus {
	CONFIRMED("CONFIRMED", "已确认"), FIN_CARD_NUM_GENERATED("FIN_CARD_NUM_GENERATED", "待转财务"), SYNC_TO_EAS("SYNC_TO_EAS", "已转财务");

	private String key;
	private String value;

	private FinCardStatus(String key, String value) {
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
