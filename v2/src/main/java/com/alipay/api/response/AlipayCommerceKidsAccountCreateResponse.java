package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.kids.account.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:10:33
 */
public class AlipayCommerceKidsAccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7822577855769742781L;

	/** 
	 * 儿童唯一id
	 */
	@ApiField("child_id")
	private String childId;

	public void setChildId(String childId) {
		this.childId = childId;
	}
	public String getChildId( ) {
		return this.childId;
	}

}
