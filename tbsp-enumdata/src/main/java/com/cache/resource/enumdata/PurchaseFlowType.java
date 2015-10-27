/**   
 * @Title: PurchaseFlowType.java 
 * @Package com.gzl.resource.enumdata 
 * @Description: 
 * @author shengjie
 * @date 2014年11月21日 下午5:57:23 
 * @version V1.0   
 */
package com.cache.resource.enumdata;

/** 
 * @ClassName: PurchaseFlowType 
 * @Description: 采购审批类型
 * @author shengjie
 * @date 2014年11月21日 下午5:57:23  
 */
public enum PurchaseFlowType {

	PO_ORG("PO_ORG", "采购订单部门审核"),
	PO_CO("PO_CO", "采购订单公司审核"),
	PR_ORG("PR_ORG", "采购需求部门审核"),
	PR_CO("PR_CO", "采购需求公司审核");
	
	private String key;
	private String value;
	
	PurchaseFlowType(String key, String value){
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
