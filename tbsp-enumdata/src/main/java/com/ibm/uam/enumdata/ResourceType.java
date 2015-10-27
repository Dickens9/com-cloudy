package com.ibm.uam.enumdata;

public enum ResourceType {
	DICT_TYPE("TBSP_RESOURCE_TYPE","资源类型"),
	MENU("0","菜单"),
	URL("1","URL"),
	BUTTON("2","按钮"),
	LINK("3","链接");

	private String code;
	private String value;
	
	
	private ResourceType(String code, String value) {
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
	    for (ResourceType c : ResourceType.values()) {
	        if (c.getCode().equals(code)) {
	            return c.value;
	        }
	    }
	    return null;
	 }
}
