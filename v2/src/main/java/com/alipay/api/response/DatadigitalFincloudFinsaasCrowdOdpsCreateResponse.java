package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.crowd.odps.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 23:23:31
 */
public class DatadigitalFincloudFinsaasCrowdOdpsCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7794894395284686765L;

	/** 
	 * 人群ID
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
