package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付信息模型
 *
 * @author auto create
 * @since 1.0, 2023-07-28 10:58:17
 */
public class PayInfoVO extends AlipayObject {

	private static final long serialVersionUID = 6157588971896271866L;

	/**
	 * 支付渠道列表
	 */
	@ApiListField("pay_channels")
	@ApiField("string")
	private List<String> payChannels;

	/**
	 * 付款时间，yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("pay_time")
	private String payTime;

	/**
	 * 支付流水单号
	 */
	@ApiField("transaction_id")
	private String transactionId;

	/**
	 * 券明细
	 */
	@ApiListField("voucher_detail_list")
	@ApiField("voucher_detail_info_d_t_o")
	private List<VoucherDetailInfoDTO> voucherDetailList;

	public List<String> getPayChannels() {
		return this.payChannels;
	}
	public void setPayChannels(List<String> payChannels) {
		this.payChannels = payChannels;
	}

	public String getPayTime() {
		return this.payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getTransactionId() {
		return this.transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public List<VoucherDetailInfoDTO> getVoucherDetailList() {
		return this.voucherDetailList;
	}
	public void setVoucherDetailList(List<VoucherDetailInfoDTO> voucherDetailList) {
		this.voucherDetailList = voucherDetailList;
	}

}
