package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.sw.article.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 05:51:58
 */
public class AlipayIserviceCcmSwArticleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6624336174696777994L;

	/** 
	 * 文章ID
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
