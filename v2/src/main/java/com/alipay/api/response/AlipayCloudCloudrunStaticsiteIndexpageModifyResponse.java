package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.staticsite.indexpage.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-21 14:36:44
 */
public class AlipayCloudCloudrunStaticsiteIndexpageModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5466266578152752559L;

	/** 
	 * 索引文件名
	 */
	@ApiField("index_file")
	private String indexFile;

	public void setIndexFile(String indexFile) {
		this.indexFile = indexFile;
	}
	public String getIndexFile( ) {
		return this.indexFile;
	}

}
