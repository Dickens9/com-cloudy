package com.cache.opportunity.enumdata;

public enum DemandPropertyType {
	/** 正餐要求 */
	Under20("Under20", "20元以下"),
	Yuan25("Yuan25", "25元"),
	Yuan30("Yuan30", "30元"),
	Above30("Above30", "30元以上"),
	/** 车辆座型 */
	Seat18("Seat18", "18座"),
	Seat22("Seat22", "22座"),
	Seat33To37("Seat33To37", "33-37座"),
	Seat41To49("Seat41To49", "41-49座"),
	AboveSeat49("AboveSeat49", "49座以上"),
	/**制定用车*/
	GZL("GZL", "广之旅"),
	QTCP("QTCP", "其它公司"),
	/** 房间方向 */
	MountainView("MountainView", "山景"),
	Seascape("Seascape", "海景"),
	OtherView("OtherView", "其它"),
	/**酒店星级*/
	Two("Two", "二星级及以下/经济"),
	Three("Three", "三星级/舒适"),
	Four("Four", "四星级/高档"),
	Five("Five", "五星级/豪华"),
	/**特别*/
	NearByPavilion("NearByPavilion", "酒店在展馆附近"),
	InternatChain("InternatChain", "现代国际连锁酒店"),
	/**交通要求方式(国内游) */
	Shuangfei("Shuangfei", "双飞"),
	Solo("Solo", "单飞"),
	HighSpeedRail("HighSpeedRail", "高铁"),
	SglHSpeedRail("SglHSpeedRail", "单高铁"),
	DoubleSleeper("DoubleSleeper", "双卧"),
	OtherMethod("OtherMethod", "其它"),
	/**接送*/
	OneWay("OneWay", "单程"),
	RoundTrip("RoundTrip", "双程"),
	OtherWays("OtherWays", "其它"),
	/**航空要求*/
	DirectFlight("DirectFlight", "直飞"),
	CanFine("CanFine", "可转机"),
	PreferredCheap("PreferredCheap", "首选/便宜"),
	OtherAppoint("OtherAppoint", "指定"),
	/**出发/返回地点*/
	GuangZhou("GuangZhou", "广州"),
	Hongkong("Hongkong", "香港"),
	OtherCity("OtherCity", "其它"),
	/**车型*/
	PlanForNum("PlanForNum", "根据人数安排车型"),
	LuxuryBusSeat35("LuxuryBusSeat35", "35座以上豪华大巴"),
	OtherSpecialReq("OtherSpecialReq", "特别要求"),
	/**购物安排*/
	ShoppingTeam("ShoppingTeam", "特别要求"),
	PurePlay("PurePlay", "纯玩"),
	/**是否*/
	Y("Y", "是"),
	N("N", "否"),
	/**团队备用品*/
	Pamphlet("Pamphlet", "小册子"),
	ConversionPlug("ConversionPlug", "转换插头"),
	LuggageBagCap("LuggageBagCap", "行李袋帽"),
	LuggageTag("LuggageTag", "行李牌"),
	RoomCard("RoomCard", "房卡"),
	SmallGifts("SmallGifts", "小礼品"),
	OtherSpares("OtherSpares", "其它");
	
	private String code;
	private String value;
	
	private DemandPropertyType(String code, String value) {
		this.value = value;
		this.code = code;
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