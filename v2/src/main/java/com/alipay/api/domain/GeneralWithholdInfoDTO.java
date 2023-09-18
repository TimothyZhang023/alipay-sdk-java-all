package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代扣签约信息模型
 *
 * @author auto create
 * @since 1.0, 2023-06-16 17:00:59
 */
public class GeneralWithholdInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6794192456589743874L;

	/**
	 * 代扣签约串
	 */
	@ApiField("agreement_pay_sign")
	private String agreementPaySign;

	public String getAgreementPaySign() {
		return this.agreementPaySign;
	}
	public void setAgreementPaySign(String agreementPaySign) {
		this.agreementPaySign = agreementPaySign;
	}

}
