package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.credit.withdraw.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-24 21:02:04
 */
public class AlipayCommerceEcCreditWithdrawSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8251681125157122259L;

	/** 
	 * 同步返回结果
成功: SUCCESS
失败: FAIL
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
