package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IotIdentityFaceOutEventApiResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotvsp.orguserfaceout.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 13:06:12
 */
public class AlipayOpenIotvspOrguserfaceoutQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7779869766389765957L;

	/** 
	 * 错误码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 事件响应
	 */
	@ApiField("data")
	private IotIdentityFaceOutEventApiResponse data;

	/** 
	 * 错误描述
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setData(IotIdentityFaceOutEventApiResponse data) {
		this.data = data;
	}
	public IotIdentityFaceOutEventApiResponse getData( ) {
		return this.data;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
