package com.cloudy.uam.auth.remote;

import com.cloudy.uam.auth.remote.vo.SessionUser;
/**
 * 
 * 获取当前Session相关信息服务 
 *
 * @author linjiarong
 * @date 2014年11月5日 下午11:08:38 
 * @version 0.0.1
 *
 */
public interface UamSessionService {

	/**
	 * 
	 * 获取当前登陆用户信息
	 * @return 
	 * @return SessionUser    返回类型
	 */
	public SessionUser getSessionUser();
	
	/**
	 * 
	 * 工具方法，保存key value对到Session
	 * spring session scope bean
	 * @param key
	 * @param value 
	 * @return void    返回类型
	 */
	public void putIntoSession(String key, Object value);
	
	/**
	 * 
	 * 工具方法，从Session获取key对应的value
	 * @param key
	 * @return 
	 * @return Object    返回类型
	 */
	public Object getFromSession(String key);
	
	/**
	 * 
	 * 将Key中的Value从Session中移除
	 * @param key 
	 * @return void    返回类型
	 */
	public void removeFromSession(String key);
	
	/**
	 * 
	 * 登出
	 * @throws BusinessException 
	 * @return void    返回类型
	 */
	public void logout();
	
	/**
	 * 
	 * 切换用户 岗位
	 * 从Session中获取当前的用户
	 * @param jobId
	 * @param orgId
	 * @throws BusinessException 
	 * @return void    返回类型
	 */
	public void changSessionOrgAndJob(String orgId,  String jobId);
	
}
