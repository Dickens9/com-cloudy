/**   
 * TODO(用一句话描述该文件做什么) 
 * @author linjiarong 
 * @date 2014年11月6日 下午3:09:41 
 * @version 0.0.1
 */
package com.cloudy.uam.message.remote.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


/** 
 * TODO(这里用一句话描述作用) 
 *
 * @author linjiarong
 * @date 2014年11月6日 下午3:09:41 
 * @version 0.0.1
 *  
 */
public class Message implements Serializable{
	/** 站内/短信/邮件/传真 */
	private MessageType type;
	
	/** 标题， 站内，邮件 */
	private String title;
	
	/** 短信只有content 邮件，传真*/
	private String content;
	
	/** 邮件附件 或者传真文件 */
	private List<Object> attachments;
	
	/** 指定发送时间，为空时马上发送 */
	private Date sendTime;

	/** 
	 * @return type 
	 */
	public MessageType getType() {
		return type;
	}

	/** 
	 * @param type 要设置的 type 
	 */
	public void setType(MessageType type) {
		this.type = type;
	}

	/** 
	 * @return title 
	 */
	public String getTitle() {
		return title;
	}

	/** 
	 * @param title 要设置的 title 
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/** 
	 * @return content 
	 */
	public String getContent() {
		return content;
	}

	/** 
	 * @param content 要设置的 content 
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/** 
	 * @return attachments 
	 */
	public List<Object> getAttachments() {
		return attachments;
	}

	/** 
	 * @param attachments 要设置的 attachments 
	 */
	public void setAttachments(List<Object> attachments) {
		this.attachments = attachments;
	}

	/** 
	 * @return sendTime 
	 */
	public Date getSendTime() {
		return sendTime;
	}

	/** 
	 * @param sendTime 要设置的 sendTime 
	 */
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
	
}
