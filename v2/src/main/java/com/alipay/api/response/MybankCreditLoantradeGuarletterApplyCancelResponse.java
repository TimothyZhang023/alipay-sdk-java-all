package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.guarletter.apply.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 03:00:13
 */
public class MybankCreditLoantradeGuarletterApplyCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 6243564252658941622L;

	/** 
	 * 取消申请单号
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
