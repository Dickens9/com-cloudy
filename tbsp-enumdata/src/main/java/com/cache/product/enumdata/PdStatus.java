package com.cache.product.enumdata;
/**
 * 
 * @ClassName: PdStatus 
 * @Description: TODO(产品状态) 
 * @author luocc
 * @date 2014年12月4日 上午10:40:32
 */
public enum PdStatus {
	Unpublish("Unpublish", "未发布"),
	Pending("Pending", "待审核"),
	Published("Published", "已发布"),
	Returned("Returned", "已退回"),
	Disabled("Disabled", "已停用");
	
	private String code;
	private String value;
	private PdStatus(String code,String value){
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
