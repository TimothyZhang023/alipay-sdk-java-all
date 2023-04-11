package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.antest.caselist.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 14:19:42
 */
public class AlipayCommerceAntestCaselistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2215493884685383975L;

	/** 
	 * 用例列表JSONString
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
