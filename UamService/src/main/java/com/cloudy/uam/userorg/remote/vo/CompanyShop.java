package com.cloudy.uam.userorg.remote.vo;

import java.io.Serializable;
import java.util.List;

/** 
 * 
 * 公司门店信息VO
 *
 * @author linjiarong
 * @date 2014年11月27日 上午9:28:43 
 * @version 0.0.1
 *  
 */
public class CompanyShop implements Serializable{
	
	/** 
	 * @Fields serialVersionUID
	 */ 
	private static final long serialVersionUID = -4208395085760343422L;

	/** 所在分子公司  */
	private Org company;
	
	/** 所在分子公司门店列表 */
	private List<Org> shopList;

	public Org getCompany() {
		return company;
	}

	public void setCompany(Org company) {
		this.company = company;
	}

	public List<Org> getShopList() {
		return shopList;
	}

	public void setShopList(List<Org> shopList) {
		this.shopList = shopList;
	}
}
