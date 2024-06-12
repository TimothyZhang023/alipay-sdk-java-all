package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.merchantsign.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-12 16:11:54
 */
public class AlipayCommerceCommonMerchantsignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3544136371786454795L;

	/** 
	 * 签约状态
	 */
	@ApiField("sign_status")
	private String signStatus;

	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}
	public String getSignStatus( ) {
		return this.signStatus;
	}

}
