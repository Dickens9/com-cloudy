package com.cache.product.enumdata;
/**
 * 
 * @ClassName: HtContinuousStayType 
 * @Description: TODO(酒店连住方式) 
 * @author luocc
 * @date 2014年12月4日 上午10:35:07
 */
public enum HtContinuousStayType {
	Nolimit("Nolimit","无限定"),
	Forward("Forward", "向前连住"),
	Back("Back", "向后连住");
	
	private String code;
	private String value;
	private HtContinuousStayType(String code,String value){
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
