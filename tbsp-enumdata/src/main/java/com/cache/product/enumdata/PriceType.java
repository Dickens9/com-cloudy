/**
 * 
 */
package com.cache.product.enumdata;

/**
 * 价格类别
 * 
 * @author Kevin
 * @date 2014年12月26日
 * @version 1.0.0
 * 
 */
public enum PriceType {
	Adult("Adult", "成人价"),
	Child("Child", "儿童价"),
	Baby("Baby", "婴儿价"),
	Old("Old", "老人价"),
	Adult12("12Adult", "1-2人成人价"),
	Child12("12Child", "1-2人儿童价"),
	Adult34("34Adult", "3-4人成人价"),
	Child34("34Child", "3-4人儿童价");
	
	
	private String code;
	private String value;
	
	private PriceType(String code, String value){
		this.code = code;
		this.value = value;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public static PriceType getPriceType(String code){
		if(Adult.code.equals(code)){
			return Adult;
		}
		if(Child.code.equals(code)){
			return Child;
		}
		if(Baby.code.equals(code)){
			return Baby;
		}
		if(Old.code.equals(code)){
			return Old;
		}
		if(Adult12.code.equals(code)){
			return Adult12;
		}
		if(Child12.code.equals(code)){
			return Child12;
		}
		if(Adult34.code.equals(code)){
			return Adult34;
		}
		if(Child34.code.equals(code)){
			return Child34;
		}
		return null;
	}
}
