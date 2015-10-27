package com.cache.product.enumdata;
/**
 * 
 * @ClassName: UsageScope 
 * @Description: TODO(适用范围) 
 * @author luocc
 * @date 2014年12月4日 上午10:47:26
 */
public enum UsageScope {
	Internal("Internal", "内部"),
	External("External", "外部");
	
	private String code;
	private String value;
	private UsageScope(String code,String value){
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
