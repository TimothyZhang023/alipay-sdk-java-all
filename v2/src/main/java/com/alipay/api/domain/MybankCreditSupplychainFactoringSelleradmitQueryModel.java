package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保理门店准入查询
 *
 * @author auto create
 * @since 1.0, 2023-10-12 10:37:39
 */
public class MybankCreditSupplychainFactoringSelleradmitQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5157289435361486718L;

	/**
	 * isv支付宝id
	 */
	@ApiField("buyer_alipay_id")
	private String buyerAlipayId;

	/**
	 * 门店名单类型,该值由网商提供
	 */
	@ApiField("list_type")
	private String listType;

	/**
	 * 销售产品码,该值由网商提供
	 */
	@ApiField("pd_code")
	private String pdCode;

	/**
	 * 门店支付登录号
	 */
	@ApiField("seller_login_id")
	private String sellerLoginId;

	public String getBuyerAlipayId() {
		return this.buyerAlipayId;
	}
	public void setBuyerAlipayId(String buyerAlipayId) {
		this.buyerAlipayId = buyerAlipayId;
	}

	public String getListType() {
		return this.listType;
	}
	public void setListType(String listType) {
		this.listType = listType;
	}

	public String getPdCode() {
		return this.pdCode;
	}
	public void setPdCode(String pdCode) {
		this.pdCode = pdCode;
	}

	public String getSellerLoginId() {
		return this.sellerLoginId;
	}
	public void setSellerLoginId(String sellerLoginId) {
		this.sellerLoginId = sellerLoginId;
	}

}
