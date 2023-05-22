package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InvoiceResponsePageDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfsettleprod.invoice.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 06:31:56
 */
public class AlipayBossFncGfsettleprodInvoiceBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2249145239567436518L;

	/** 
	 * 发票数据
	 */
	@ApiField("result_set")
	private InvoiceResponsePageDTO resultSet;

	public void setResultSet(InvoiceResponsePageDTO resultSet) {
		this.resultSet = resultSet;
	}
	public InvoiceResponsePageDTO getResultSet( ) {
		return this.resultSet;
	}

}
