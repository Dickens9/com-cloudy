/**   
 * TODO(用一句话描述该文件做什么) 
 * @author linjiarong 
 * @date 2014年11月5日 下午11:36:17 
 * @version 0.0.1
 */
package com.cloudy.uam.userorg.remote.vo;

import java.io.Serializable;

/** 
 * 
 * 岗位VO
 * @author linjiarong
 * @date 2014年11月5日 下午11:36:17 
 * @version 0.0.1
 *  
 */
public class Job implements Serializable{

	/** 
	 * @Fields serialVersionUID
	 */ 
	private static final long serialVersionUID = -3940609005676360644L;
	
	/** 岗位ID */
	private String id;
	
	/** 岗位代码 */
	private String jobCode;
	
	/** 岗位名称 **/
	private java.lang.String jobName;
	
	/** 描述 **/
	private java.lang.String description;
	
	/** 是否可用 , AvailableStatus*/
	private String available;

	/** 
	 * @return id 
	 */
	public String getId() {
		return id;
	}

	/** 
	 * @param id 要设置的 id 
	 */
	public void setId(String id) {
		this.id = id;
	}

	/** 
	 * @return jobName 
	 */
	public java.lang.String getJobName() {
		return jobName;
	}

	/** 
	 * @param jobName 要设置的 jobName 
	 */
	public void setJobName(java.lang.String jobName) {
		this.jobName = jobName;
	}

	/** 
	 * @return description 
	 */
	public java.lang.String getDescription() {
		return description;
	}

	/** 
	 * @param description 要设置的 description 
	 */
	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	/** 
	 * @return available 
	 */
	public String getAvailable() {
		return available;
	}

	/** 
	 * @param available 要设置的 available 
	 */
	public void setAvailable(String available) {
		this.available = available;
	}

	public String getJobCode() {
		return jobCode;
	}

	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}

}
