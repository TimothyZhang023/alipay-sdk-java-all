package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.extitem.info.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 06:45:55
 */
public class KoubeiItemExtitemInfoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8226762531474872431L;

	/** 
	 * 创建成功，返回id
	 */
	@ApiField("id")
	private String id;

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

}
