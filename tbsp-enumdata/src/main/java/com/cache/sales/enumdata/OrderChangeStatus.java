package com.cache.sales.enumdata;


public enum OrderChangeStatus {
	
	ORDER_CHANGE_STATUS("ORDER_CHANGE_STATUS","变更单状态"),
	WaitingSubmit("WSubmit","待提交"),
	WaitingAudit("WAudit", "待审核"), 
	WaitingResourceComfirm("WRComfirm", "待资源确认"), 
	Finish("Finish", "已完成");
	

	private String key;
	private String value;

	private OrderChangeStatus(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public static String loadValueByKey(String key){
		String value = null;
		if(OrderChangeStatus.WaitingAudit.getKey().equals(key)){
			value = OrderChangeStatus.WaitingAudit.getValue();
		}else if(OrderChangeStatus.WaitingSubmit.getKey().equals(key)){
			value = OrderChangeStatus.WaitingSubmit.getValue();
		}else if(OrderChangeStatus.WaitingResourceComfirm.getKey().equals(key)){
			value = OrderChangeStatus.WaitingResourceComfirm.getValue();
		}else if(OrderChangeStatus.Finish.getKey().equals(key)){
			value = OrderChangeStatus.Finish.getValue();
		}
		return value;
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
