package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.virtualcategory.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 04:19:49
 */
public class KoubeiCateringDishVirtualcategoryDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 1564214244933656438L;

	/** 
	 * 是否重试，true：需要重试；false：不需要重试
	 */
	@ApiField("retry")
	private Boolean retry;

	public void setRetry(Boolean retry) {
		this.retry = retry;
	}
	public Boolean getRetry( ) {
		return this.retry;
	}

}
