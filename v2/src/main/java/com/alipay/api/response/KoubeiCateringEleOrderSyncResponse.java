package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.ele.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 07:47:27
 */
public class KoubeiCateringEleOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3566974966954666991L;

	/** 
	 * 原始的订单id编号
	 */
	@ApiField("order_id")
	private String orderId;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}
