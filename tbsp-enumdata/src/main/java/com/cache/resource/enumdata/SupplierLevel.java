package com.cache.resource.enumdata;

public enum SupplierLevel {
	
	DICT_TYPE("SUPPLIER_LEVEL","供应商等级"),
	A("A","A级"),
	B("B","B级"),
	C("C","C级"),
	N("N","永不使用");
	
	private String key;
	private String value;
	private SupplierLevel(String key,String value){
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
