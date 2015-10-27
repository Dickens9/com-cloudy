package com.cloudy.uam.message.remote;

import java.util.List;

import com.cloudy.uam.message.remote.vo.Message;
import com.cloudy.uam.message.remote.vo.SendStatus;

public interface UamMessageService {
	

	/**
	 * 
	 * 直接根据recieves的目标地址发送消息到MQ
	 * MQ成功接收消息即正常返回
	 * @param type 站内/短信/邮件/传真
	 * @param context
	 * @param receiverDist 接收目标地址（邮箱，手机号，用户登陆名，传真号）
	 * @return 发送批次号  TYPE_yyyymmddhhmmss_3位随机数
	 */
	public String sendMessageByDist(Message message, List<String> receiverDist);
	
	/**
	 * 
	 * 向MQ发送消息,根据提供的userID从用户管理模块获取用户相关的手机，邮箱等信息进行发送
	 * @param type
	 * @param context
	 * @param userIds
	 * @throws BusinessException 发送到MQ出错
	 * @throws ValidationException 	 
	 * @return 发送批次号  TYPE_yyyymmddhhmmss_3位随机数
	 */
	public String sendMessageByUser(Message message, List<String> userIds);
	
	/**
	 * 
	 * 根据批次号检查发送状态
	 * @param batchNumber
	 * @return 发送状态
	 */
	public SendStatus checkSendStatus(String batchNumber);
}
