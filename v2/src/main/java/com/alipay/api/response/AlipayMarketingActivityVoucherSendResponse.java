package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.voucher.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-01 22:52:05
 */
public class AlipayMarketingActivityVoucherSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4182861257133944527L;

	/** 
	 * 本次发放的支付券id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}
	public String getVoucherId( ) {
		return this.voucherId;
	}

}
