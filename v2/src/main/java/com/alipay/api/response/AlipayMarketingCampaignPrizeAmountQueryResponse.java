package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.prize.amount.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 05:18:45
 */
public class AlipayMarketingCampaignPrizeAmountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7166174185879941974L;

	/** 
	 * 奖品剩余数量，数值
	 */
	@ApiField("remain_amount")
	private String remainAmount;

	public void setRemainAmount(String remainAmount) {
		this.remainAmount = remainAmount;
	}
	public String getRemainAmount( ) {
		return this.remainAmount;
	}

}
