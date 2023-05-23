package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.notice.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 09:41:47
 */
public class AlipayEbppCommunityNoticeSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2477971369572423155L;

	/** 
	 * 支付宝通知id
	 */
	@ApiField("alipay_notice_id")
	private String alipayNoticeId;

	public void setAlipayNoticeId(String alipayNoticeId) {
		this.alipayNoticeId = alipayNoticeId;
	}
	public String getAlipayNoticeId( ) {
		return this.alipayNoticeId;
	}

}
