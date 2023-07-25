package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 10:13:18
 */
public class AlipayDataDataserviceAdOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6199857882546759468L;

	/** 
	 * 广告投放平台生成的订单ID
	 */
	@ApiField("order_id")
	private Long orderId;

	/** 
	 * 外部平台导入广告库后，广告投放创意对应的外部订单ID
	 */
	@ApiField("order_outer_id")
	private String orderOuterId;

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Long getOrderId( ) {
		return this.orderId;
	}

	public void setOrderOuterId(String orderOuterId) {
		this.orderOuterId = orderOuterId;
	}
	public String getOrderOuterId( ) {
		return this.orderOuterId;
	}

}
