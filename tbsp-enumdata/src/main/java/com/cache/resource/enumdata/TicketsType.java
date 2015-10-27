package com.cache.resource.enumdata;

/** 
 * @ClassName: DirectoryType 
 * @Description: 数据字典类型
 * @author zhangxf
 * @date 2014年11月20日 下午5:26:36  
 */
public enum TicketsType {
	
	DICT_TYPE("TICKETS_TYPE","票券类型"),
	SCENIC_TICKET("Scenic","景点门票"),
	CATERING("Catering","餐饮团购"),
	CRUISE_TICKET("Cruise","游船票");

	private String key;
	private String value;
	
	TicketsType(String key, String value){
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
