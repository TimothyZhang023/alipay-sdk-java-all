package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.patch.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 02:41:46
 */
public class AlipayOpenOperationOpenbizmockPatchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2854718988489185166L;

	/** 
	 * test
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
