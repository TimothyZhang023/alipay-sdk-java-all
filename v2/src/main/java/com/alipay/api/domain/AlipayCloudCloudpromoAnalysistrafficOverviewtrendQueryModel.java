package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营分析流量分析总览趋势
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:49:51
 */
public class AlipayCloudCloudpromoAnalysistrafficOverviewtrendQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6853561447376721916L;

	/**
	 * 经营分析、经营概况模块公用入参
	 */
	@ApiField("common_request")
	private OpenApiAnalysisCommonRequest commonRequest;

	public OpenApiAnalysisCommonRequest getCommonRequest() {
		return this.commonRequest;
	}
	public void setCommonRequest(OpenApiAnalysisCommonRequest commonRequest) {
		this.commonRequest = commonRequest;
	}

}
