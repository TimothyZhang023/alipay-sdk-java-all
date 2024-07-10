package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.deliver.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:27
 */
public class AlipayPcreditHuabeiDeliverQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4218489341139832844L;

	/** 
	 * 配置ID
	 */
	@ApiField("config_id")
	private String configId;

	public void setConfigId(String configId) {
		this.configId = configId;
	}
	public String getConfigId( ) {
		return this.configId;
	}

}
