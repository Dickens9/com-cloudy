package com.ibm.uam.enumdata;

/**
 * 员工分类：
 * 正式员工、临时员工、外部员工
 *
 * @author linjiarong
 * @date 2014年11月24日 下午5:31:13 
 * @version 0.0.1
 *
 */
public enum EmployeeType {
	DICT_TYPE("UAM_EMP_TYPE","员工分类"),
	REGULAR("REGU", "正式员工"),
	TEMPORARY("TEMP","临时工"),
	EXTERNAL("EXTE","外部员工");
	
	private String code;
	
	private String value;
	
	private EmployeeType(String code, String value) {
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
