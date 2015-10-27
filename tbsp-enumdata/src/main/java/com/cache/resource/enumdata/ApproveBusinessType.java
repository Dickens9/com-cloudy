package com.cache.resource.enumdata;

public enum ApproveBusinessType {
	
	PURCHASE("PURCHASE","资源采购"),
	SUPPLIER_AUTH("SUPPLIER_AUTH","供应商资源审批");
	
	private String key;
	private String value;
	private ApproveBusinessType(String key,String value){
		this.key = key;
		this.value = value;
	}

	public String getKey(){
		return this.key;
	}
	
	public String getValue(){
		return this.value;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
