/**   
 * @Title: UsageStatus.java 
 * @Package com.gzl.resource.enumdata 
 * @Description: 
 * @author shengjie
 * @date 2014年11月29日 上午11:06:55 
 * @version V1.0   
 */
package com.cache.resource.enumdata;

/** 
 * @ClassName: UsageStatus 
 * @Description: 
 * @author shengjie
 * @date 2014年11月29日 上午11:06:55  
 */
public enum UsageStatus {
	
	Locked("Locked", "预占"),
	Used("Used", "占用");
	
	private String key;
	private String value;
	
	UsageStatus(String key, String value){
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
