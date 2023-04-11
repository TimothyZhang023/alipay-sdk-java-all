package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.ampe.devicemodel.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 13:00:04
 */
public class AlipayOpenMiniAmpeDevicemodelAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 5419275271864169696L;

	/** 
	 * 设备机型id
	 */
	@ApiField("device_model_id")
	private Long deviceModelId;

	public void setDeviceModelId(Long deviceModelId) {
		this.deviceModelId = deviceModelId;
	}
	public Long getDeviceModelId( ) {
		return this.deviceModelId;
	}

}
