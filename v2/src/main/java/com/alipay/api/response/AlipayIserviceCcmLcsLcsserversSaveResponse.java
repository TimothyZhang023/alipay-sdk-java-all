package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.lcs.lcsservers.save response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 15:46:44
 */
public class AlipayIserviceCcmLcsLcsserversSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 1865271861327772651L;

	/** 
	 * 操作返回结果
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
