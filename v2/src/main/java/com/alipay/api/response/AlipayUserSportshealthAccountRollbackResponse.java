package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.sportshealth.account.rollback response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 15:56:47
 */
public class AlipayUserSportshealthAccountRollbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 5749738894117642277L;

	/** 
	 * 运动币账户支付流水号
	 */
	@ApiField("pay_order_no")
	private String payOrderNo;

	public void setPayOrderNo(String payOrderNo) {
		this.payOrderNo = payOrderNo;
	}
	public String getPayOrderNo( ) {
		return this.payOrderNo;
	}

}
