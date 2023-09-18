package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.extension.bsn.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-14 17:41:44
 */
public class AlipayCloudCloudbaseExtensionBsnApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7193999292521192171L;

	/** 
	 * 是否已成功开始安装
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
