package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BizResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.finance.ar.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-09 21:46:39
 */
public class AnttechBlockchainDefinFinanceArSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 5873291121616764623L;

	/** 
	 * 业务结果
	 */
	@ApiField("biz_result")
	private BizResult bizResult;

	public void setBizResult(BizResult bizResult) {
		this.bizResult = bizResult;
	}
	public BizResult getBizResult( ) {
		return this.bizResult;
	}

}
