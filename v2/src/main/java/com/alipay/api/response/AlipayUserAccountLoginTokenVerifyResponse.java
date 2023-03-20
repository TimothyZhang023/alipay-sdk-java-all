package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.login.token.verify response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 22:49:33
 */
public class AlipayUserAccountLoginTokenVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6349885617791316265L;

	/** 
	 * 支付宝用户uid
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

}
