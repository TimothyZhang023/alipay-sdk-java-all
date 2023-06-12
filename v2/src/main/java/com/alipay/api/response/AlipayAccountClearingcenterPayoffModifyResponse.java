package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ClearingCommonResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.clearingcenter.payoff.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 19:37:08
 */
public class AlipayAccountClearingcenterPayoffModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2583637276896114639L;

	/** 
	 * 返回结果
	 */
	@ApiField("result")
	private ClearingCommonResult result;

	public void setResult(ClearingCommonResult result) {
		this.result = result;
	}
	public ClearingCommonResult getResult( ) {
		return this.result;
	}

}
