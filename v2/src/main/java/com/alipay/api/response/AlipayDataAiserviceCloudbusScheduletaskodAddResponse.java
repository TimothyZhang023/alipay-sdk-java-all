package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CloudbusCommonResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.scheduletaskod.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 06:22:37
 */
public class AlipayDataAiserviceCloudbusScheduletaskodAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 6233268234296824293L;

	/** 
	 * 任务结果
	 */
	@ApiField("result")
	private CloudbusCommonResult result;

	public void setResult(CloudbusCommonResult result) {
		this.result = result;
	}
	public CloudbusCommonResult getResult( ) {
		return this.result;
	}

}
