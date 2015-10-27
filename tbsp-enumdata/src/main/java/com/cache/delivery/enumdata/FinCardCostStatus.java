/**
 * 
 */
package com.cache.delivery.enumdata;

/**
 * @author David 大卡成本项状态
 */
public enum FinCardCostStatus {
	INITED("INITED", "待确认"), CONFIRMED("CONFIRMED", "已确认"), FIN_CARD_NUM_GENERATED("FIN_CARD_NUM_GENERATED", "待转财务"), SYNC_TO_EAS("SYNC_TO_EAS", "已转财务"), WRITTEN_OFF(
			"WRITTEN_OFF", "已付款/核销");

	private String key;
	private String value;

	private FinCardCostStatus(String key, String value) {
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
