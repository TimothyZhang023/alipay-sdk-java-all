package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.fwh.sign.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-09 11:31:58
 */
public class AnttechBlockchainDefinFwhSignApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6481666375262381372L;

	/** 
	 * 受理号
	 */
	@ApiField("accepted_no")
	private String acceptedNo;

	/** 
	 * 授权商家会员id
	 */
	@ApiField("merchant_member_id")
	private String merchantMemberId;

	/** 
	 * 用户签约号，协议中标识用户的唯一签约号
	 */
	@ApiField("sign_id")
	private String signId;

	/** 
	 * 签约链接，可通过二维码生成工具将该字符串转成二维码，用户进行扫码签约
	 */
	@ApiField("sign_link")
	private String signLink;

	public void setAcceptedNo(String acceptedNo) {
		this.acceptedNo = acceptedNo;
	}
	public String getAcceptedNo( ) {
		return this.acceptedNo;
	}

	public void setMerchantMemberId(String merchantMemberId) {
		this.merchantMemberId = merchantMemberId;
	}
	public String getMerchantMemberId( ) {
		return this.merchantMemberId;
	}

	public void setSignId(String signId) {
		this.signId = signId;
	}
	public String getSignId( ) {
		return this.signId;
	}

	public void setSignLink(String signLink) {
		this.signLink = signLink;
	}
	public String getSignLink( ) {
		return this.signLink;
	}

}
