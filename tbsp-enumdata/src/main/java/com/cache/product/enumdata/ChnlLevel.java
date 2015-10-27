package com.cache.product.enumdata;
/**
 * 
 * @ClassName: ChnlLevel 
 * @Description: TODO(渠道级别) 
 * @author luocc
 * @date 2014年12月4日 上午10:18:01
 */
public enum ChnlLevel {
	Channel("Channel", "渠道级"),
	Company("Company", "公司级"),
	Store("Store", "门店级");
	
	private String code;
	private String value;
	private ChnlLevel(String code,String value){
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
