package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.crowd.logical.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 04:08:23
 */
public class DatadigitalFincloudFinsaasCrowdLogicalCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1436173332583113322L;

	/** 
	 * 人群ID+唯一
	 */
	@ApiField("crowd_id")
	private String crowdId;

	public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
	}
	public String getCrowdId( ) {
		return this.crowdId;
	}

}
