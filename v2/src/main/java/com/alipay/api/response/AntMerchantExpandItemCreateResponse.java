package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.item.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:39
 */
public class AntMerchantExpandItemCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4185282514332352636L;

	/** 
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

}
