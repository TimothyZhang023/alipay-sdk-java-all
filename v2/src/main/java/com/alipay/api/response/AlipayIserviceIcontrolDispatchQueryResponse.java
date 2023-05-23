package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.icontrol.dispatch.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 14:09:24
 */
public class AlipayIserviceIcontrolDispatchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5471491975331169771L;

	/** 
	 * 热线技能组ID
	 */
	@ApiField("skill_group_id")
	private String skillGroupId;

	public void setSkillGroupId(String skillGroupId) {
		this.skillGroupId = skillGroupId;
	}
	public String getSkillGroupId( ) {
		return this.skillGroupId;
	}

}
