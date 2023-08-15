package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GFAOpenAPIAcceptanceResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfacceptance.syncbill.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 06:08:53
 */
public class AlipayBossFncGfacceptanceSyncbillCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 2212235733996688821L;

	/** 
	 * 业财受理结果
	 */
	@ApiField("result")
	private GFAOpenAPIAcceptanceResult result;

	public void setResult(GFAOpenAPIAcceptanceResult result) {
		this.result = result;
	}
	public GFAOpenAPIAcceptanceResult getResult( ) {
		return this.result;
	}

}
