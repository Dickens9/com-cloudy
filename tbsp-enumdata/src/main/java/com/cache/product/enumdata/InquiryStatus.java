package com.cache.product.enumdata;
/**
 * 
 * @ClassName: InquiryStatus 
 * @Description: TODO(询价单状态) 
 * @author luocc
 * @date 2014年12月4日 上午11:03:00
 */
public enum InquiryStatus {
	Draft("Draft", "未提交"),
	Sent("Sent", "已发出"),
	Invalid("Invalid", "已无效");
	
	private String code;
	private String value;
	private InquiryStatus(String code,String value){
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
