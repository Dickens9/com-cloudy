package com.cache.product.enumdata;
/**
 * 
 * @ClassName: DesignMode 
 * @Description: TODO(产品设计方式) 
 * @author luocc
 * @date 2014年12月8日 下午2:21:36
 */
public enum DesignMode {
	Standard("Standard", "标准"),
	Customized("Customized", "定制");
	private String code;
	private String value;
	private DesignMode(String code,String value){
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
