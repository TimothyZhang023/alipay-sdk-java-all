package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.csccmng.openapi.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-23 14:26:47
 */
public class AlipayIserviceCsccmngOpenapiTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 8269262381314415631L;

	/** 
	 * 业务参数，业务执行是否成功和结果都从该参数中取
	 */
	@ApiField("result_content")
	private String resultContent;

	public void setResultContent(String resultContent) {
		this.resultContent = resultContent;
	}
	public String getResultContent( ) {
		return this.resultContent;
	}

}
