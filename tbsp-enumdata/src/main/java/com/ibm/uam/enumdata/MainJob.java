package com.ibm.uam.enumdata;
/**
 * 
 * 主兼职
 *
 * @author linjiarong
 * @date 2014年11月26日 下午5:46:11 
 * @version 0.0.1
 *
 */
public enum MainJob {
	DICT_TYPE("UAM_MAIN_JOB","主兼职"),
	MAIN("1", "主岗"),
	PARTTIME("0", "兼职");
	
	private String code;
	
	private String value;
	
	private MainJob(String code, String value) {
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
