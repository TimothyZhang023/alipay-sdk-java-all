package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.epayprod.product.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-30 10:42:03
 */
public class AlipayTradeEpayprodProductQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2142592618996489355L;

	/** 
	 * 产品开通状态
	 */
	@ApiField("product_open_status")
	private String productOpenStatus;

	public void setProductOpenStatus(String productOpenStatus) {
		this.productOpenStatus = productOpenStatus;
	}
	public String getProductOpenStatus( ) {
		return this.productOpenStatus;
	}

}
