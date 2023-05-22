package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RcSmartResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.rcservcenter.rcsmart.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 03:56:23
 */
public class AlipayFincoreComplianceRcservcenterRcsmartConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 2365886787566581597L;

	/** 
	 * 工单维度打标返回值
	 */
	@ApiField("rc_smart_response")
	private RcSmartResponse rcSmartResponse;

	public void setRcSmartResponse(RcSmartResponse rcSmartResponse) {
		this.rcSmartResponse = rcSmartResponse;
	}
	public RcSmartResponse getRcSmartResponse( ) {
		return this.rcSmartResponse;
	}

}
