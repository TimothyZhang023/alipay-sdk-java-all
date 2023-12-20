package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.data.alibaba.securitydata.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 02:26:47
 */
public class AlipaySecurityDataAlibabaSecuritydataSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4728671766666431498L;

	/** 
	 * 返回数据写入后详细信息，一般为数据唯一key
	 */
	@ApiField("data_id")
	private String dataId;

	public void setDataId(String dataId) {
		this.dataId = dataId;
	}
	public String getDataId( ) {
		return this.dataId;
	}

}
