package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isportal.permissioncheck.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 03:41:52
 */
public class AlipayIserviceIsportalPermissioncheckQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2723379274548951784L;

	/** 
	 * 鉴权结果
	 */
	@ApiField("biz_data")
	private String bizData;

	public void setBizData(String bizData) {
		this.bizData = bizData;
	}
	public String getBizData( ) {
		return this.bizData;
	}

}
