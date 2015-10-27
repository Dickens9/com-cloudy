/**   
 * @Title: PoStatusType.java 
 * @Package com.gzl.resource.enumdata 
 * @Description: 
 * @author shengjie
 * @date 2014年11月21日 下午5:48:10 
 * @version V1.0   
 */
package com.cache.resource.enumdata;

/**
 * @ClassName: PoDetailStatusType 
 * @Description: 采购订单明细状态
 * @author shengjie
 * @date 2015年1月6日 下午2:20:43
 */
public enum PoDetailStatusType {

	Pending("Pending", "未入库"),
	StockIn("StockIn", "已入库");
	
	private String key;
	private String value;
	
	PoDetailStatusType(String key, String value){
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
