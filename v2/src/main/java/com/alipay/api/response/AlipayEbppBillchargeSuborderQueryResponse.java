package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.billcharge.suborder.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 00:46:56
 */
public class AlipayEbppBillchargeSuborderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7344465321335488181L;

	/** 
	 * 状态
I-等待付款 P-已支付 C-单据关闭 
F-失败  S-成功
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
