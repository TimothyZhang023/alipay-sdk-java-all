package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InterTradeConsultOpenApiResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.contract.management.identify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 21:27:45
 */
public class AlipayBossContractManagementIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1395341992222225152L;

	/** 
	 * 识别结果
	 */
	@ApiField("result_set")
	private InterTradeConsultOpenApiResult resultSet;

	public void setResultSet(InterTradeConsultOpenApiResult resultSet) {
		this.resultSet = resultSet;
	}
	public InterTradeConsultOpenApiResult getResultSet( ) {
		return this.resultSet;
	}

}
