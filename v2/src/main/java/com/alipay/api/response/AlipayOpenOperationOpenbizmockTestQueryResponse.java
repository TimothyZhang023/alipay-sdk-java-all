package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.test.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 22:21:56
 */
public class AlipayOpenOperationOpenbizmockTestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5288966248749792231L;

	/** 
	 * test
	 */
	@ApiField("out_open_id")
	private String outOpenId;

	/** 
	 * test
	 */
	@ApiField("out_test")
	private String outTest;

	public void setOutOpenId(String outOpenId) {
		this.outOpenId = outOpenId;
	}
	public String getOutOpenId( ) {
		return this.outOpenId;
	}

	public void setOutTest(String outTest) {
		this.outTest = outTest;
	}
	public String getOutTest( ) {
		return this.outTest;
	}

}
