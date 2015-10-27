/**
 * 
 */
package com.cache.product.enumdata;

/**
 * 渠道类别
 * 
 * @author Kevin
 * @date 2014年12月3日
 * @version 1.0.0
 * 
 */
public enum ChnlType {
	DirectSale("DirectSale", "直营门店"),
	Franchisee("Franchisee", "加盟门店"),
	Branch("Branch", "分子公司"),
	Network("Network", "网络成员"),
	Industry("Industry", "同业销售"),
	B2C("B2C", "B2C网站"),
	TelSale("TelSale", "电话销售"),
	SelfTerminal("SelfTerminal", "自助终端"),
	MobileSale("MobileSale", "移动终端"),
	WechatSale("WechatSale", "微信终端"),
	Tmall("Tmall", "天猫"),
	Ctrip("Ctrip", "携程"),
	Qunar("Qunar", "去哪儿"),
	GroupSale("GroupSale", "团体销售"),
	VipSale("VipSale", "工商会奖");
	private String code;
	private String value;
	private ChnlType(String code, String value){
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
