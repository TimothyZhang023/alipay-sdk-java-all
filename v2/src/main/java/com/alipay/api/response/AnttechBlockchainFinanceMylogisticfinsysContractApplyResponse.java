package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.mylogisticfinsys.contract.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 00:07:34
 */
public class AnttechBlockchainFinanceMylogisticfinsysContractApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1476787527449965315L;

	/** 
	 * 错误码
	 */
	@ApiField("code")
	private String code;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

}
