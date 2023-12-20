package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.riskscan.single.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 16:58:25
 */
public class AlipaySecurityRiskRiskscanSingleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6619785543162822312L;

	/** 
	 * 业务返回数据，这是一个JsonString，Json中的key根据业务不同而不同，接入时商定。
	 */
	@ApiField("scan_result_data")
	private String scanResultData;

	public void setScanResultData(String scanResultData) {
		this.scanResultData = scanResultData;
	}
	public String getScanResultData( ) {
		return this.scanResultData;
	}

}
