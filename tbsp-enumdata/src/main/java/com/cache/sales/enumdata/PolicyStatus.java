package com.cache.sales.enumdata;

/***
 * 保单状态：未投保Uninsured、已投保Insured、已退保CancelInsured
 * 
 *
 */
public enum PolicyStatus {
	Uninsured("Uninsured","未投保"),
	Insured("Insured","已投保"),
	CancelInsured("CancelInsured","已退保"),
	CancelRecored("CancelRecored","退保登记"),
	Canceled("Canceled","已取消");
	
	private String key;
	private String value;

	private PolicyStatus(String key, String value) {
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
