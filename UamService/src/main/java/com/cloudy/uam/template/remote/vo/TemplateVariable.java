package com.cloudy.uam.template.remote.vo;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**

 * @version 1.0.0
 */
public class TemplateVariable implements Serializable{

	/**@Fields serialVersionUID:TODO*/
	private static final long serialVersionUID = -9012326504440001228L;
	public static final String ID = "id";
	public static final String NAME = "name";
	public static final String DESCEIPTION = "desceiption";
	public static final String TYPE = "type";
	public static final String CONFIG = "config";
	public static final String SCOPE = "scope";
	public static final String IS_EVAL = "IS_EVAL";
	public static final String VALUE="value";

	private String id;
    /** NAME - 变量名称，例：orderId  */
    private String name;
    /** DESCEIPTION - 变量说明，例，订单ID  */
    private String desceiption;
    /** TYPE - 变量类型，SQL，固定  */
    private String type;
    /** CONFIG - 变量配置，SELECT...，固定  */
    private String config;
    /** SCOPE - 适用范围，全局，局部  */
    private String scope;
    /** 计算后的具体值 */
    private Object value;
    
    public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	private EvalStatus evalStatus = EvalStatus.WAITING;

    public EvalStatus getEvalStatus() {
		return evalStatus;
	}

	public void setEvalStatus(EvalStatus isEval) {
		this.evalStatus = isEval;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String value) {
		this.name = value;
	}
    
	public String getName() {
		return this.name;
	}

    public void setDesceiption(String value) {
		this.desceiption = value;
	}
    
	public String getDesceiption() {
		return this.desceiption;
	}

    public void setType(String value) {
		this.type = value;
	}

    
	public String getType() {
		return this.type;
	}

    public void setConfig(String value) {
		this.config = value;
	}

    
	public String getConfig() {
		return this.config;
	}

    public void setScope(String value) {
		this.scope = value;
	}

    
	public String getScope() {
		return this.scope;
	}

	
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("ID",getId())
			.append("NAME",getName())
			.append("DESCEIPTION",getDesceiption())
			.append("TYPE",getType())
			.append("CONFIG",getConfig())
			.append("SCOPE",getScope())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(this.getId() == null){
			return false;
		}
		if(!(obj instanceof TemplateVariable)){
			return false;
		}
		if(this == obj) {
			return true;
		}
		TemplateVariable other = (TemplateVariable)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

