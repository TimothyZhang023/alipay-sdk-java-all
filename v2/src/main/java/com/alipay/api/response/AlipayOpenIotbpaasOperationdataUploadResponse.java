package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotbpaas.operationdata.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 01:36:23
 */
public class AlipayOpenIotbpaasOperationdataUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8265649841585532739L;

	/** 
	 * 操作是否成功
	 */
	@ApiField("flag")
	private Boolean flag;

	/** 
	 * 业务结果信息，用于错误排查
	 */
	@ApiField("message")
	private String message;

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}
	public Boolean getFlag( ) {
		return this.flag;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

}
