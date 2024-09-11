package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营 SaaS 投放计划暂停
 *
 * @author auto create
 * @since 1.0, 2023-05-04 11:29:21
 */
public class DatadigitalFincloudFinsaasPutplanPauseModel extends AlipayObject {

	private static final long serialVersionUID = 5174479141364812731L;

	/**
	 * 操作人 id
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 投放计划 id
	 */
	@ApiField("put_plan_id")
	private Long putPlanId;

	/**
	 * 租户 code
	 */
	@ApiField("tenant_code")
	private String tenantCode;

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public Long getPutPlanId() {
		return this.putPlanId;
	}
	public void setPutPlanId(Long putPlanId) {
		this.putPlanId = putPlanId;
	}

	public String getTenantCode() {
		return this.tenantCode;
	}
	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
	}

}
