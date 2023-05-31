package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.dtbank.dailybill.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 23:06:48
 */
public class AlipayUserDtbankDailybillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5794137418854489145L;

	/** 
	 * bill_download_url
	 */
	@ApiField("bill_download_url")
	private String billDownloadUrl;

	public void setBillDownloadUrl(String billDownloadUrl) {
		this.billDownloadUrl = billDownloadUrl;
	}
	public String getBillDownloadUrl( ) {
		return this.billDownloadUrl;
	}

}
