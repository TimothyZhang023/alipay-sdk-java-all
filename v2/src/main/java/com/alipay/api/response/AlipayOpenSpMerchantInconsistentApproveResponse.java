package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.merchant.inconsistent.approve response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 00:28:21
 */
public class AlipayOpenSpMerchantInconsistentApproveResponse extends AlipayResponse {

	private static final long serialVersionUID = 5485495376533699318L;

	/** 
	 * 申请单据编号
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
