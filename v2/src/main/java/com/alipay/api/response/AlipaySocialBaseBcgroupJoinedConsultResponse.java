package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.bcgroup.joined.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 03:16:47
 */
public class AlipaySocialBaseBcgroupJoinedConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7547338492125534932L;

	/** 
	 * 入群状态。true为已经入群，false为未入群。
	 */
	@ApiField("joined")
	private Boolean joined;

	public void setJoined(Boolean joined) {
		this.joined = joined;
	}
	public Boolean getJoined( ) {
		return this.joined;
	}

}
