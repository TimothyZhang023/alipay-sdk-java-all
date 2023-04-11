package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 规则使用条件
 *
 * @author auto create
 * @since 1.0, 2022-12-27 19:04:37
 */
public class RuleSyncStandardConditionInfo extends AlipayObject {

	private static final long serialVersionUID = 2164915521914924453L;

	/**
	 * 规则因子
	 */
	@ApiField("rule_factor")
	private String ruleFactor;

	/**
	 * 使用规则ID
	 */
	@ApiField("rule_id")
	private String ruleId;

	/**
	 * 规则因子值
	 */
	@ApiField("rule_value")
	private String ruleValue;

	public String getRuleFactor() {
		return this.ruleFactor;
	}
	public void setRuleFactor(String ruleFactor) {
		this.ruleFactor = ruleFactor;
	}

	public String getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public String getRuleValue() {
		return this.ruleValue;
	}
	public void setRuleValue(String ruleValue) {
		this.ruleValue = ruleValue;
	}

}
