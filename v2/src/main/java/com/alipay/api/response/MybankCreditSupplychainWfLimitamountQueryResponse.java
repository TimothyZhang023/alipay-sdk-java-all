package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AmountWf;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.wf.limitamount.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 06:39:13
 */
public class MybankCreditSupplychainWfLimitamountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3452245215122576797L;

	/** 
	 * 是否准入
	 */
	@ApiField("admit")
	private Boolean admit;

	/** 
	 * 盖帽额度
	 */
	@ApiField("limitamt")
	private AmountWf limitamt;

	public void setAdmit(Boolean admit) {
		this.admit = admit;
	}
	public Boolean getAdmit( ) {
		return this.admit;
	}

	public void setLimitamt(AmountWf limitamt) {
		this.limitamt = limitamt;
	}
	public AmountWf getLimitamt( ) {
		return this.limitamt;
	}

}
