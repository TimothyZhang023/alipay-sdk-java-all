package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.dataservice.verify.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 05:01:27
 */
public class AnttechBlockchainDefinDataserviceVerifySubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 5556454374345159888L;

	/** 
	 * 业务结果
	 */
	@ApiField("biz_result")
	private String bizResult;

	public void setBizResult(String bizResult) {
		this.bizResult = bizResult;
	}
	public String getBizResult( ) {
		return this.bizResult;
	}

}
