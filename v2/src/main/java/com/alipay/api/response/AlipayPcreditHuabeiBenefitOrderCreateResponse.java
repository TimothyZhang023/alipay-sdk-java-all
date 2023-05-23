package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.benefit.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 01:24:55
 */
public class AlipayPcreditHuabeiBenefitOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3517474175397762219L;

	/** 
	 * 权益订单id
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
