package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.level.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 04:01:52
 */
public class ZhimaCreditEpDossierLevelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2279242495449874431L;

	/** 
	 * 信用等级
	 */
	@ApiField("credit_level")
	private String creditLevel;

	/** 
	 * 评估信用等级时间
	 */
	@ApiField("evaluate_time")
	private String evaluateTime;

	/** 
	 * 是否授权
	 */
	@ApiField("has_authed")
	private Boolean hasAuthed;

	public void setCreditLevel(String creditLevel) {
		this.creditLevel = creditLevel;
	}
	public String getCreditLevel( ) {
		return this.creditLevel;
	}

	public void setEvaluateTime(String evaluateTime) {
		this.evaluateTime = evaluateTime;
	}
	public String getEvaluateTime( ) {
		return this.evaluateTime;
	}

	public void setHasAuthed(Boolean hasAuthed) {
		this.hasAuthed = hasAuthed;
	}
	public Boolean getHasAuthed( ) {
		return this.hasAuthed;
	}

}
