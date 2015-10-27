/**   
 * TODO(用一句话描述该文件做什么) 
 * @author linjiarong 
 * @date 2014年12月11日 下午1:49:32 
 * @version 0.0.1
 */
package com.ibm.uam.enumdata;

/** 
 * TODO(这里用一句话描述作用) 
 *
 * @author linjiarong
 * @date 2014年12月11日 下午1:49:32 
 * @version 0.0.1
 *  
 */
public enum SchedulerJobRunStatus {
	DICT_TYPE("SCHEDULER_RUN_STATUS","组织类型"),
	RUNNING("RUNNING","运行中"),
	FINISHED("FINISHED","运行完成");

	private String code;
	private String value;
	
	
	private SchedulerJobRunStatus(String code, String value) {
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
