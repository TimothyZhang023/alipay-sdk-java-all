package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EnterpriseAgreementDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.enterprise.agreement.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 20:31:42
 */
public class AlipayCommerceEcEnterpriseAgreementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3833658323216366986L;

	/** 
	 * 企业签约信息
	 */
	@ApiField("enterprise_agreement_dto")
	private EnterpriseAgreementDTO enterpriseAgreementDto;

	public void setEnterpriseAgreementDto(EnterpriseAgreementDTO enterpriseAgreementDto) {
		this.enterpriseAgreementDto = enterpriseAgreementDto;
	}
	public EnterpriseAgreementDTO getEnterpriseAgreementDto( ) {
		return this.enterpriseAgreementDto;
	}

}
