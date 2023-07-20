package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dataapi.migration.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 22:34:36
 */
public class ZhimaCreditEpDataapiMigrationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2499988829567623662L;

	/** 
	 * 企业工商资料查询，数据都是公开数据，没有个人敏感信息，格式参考
https://xin-docs.antfin-inc.com/dataapi/index.html#document-company
	 */
	@ApiField("content")
	private String content;

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent( ) {
		return this.content;
	}

}
