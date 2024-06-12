package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MemberCardCertificateDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.commercial.certificate.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-26 21:27:01
 */
public class AlipayCommerceMedicalCommercialCertificateSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8181742653429918617L;

	/** 
	 * 凭证详情
	 */
	@ApiField("certificate_detail")
	private MemberCardCertificateDetail certificateDetail;

	/** 
	 * 兑换凭证是否同步成功
	 */
	@ApiField("sync_result")
	private Boolean syncResult;

	public void setCertificateDetail(MemberCardCertificateDetail certificateDetail) {
		this.certificateDetail = certificateDetail;
	}
	public MemberCardCertificateDetail getCertificateDetail( ) {
		return this.certificateDetail;
	}

	public void setSyncResult(Boolean syncResult) {
		this.syncResult = syncResult;
	}
	public Boolean getSyncResult( ) {
		return this.syncResult;
	}

}
