package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expenserules.groupemployee.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-19 15:31:52
 */
public class AlipayEbppInvoiceExpenserulesGroupemployeeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1277617952987418675L;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
