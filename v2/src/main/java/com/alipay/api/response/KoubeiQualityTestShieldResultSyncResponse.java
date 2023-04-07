package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.quality.test.shield.result.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-31 18:42:37
 */
public class KoubeiQualityTestShieldResultSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5369757693573962461L;

	/** 
	 * 扩展信息
	 */
	@ApiField("ext_infos")
	private String extInfos;

	public void setExtInfos(String extInfos) {
		this.extInfos = extInfos;
	}
	public String getExtInfos( ) {
		return this.extInfos;
	}

}
