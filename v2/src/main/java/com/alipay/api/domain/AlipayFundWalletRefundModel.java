package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 钱包原路退接口
 *
 * @author auto create
 * @since 1.0, 2023-03-08 17:21:51
 */
public class AlipayFundWalletRefundModel extends AlipayObject {

	private static final long serialVersionUID = 8828478933652551967L;

	/**
	 * 金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 原充值单号
	 */
	@ApiField("original_deposit_order_id")
	private String originalDepositOrderId;

	/**
	 * 用户唯一请求标识
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 用户唯一表示
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 用户唯一表示
	 */
	@ApiField("principal_open_id")
	private String principalOpenId;

	/**
	 * alipay_user_id代表支付宝用户id mechant_user_id代表商户id
	 */
	@ApiField("principal_type")
	private String principalType;

	/**
	 * 销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 提现策略
	 */
	@ApiField("refund_strategy")
	private String refundStrategy;

	/**
	 * 钱包id
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getOriginalDepositOrderId() {
		return this.originalDepositOrderId;
	}
	public void setOriginalDepositOrderId(String originalDepositOrderId) {
		this.originalDepositOrderId = originalDepositOrderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public String getPrincipalOpenId() {
		return this.principalOpenId;
	}
	public void setPrincipalOpenId(String principalOpenId) {
		this.principalOpenId = principalOpenId;
	}

	public String getPrincipalType() {
		return this.principalType;
	}
	public void setPrincipalType(String principalType) {
		this.principalType = principalType;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRefundStrategy() {
		return this.refundStrategy;
	}
	public void setRefundStrategy(String refundStrategy) {
		this.refundStrategy = refundStrategy;
	}

	public String getUserWalletId() {
		return this.userWalletId;
	}
	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}

}
