package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.fulfillment.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 10:17:00
 */
public class ZhimaCustomerFulfillmentSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6374821726763232861L;

	/** 
	 * 合约号
	 */
	@ApiListField("contract_nos")
	@ApiField("string")
	private List<String> contractNos;

	public void setContractNos(List<String> contractNos) {
		this.contractNos = contractNos;
	}
	public List<String> getContractNos( ) {
		return this.contractNos;
	}

}
