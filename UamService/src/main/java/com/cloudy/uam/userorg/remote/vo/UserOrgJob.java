package com.cloudy.uam.userorg.remote.vo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/** 
 * 
 * 用户组织岗位信息
 *
 * @author linjiarong
 * @date 2014年11月6日 上午10:31:29 
 * @version 0.0.1
 *  
 */
public class UserOrgJob implements Serializable{
	/** serialVersionUID */
	private static final long serialVersionUID = -4472928218305615228L;
	
	/** UUID */
	private String id;
	
	/** 用户 UUID */
    private String  userId ;
    
    /** 用户名，用户登陆名 */
    private String username;
    
    /** 组织ID **/
    private String  orgId ;
    
    /** 组织代码 */
    private String orgCode;
    
    /** 组织名称 */
    private String orgName;

    /** 岗位ID **/
    private String  jobId ;
    
    /** 岗位Code **/
    private String jobCode;
    
    public String getJobCode() {
		return jobCode;
	}

	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}

	/** 岗位名称 */
    private String jobName;

    /** 是否主岗 MainJob **/
    private String  ismain ;
    
    /** 生效时间 **/
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date  effectiveDate;
    
    /** 失效时间 **/
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date  expiredDate ;
    
    public UserOrgJob() {
		super();
	}

	public UserOrgJob(String id, String userId,
			String orgId, String orgName, String jobId, String jobCode, String jobName, String ismain) {
		super();
		this.id = id;
		this.userId = userId;
		this.orgId = orgId;
		this.orgName = orgName;
		this.jobId = jobId;
		this.jobCode = jobCode;
		this.jobName = jobName;
		this.ismain = ismain;
	}

	/** 
	 * 构造函数
	 * @param id
	 * @param userId
	 * @param username
	 * @param orgId
	 * @param orgCode
	 * @param orgName
	 * @param jobId
	 * @param jobName
	 * @param ismain
	 * @param effectiveDate
	 * @param expiredDate 
	 */
	public UserOrgJob(String id, String userId, String username, String orgId,
			String orgCode, String orgName, String jobId, String jobCode, String jobName,
			String ismain, Date effectiveDate, Date expiredDate) {
		super();
		this.id = id;
		this.userId = userId;
		this.username = username;
		this.orgId = orgId;
		this.orgCode = orgCode;
		this.orgName = orgName;
		this.jobId = jobId;
		this.jobCode = jobCode;
		this.jobName = jobName;
		this.ismain = ismain;
		this.effectiveDate = effectiveDate;
		this.expiredDate = expiredDate;
	}

	/** 
	 * @return id 
	 */
	public String getId() {
		return id;
	}

	/** 
	 * @param id 要设置的 id 
	 */
	public void setId(String id) {
		this.id = id;
	}

	/** 
	 * @return userId 
	 */
	public String getUserId() {
		return userId;
	}

	/** 
	 * @param userId 要设置的 userId 
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/** 
	 * @return username 
	 */
	public String getUsername() {
		return username;
	}

	/** 
	 * @param username 要设置的 username 
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/** 
	 * @return orgId 
	 */
	public String getOrgId() {
		return orgId;
	}

	/** 
	 * @param orgId 要设置的 orgId 
	 */
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	/** 
	 * @return orgCode 
	 */
	public String getOrgCode() {
		return orgCode;
	}

	/** 
	 * @param orgCode 要设置的 orgCode 
	 */
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	/** 
	 * @return orgName 
	 */
	public String getOrgName() {
		return orgName;
	}

	/** 
	 * @param orgName 要设置的 orgName 
	 */
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	/** 
	 * @return jobId 
	 */
	public String getJobId() {
		return jobId;
	}

	/** 
	 * @param jobId 要设置的 jobId 
	 */
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	/** 
	 * @return jobName 
	 */
	public String getJobName() {
		return jobName;
	}

	/** 
	 * @param jobName 要设置的 jobName 
	 */
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	/** 
	 * @return ismain 
	 */
	public String getIsmain() {
		return ismain;
	}

	/** 
	 * @param ismain 要设置的 ismain 
	 */
	public void setIsmain(String ismain) {
		this.ismain = ismain;
	}

	/** 
	 * @return effectiveDate 
	 */
	public Date getEffectiveDate() {
		return effectiveDate;
	}

	/** 
	 * @param effectiveDate 要设置的 effectiveDate 
	 */
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	/** 
	 * @return expiredDate 
	 */
	public Date getExpiredDate() {
		return expiredDate;
	}

	/** 
	 * @param expiredDate 要设置的 expiredDate 
	 */
	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}
}
