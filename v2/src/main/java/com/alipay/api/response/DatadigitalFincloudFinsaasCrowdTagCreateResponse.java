package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.crowd.tag.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 08:15:26
 */
public class DatadigitalFincloudFinsaasCrowdTagCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8549497286419583799L;

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
