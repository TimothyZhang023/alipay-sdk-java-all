package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询签约授权一体化订单状态
 *
 * @author auto create
 * @since 1.0, 2024-08-29 11:38:05
 */
public class AlipayOpenSpIsvSignauthQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2898983162525681266L;

	/**
	 * 签约授权一体化订单ID
可通过alipay.open.sp.isv.signauth.create 接口获取
	 */
	@ApiField("order_id")
	private String orderId;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
