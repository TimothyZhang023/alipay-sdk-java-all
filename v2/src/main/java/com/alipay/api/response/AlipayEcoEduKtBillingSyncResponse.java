package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.kt.billing.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 16:51:52
 */
public class AlipayEcoEduKtBillingSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8339464686993927439L;

	/** 
	 * 教育缴费平台的账单号
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
