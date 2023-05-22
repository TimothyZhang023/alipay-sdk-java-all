package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SymbolDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.quotation.quotetrade.symbol.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 18:31:11
 */
public class AlipayFinanceQuotationQuotetradeSymbolBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3394868128119857282L;

	/** 
	 * 码表
	 */
	@ApiListField("data")
	@ApiField("symbol_d_t_o")
	private List<SymbolDTO> data;

	public void setData(List<SymbolDTO> data) {
		this.data = data;
	}
	public List<SymbolDTO> getData( ) {
		return this.data;
	}

}
