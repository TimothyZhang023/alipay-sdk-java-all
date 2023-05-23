package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiResponseHeader;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.applepay.merchantauthtoken.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 06:03:19
 */
public class AlipayUserApplepayMerchantauthtokenGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4373785785648911477L;

	/** 
	 * 商户授权token
	 */
	@ApiField("merchant_auth_token")
	private String merchantAuthToken;

	/** 
	 * 响应头
	 */
	@ApiField("response_header")
	private OpenApiResponseHeader responseHeader;

	public void setMerchantAuthToken(String merchantAuthToken) {
		this.merchantAuthToken = merchantAuthToken;
	}
	public String getMerchantAuthToken( ) {
		return this.merchantAuthToken;
	}

	public void setResponseHeader(OpenApiResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}
	public OpenApiResponseHeader getResponseHeader( ) {
		return this.responseHeader;
	}

}
