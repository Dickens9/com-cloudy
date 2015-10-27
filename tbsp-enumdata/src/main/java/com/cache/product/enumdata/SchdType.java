package com.cache.product.enumdata;
/**
 * 
 * @ClassName: SchdType 
 * @Description: TODO(排期类型) 
 * @author luocc
 * @date 2014年12月4日 上午10:59:21
 */
public enum SchdType {
	SingleSCHD("SingleSCHD", "单项产品排期"),
	GroupSCHD("GroupSCHD", "组合类产品排期");
	
	private String code;
	private String value;
	private SchdType(String code,String value){
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
