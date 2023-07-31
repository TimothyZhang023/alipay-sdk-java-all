package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ApiContractDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.contract.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 22:09:40
 */
public class ZhimaCustomerContractDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2192286846983911835L;

	/** 
	 * 合约详情
	 */
	@ApiField("contract_detail")
	private ApiContractDetail contractDetail;

	public void setContractDetail(ApiContractDetail contractDetail) {
		this.contractDetail = contractDetail;
	}
	public ApiContractDetail getContractDetail( ) {
		return this.contractDetail;
	}

}
