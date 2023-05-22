package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.plan.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 02:28:19
 */
public class AlipayDataDataserviceAdPlanCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3485265582118369279L;

	/** 
	 * 计划id
	 */
	@ApiField("plan_id")
	private Long planId;

	/** 
	 * 外部计划编号。同入参的同名字段。
	 */
	@ApiField("plan_outer_id")
	private String planOuterId;

	public void setPlanId(Long planId) {
		this.planId = planId;
	}
	public Long getPlanId( ) {
		return this.planId;
	}

	public void setPlanOuterId(String planOuterId) {
		this.planOuterId = planOuterId;
	}
	public String getPlanOuterId( ) {
		return this.planOuterId;
	}

}
