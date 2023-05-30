package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.creditlinkloan.authorder.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 06:26:55
 */
public class ZhimaCreditEpCreditlinkloanAuthorderInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4447167764422836123L;

	/** 
	 * 商户单号，请与授权申请时的单号保持一致
	 */
	@ApiField("merchant_biz_no")
	private String merchantBizNo;

	public void setMerchantBizNo(String merchantBizNo) {
		this.merchantBizNo = merchantBizNo;
	}
	public String getMerchantBizNo( ) {
		return this.merchantBizNo;
	}

}
