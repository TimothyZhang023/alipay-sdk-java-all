package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.testparameter.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-07 15:41:48
 */
public class AlipayOpenOperationOpenbizmockTestparameterQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2785468236835823482L;

	/** 
	 * 1
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
