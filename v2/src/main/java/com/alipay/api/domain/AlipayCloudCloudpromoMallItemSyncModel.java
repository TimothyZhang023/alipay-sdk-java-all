package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步渠道商商品
 *
 * @author auto create
 * @since 1.0, 2024-06-05 15:17:40
 */
public class AlipayCloudCloudpromoMallItemSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7663816217593467198L;

	/**
	 * 分销店铺id
	 */
	@ApiField("purchaser_id")
	private String purchaserId;

	public String getPurchaserId() {
		return this.purchaserId;
	}
	public void setPurchaserId(String purchaserId) {
		this.purchaserId = purchaserId;
	}

}
