package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.ownercardmsg.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 08:58:16
 */
public class AlipayEbppCommunityOwnercardmsgSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5679512492925842786L;

	/** 
	 * 支付宝消息id
	 */
	@ApiField("alipay_msg_id")
	private String alipayMsgId;

	public void setAlipayMsgId(String alipayMsgId) {
		this.alipayMsgId = alipayMsgId;
	}
	public String getAlipayMsgId( ) {
		return this.alipayMsgId;
	}

}
