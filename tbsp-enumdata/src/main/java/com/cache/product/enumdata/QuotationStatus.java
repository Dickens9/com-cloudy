package com.cache.product.enumdata;
/**
 * 
 * @ClassName: QuotationStatus 
 * @Description: TODO(报价单状态) 
 * @author luocc
 * @date 2014年12月4日 上午11:06:15
 */
public enum QuotationStatus {
	Draft("Draft", "未提交"),
	Sent("Sent", "已发出"),
	Returned("Returned", "已退回"),
	Canceled("Canceled", "已取消"),
	Confirmed("Confirmed", "已确认");
	
	private String code;
	private String value;
	private QuotationStatus(String code,String value){
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
