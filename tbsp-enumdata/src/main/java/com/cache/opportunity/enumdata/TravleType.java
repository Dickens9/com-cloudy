package com.cache.opportunity.enumdata;

public enum TravleType {
	TI_CJY("出境游", "TI_CJY"),
	TI_GNY("国内游", "TI_GNY"),
	TI_GAT("港澳、台湾", "TI_GAT"),
	TI_DIY("自主性搭配", "TI_DIY"),
	TI_OTHER("其它", "TI_OTHER"),
	Europe("欧洲", "Europe"),
	Australia("澳洲", "Australia"),
	America("美洲", "America"),
	Afrika("非洲", "Afrika"),
	OtherDelta("其它", "OtherDelta"),
	EastChina("华东", "EastChina"),
	NorthChina("华北", "NorthChina"),
	CentralChina("华中", "CentralChina"),
	SouthChina("华南", "SouthChina"),
	OtherArea("其它", "OtherArea"),
	Hongkong("香港", "Hongkong"),
	Macao("澳门", "Macao"),
	Taiwan("台湾", "Taiwan")
	;
	private String code;
	private String value;
	
	private TravleType(String value, String code) {
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