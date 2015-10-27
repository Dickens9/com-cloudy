package com.cache.product.enumdata;
/**
 * 
 * @ClassName: PdGroupBrand 
 * @Description: TODO(产品品牌) 
 * @author luocc
 * @date 2014年12月4日 上午10:27:01
 */
public enum PdGroupBrand {
	GuangZhiLv("GuangZhiLv", "广之旅假期"),
	MingJia("MingJia", "名家之旅"),
	lvCheng("lvCheng", "侣程"),
	XiBuZhiLv("XiBuZhiLv", "西部之旅"),
	ZiYouTong("ZiYouTong", "自由通"),
	ZhenYi("ZhenYi", "臻逸");
	
	private String code;
	private String value;
	private PdGroupBrand(String code,String value){
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
