package com.cache.product.enumdata;
/**
 * 
 * @ClassName: StageUnit 
 * @Description: TODO(行程段次单位) 
 * @author luocc
 * @date 2014年12月4日 上午10:15:49
 */
public enum StageUnit {
	Day("Day", "天"),
	Stage("Stage", "段");
	
	private String code;
	private String value;
	private StageUnit(String code,String value){
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
