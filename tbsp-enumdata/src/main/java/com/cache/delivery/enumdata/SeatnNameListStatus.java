package com.cache.delivery.enumdata;

/**
 *分座状态 
 * @author swg
 * @date 2014年12月22日 上午10:07:36
 */
public enum SeatnNameListStatus {
	ALEADY_BRANCH_SEAT("ALEADY_BRANCH_SEAT","已分座"),
	NOT_BRANCH_SEAT("NOT_BRANCH_SEAT","未分座");
	
	private String key;
	private String value;
	
	SeatnNameListStatus(String key, String value){
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
