/**
 * Copyright © 2014, IBM and/or GZL, All rights reserved.
 */
package com.cache.resource.enumdata;

/**
 * 提示信息
 * @author zhangxf
 * @since 0.0.1
 */
public enum MsgInfo {

	SUCCESS("SUCCESS","保存成功"),
	FAIL("FAIL","系统错误，请联系管理员"),
	UPDATESUCCESS("UPDATESUCCESS","修改成功"),
	UPDATEFAIL("UPDATEFAIL","修改失败"),
	DELSUCCESS("DELSUCCESS","删除成功"),
	DELFAIL("DELFAIL","删除失败"),
	BIGTHAN("BIGTHAN","您输入的分配数大于批次数量"),
	BIGTHAN_LOT("BIGTHAN_LOT","该批次的批次计划总和大于批次分配的数量"),
	EXIST_LOT_PLAN("EXIST_LOT_PLAN","你选择的时间范围内该批次已经存在批次计划"),
	BIGTHAN_QUOTA_PLAN("BIGTHAN_QUOTA_PLAN","你输入配额数量大于可分配的配额数量"),
	NOT_FIND_OWNER("NOT_FIND_OWNER","没有找到该配额计划的第一使用者"),
	LESSTHAN("LESSTHAN","您输入的分配数小于配额已分配额数量");

	private String key;
	private String value;
	private MsgInfo(String key,String value){
		this.key = key;
		this.value = value;
	}

	public String getKey(){
		return this.key;
	}
	
	public String getValue(){
		return this.value;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
