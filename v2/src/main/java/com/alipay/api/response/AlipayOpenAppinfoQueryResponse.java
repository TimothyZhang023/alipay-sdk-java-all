package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.appinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 23:46:55
 */
public class AlipayOpenAppinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7582215545438933823L;

	/** 
	 * 应用openid配置
	 */
	@ApiField("open_id_config")
	private String openIdConfig;

	public void setOpenIdConfig(String openIdConfig) {
		this.openIdConfig = openIdConfig;
	}
	public String getOpenIdConfig( ) {
		return this.openIdConfig;
	}

}
