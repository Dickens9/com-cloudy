/**
 * Copyright © 2014, IBM and/or GZL, All rights reserved.
 */
package com.cache.settlement.enumdata;

/**
 * 费用类型
 * @author can
 * @since 0.0.1
 */
public enum FeeType {

	RoomFee("RoomFee","房间费"),
	OptionalServiceFee("OptionalServiceFee","可选服务费"),
	Airfare("Airfare","机票费"),
	FuelSurcharge("FuelSurcharge","燃油附加费"),
	AirportFee("AirportFee","机场建设费"),
	InsuranceFee("InsuranceFee","保险费"),
	TourFee("TourFee","团费"),
	VisaFee("VisaFee","签证费"),
	TicketFee("TicketFee","票券费"),
	AccommodationFee("AccommodationFee","舱位费"),
	PoorHousingFee("PoorHousingFee","单人房差费");

	private String key;
	private String value;
	
	FeeType(String key, String value){
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
