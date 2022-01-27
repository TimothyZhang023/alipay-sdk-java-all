package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.jobcard.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-07 15:22:55
 */
public class AlipayUserJobcardInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5859925687229345763L;

	/** 
	 * 意向行政区域
	 */
	@ApiField("admin_area")
	private String adminArea;

	/** 
	 * 意向岗位，json数组
	 */
	@ApiField("intent_post_tag")
	private String intentPostTag;

	/** 
	 * 用户意向工作地点类型
	 */
	@ApiField("job_site_type")
	private String jobSiteType;

	/** 
	 * 用户意向工作时间类型
	 */
	@ApiField("job_time_type")
	private String jobTimeType;

	/** 
	 * 就近距离，单位千米
	 */
	@ApiField("local_range")
	private Long localRange;

	/** 
	 * 用户技能tag，json字符串
	 */
	@ApiField("skill_tag")
	private String skillTag;

	/** 
	 * 适工年龄状态
	 */
	@ApiField("suitable_age_status")
	private String suitableAgeStatus;

	/** 
	 * 姓名
	 */
	@ApiField("user_name")
	private String userName;

	/** 
	 * 用户手机号
	 */
	@ApiField("user_phone")
	private String userPhone;

	public void setAdminArea(String adminArea) {
		this.adminArea = adminArea;
	}
	public String getAdminArea( ) {
		return this.adminArea;
	}

	public void setIntentPostTag(String intentPostTag) {
		this.intentPostTag = intentPostTag;
	}
	public String getIntentPostTag( ) {
		return this.intentPostTag;
	}

	public void setJobSiteType(String jobSiteType) {
		this.jobSiteType = jobSiteType;
	}
	public String getJobSiteType( ) {
		return this.jobSiteType;
	}

	public void setJobTimeType(String jobTimeType) {
		this.jobTimeType = jobTimeType;
	}
	public String getJobTimeType( ) {
		return this.jobTimeType;
	}

	public void setLocalRange(Long localRange) {
		this.localRange = localRange;
	}
	public Long getLocalRange( ) {
		return this.localRange;
	}

	public void setSkillTag(String skillTag) {
		this.skillTag = skillTag;
	}
	public String getSkillTag( ) {
		return this.skillTag;
	}

	public void setSuitableAgeStatus(String suitableAgeStatus) {
		this.suitableAgeStatus = suitableAgeStatus;
	}
	public String getSuitableAgeStatus( ) {
		return this.suitableAgeStatus;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName( ) {
		return this.userName;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserPhone( ) {
		return this.userPhone;
	}

}
