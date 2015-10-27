/**
 * 
 */
package com.cache.delivery.enumdata;

/**
 * 大卡成本来源类型
 */
public enum CostSourceType {
	ORDER_RESOURCE_USAGE("DESCRIBE", "资源成本"), 
	VISA("VISA", "签证成本"),
	POLICY("POLICY", "保险成本"),
	ORDER_SERVICE("ORDER_SERVICE", "可选服务成本"),
	VEHICLE("VEHICLE", "接送车辆成本"),
	SETTLEMENT("SETTLEMENT","结算成本"),
	MANUAL("MANUAL", "手工录入成本");

	private String key;
	private String value;

	private CostSourceType(String key, String value) {
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
