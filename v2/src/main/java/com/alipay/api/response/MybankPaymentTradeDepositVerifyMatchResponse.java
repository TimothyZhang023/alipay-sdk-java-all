package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.deposit.verify.match response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 08:33:40
 */
public class MybankPaymentTradeDepositVerifyMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 4468543843148753277L;

	/** 
	 * 金额是否匹配
	 */
	@ApiField("valid")
	private Boolean valid;

	public void setValid(Boolean valid) {
		this.valid = valid;
	}
	public Boolean getValid( ) {
		return this.valid;
	}

}
