/**
 * 
 */
package com.cache.delivery.enumdata;

import java.util.HashMap;
import java.util.Map;

/**
 * @author laiminzhan 旅行团状态
 */
public enum GroupStatus {
	RECUITING("RECUITING", "收客中"), CANCELED("CANCELED", "不成团"), CLOSE_OFF("CLOSE_OFF", "已截止"), CONFIRMED("CONFIRMED",
			"已确认"), SET_OFF("SET_OFF", "已出团"), RETURNED("RETURNED", "已回团");

	private String key;
	private String value;

	private GroupStatus(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public static Map<String, String> getEnumMember()
	{
		Map<String, String> member=new HashMap<String,String>();
		for(GroupStatus enumMember:GroupStatus.values())
		{
			member.put(enumMember.getKey(),enumMember.getValue());
		}
		
		return member;
		
	}
}
