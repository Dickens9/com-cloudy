package com.cache.product.enumdata;
/**
 * 
 * @ClassName: GroupLevel 
 * @Description: TODO(团队性质) 
 * @author luocc
 * @date 2014年12月4日 上午10:20:55
 */
public enum GroupLevel {
	OverValue("OverValue", "超值"),
	Classic("Classic", "经典"),
	Boutique("Boutique", "精品"),
	Luxury("Luxury", "豪华"),
	Golden("Golden", "金品质"),
	Popular("Popular", "人气"),
	King("King", "皇牌"),
	VIP("VIP", "贵宾"),
	HighQuality("HighQuality", "高品保"),
	PopularDiscount("PopularDiscount", "人气特惠"),
	KingDiscount("KingDiscount", "皇牌特惠"),
	GSW("GSW", "公商务"),
	RewardSale("RewardSale", "奖励销售"),
	IndustrySale("IndustrySale", "同业包团");
	private String code;
	private String value;
	private GroupLevel(String code,String value){
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
