package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘客税筹授权查询
 *
 * @author auto create
 * @since 1.0, 2023-09-15 10:45:16
 */
public class AlipayCommerceCommonUsertaxbillsignQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4113836449797163886L;

	/**
	 * 淘客的userId
	 */
	@ApiField("sign_user_id")
	private String signUserId;

	/**
	 * 淘客的openId
	 */
	@ApiField("sign_user_open_id")
	private String signUserOpenId;

	public String getSignUserId() {
		return this.signUserId;
	}
	public void setSignUserId(String signUserId) {
		this.signUserId = signUserId;
	}

	public String getSignUserOpenId() {
		return this.signUserOpenId;
	}
	public void setSignUserOpenId(String signUserOpenId) {
		this.signUserOpenId = signUserOpenId;
	}

}
