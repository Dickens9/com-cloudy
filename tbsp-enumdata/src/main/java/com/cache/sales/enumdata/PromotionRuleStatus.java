package com.cache.sales.enumdata;

/***
 * 优惠规则状态：草稿Draft、已上架OnSale、已下架OffShelves
 * 
 *
 */
public enum PromotionRuleStatus {
	Draft("0","草稿"),
	OnSale("1","已上架"),
	OffShelves("2","已下架");
	
	private String key;
	private String value;

	private PromotionRuleStatus(String key, String value) {
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
