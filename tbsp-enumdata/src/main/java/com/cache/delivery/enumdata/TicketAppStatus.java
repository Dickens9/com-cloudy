/**
 * Copyright © 2014, IBM and/or GZL, All rights reserved.
 */
package com.cache.delivery.enumdata;

/**
 * 服务交付 出票申请状态
 * 
 * @author suxiaojing
 * @since 0.0.1
 */
public enum TicketAppStatus {

	DRAFT("DRAFT","草稿"),
	SUBMITTED("SUBMITTED","已提交"),
	CLAIM("CLAIM" , "已认领"),
	REISSUED("REISSUED", "已出票"),
	FINISH("FINISH","已完成");

	private String key;

	private String value;

	private TicketAppStatus(String key, String value) {
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
