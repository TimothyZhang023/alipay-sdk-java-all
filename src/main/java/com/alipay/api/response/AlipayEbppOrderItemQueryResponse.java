package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EbppOrderItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.order.item.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-07 20:41:15
 */
public class AlipayEbppOrderItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5221895562259698912L;

	/** 
	 * 订单项
	 */
	@ApiField("item")
	private EbppOrderItem item;

	public void setItem(EbppOrderItem item) {
		this.item = item;
	}
	public EbppOrderItem getItem( ) {
		return this.item;
	}

}
