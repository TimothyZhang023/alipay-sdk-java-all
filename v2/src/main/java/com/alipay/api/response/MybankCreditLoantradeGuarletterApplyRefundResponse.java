package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.guarletter.apply.refund response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 08:41:12
 */
public class MybankCreditLoantradeGuarletterApplyRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 5848937233964497345L;

	/** 
	 * 退款申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getApplyNo( ) {
		return this.applyNo;
	}

}
