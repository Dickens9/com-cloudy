/**   
 * TODO(用一句话描述该文件做什么) 
 * @author linjiarong 
 * @date 2014年11月6日 下午4:57:07 
 * @version 0.0.1
 */
package com.cloudy.uam.message.remote.vo;

import java.io.Serializable;

/** 
 * TODO(这里用一句话描述作用) 
 *
 * @author linjiarong
 * @date 2014年11月6日 下午4:57:07 
 * @version 0.0.1
 *  
 */
public enum SendStatus implements Serializable{
	SENT("SUC","已发送"),
	NOTSEND("FAIL", "未发送"),
	PENDING("PENDING","待发送"),
	NOTFOUND("NOTFOUND","批准号未找到");
	
	private String code;
	private String name;
	
	SendStatus(String code, String name){
		this.code = code;
		this.name = name;
	}
	/** 
	 * @return code 
	 */
	public String getCode() {
		return code;
	}
	/** 
	 * @return name 
	 */
	public String getName() {
		return name;
	}
}
