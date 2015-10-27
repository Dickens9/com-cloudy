package com.cache.delivery.enumdata;

/**
 * 
 * @author	yanzhenluan
 * @date	2014-11-20
 * @Description 服务交付  '担保金收取方式'  枚举类
 */
public enum GuaranteeHandinMethod {
	BOC_PASSBOOK_ORIGINAL("BOC_PASSBOOK_ORIGINAL" , "中行存折原件"),
	ICBC_CAPITAL_FROZEN("ICBC_CAPITAL_FROZEN","工行银行冻结"),
	SCB_CAPITAL_FROZEN("SCB_CAPITAL_FROZEN","渣打银行冻结"),
	REMITTANCE("REMITTANCE","汇款至公司银行账户");
	
	
	private String key;
	private String value;
	
	GuaranteeHandinMethod(String key, String value){
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
