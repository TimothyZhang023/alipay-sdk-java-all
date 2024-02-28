package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PayForPrivilegeUserRelation;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.payforprivilege.userrelation.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:11:48
 */
public class AlipayMerchantPayforprivilegeUserrelationCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3448428183145866631L;

	/** 
	 * 充值业务用户与商户关系
	 */
	@ApiField("member_info")
	private PayForPrivilegeUserRelation memberInfo;

	public void setMemberInfo(PayForPrivilegeUserRelation memberInfo) {
		this.memberInfo = memberInfo;
	}
	public PayForPrivilegeUserRelation getMemberInfo( ) {
		return this.memberInfo;
	}

}
