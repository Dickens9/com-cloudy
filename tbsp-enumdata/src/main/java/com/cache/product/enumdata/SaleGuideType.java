package com.cache.product.enumdata;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName: SaleGuideType 
 * @Description: TODO(销售指引类型) 
 * @author luocc
 * @date 2014年12月4日 上午10:49:42
 */
public enum SaleGuideType {
	General("General", "通用销售指引"),
	Travel("Travel", "行程吸引力对比"),
	Receive("Receive", "接待标准对比"),
	Traffic("Traffic", "大交通档次"),
	Price("Price", "总体价格差异");
	
	private String code;
	private String value;
	private SaleGuideType(String code,String value){
		this.code = code;
		this.value = value;
	}
	public String getCode() {
		return code;
	}
	public String getValue() {
		return value;
	}
	
	/**
	 * 根据产品类别获取销售指引类别
	 * @param pdType 产品类别
	 * @return
	 */
	public static List<SaleGuideType> getSaleGuideType(String pdType){
		List<SaleGuideType> list = new ArrayList<SaleGuideType>();
		if(PdType.SK.getCode().equals(pdType)){
			list.add(SaleGuideType.Travel);
			list.add(SaleGuideType.Receive);
			list.add(SaleGuideType.Traffic);
			list.add(SaleGuideType.Price);
		}else if(PdType.DZ.getCode().equals(pdType)){
			list.add(SaleGuideType.Travel);
			list.add(SaleGuideType.Receive);
			list.add(SaleGuideType.Traffic);
			list.add(SaleGuideType.Price);
		}else{
			list.add(SaleGuideType.General);
		}
		return list;
	}
	
}
