package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.aligroup.productopen.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 06:21:57
 */
public class AlipayOpenAligroupProductopenApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2197683762882449162L;

	/** 
	 * 订单号
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
