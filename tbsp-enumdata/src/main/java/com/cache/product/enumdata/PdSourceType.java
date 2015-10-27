package com.cache.product.enumdata;
/**
 * 
 * @ClassName: PdSourceType 
 * @Description: TODO(产品来源) 
 * @author luocc
 * @date 2014年12月4日 上午9:56:37
 */
public enum PdSourceType {
	OwnPd("OwnPd", "自有产品"),
	OtherPd("OtherPd", "第三方产品");
	private String code;
	private String value;
	private PdSourceType(String code,String value){
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
