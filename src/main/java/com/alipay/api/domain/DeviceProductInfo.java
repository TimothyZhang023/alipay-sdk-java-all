package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备产品信息
 *
 * @author auto create
 * @since 1.0, 2020-07-14 10:50:32
 */
public class DeviceProductInfo extends AlipayObject {

	private static final long serialVersionUID = 2194416655524387591L;

	/**
	 * 产品id
	 */
	@ApiField("product_id")
	private Long productId;

	/**
	 * 产品名称
	 */
	@ApiField("product_name")
	private String productName;

	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

}