package com.ibm.uam.enumdata;

/**
 * 
 * 用户状态
 *
 * @author linjiarong
 * @date 2014年11月26日 下午5:41:47 
 * @version 0.0.1
 *
 */
public enum UserStatus {
	DICT_TYPE("UAM_USER_STATUS","用户状态"),
	LOCK("0","锁定"),
	ACTIVE("1","激活");
	
	private String code;
	
	private String value;
	
	private UserStatus(String code, String value) {
		this.code = code;
		this.value = value;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public static String getValueByCode(String code) {
        for (UserStatus c : UserStatus.values()) {
            if (c.getCode().equals(code)) {
                return c.value;
            }
        }
        return null;
    }
}
