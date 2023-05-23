package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.rating.inner.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 01:06:04
 */
public class ZhimaCreditEpRatingInnerInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 5333344537146232142L;

	/** 
	 * 芝麻企业信用客户评估单号，商户应该妥善关联持久化保存该订单号用于后续的对账。
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}
