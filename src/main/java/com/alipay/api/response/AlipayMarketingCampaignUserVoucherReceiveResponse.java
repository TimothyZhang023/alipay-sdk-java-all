package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.user.voucher.receive response.
 * 
 * @author auto create
 * @since 1.0, 2021-05-28 17:20:51
 */
public class AlipayMarketingCampaignUserVoucherReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 7131851354425444467L;

	/** 
	 * 券id：领取成功时返回
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}
	public String getVoucherId( ) {
		return this.voucherId;
	}

}
