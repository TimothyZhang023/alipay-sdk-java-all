package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可信价值中心账单明细查询
 *
 * @author auto create
 * @since 1.0, 2024-10-23 17:07:23
 */
public class AnttechBlockchainFinanceTvpBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8233592279295559619L;

	/**
	 * 账单id，数科唯一
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 外部账单id，商户唯一
	 */
	@ApiField("out_bill_no")
	private String outBillNo;

	/**
	 * 账单管理产品实例ID
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getOutBillNo() {
		return this.outBillNo;
	}
	public void setOutBillNo(String outBillNo) {
		this.outBillNo = outBillNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
