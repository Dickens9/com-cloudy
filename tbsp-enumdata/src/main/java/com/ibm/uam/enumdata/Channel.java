package com.ibm.uam.enumdata;

/**
 * 
 * 渠道属性
 * 渠道的划分：门店（直营、加盟），B2C….，网络成员；部门层次为网点的必须指定渠道属性： 
 *
 * @author linjiarong
 * @date 2014年11月24日 下午5:08:31 
 * @version 0.0.1
 *
 */
public enum Channel {
	
	DICT_TYPE("CHNL_TYPE","渠道"),
	DIRECTSALE("DirectSale","直营门店"),
	WECHATSALE("WechatSale","微信终端"),
	TMALL("Tmall","天猫"),
	CTRIP("Ctrip","携程"),
	QUNAR("Qunar","去哪儿"),
	GROUPSALE("GroupSale","团体销售"),
	VIPSALE("VipSale","公商会奖"),
	FRANCHISEE("Franchisee","加盟门店"),
	BRANCH("Branch","分子公司"),
	NETWORK("Network","网络成员"),
	INDUSTRY("Industry","同业销售"),
	B2C("B2C","B2C网站"),
	TELSALE("TelSale","电话销售"),
	SELFTERMINA("SelfTermina","自助终端"),
	MOBILESALE("MobileSale","移动终端");

	
	private String code;
	
	private String value;
	
	
	private Channel(String code, String value) {
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
}
