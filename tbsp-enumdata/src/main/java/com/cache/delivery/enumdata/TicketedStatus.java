/**
 * Copyright © 2014, IBM and/or GZL, All rights reserved.
 */
package com.cache.delivery.enumdata;

/**
 * 服务交付 出票状态
 * 
 * @author suxiaojing
 * @since 0.0.1
 */
public enum TicketedStatus {

	UNAPP("UNAPP","未申请"),
	UNISSUED("UNISSUED", "未出票"),
	REISSUED("REISSUED", "已出票"),
	PARTISSUED("PARTISSUED", "部分出票"),
	ALLISSUED("ALLISSUED", "全部出票");

	private String key;

	private String value;

	private TicketedStatus(String key, String value) {
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
