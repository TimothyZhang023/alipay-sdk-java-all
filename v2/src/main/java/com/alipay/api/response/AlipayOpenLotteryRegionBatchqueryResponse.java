package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.lottery.region.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 15:46:08
 */
public class AlipayOpenLotteryRegionBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3497817477581159222L;

	/** 
	 * 商家入驻专区列表
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
