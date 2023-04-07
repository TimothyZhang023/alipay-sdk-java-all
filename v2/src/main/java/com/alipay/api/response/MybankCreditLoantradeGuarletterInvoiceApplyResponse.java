package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.guarletter.invoice.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 12:06:40
 */
public class MybankCreditLoantradeGuarletterInvoiceApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3435481367287376348L;

	/** 
	 * 开发票申请单单号
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
