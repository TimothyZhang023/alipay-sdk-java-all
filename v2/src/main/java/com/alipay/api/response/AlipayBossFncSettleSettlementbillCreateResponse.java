package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SettlementbillOpenApiDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.settle.settlementbill.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 15:34:49
 */
public class AlipayBossFncSettleSettlementbillCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6739195788362425471L;

	/** 
	 * 返回参数
	 */
	@ApiField("result_set")
	private SettlementbillOpenApiDTO resultSet;

	public void setResultSet(SettlementbillOpenApiDTO resultSet) {
		this.resultSet = resultSet;
	}
	public SettlementbillOpenApiDTO getResultSet( ) {
		return this.resultSet;
	}

}
