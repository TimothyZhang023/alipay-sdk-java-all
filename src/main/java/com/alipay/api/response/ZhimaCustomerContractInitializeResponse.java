package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.contract.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2020-11-18 17:17:28
 */
public class ZhimaCustomerContractInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 5793686385117869474L;

	/** 
	 * 电子合约号，后续的电子签名流程需要用到
	 */
	@ApiField("contract_no")
	private String contractNo;

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	public String getContractNo( ) {
		return this.contractNo;
	}

}
