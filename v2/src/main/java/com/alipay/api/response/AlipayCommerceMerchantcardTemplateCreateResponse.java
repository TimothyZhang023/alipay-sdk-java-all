package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-02 19:32:08
 */
public class AlipayCommerceMerchantcardTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6255869937735614673L;

	/** 
	 * 卡id
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}
	public String getCardTemplateId( ) {
		return this.cardTemplateId;
	}

}
