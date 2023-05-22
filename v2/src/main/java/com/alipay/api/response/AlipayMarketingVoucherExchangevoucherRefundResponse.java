package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenVoucherDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.exchangevoucher.refund response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 08:41:50
 */
public class AlipayMarketingVoucherExchangevoucherRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 4693763796357646453L;

	/** 
	 * 被冲正的券
	 */
	@ApiField("voucher")
	private OpenVoucherDTO voucher;

	public void setVoucher(OpenVoucherDTO voucher) {
		this.voucher = voucher;
	}
	public OpenVoucherDTO getVoucher( ) {
		return this.voucher;
	}

}
