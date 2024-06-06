package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.recycle.billing.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-05 10:52:03
 */
public class AlipayCommerceOperationRecycleBillingSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4323212717933927159L;

	/** 
	 * 是否传递成功
	 */
	@ApiField("data")
	private Boolean data;

	public void setData(Boolean data) {
		this.data = data;
	}
	public Boolean getData( ) {
		return this.data;
	}

}
