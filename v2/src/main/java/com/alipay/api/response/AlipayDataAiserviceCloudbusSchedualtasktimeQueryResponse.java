package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ScheduleTimeResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.schedualtasktime.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 15:35:37
 */
public class AlipayDataAiserviceCloudbusSchedualtasktimeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5169942849537685511L;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private ScheduleTimeResult result;

	public void setResult(ScheduleTimeResult result) {
		this.result = result;
	}
	public ScheduleTimeResult getResult( ) {
		return this.result;
	}

}
