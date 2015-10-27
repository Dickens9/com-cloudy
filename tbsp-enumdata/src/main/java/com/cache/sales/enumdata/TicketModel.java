package com.cache.sales.enumdata;

public enum TicketModel {

	TICKET_MODEL("TICKET_MODEL","出票模式"),
	Reception("Reception", "前台出票"), 
	Backstage("Backstage", "后台出票");

	private String key;
	private String value;

	private TicketModel(String key, String value) {
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
