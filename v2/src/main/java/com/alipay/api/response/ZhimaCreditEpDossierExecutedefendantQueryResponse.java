package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpExecuteDefendantDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.executedefendant.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-19 14:32:22
 */
public class ZhimaCreditEpDossierExecutedefendantQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4189742589297121322L;

	/** 
	 * 企业被执行人内容
	 */
	@ApiField("data")
	private EpExecuteDefendantDataInfo data;

	public void setData(EpExecuteDefendantDataInfo data) {
		this.data = data;
	}
	public EpExecuteDefendantDataInfo getData( ) {
		return this.data;
	}

}
