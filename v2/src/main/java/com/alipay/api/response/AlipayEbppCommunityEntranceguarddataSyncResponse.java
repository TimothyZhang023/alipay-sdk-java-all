package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.entranceguarddata.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 09:16:55
 */
public class AlipayEbppCommunityEntranceguarddataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1545947532499835559L;

	/** 
	 * 外部用户id
	 */
	@ApiField("out_user_id")
	private String outUserId;

	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}
	public String getOutUserId( ) {
		return this.outUserId;
	}

}
