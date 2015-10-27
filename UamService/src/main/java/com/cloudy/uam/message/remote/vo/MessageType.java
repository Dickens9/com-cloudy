/**   
 * TODO(用一句话描述该文件做什么) 
 * @author linjiarong 
 * @date 2014年11月6日 下午2:53:16 
 * @version 0.0.1
 */
package com.cloudy.uam.message.remote.vo;

import java.io.Serializable;

/** 
 * TODO(这里用一句话描述作用) 
 *
 * @author linjiarong
 * @date 2014年11月6日 下午2:53:16 
 * @version 0.0.1
 *  
 */
public enum MessageType implements Serializable {
	SITE("SITE", "站内消息"),
	SMS("SMS","短信"),
	EMAIL("EMAIL", "邮件"),
	FAX("FAX","传真");
	
	private String code;
	private String name;
	
	MessageType(String code, String name){
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
