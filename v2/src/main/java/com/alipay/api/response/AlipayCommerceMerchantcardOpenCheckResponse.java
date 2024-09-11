package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.open.check response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-10 14:30:31
 */
public class AlipayCommerceMerchantcardOpenCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 8459492124595459641L;

	/** 
	 * 预校验是否通过
	 */
	@ApiField("check_result")
	private Boolean checkResult;

	/** 
	 * 预校验失败的原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	public void setCheckResult(Boolean checkResult) {
		this.checkResult = checkResult;
	}
	public Boolean getCheckResult( ) {
		return this.checkResult;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

}
