package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.StockTaskResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ad.stocktaskresult.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCommerceTransportAdStocktaskresultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5155531331858119729L;

	/** 
	 * 库存查询结果
	 */
	@ApiField("stock_task_result")
	private StockTaskResult stockTaskResult;

	public void setStockTaskResult(StockTaskResult stockTaskResult) {
		this.stockTaskResult = stockTaskResult;
	}
	public StockTaskResult getStockTaskResult( ) {
		return this.stockTaskResult;
	}

}
