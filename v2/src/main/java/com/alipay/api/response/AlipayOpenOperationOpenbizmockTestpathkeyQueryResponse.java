package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.testpathkey.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 16:33:25
 */
public class AlipayOpenOperationOpenbizmockTestpathkeyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4661497813931435545L;

	/** 
	 * 测试
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
