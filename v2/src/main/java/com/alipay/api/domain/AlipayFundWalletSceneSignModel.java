package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 个人用户开通场景钱包
 *
 * @author auto create
 * @since 1.0, 2024-06-14 17:53:07
 */
public class AlipayFundWalletSceneSignModel extends AlipayObject {

	private static final long serialVersionUID = 7364196824221538898L;

	/**
	 * 钱包业务的场景吗
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("principal_open_id")
	private String principalOpenId;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 钱包营销规则
	 */
	@ApiField("wallet_marketing_rule")
	private WalletMarketingRule walletMarketingRule;

	/**
	 * 钱包模版id
	 */
	@ApiField("wallet_template_id")
	private String walletTemplateId;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPrincipalOpenId() {
		return this.principalOpenId;
	}
	public void setPrincipalOpenId(String principalOpenId) {
		this.principalOpenId = principalOpenId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public WalletMarketingRule getWalletMarketingRule() {
		return this.walletMarketingRule;
	}
	public void setWalletMarketingRule(WalletMarketingRule walletMarketingRule) {
		this.walletMarketingRule = walletMarketingRule;
	}

	public String getWalletTemplateId() {
		return this.walletTemplateId;
	}
	public void setWalletTemplateId(String walletTemplateId) {
		this.walletTemplateId = walletTemplateId;
	}

}
