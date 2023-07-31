package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.fuelling.shop.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 22:52:58
 */
public class AlipayEcoMycarFuellingShopCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7783924354957179414L;

	/** 
	 * 车主平台内部门店编号,系统唯一，ISV应保存好该标识
	 */
	@ApiField("shop_id")
	private String shopId;

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

}
