package com.cache.sales.enumdata;

/**
 * 证件类型：
 * 身份证、护照、通行证、台胞证、回乡证、军官证、户口本、出生证
 * @author shaominglei
 *
 */
public enum CertType {
	DICT_TYPE("CERT_TYPE","证件类型"),
	IDCard("IDCard", "身份证"), 
	PassPort("PassPort", "护照"), 
	Pass("Pass", "通行证"), 
	MTPs("OldPeople", "台胞证"),
	HVPs("HVPs", "回乡证"),
	MilitaryID("MilitaryID", "军官证"),
	AccountBook("AccountBook", "户口本"),
	BrithCert("BrithCert", "出生证");

	private String key;
	private String value;

	private CertType(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return this.key;
	}

	public String getValue() {
		return this.value;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
