package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvoiceBillResponsePageDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfsettleprod.invoicebill.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 22:40:45
 */
public class AlipayBossFncGfsettleprodInvoicebillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3616265912879453777L;

	/** 
	 * 发票关联的账单
	 */
	@ApiListField("result_set")
	@ApiField("invoice_bill_response_page_d_t_o")
	private List<InvoiceBillResponsePageDTO> resultSet;

	public void setResultSet(List<InvoiceBillResponsePageDTO> resultSet) {
		this.resultSet = resultSet;
	}
	public List<InvoiceBillResponsePageDTO> getResultSet( ) {
		return this.resultSet;
	}

}
