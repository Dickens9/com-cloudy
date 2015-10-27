package com.cache.product.enumdata;
/**
 * 
 * @ClassName: TrafficMode 
 * @Description: TODO(交通方式) 
 * @author luocc
 * @date 2014年12月4日 上午10:55:05
 */
public enum TrafficMode {
	AirPlane("AirPlane", "飞机"),
	Train("Train", "火车"),
	Bus("Bus", "大巴"),
	Ride("Ride", "骑马"),
	Foot("Foot", "徒步"),
	Ship("Ship", "轮船"),
	Other("Other", "其它");
	
	private String code;
	private String value;
	private TrafficMode(String code,String value){
		this.code = code;
		this.value = value;
	}
	public String getCode() {
		return code;
	}
	public String getValue() {
		return value;
	}
	
}
