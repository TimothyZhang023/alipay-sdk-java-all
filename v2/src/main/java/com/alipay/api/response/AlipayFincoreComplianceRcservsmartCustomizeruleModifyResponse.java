package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RcSmartCustomizeRuleResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.rcservsmart.customizerule.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 22:16:50
 */
public class AlipayFincoreComplianceRcservsmartCustomizeruleModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6455957755192285852L;

	/** 
	 * 自定义规则返回体
	 */
	@ApiField("rcsmart_common_response")
	private RcSmartCustomizeRuleResponse rcsmartCommonResponse;

	public void setRcsmartCommonResponse(RcSmartCustomizeRuleResponse rcsmartCommonResponse) {
		this.rcsmartCommonResponse = rcsmartCommonResponse;
	}
	public RcSmartCustomizeRuleResponse getRcsmartCommonResponse( ) {
		return this.rcsmartCommonResponse;
	}

}
