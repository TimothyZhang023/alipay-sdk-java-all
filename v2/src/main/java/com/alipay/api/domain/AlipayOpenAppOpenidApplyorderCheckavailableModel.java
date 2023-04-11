package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 检查转换工单审核状态
 *
 * @author auto create
 * @since 1.0, 2023-04-07 10:13:57
 */
public class AlipayOpenAppOpenidApplyorderCheckavailableModel extends AlipayObject {

	private static final long serialVersionUID = 3212714876611614125L;

	/**
	 * 指定查询的工单，不填则查询最近的10条工单
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
