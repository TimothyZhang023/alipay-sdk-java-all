package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CloudbusAvaliableItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.available.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:38:06
 */
public class AlipayDataAiserviceCloudbusAvailableQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1833964759297612947L;

	/** 
	 * 城市可用时间和用户geohash可用额度
	 */
	@ApiField("result")
	private CloudbusAvaliableItem result;

	public void setResult(CloudbusAvaliableItem result) {
		this.result = result;
	}
	public CloudbusAvaliableItem getResult( ) {
		return this.result;
	}

}
