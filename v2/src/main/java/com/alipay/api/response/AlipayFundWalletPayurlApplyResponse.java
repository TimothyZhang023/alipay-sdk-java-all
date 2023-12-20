package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.payurl.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-11 19:21:02
 */
public class AlipayFundWalletPayurlApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5494567387249642479L;

	/** 
	 * 跳转前端申请付款码的短链接
	 */
	@ApiField("payment_url")
	private String paymentUrl;

	public void setPaymentUrl(String paymentUrl) {
		this.paymentUrl = paymentUrl;
	}
	public String getPaymentUrl( ) {
		return this.paymentUrl;
	}

}
