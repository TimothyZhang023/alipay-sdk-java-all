package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.customer.member.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 12:06:53
 */
public class AnttechBlockchainDefinCustomerMemberCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2487288476917839173L;

	/** 
	 * 中台会员唯一ID
	 */
	@ApiField("member_id")
	private String memberId;

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberId( ) {
		return this.memberId;
	}

}
