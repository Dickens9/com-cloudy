/**   
 * TODO(用一句话描述该文件做什么) 
 * @author linjiarong 
 * @date 2014年11月3日 下午3:59:33 
 * @version 0.0.1
 */
package com.cloudy.common.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AuditorAware;

import com.cloudy.uam.auth.remote.UamSessionService;
import com.cloudy.uam.auth.remote.vo.SessionUser;

/** 
 * JPA AuditorAware实现
 * 实现获取当前系统操作的用户 ID
 *
 * @author linjiarong
 * @date 2014年11月3日 下午3:59:33 
 * @version 0.0.1
 *  
 */
public class AuditorAwareImpl implements AuditorAware<String>{
	
	@Autowired
	private UamSessionService uamSessionService;
	/**
	 * 返回当前登陆用户的ID 
	 * @return 
	 * @see org.springframework.data.domain.AuditorAware#getCurrentAuditor() 
	 */
	@Override
	public String getCurrentAuditor() {
		try {
			SessionUser sessionUser = uamSessionService.getSessionUser();
			if(sessionUser==null){
				return "SYSTEM";
			}
			return sessionUser.getId();
		} catch (Exception e) {
			return "SYSTEM";
		}
	}
}
