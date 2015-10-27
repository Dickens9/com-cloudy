package com.cache.sales.enumdata;

/**
 * 费用项类别：
 * 房间费、可选服务费、机票费、燃油附加费、机场建设费、保险费、团费、签证费、票券费、舱位费、单人房差费
 * @author shaominglei
 *
 */
public enum FeeType {
	FEE_TYPE("FEE_TYPE","费用项类别"),
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
	PoorHousingFee("PoorHousingFee","单人房差费"),
	RefundFee("RefundFee", "退款费"),
	PreferentialFee("PreferentialFee", "优惠费");


	private String key;
	private String value;

	private FeeType(String key, String value) {
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
