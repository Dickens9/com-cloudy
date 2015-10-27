package com.cache.delivery.enumdata;

/**
 * 
 * @author	yanzhenluan
 * @date	2014-11-20
 * @Description 服务交付  收取担保金状态
 */
public enum GuaranteeStatus {
	TO_CHARGE("TO_CHARGE" , "待缴款"),
	CHARGED("CHARGED","已缴款"),
	CONFIRMED("CONFIRMED","已确认"),
	REFUNDED("REFUNDED","已退还"),
	RETURNED("RETURNED","已撤销缴款");
	
	
	private String key;
	private String value;
	
	GuaranteeStatus(String key, String value){
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
