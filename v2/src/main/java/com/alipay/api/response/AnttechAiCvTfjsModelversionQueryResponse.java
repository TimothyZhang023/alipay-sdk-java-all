package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.cv.tfjs.modelversion.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 21:57:08
 */
public class AnttechAiCvTfjsModelversionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7715586143195769282L;

	/** 
	 * 对应模型最新版本号
	 */
	@ApiField("model_version")
	private String modelVersion;

	public void setModelVersion(String modelVersion) {
		this.modelVersion = modelVersion;
	}
	public String getModelVersion( ) {
		return this.modelVersion;
	}

}
