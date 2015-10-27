package com.cache.resource.enumdata;

public enum CatalogType {
	
	IMAGE("IMAGE","图片素材"),
	DOC("DOC","附件文档");
	
	private String key;
	private String value;
	
	private CatalogType(String key,String value){
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
