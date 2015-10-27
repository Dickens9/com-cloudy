
package com.bulider.decorate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.cloudy.common.entity.BaseEntity;
/**
 * TODO(实体类)
 * @author by ibm core generator
 * @version 1.0.0
 */
@Entity
@Table(name = "TB_CM_ROTATE_ADS")
public class CmRotateAds extends BaseEntity<String>{

	public static final String ID = "id";
	public static final String POSITION = "position";
	public static final String TITLE = "title";
	public static final String HREF = "href";
	public static final String START_TIME = "startTime";
	public static final String END_TIME = "endTime";
	public static final String PIC_ID = "picId";
	public static final String TIP = "tip";
	public static final String BACKGROUND_COLOR = "backgroundColor";
	public static final String IS_NEW_WINDOW = "isNewWindow";
	public static final String MODULE_ID = "moduleId";
	public static final String TAG_ID = "tagId";
	public static final String CREATE_BY = "createBy";
	public static final String CREATE_DATE = "createDate";
	public static final String UPDATE_BY = "updateBy";
	public static final String UPDATE_DATE = "updateDate";
	public static final String VERSION = "version";
	public static final String IS_DELETED = "isDeleted";

    /** POSITION - 排序 */
    @Column(name = "POSITION", unique = false, nullable = false, insertable = true, updatable = true, length = 5)
    private Integer position;
    /** TITLE - 标题 */
    @Column(name = "TITLE", unique = false, nullable = true, insertable = true, updatable = true, length = 256)
    private String title;
    /** HREF - 链接 */
    @Column(name = "HREF", unique = false, nullable = true, insertable = true, updatable = true, length = 1024)
    private String href;
    /** START_TIME - 开始时间 */
    @Column(name = "START_TIME", unique = false, nullable = true, insertable = true, updatable = true, length = 7)
    private java.util.Date startTime;
    /** END_TIME - 结束时间 */
    @Column(name = "END_TIME", unique = false, nullable = true, insertable = true, updatable = true, length = 7)
    private java.util.Date endTime;
    /** PIC_ID - 图片ID */
    @Column(name = "PIC_ID", unique = false, nullable = false, insertable = true, updatable = true, length = 64)
    private String picId;
    /** TIP - 提示内容 */
    @Column(name = "TIP", unique = false, nullable = true, insertable = true, updatable = true, length = 512)
    private String tip;
    /** BACKGROUND_COLOR - 背景颜色 */
    @Column(name = "BACKGROUND_COLOR", unique = false, nullable = true, insertable = true, updatable = true, length = 32)
    private String backgroundColor;
    /** IS_NEW_WINDOW - 是否新窗口打开 */
    @Column(name = "IS_NEW_WINDOW", unique = false, nullable = true, insertable = true, updatable = true, length = 1)
    private String isNewWindow;
    /** MODULE_ID - 模块ID */
    @Column(name = "MODULE_ID", unique = false, nullable = false, insertable = true, updatable = true, length = 32)
    private String moduleId;
    /** TAG_ID - 标签ID */
    @Column(name = "TAG_ID", unique = false, nullable = true, insertable = true, updatable = true, length = 32)
    private String tagId;







    public void setPosition(Integer value) {
		this.position = value;
	}

    public Integer getPosition() {
		return this.position;
	}

    public void setTitle(String value) {
		this.title = value;
	}

    public String getTitle() {
		return this.title;
	}

    public void setHref(String value) {
		this.href = value;
	}

    public String getHref() {
		return this.href;
	}

    public void setStartTime(java.util.Date value) {
		this.startTime = value;
	}

    public java.util.Date getStartTime() {
		return this.startTime;
	}

    public void setEndTime(java.util.Date value) {
		this.endTime = value;
	}

    public java.util.Date getEndTime() {
		return this.endTime;
	}

    public void setPicId(String value) {
		this.picId = value;
	}

    public String getPicId() {
		return this.picId;
	}

    public void setTip(String value) {
		this.tip = value;
	}

    public String getTip() {
		return this.tip;
	}

    public void setBackgroundColor(String value) {
		this.backgroundColor = value;
	}

    public String getBackgroundColor() {
		return this.backgroundColor;
	}

    public void setIsNewWindow(String value) {
		this.isNewWindow = value;
	}

    public String getIsNewWindow() {
		return this.isNewWindow;
	}

    public void setModuleId(String value) {
		this.moduleId = value;
	}

    public String getModuleId() {
		return this.moduleId;
	}

    public void setTagId(String value) {
		this.tagId = value;
	}

    public String getTagId() {
		return this.tagId;
	}
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("ID",getId())
			.append("POSITION",getPosition())
			.append("TITLE",getTitle())
			.append("HREF",getHref())
			.append("START_TIME",getStartTime())
			.append("END_TIME",getEndTime())
			.append("PIC_ID",getPicId())
			.append("TIP",getTip())
			.append("BACKGROUND_COLOR",getBackgroundColor())
			.append("IS_NEW_WINDOW",getIsNewWindow())
			.append("MODULE_ID",getModuleId())
			.append("TAG_ID",getTagId())
			.append("CREATE_BY",getCreateBy())
			.append("CREATE_DATE",getCreateDate())
			.append("UPDATE_BY",getUpdateBy())
			.append("UPDATE_DATE",getUpdateDate())
			.append("VERSION",getVersion())
			.append("IS_DELETED",getIsDeleted())
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
		if(!(obj instanceof CmRotateAds)){
			return false;
		}
		if(this == obj) {
			return true;
		}
		CmRotateAds other = (CmRotateAds)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

