package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡模版修改
 *
 * @author auto create
 * @since 1.0, 2024-11-13 14:20:21
 */
public class AlipayCommerceMerchantcardTemplateModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8859378476652847113L;

	/**
	 * 卡信息
	 */
	@ApiField("card_template")
	private MerchantCardTemplate cardTemplate;

	public MerchantCardTemplate getCardTemplate() {
		return this.cardTemplate;
	}
	public void setCardTemplate(MerchantCardTemplate cardTemplate) {
		this.cardTemplate = cardTemplate;
	}

}
