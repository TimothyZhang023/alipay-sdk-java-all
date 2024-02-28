package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.ebpp.pdeduct.czsign.upgrade response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 03:17:10
 */
public class AlipayEbppEbppPdeductCzsignUpgradeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4139417372679627544L;

	/** 
	 * 错误信息文案
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 升级后新的协议ID（如果只涉及金额更改则协议id与之前一致）
	 */
	@ApiField("new_agreement_id")
	private String newAgreementId;

	/** 
	 * 支付宝用户的openId
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 当前更新结果是否成功
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

	public void setNewAgreementId(String newAgreementId) {
		this.newAgreementId = newAgreementId;
	}
	public String getNewAgreementId( ) {
		return this.newAgreementId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
