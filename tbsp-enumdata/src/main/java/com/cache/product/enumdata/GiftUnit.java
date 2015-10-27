package com.cache.product.enumdata;
/**
 * 
 * @ClassName: GiftUnit 
 * @Description: TODO(产品赠品单位) 
 * @author luocc
 * @date 2014年12月4日 上午10:44:20
 */
public enum GiftUnit {
	UnitGe("UnitGe", "个"),
	UnitZhang("UnitZhang", "张"),
	UnitJian("UnitJian", "件"),
	UnitPing("UnitPing", "瓶");
	
	private String code;
	private String value;
	private GiftUnit(String code,String value){
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
