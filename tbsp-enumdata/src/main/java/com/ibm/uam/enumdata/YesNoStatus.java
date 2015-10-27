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
public enum YesNoStatus {
	DICT_TYPE("UAM_YESNO_STATUS","是否"),
	YES("1","是"),
	NO("0","否");
	
	private String code;
	
	private String value;
	
	private YesNoStatus(String code, String value) {
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
        for (YesNoStatus c : YesNoStatus.values()) {
            if (c.getCode().equals(code)) {
                return c.value;
            }
        }
        return null;
    }
}
