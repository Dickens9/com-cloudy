/**   
 * @Title: DataStatusType.java 
 * @Package com.gzl.resource.enumdata 
 * @Description: 
 * @author shengjie
 * @date 2014年11月21日 上午9:24:19 
 * @version V1.0   
 */
package com.cache.resource.enumdata;

/** 
 * @ClassName: DataStatusType 
 * @Description: 数据状态
 * @author shengjie
 * @date 2014年11月21日 上午9:24:19  
 */
public enum DataStatusType {
	
	AVAILABLY("AVL", "有效"),
	UNAVAILABLY("UNAVL", "停用"),
	Manual("Manual","手工");
	
	private String key;
	private String value;
	
	DataStatusType(String key, String value){
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
