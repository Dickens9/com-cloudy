package com.cache.settlement.enumdata;

/** 
 * @ClassName: Directory
 * @Description: 数据字典类型
 * @author zhangxf
 * @date 2014年11月20日 下午5:26:36  
 */
public enum DictType {

	SETTLEMENT_CONSTANT("SETTLEMENT_CONSTANT",""),
	CUSTOMER_SOURCE("CUSTOMER_SOURCE","客户来源"),
	DATA_STATUS("DATA_STATUS","数据状态"),
	CP_STATUS("CP_STATUS","收付款数据状态"),
	ENTRY_DC("ENTRY_DC","EAS借贷方向"),
	EAS_CURRENCY_NUMBER("EAS_CURRENCY_NUMBER","EAS财务币种编码"),
	FIN_CP_STATUS("FIN_CP_STATUS","大卡收付款状态"),
	RESOURCE_FEE_MAPPING("RESOURCE_FEE_MAPPING","资源费用类型映射"),
	FEE_TYPE("FEE_TYPE","费用项类别"),
	CP_TYPE("CP_TYPE","收付款类型"),
	CP_BUSINESS_TYPE("CP_BUSINESS_TYPE","收付款业务类型");

	private String key;
	private String value;
	
	DictType(String key, String value){
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
