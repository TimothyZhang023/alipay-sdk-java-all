package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.cashpool.allocaterule.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 07:44:56
 */
public class AlipayAccountCashpoolAllocateruleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5686452542339938385L;

	/** 
	 * 新增规则ID
	 */
	@ApiField("rule_id")
	private Long ruleId;

	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
	}
	public Long getRuleId( ) {
		return this.ruleId;
	}

}
