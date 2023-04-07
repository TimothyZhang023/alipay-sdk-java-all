package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.common.policy.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 10:26:45
 */
public class AlipayInsSceneCommonPolicyCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 7172759413521186521L;

	/** 
	 * 批单号
	 */
	@ApiField("endorse_no")
	private String endorseNo;

	public void setEndorseNo(String endorseNo) {
		this.endorseNo = endorseNo;
	}
	public String getEndorseNo( ) {
		return this.endorseNo;
	}

}
