package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.jointaccount.member.bind response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-12 19:54:49
 */
public class AlipayFundJointaccountMemberBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 5569176118327264997L;

	/** 
	 * 员工回应邀请链接
	 */
	@ApiField("reply_url")
	private String replyUrl;

	public void setReplyUrl(String replyUrl) {
		this.replyUrl = replyUrl;
	}
	public String getReplyUrl( ) {
		return this.replyUrl;
	}

}
