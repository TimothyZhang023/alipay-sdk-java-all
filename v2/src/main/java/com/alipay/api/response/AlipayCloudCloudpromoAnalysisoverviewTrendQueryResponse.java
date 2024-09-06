package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiOperationalAnalysisResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.analysisoverview.trend.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-05 14:17:06
 */
public class AlipayCloudCloudpromoAnalysisoverviewTrendQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2793637829719167416L;

	/** 
	 * 经营概况总览接口返回数据
	 */
	@ApiField("result")
	private OpenApiOperationalAnalysisResult result;

	public void setResult(OpenApiOperationalAnalysisResult result) {
		this.result = result;
	}
	public OpenApiOperationalAnalysisResult getResult( ) {
		return this.result;
	}

}
