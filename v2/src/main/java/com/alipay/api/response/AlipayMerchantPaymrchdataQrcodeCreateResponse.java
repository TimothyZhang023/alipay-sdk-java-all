package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.paymrchdata.qrcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-16 10:47:23
 */
public class AlipayMerchantPaymrchdataQrcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5871189276851728973L;

	/** 
	 * 经营码开通结果
	 */
	@ApiField("open_result")
	private Boolean openResult;

	/** 
	 * 表示经营码开通的单据号
	 */
	@ApiField("qrcode_business_apply_no")
	private String qrcodeBusinessApplyNo;

	public void setOpenResult(Boolean openResult) {
		this.openResult = openResult;
	}
	public Boolean getOpenResult( ) {
		return this.openResult;
	}

	public void setQrcodeBusinessApplyNo(String qrcodeBusinessApplyNo) {
		this.qrcodeBusinessApplyNo = qrcodeBusinessApplyNo;
	}
	public String getQrcodeBusinessApplyNo( ) {
		return this.qrcodeBusinessApplyNo;
	}

}
