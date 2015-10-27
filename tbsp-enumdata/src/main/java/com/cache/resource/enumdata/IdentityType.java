/**
 * Copyright © 2014, IBM and/or GZL, All rights reserved.
 */
package com.cache.resource.enumdata;

/**
 *
 * @author Administrator
 * @since 0.0.1
 */
public enum IdentityType {

	Worker("Worker","在职人员"),
	Freelance("Freelance","自由职业者"),
	Retirer("Retirer","退休人员"),
	Student("Student","学生"),
	Child("Child","学龄前儿童");
	
	private String key;
	private String value;
	
	private IdentityType(String key, String value) {
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
	
}
