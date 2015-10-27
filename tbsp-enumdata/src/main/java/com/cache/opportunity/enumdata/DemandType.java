package com.cache.opportunity.enumdata;

public enum DemandType {
	
	GNY_FoodReq("GNY_FoodReq","餐食要求"),
	CJY_FoodReq("CJY_FoodReq","餐食要求"),
	CJY_TeamOfficials("CJY_TeamOfficials","随团人员"),
	GNY_CarReq("GNY_CarReq","用车要求"),
	GNY_HotelReq("GNY_HotelReq","酒店要求"),
	CJY_HotelReq("CJY_HotelReq","酒店要求"),
	GNY_TrafficReq("GNY_TrafficReq","交通要求"),
	CJY_TrafficReq("CJY_TrafficReq","交通要求"),
	GNY_ShoppingReq("GNY_ShoppingReq","购物要求"),
	CJY_ALetterReq("CJY_ALetterReq","发函要求"),
	CJY_OtherReq("CJY_OtherReq","其它要求"),
	GNY_OtherReq("GNY_OtherReq","其它要求");
	
	private String code;
	private String value;

	private DemandType(String code, String value) {
		this.code = code;
		this.value = value;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}