package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.application.orderapply.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 05:54:33
 */
public class AlipayInsSceneApplicationOrderapplyCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4495542848663547144L;

	/** 
	 * 流水号
	 */
	@ApiField("biz_flow_no")
	private String bizFlowNo;

	/** 
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	public void setBizFlowNo(String bizFlowNo) {
		this.bizFlowNo = bizFlowNo;
	}
	public String getBizFlowNo( ) {
		return this.bizFlowNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getPolicyNo( ) {
		return this.policyNo;
	}

}
