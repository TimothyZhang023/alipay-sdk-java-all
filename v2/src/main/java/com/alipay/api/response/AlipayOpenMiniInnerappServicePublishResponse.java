package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerapp.service.publish response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 01:17:45
 */
public class AlipayOpenMiniInnerappServicePublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 5654283287397386644L;

	/** 
	 * 服务ID
	 */
	@ApiField("merchandise_id")
	private String merchandiseId;

	public void setMerchandiseId(String merchandiseId) {
		this.merchandiseId = merchandiseId;
	}
	public String getMerchandiseId( ) {
		return this.merchandiseId;
	}

}
