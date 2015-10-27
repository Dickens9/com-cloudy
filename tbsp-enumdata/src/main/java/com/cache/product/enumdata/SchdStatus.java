package com.cache.product.enumdata;
/**
 * 
 * @ClassName: SchdStatus 
 * @Description: TODO(排期状态) 
 * @author luocc
 * @date 2014年12月4日 上午11:00:18
 */
public enum SchdStatus {
	beforeSale("beforeSale", "未上架"),
	onSale("onSale", "已上架"),
	AfterSale("AfterSale", "已下架");
	
	private String code;
	private String value;
	private SchdStatus(String code,String value){
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
