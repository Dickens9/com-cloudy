package com.cloudy.uam.permission.remote.vo;

import java.io.Serializable;
import java.text.MessageFormat;

/** 
 * TODO(这里用一句话描述作用) 
 *
 * @author linjiarong
 * @date 2014年11月6日 上午11:31:58 
 * @version 0.0.1
 *  
 */
public class App implements Serializable{
	
	private String appName;
	
	/** 应用中文名称 **/
	private String appCname;
	
	/** 应用KEY **/
	private String appKey;

	/** APP_SECRET **/
	private String appSecret;
	
	/** HOSTNAME **/
	private String hostname;
	
	/** 域  */
	private String domain;
	
	/** 端口 */
	private Integer port;
	
	/** 协议 http/https */
	private String protocol;
	
	/** 应用上下文 **/
	private String webContext;
	
	/** 顺序 **/
	private String orderby;

	/** 
	 * @return appName 
	 */
	public String getAppName() {
		return appName;
	}

	/** 
	 * @param appName 要设置的 appName 
	 */
	public void setAppName(String appName) {
		this.appName = appName;
	}

	/** 
	 * @return appCname 
	 */
	public String getAppCname() {
		return appCname;
	}

	/** 
	 * @param appCname 要设置的 appCname 
	 */
	public void setAppCname(String appCname) {
		this.appCname = appCname;
	}

	/** 
	 * @return appKey 
	 */
	public String getAppKey() {
		return appKey;
	}

	/** 
	 * @param appKey 要设置的 appKey 
	 */
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	/** 
	 * @return appSecret 
	 */
	public String getAppSecret() {
		return appSecret;
	}

	/** 
	 * @param appSecret 要设置的 appSecret 
	 */
	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}

	/** 
	 * @return hostname 
	 */
	public String getHostname() {
		return hostname;
	}

	/** 
	 * @param hostname 要设置的 hostname 
	 */
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	/** 
	 * @return domain 
	 */
	public String getDomain() {
		return domain;
	}

	/** 
	 * @param domain 要设置的 domain 
	 */
	public void setDomain(String domain) {
		this.domain = domain;
	}

	/** 
	 * @return port 
	 */
	public Integer getPort() {
		return port;
	}

	/** 
	 * @param port 要设置的 port 
	 */
	public void setPort(Integer port) {
		this.port = port;
	}

	/** 
	 * @return protocol 
	 */
	public String getProtocol() {
		return protocol;
	}

	/** 
	 * @param protocol 要设置的 protocol 
	 */
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	/** 
	 * @return webContext 
	 */
	public String getWebContext() {
		return webContext;
	}

	/** 
	 * @param webContext 要设置的 webContext 
	 */
	public void setWebContext(String webContext) {
		this.webContext = webContext;
	}

	/** 
	 * @return orderby 
	 */
	public String getOrderby() {
		return orderby;
	}

	/** 
	 * @param orderby 要设置的 orderby 
	 */
	public void setOrderby(String orderby) {
		this.orderby = orderby;
	}
	/**
	 * 
	 * 生成app的访问路径
	 * @return 
	 * @return String    返回类型
	 */
	public String genAbsoluteUrl(){
//		String template = "{0}://{1}:{2}/{3}";
//		String result = MessageFormat.format(template, this.protocol, this.hostname, this.port,this.webContext);
		String template = "{0}{1}";
		String result = MessageFormat.format(template, this.hostname, this.webContext);
		return result;
	}
}
