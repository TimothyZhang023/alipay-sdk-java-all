package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.sellerconfig.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-28 16:31:43
 */
public class AlipayCommerceTransportEtcSellerconfigQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2434481184169499933L;

	/** 
	 * 查询得到的发行方静态信息（图片、文字等配置信息）
	 */
	@ApiField("query_results")
	private String queryResults;

	public void setQueryResults(String queryResults) {
		this.queryResults = queryResults;
	}
	public String getQueryResults( ) {
		return this.queryResults;
	}

}
