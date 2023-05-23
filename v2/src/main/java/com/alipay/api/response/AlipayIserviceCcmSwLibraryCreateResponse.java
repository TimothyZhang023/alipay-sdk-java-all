package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.sw.library.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 23:36:59
 */
public class AlipayIserviceCcmSwLibraryCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7177899912952238912L;

	/** 
	 * 知识库Id
	 */
	@ApiField("id")
	private Long id;

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId( ) {
		return this.id;
	}

}
