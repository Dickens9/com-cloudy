package com.cache.sales.enumdata;

/**
 * 合同状态：
 * 草稿,待分派,已分派,待资源审核,资源审核不通过,资源审核通过,待签订,已签订
 * @author hemeng
 */

public enum ContractStatus {
	CONTRACT_STATUS("CONTRACT_STATUS","合同状态"),
	Draft("Draft","草稿"),
	ToDispatch("ToDispatch","待分派"),
	Dispatch("Dispatch","已分派"),
	ToResourceAudit("ToResourceAudit","待资源审核"),
	ResourceAuditNotPass("ResourceAuditNotPass","资源审核不通过"),
	ResourceAuditPass("ResourceAuditPass","资源审核通过"),
	ToSign("ToSign","待签订"),
	Signed("Signed","已签订");

	private String key;
	private String value;

	private ContractStatus(String key, String value) {
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
