package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeviceRelationData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.advertiser.device.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 19:26:12
 */
public class AlipayCommerceIotAdvertiserDeviceConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2778259371459717393L;

	/** 
	 * 设备关联数据
	 */
	@ApiListField("result")
	@ApiField("device_relation_data")
	private List<DeviceRelationData> result;

	public void setResult(List<DeviceRelationData> result) {
		this.result = result;
	}
	public List<DeviceRelationData> getResult( ) {
		return this.result;
	}

}
