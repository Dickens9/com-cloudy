package com.cache.sales.enumdata;

/**
 * 游客类别：
 * 成人、儿童、婴儿、老人
 * 
 * @author shaominglei
 *
 */
public enum TouristType {
	DICT_TYPE("TOURIST_TYPE","游客类别"),
	Adult("Adult", "成人"), 
	Child("Child", "儿童"), 
	Baby("Baby", "婴儿"), 
	OldPeople("OldPeople", "老人");

	private String key;
	private String value;

	private TouristType(String key, String value) {
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
