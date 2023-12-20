package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.haiguan.nolabel.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 18:03:57
 */
public class AlipaySecurityProdHaiguanNolabelCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5891521711134598611L;

	/** 
	 * 23
	 */
	@ApiField("out_one")
	private String outOne;

	/** 
	 * 23
	 */
	@ApiField("out_three")
	private String outThree;

	/** 
	 * 23
	 */
	@ApiField("out_two")
	private String outTwo;

	public void setOutOne(String outOne) {
		this.outOne = outOne;
	}
	public String getOutOne( ) {
		return this.outOne;
	}

	public void setOutThree(String outThree) {
		this.outThree = outThree;
	}
	public String getOutThree( ) {
		return this.outThree;
	}

	public void setOutTwo(String outTwo) {
		this.outTwo = outTwo;
	}
	public String getOutTwo( ) {
		return this.outTwo;
	}

}
