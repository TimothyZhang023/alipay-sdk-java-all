package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotvsp.userstate.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 11:17:02
 */
public class AlipayOpenIotvspUserstateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1672448797886179892L;

	/** 
	 * 返回用户在团餐、门禁等人脸库场景的状态，1在库2不在库3在开放库4在封闭库
	 */
	@ApiField("group_state")
	private String groupState;

	/** 
	 * 返回用户是否在库（1：在库，2：不在库）
	 */
	@ApiField("state")
	private String state;

	public void setGroupState(String groupState) {
		this.groupState = groupState;
	}
	public String getGroupState( ) {
		return this.groupState;
	}

	public void setState(String state) {
		this.state = state;
	}
	public String getState( ) {
		return this.state;
	}

}
