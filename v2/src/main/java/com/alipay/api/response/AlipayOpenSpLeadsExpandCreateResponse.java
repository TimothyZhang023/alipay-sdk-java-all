package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.leads.expand.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 04:06:37
 */
public class AlipayOpenSpLeadsExpandCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5294589711135366929L;

	/** 
	 * 商机id
	 */
	@ApiField("leads_id")
	private String leadsId;

	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}
	public String getLeadsId( ) {
		return this.leadsId;
	}

}
