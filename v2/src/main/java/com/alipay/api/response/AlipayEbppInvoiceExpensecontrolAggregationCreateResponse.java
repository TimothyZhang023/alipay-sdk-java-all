package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expensecontrol.aggregation.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 23:59:53
 */
public class AlipayEbppInvoiceExpensecontrolAggregationCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2591619448474831419L;

	/** 
	 * 费控聚合关系ID
	 */
	@ApiField("aggregation_id")
	private String aggregationId;

	public void setAggregationId(String aggregationId) {
		this.aggregationId = aggregationId;
	}
	public String getAggregationId( ) {
		return this.aggregationId;
	}

}
