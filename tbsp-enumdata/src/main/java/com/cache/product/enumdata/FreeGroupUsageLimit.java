package com.cache.product.enumdata;
/**
 * 
 * @ClassName: FreeGroupUsageLimit 
 * @Description: TODO(自由行使用限定) 
 * @author luocc
 * @date 2014年12月4日 上午10:38:25
 */
public enum FreeGroupUsageLimit {
	All("All", "全部可用"),
	OnlyFree("OnlyFree", "仅自由行可用"),
	NotFree("NotFree", "自由行不可用");
	
	private String code;
	private String value;
	private FreeGroupUsageLimit(String code,String value){
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
