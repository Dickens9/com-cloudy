package com.cloudy.uam.auth.remote;
/**
 * 
 * 跨应用提供的服务
 * 可用于存储跨应用的Session信息。 
 *
 * @author linjiarong
 * @date 2014年11月13日 下午10:59:08 
 * @version 0.0.1
 *
 */
public interface UamCrossAppSessionService {
	/**
	 * 
	 * 根据Key从CrossAppSession中获取数据
	 * @param key
	 * @return 
	 * @return Object    返回类型
	 */
	public Object getObjectFrom(String key);
	
	/**
	 * 
	 * 根据sessionid及Key从CrossAppSession中获取数据
	 * @param sessionId
	 * @param key
	 * @return 
	 * @return Object    返回类型
	 */
	public Object getObjectFrom(String sessionId, String key);
	
	/**
	 * 
	 * 把Object放入key中
	 * @param sessionId
	 * @param key
	 * @return 
	 * @return Object    返回类型
	 */
	public void putObjectInto(String key, Object object);
	
	/**
	 * 
	 * 把object放入sessionid及key
	 * @param sessionId
	 * @param key
	 * @param object 
	 * @return void    返回类型
	 */
	public void putObjectInto(String sessionId, String key, Object object);
	
}
