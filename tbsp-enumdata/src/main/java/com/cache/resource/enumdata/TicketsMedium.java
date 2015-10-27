package com.cache.resource.enumdata;

/** 
 * @ClassName: DirectoryType 
 * @Description: 数据字典类型
 * @author can
 * @date 2014年11月22日 下午6:13:36  
 */
public enum TicketsMedium {

	XP("01","现票"),
	HPZ("02","换票证"),
	DZP("03","电子票"),
	TP("04","团票");
	
	private String key;
	private String value;
	
	private TicketsMedium(String key, String value) {
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
