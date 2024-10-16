package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.template.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-24 14:32:10
 */
public class AlipayCommerceMerchantcardTemplateModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6855886825694362825L;

	/** 
	 * 卡ID
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
