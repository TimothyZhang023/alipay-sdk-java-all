package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CollectReceiptOpenApiPageDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.collectreceipt.receipt.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 20:16:57
 */
public class AlipayBossFncCollectreceiptReceiptQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2252195549858127257L;

	/** 
	 * 收款单openapi分页返回DTO
	 */
	@ApiField("result_set")
	private CollectReceiptOpenApiPageDTO resultSet;

	public void setResultSet(CollectReceiptOpenApiPageDTO resultSet) {
		this.resultSet = resultSet;
	}
	public CollectReceiptOpenApiPageDTO getResultSet( ) {
		return this.resultSet;
	}

}
