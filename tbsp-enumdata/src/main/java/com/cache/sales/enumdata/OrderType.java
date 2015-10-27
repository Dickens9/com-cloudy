/**
 * 
 */
package com.cache.sales.enumdata;

/**
 * 订单类型
 * 
 * @author hzy
 *
 */
public enum OrderType {
	DICT_TYPE("ORDER_TYPE", "证件类型"), 
	/**酒店*/
	Hotel("Hotel", "酒店"), 
	/**机票*/
	PassengerTicket("PassengerTicket", "机票"), 
	/**组团*/
	Tour("Tour", "组团"), 
	/**邮轮*/
	Cruises("Cruises", "邮轮"), 
	/**票券*/
	Tickets("Tickets", "票券"), 
	/**自由行*/
	Freedoms("Freedoms", "自由行"), 
	/**中航信机票*/
	Travelsky("Travelsky", "中航信机票"),
	/**签证*/
	Visa("Visa", "签证");

	private String key;
	private String value;

	private OrderType(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return this.key;
	}

	public String getValue() {
		return this.value;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
