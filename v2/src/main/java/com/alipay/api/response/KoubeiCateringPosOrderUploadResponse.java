package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.order.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 03:05:00
 */
public class KoubeiCateringPosOrderUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6374513358892983561L;

	/** 
	 * 生成序列号标记每次上传
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
