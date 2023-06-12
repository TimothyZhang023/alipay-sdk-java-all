package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.bcgroup.joined.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 19:52:04
 */
public class AlipaySocialBaseBcgroupJoinedConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 8531451741589234943L;

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
