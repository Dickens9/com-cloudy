package com.cache.resource.enumdata;

/** 
 * @ClassName: SupplierAuthStatus 
 * @Description: 供应商授权状态
 * @author zhanglc
 * @date 2014年12月17日 下午8:48:17  
 */
public enum SupplierAuthStatus {

	Draft("Draft","未提交"),
	Handle("Handle","待审批"),
	Passed("Passed","已通过"),
	Returned("Returned","已退回");

	private String key;
	private String value;
	
	SupplierAuthStatus(String key, String value){
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
