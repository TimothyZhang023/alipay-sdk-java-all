package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.jobworth.authentication.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-19 19:11:58
 */
public class ZhimaCustomerJobworthAuthenticationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1849675133218184729L;

	/** 
	 * SUCCESS代表可信，FAILED代表不可信，WAITING_VERIFY代表未知需要等待结果
	 */
	@ApiField("identity_result")
	private String identityResult;

	/** 
	 * 身份认证查询结果页面的小程序链接，有芝麻提供，用户在端内可直接访问
	 */
	@ApiField("identity_result_skip_url")
	private String identityResultSkipUrl;

	/** 
	 * 代表订单状态
	 */
	@ApiField("token_status")
	private String tokenStatus;

	public void setIdentityResult(String identityResult) {
		this.identityResult = identityResult;
	}
	public String getIdentityResult( ) {
		return this.identityResult;
	}

	public void setIdentityResultSkipUrl(String identityResultSkipUrl) {
		this.identityResultSkipUrl = identityResultSkipUrl;
	}
	public String getIdentityResultSkipUrl( ) {
		return this.identityResultSkipUrl;
	}

	public void setTokenStatus(String tokenStatus) {
		this.tokenStatus = tokenStatus;
	}
	public String getTokenStatus( ) {
		return this.tokenStatus;
	}

}
