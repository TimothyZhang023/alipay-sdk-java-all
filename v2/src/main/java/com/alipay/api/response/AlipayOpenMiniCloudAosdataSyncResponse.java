package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.cloud.aosdata.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 01:31:44
 */
public class AlipayOpenMiniCloudAosdataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6461972125913659859L;

	/** 
	 * 请求链路标识，用于排查问题
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
