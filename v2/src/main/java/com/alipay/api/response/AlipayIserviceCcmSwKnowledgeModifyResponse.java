package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.sw.knowledge.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 10:13:30
 */
public class AlipayIserviceCcmSwKnowledgeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1137221252651323863L;

	/** 
	 * 知识点ID
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
