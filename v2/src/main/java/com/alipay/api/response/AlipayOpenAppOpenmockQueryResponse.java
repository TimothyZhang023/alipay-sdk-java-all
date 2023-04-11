package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.openmock.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-07 11:11:46
 */
public class AlipayOpenAppOpenmockQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1373921484442915999L;

	/** 
	 * xxxx
	 */
	@ApiField("xxxsa")
	private String xxxsa;

	public void setXxxsa(String xxxsa) {
		this.xxxsa = xxxsa;
	}
	public String getXxxsa( ) {
		return this.xxxsa;
	}

}
