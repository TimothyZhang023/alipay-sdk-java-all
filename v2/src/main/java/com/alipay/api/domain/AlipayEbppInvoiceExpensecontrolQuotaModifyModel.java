package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改额度
 *
 * @author auto create
 * @since 1.0, 2023-05-17 10:32:19
 */
public class AlipayEbppInvoiceExpensecontrolQuotaModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2373224382768651828L;

	/**
	 * 企业共同账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 变更模式
	 */
	@ApiField("action")
	private String action;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 变更的金额/余额，以（分）为单位
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 外部操作幂等ID（接入方接口调用幂等控制ID）
	 */
	@ApiField("outer_source_id")
	private String outerSourceId;

	/**
	 * 外部平台编码
	 */
	@ApiField("platform")
	private String platform;

	/**
	 * 额度ID
	 */
	@ApiField("quota_id")
	private String quotaId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getOuterSourceId() {
		return this.outerSourceId;
	}
	public void setOuterSourceId(String outerSourceId) {
		this.outerSourceId = outerSourceId;
	}

	public String getPlatform() {
		return this.platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getQuotaId() {
		return this.quotaId;
	}
	public void setQuotaId(String quotaId) {
		this.quotaId = quotaId;
	}

}
