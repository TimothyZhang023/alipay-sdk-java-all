package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义优惠规则
 *
 * @author auto create
 * @since 1.0, 2023-06-01 17:31:33
 */
public class CustomerDefineDeductRule extends AlipayObject {

	private static final long serialVersionUID = 3636341117892968989L;

	/**
	 * 自定义优惠规则描述
	 */
	@ApiField("customer_define_deduct_rule_desc")
	private String customerDefineDeductRuleDesc;

	public String getCustomerDefineDeductRuleDesc() {
		return this.customerDefineDeductRuleDesc;
	}
	public void setCustomerDefineDeductRuleDesc(String customerDefineDeductRuleDesc) {
		this.customerDefineDeductRuleDesc = customerDefineDeductRuleDesc;
	}

}
