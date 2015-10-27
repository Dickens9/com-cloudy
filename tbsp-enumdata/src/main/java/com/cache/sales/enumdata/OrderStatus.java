package com.cache.sales.enumdata;

/**
 * 证件类型：
 * 草稿、待确认、已确认、订单完成、已取消
 * @author shaominglei
 *
 */
public enum OrderStatus {
	ORDER_STATUS("ORDER_STATUS","订单状态"),
	Draft("Draft", "草稿"), 
	Submitted("Submitted", "已提交"), 
//	BeConfirm("BeConfirm", "待确认"), 
	BeResourceConfirm("BeResourceConfirm", "待资源确认"), 
//	ResourceConfirmation("ResourceConfirmation", "资源确认中"), 
	ResourceConfirmed("ResourceConfirmed", "资源已确认"), 
	BeIndustryConfirm("BeIndustryConfirm", "待同业确认"), 
	IndustryConfirmed("IndustryConfirmed", "同业已确认"), 
	IndustryCancelled("IndustryCancelled", "同业取消"), 
	BeResourceOperate("BeResourceOperate", "待资源处理"), 
//	ResourceTreatment("ResourceTreatment", "待资处理中"), 
	ResourceOperated("ResourceOperated", "资源已处理"), 
	OperatorCancelled("OperatorCancelled", "计调取消"), 
	BeGTAOperate("BeGTAOperate", "待GTA处理"), 
	GTAOperated("GTAOperated", "GTA已处理"), 
	GTACancelled("GTACancelled", "GTA取消"), 
	BeGroupConfirm("BeGroupConfirm","待成团确认"),
	GroupConfirmed("GroupConfirmed","已成团确认"),
	BeFrontResOper("BeFrontResOper","待前台资源处理"),
	FrontResOperated("FrontResOperated","前台资源处理"),
	BeGroup("BeGroup","待出团"),
	Grouping("Grouping","出团中"),
	Groupped("Groupped","已出团"),
	SalesCancel("SalesCancel","销售取消"),
	CustomerCancel("CustomerCancel","客户取消"),
	BeCancel("BeCancel","待取消"),
	FullConfirmed("FullConfirmed", "订单完成"),
	Cancelled("Cancelled", "订单取消");

	private String key;
	private String value;

	private OrderStatus(String key, String value) {
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
