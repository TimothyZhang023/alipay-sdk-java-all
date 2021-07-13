package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.discountplan.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-27 11:35:57
 */
public class MybankCreditSceneprodDiscountplanQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6775884892847418829L;

	/** 
	 * 咨询结果，包含贴息方案的相关信息。
	 */
	@ApiField("consult_result")
	private String consultResult;

	/** 
	 * 网商traceId，便于查询日志内容
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setConsultResult(String consultResult) {
		this.consultResult = consultResult;
	}
	public String getConsultResult( ) {
		return this.consultResult;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
