package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BaseOpenApiResponseHeaderDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.applepay.transactionauthtoken.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 05:21:54
 */
public class AlipayPayApplepayTransactionauthtokenDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 2874393587224382893L;

	/** 
	 * 响应报文头部
	 */
	@ApiField("response_header")
	private BaseOpenApiResponseHeaderDTO responseHeader;

	public void setResponseHeader(BaseOpenApiResponseHeaderDTO responseHeader) {
		this.responseHeader = responseHeader;
	}
	public BaseOpenApiResponseHeaderDTO getResponseHeader( ) {
		return this.responseHeader;
	}

}
