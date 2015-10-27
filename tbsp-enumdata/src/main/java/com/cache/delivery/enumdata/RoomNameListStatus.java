package com.cache.delivery.enumdata;

/**
 * 分房单状态
 * @author swg
 * @date 2014年11月29日 下午12:32:15
 */
public enum RoomNameListStatus {
	
    ALEADY_BRANCH_ROOM("ALEADY_BRANCH_ROOM","已分房"),
	NOT_BRANCH_ROOM("NOT_BRANCH_ROOM","未分房");
	
	private String key;
	private String value;
	
	RoomNameListStatus(String key, String value){
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
