package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.apply.inv.upload response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-13 14:07:39
 */
public class AlipayEbppInvoiceApplyInvUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5513287256114191964L;

	/** 
	 * 处理是否成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

}
