package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.tax.advanced.unfreeze response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 22:55:12
 */
public class AlipayOverseasTaxAdvancedUnfreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 5371449717938592697L;

	/** 
	 * 支付宝退税资金订单号
	 */
	@ApiField("tax_refund_no")
	private String taxRefundNo;

	public void setTaxRefundNo(String taxRefundNo) {
		this.taxRefundNo = taxRefundNo;
	}
	public String getTaxRefundNo( ) {
		return this.taxRefundNo;
	}

}
