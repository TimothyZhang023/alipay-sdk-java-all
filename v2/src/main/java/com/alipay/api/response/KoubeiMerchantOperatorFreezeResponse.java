package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.freeze response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 09:27:36
 */
public class KoubeiMerchantOperatorFreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 3557478681438467914L;

	/** 
	 * 操作结果 true:success, false: failed
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
