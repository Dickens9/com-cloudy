package com.cache.resource.enumdata;

/** 
 * @ClassName: DirectoryType 
 * @Description: 数据字典类型
 * @author zhangxf
 * @date 2014年11月20日 下午5:26:36  
 */
public enum DictType {

	PRICE_TYPE("PRICE_TYPE","价格类型"),
	TICKETS_TYPE("TICKETS_TYPE","票券类型"),
	TICKET_MEDIUM("TICKET_MEDIUM","票券介质"),
	TICKETS_PROPERTY("TICKETS_PROPERTY","票券性质"),
	VISA_TYPE("VISA_TYPE","签证类型"),
	TRAIN_TYPE("TRAIN_TYPE","火车车型"),
	PORT_TYPE("PORT_TYPE","港口类型"),
	DATA_STATUS("DATA_STATUS","状态类型"),
	HOTEL_LEVEL("HOTEL_LEVEL","酒店星级"),
	HOTEL_FACILITIES("HOTEL_FACILITIES","酒店设施"),
	ROOM_FACILITIES("ROOM_FACILITIES","房间设施"),
	HOTEL_ROOM_TYPE("HOTEL_ROOM_TYPE","标准类型"),
	CREDIT_CARD_TYPE("CREDIT_CARD_TYPE","信用卡种类"),
	DISHES_TYPE("DISHES_TYPE","菜系"),
	AIR_LINE("AIR_LINE","航空公司"),
	PLANE_TYPE("PLANE_TYPE","机型"),
	PT_EXTRA_FEE("PT_EXTRA_FEE","机票额外费用"),
	PLANE_TICKET_TYPE("PLANE_TICKET_TYPE","航程类型"),
	IDENTITY_TYPE("IDENTITY_TYPE","签证身份"),
	SUPPLIER_LEVEL("SUPPLIER_LEVEL","供应商等级"),
	FLEET_SOURCE("FLEET_SOURCE","车队来源"),
	INSURANCE_COMPANY_TYPE("INSURANCE_COMPANY_TYPE","保险公司类型"),
	INSURANCE_TYPE("INSURANCE_TYPE","投保类型"),
	VEHICLE_TYPE("VEHICLE_TYPE","车辆车型"),
	ISSUE_TYPE("ISSUE_TYPE","出票类型"),
	VEHICLE_FACILITY("VEHICLE_FACILITY","车上设施"),
	JP_PRICE_TYPE("JP_PRICE_TYPE","机票价格类型"),
	JD_PRICE_TYPE("JD_PRICE_TYPE","酒店价格类型"),
	PQ_PRICE_TYPE("PQ_PRICE_TYPE","票券价格类型"),
	YL_PRICE_TYPE("YL_PRICE_TYPE","邮轮价格类型"),
	HC_PRICE_TYPE("HC_PRICE_TYPE","火车票价格类型"),
	ZT_PRICE_TYPE("ZT_PRICE_TYPE","组团价格类型"),
	OPENING_BANK("OPENING_BANK","开户银行"),
	RES_TYPE("RES_TYPE","资源类型"),
	DESTINATION_TYPE("DESTINATION_TYPE","目的地类型"),
	SEX("SEX","性别"),
	MARITAL_STATUS("MARITAL_STATUS","婚姻状况"),
	NATION("NATION","民族"),
	POLITICAL_STATUS("POLITICAL_STATUS","政治面貌"),
	GUIDE_CARD_GRADE("GUIDE_CARD_GRADE","导游证级别"),
	GUIDE_CARD_LANGUAGE("GUIDE_CARD_LANGUAGE","导游证语种"),
	EDUCATION("EDUCATION","学历"),
	CONTRACT_TYPE("CONTRACT_TYPE","合同类型"),
	INNER_GRADE("INNER_GRADE","内级别"),
	SUPPLIER_AUTH_STATUS("SUPPLIER_AUTH_STATUS","供应商授权状态"),
	WHETHER("WHETHER","是否"),
	CABIN_TYPE("CABIN_TYPE","舱位"),
	CLASS_TYPE("CLASS_TYPE","席别"),
	BREAKFAST_TYPE("BREAKFAST_TYPE","早餐类型"),
	PURCHASE_TYPE("PURCHASE_TYPE","采购类型"),
	PURCHASE_PROPERTY("PURCHASE_PROPERTY","采购属性"),
	SETTLEMENT_TYPE("SETTLEMENT_TYPE","结算方式"),
	PD_TYPE("PD_TYPE","产品类别"),
	ADD_OR_SUB_TYPE("ADD_OR_SUB_TYPE","费用加减项标示"),
	CHNL_TYPE("CHNL_TYPE","渠道类别"),
	GROUP_LEVEL("GROUP_LEVEL","团队性质"),
	PD_STATUS("PD_STATUS","产品状态"),
	GUIDE_STATUS("GUIDE_STATUS","导游状态"),
	BED_TYPE("BED_TYPE","床型"),
	PO_STATUS("PO_STATUS","采购订单状态"),
	CATALOG_TYPE("CATALOG_TYPE","知识目录类型")
	;

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
