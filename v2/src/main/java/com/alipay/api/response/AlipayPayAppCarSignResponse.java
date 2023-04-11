package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.app.car.sign response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 16:17:36
 */
public class AlipayPayAppCarSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 3394741973995572623L;

	/** 
	 * 上下文token
	 */
	@ApiField("context_token")
	private String contextToken;

	public void setContextToken(String contextToken) {
		this.contextToken = contextToken;
	}
	public String getContextToken( ) {
		return this.contextToken;
	}

}
