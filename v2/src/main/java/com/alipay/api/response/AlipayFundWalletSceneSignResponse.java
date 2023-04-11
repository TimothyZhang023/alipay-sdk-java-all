package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.scene.sign response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 02:26:44
 */
public class AlipayFundWalletSceneSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 5667764966417617752L;

	/** 
	 * 资产id
	 */
	@ApiField("asset_no")
	private String assetNo;

	/** 
	 * 可用金额，本金+权益
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/** 
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 总金额，本金+权益
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 用户钱包id
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
	}
	public String getAssetNo( ) {
		return this.assetNo;
	}

	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}
	public String getAvailableAmount( ) {
		return this.availableAmount;
	}

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}
	public String getUserWalletId( ) {
		return this.userWalletId;
	}

}
