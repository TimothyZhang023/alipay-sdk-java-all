package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.sign.flow.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 20:06:10
 */
public class AlipayEcoSignFlowCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4499369324721168624L;

	/** 
	 * 流程Id
	 */
	@ApiField("flow_id")
	private String flowId;

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}
	public String getFlowId( ) {
		return this.flowId;
	}

}
