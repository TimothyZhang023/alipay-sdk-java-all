package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.order.istdcancel.preconsult response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-31 17:41:49
 */
public class AlipayCommerceLogisticsOrderIstdcancelPreconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2465817186953157215L;

	/** 
	 * 是否允许取消
	 */
	@ApiField("allow_cancel")
	private Boolean allowCancel;

	/** 
	 * 取消金额
	 */
	@ApiField("cancel_fee")
	private String cancelFee;

	public void setAllowCancel(Boolean allowCancel) {
		this.allowCancel = allowCancel;
	}
	public Boolean getAllowCancel( ) {
		return this.allowCancel;
	}

	public void setCancelFee(String cancelFee) {
		this.cancelFee = cancelFee;
	}
	public String getCancelFee( ) {
		return this.cancelFee;
	}

}
