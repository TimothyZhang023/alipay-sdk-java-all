package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店id查桌码信息列表
 *
 * @author auto create
 * @since 1.0, 2022-10-11 12:09:53
 */
public class KoubeiCateringTablelistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8357355323218115683L;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
