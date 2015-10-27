package com.cache.settlement.enumdata;

/**
 * 收付款数据状态
 * @ClassName: CpStatus 
 * @author zhanglc
 * @date 2015年1月15日 下午2:38:11
 */
public enum CpStatus {
	
	BE_CONFIRM("BeConfirm","待确认"),
	CONFIRMED("Confirmed","已确认"),
	TO_FINANCE("ToFinance","已转财务"),
	TO_EAS("ToEAS","已转EAS");

	private String key;
	private String value;
	
	CpStatus(String key, String value){
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
