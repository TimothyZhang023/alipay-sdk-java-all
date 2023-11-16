package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票规则新增接口
 *
 * @author auto create
 * @since 1.0, 2023-08-15 17:29:20
 */
public class AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1429158896756211982L;

	/**
	 * 共同账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 账期结束日期
	 */
	@ApiField("bill_month_day")
	private Long billMonthDay;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 开票规则名称
	 */
	@ApiField("invoice_rule_name")
	private String invoiceRuleName;

	/**
	 * 发票抬头
	 */
	@ApiField("invoice_title_id")
	private String invoiceTitleId;

	/**
	 * 开票模式
	 */
	@ApiField("open_mode")
	private String openMode;

	/**
	 * 销方类型
	 */
	@ApiField("seller_type")
	private String sellerType;

	/**
	 * 开票规则标记
	 */
	@ApiField("tag")
	private String tag;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public Long getBillMonthDay() {
		return this.billMonthDay;
	}
	public void setBillMonthDay(Long billMonthDay) {
		this.billMonthDay = billMonthDay;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getInvoiceRuleName() {
		return this.invoiceRuleName;
	}
	public void setInvoiceRuleName(String invoiceRuleName) {
		this.invoiceRuleName = invoiceRuleName;
	}

	public String getInvoiceTitleId() {
		return this.invoiceTitleId;
	}
	public void setInvoiceTitleId(String invoiceTitleId) {
		this.invoiceTitleId = invoiceTitleId;
	}

	public String getOpenMode() {
		return this.openMode;
	}
	public void setOpenMode(String openMode) {
		this.openMode = openMode;
	}

	public String getSellerType() {
		return this.sellerType;
	}
	public void setSellerType(String sellerType) {
		this.sellerType = sellerType;
	}

	public String getTag() {
		return this.tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}

}
