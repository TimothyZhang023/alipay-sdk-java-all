package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.device.baseinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 15:27:24
 */
public class AlipayCommerceIotDeviceBaseinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2537678897294269162L;

	/** 
	 * 设备ID，biztid
	 */
	@ApiField("device_id")
	private String deviceId;

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceId( ) {
		return this.deviceId;
	}

}
