package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CloudbusCommonResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.resource.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 05:23:38
 */
public class AlipayDataAiserviceCloudbusResourceUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6733477656819627558L;

	/** 
	 * 结果
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
