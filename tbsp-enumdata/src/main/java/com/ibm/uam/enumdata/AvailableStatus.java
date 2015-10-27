package com.ibm.uam.enumdata;
/**
 * 
 * 有效状态 
 *
 * @author linjiarong
 * @date 2014年11月24日 下午5:07:51 
 * @version 0.0.1
 *
 */
public enum AvailableStatus {
	DICT_TYPE("UAM_AVAIL_STATUS","有效状态"),
	Valid("1","可用"),
	Invalid("0","不可用");
	
	private String code;
	
	private String value;
	
	private AvailableStatus(String code, String value) {
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
        for (AvailableStatus c : AvailableStatus.values()) {
            if (c.getCode().equals(code)) {
                return c.value;
            }
        }
        return null;
    }
}
