package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.gotone.message.sms.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 21:56:48
 */
public class AlipayGotoneMessageSmsSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 1642185276813828744L;

	/** 
	 * 返回结果
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
