package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.objectstorage.securedomain.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-02 18:57:03
 */
public class AlipayCloudCloudrunObjectstorageSecuredomainDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 5751772544647963413L;

	/** 
	 * 安全域名
	 */
	@ApiField("secure_domain")
	private String secureDomain;

	public void setSecureDomain(String secureDomain) {
		this.secureDomain = secureDomain;
	}
	public String getSecureDomain( ) {
		return this.secureDomain;
	}

}
