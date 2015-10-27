package com.cache.product.enumdata;
/**
 * 
 * @ClassName: PricingMode 
 * @Description: TODO(定价方式) 
 * @author luocc
 * @date 2014年12月4日 上午10:30:37
 */
public enum PricingMode {
	RatePricing("RatePricing", "比例定价"),
	RaisePricing("RaisePricing", "幅度定价"),
	FixPricing("FixPricing", "固定定价");
	
	private String code;
	private String value;
	private PricingMode(String code,String value){
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
