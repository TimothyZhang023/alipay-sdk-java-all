package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.account.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-04 20:52:00
 */
public class AlipayFundAccountInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5179942938772233291L;

	/** 
	 * 是否允许余额支付
	 */
	@ApiField("enable_payment")
	private Boolean enablePayment;

	public void setEnablePayment(Boolean enablePayment) {
		this.enablePayment = enablePayment;
	}
	public Boolean getEnablePayment( ) {
		return this.enablePayment;
	}

}
