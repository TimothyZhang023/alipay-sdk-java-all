package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.risk.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 03:27:08
 */
public class AnttechBlockchainFinanceRiskApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8137649325436745823L;

	/** 
	 * 外部风控编号
	 */
	@ApiField("out_risk_id")
	private String outRiskId;

	/** 
	 * 风控申请结果返回
	 */
	@ApiField("risk_info")
	private String riskInfo;

	public void setOutRiskId(String outRiskId) {
		this.outRiskId = outRiskId;
	}
	public String getOutRiskId( ) {
		return this.outRiskId;
	}

	public void setRiskInfo(String riskInfo) {
		this.riskInfo = riskInfo;
	}
	public String getRiskInfo( ) {
		return this.riskInfo;
	}

}
