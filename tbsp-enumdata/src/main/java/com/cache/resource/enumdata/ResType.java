package com.cache.resource.enumdata;

/** 
 * @ClassName: DirectoryType 
 * @Description: 数据字典类型
 * @author zhangxf
 * @date 2014年11月20日 下午5:26:36  
 */
public enum ResType {
	
	DICT_TYPE("RES_TYPE","资源类型"),
	JP("JP","机票"),
	HC("HC","火车票"),
	JD("JD","酒店"),
	YL("YL","邮轮"),
	PQ("PQ","票券"),
	CT("CT","餐厅"),
	CD("CD","车队"),
	QZ("QZ","签证"),
	BX("BX","保险"),
	DJ("DJ","地接服务"),
	DY("DY","导游"),
	CL("CL","车辆"),
	JQ("JQ","景区");

	private String key;
	private String value;
	
	ResType(String key, String value){
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
