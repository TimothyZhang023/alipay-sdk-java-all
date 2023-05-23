package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MultiCurrencyMoneyOpenApi;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.aggregation.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 01:20:36
 */
public class AlipayBossFncAggregationDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2896298355224428526L;

	/** 
	 * 已入账金额（含税）
	 */
	@ApiField("result_data")
	private MultiCurrencyMoneyOpenApi resultData;

	public void setResultData(MultiCurrencyMoneyOpenApi resultData) {
		this.resultData = resultData;
	}
	public MultiCurrencyMoneyOpenApi getResultData( ) {
		return this.resultData;
	}

}
