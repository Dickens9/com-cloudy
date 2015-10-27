package com.cache.settlement.enumdata;

/**
 * 数据状态
 * @ClassName: DataStatus
 * @author zhanglc
 * @date 2015年1月15日 下午2:38:00
 */
public enum DataStatus {
	
	AVAILABLY("AVL", "有效"),
	UNAVAILABLY("UNAVL", "停用");
	
	private String key;
	private String value;
	
	DataStatus(String key, String value){
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
