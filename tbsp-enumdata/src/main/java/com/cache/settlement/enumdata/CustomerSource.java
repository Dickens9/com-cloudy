package com.cache.settlement.enumdata;

/**
 * 客户来源
 * @ClassName: CustomerSource 
 * @author zhanglc
 * @date 2015年1月15日 下午2:38:11
 */
public enum CustomerSource {
	
	ORG("Org","组织机构"),
	PEER("Peer","同业客户"),
	CRM("CRM","CRM客户"),
	NETWORK("Network","网络成员");

	private String key;
	private String value;
	
	CustomerSource(String key, String value){
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
