package com.cache.resource.enumdata;

public enum VisaType {

	TravelVisa("L","旅游签证"),
	TradeVisa("F","商务签证"),
	WorkVisa("Z","工作签证"),
	StudyVisa("X","学习签证"),
	ResidentVisa("D","定居签证"),
	TransitVisa("G","过境签证"),
	FlightVisa("C","乘务签证"),
	JournalistVisa("J","记者签证");
	
	private String key;
	private String value;
	
	private VisaType(String key, String value) {
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
