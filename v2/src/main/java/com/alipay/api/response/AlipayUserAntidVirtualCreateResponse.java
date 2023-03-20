package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.antid.virtual.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 22:52:54
 */
public class AlipayUserAntidVirtualCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2363252317275661224L;

	/** 
	 * 蚂蚁通行证ID
	 */
	@ApiField("ant_id")
	private String antId;

	/** 
	 * 蚂蚁虚拟账户ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setAntId(String antId) {
		this.antId = antId;
	}
	public String getAntId( ) {
		return this.antId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
