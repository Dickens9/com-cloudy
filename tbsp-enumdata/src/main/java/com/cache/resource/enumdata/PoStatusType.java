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
 * @ClassName: PoStatusType 
 * @Description: 采购订单状态
 * @author shengjie
 * @date 2014年11月21日 下午5:48:10  
 */
public enum PoStatusType {

	Draft("Draft", "未提交"),
	Returned("Returned", "已退回"),
	Canceled("Canceled", "已取消"),
	DepHandle("DepHandle", "待部门审批"),
	CoHandle("CoHandle", "待公司审批"),
	Passed("Passed", "已通过"),
	StockIn("StockIn", "已入库");
	
	private String key;
	private String value;
	
	PoStatusType(String key, String value){
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
