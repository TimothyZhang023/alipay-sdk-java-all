package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.xwbtstabc.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 06:36:14
 */
public class AlipayOpenAppXwbtstabcQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3865559765527949813L;

	/** 
	 * 1
	 */
	@ApiField("xwbbbdd")
	private String xwbbbdd;

	public void setXwbbbdd(String xwbbbdd) {
		this.xwbbbdd = xwbbbdd;
	}
	public String getXwbbbdd( ) {
		return this.xwbbbdd;
	}

}
