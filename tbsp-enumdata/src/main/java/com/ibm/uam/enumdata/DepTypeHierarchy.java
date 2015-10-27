package com.ibm.uam.enumdata;
/**
 * 
 * 1. 部门分类：产品线，销售线，营业线，财务线，供应商线，运营线，管理线；公司没有部门分类，部门必须有分类；
 * 		父级的部门分类如果为空则可选，否则继承父级部门分类
 * 2. 部门层次：部门分类为产品线的，部门层次为：业务板块，业务中心，业务部门，市场；
 *    营业线分类：营业部，网点；其中B2C、同业销售、电话销售中心属于网点，且不可修改
 *    供应商分类：供应商（供应商下不能再增组织）
 *    其他分类：其它。
 *    （只有产品线和营业线部门分类部门层次属性才生效，其他均采用其它） 
 *
 * @author linjiarong
 * @date 2014年11月24日 下午5:12:45 
 * @version 0.0.1
 *
 */
public enum DepTypeHierarchy {
	DICT_TYPE("UAM_DEP_TYPE_HIER","部门分类层次"),
	Product("PROD","产品线"),
	    PROD_BIZ_PLATE("PBPL","业务板块"),
	    PROD_BIZ_CENTER("PBCE","业务中心"),
	    //PROD_BIZ_DEPARTMENT("PBDE","业务部门"),
	    PROD_MARKET("PBMK","市场"),
	Sales("SALE","销售线"),
	Business("BUSI","营业线"),
	    BUSI_DEPA("BUDE","营业部"),
	    BUSI_SHOP("BUSH","网点"),
	Finance("FINA","财务线"),
	Supplier("SUPP","供应商线"),
	Operation("OPER","运营线"),
	Management("MANA","管理线"),
	OTHER("OTHE","其它");
	
	private String code;
	private String value;
	
	private DepTypeHierarchy(String code, String value) {
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
