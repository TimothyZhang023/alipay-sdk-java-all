package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.bizadviser.myddsreport.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 00:01:01
 */
public class KoubeiMarketingDataBizadviserMyddsreportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7373259738129318496L;

	/** 
	 * result是一个所有结果集合的json串。
result结果集是一个json格式数组， 是门店热力图信息
lng: 位置经度 lat:位置维度 cnt：会员数量
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
