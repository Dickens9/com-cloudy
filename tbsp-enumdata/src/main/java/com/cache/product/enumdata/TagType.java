package com.cache.product.enumdata;
/**
 * 
 * @ClassName: TagType 
 * @Description: TODO(产品标签类别) 
 * @author luocc
 * @date 2014年12月4日 上午10:36:34
 */
public enum TagType {
	ProductTheme("ProductTheme", "产品主题"),
	SaleTag("SaleTag", "销售标签"),
	PromoteTag("PromoteTag","推广标签");
	
	private String code;
	private String value;
	private TagType(String code,String value){
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
