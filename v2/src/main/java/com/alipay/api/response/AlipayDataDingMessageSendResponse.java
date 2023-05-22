package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.ding.message.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 03:48:23
 */
public class AlipayDataDingMessageSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2756176236481977995L;

	/** 
	 * 状态码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 描述
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 状态
	 */
	@ApiField("status")
	private String status;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
