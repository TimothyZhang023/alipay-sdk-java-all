package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.point.budget.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-27 14:02:26
 */
public class AlipayPointBudgetGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1777944829878638793L;

	/** 
	 * 还可以发放的集分宝个数
	 */
	@ApiField("budget_amount")
	private Long budgetAmount;

	public void setBudgetAmount(Long budgetAmount) {
		this.budgetAmount = budgetAmount;
	}
	public Long getBudgetAmount( ) {
		return this.budgetAmount;
	}

}
