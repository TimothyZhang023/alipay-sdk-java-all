package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.isv.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 12:36:27
 */
public class AlipayIserviceCcmIsvInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 6369218571421314442L;

	/** 
	 * Base64编码CCM公钥：CCM公私钥对由CCM自动生成，用于Iframe spi接口安全认证
	 */
	@ApiField("ccm_pub_key")
	private String ccmPubKey;

	public void setCcmPubKey(String ccmPubKey) {
		this.ccmPubKey = ccmPubKey;
	}
	public String getCcmPubKey( ) {
		return this.ccmPubKey;
	}

}
