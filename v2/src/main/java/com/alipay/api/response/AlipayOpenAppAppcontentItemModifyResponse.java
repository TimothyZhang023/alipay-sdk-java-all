package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.appcontent.item.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 23:39:14
 */
public class AlipayOpenAppAppcontentItemModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5561897795575646584L;

	/** 
	 * 商品ID
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
