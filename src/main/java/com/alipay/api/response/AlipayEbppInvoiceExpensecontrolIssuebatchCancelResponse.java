package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expensecontrol.issuebatch.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-27 16:26:49
 */
public class AlipayEbppInvoiceExpensecontrolIssuebatchCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 5325868132496332978L;

	/** 
	 * 是否成功
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
