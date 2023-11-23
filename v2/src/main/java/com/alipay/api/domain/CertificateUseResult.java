package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证核销结果
 *
 * @author auto create
 * @since 1.0, 2023-10-16 15:12:42
 */
public class CertificateUseResult extends AlipayObject {

	private static final long serialVersionUID = 4668663925956754376L;

	/**
	 * 凭证实例的金额信息，在异常场景下可能为空，需要判断是否有值才可进行使用。
	 */
	@ApiField("amount_info")
	private CertificateInstanceAmountInfo amountInfo;

	/**
	 * 凭证id
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * 三方码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 核销准备返回的支付宝平台加密券码
	 */
	@ApiField("encrypted_code")
	private String encryptedCode;

	/**
	 * 结果说明
	 */
	@ApiField("msg")
	private String msg;

	/**
	 * 购买商品的订单id。
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商家侧核销对应的交易订单id
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 核销结果枚举
	 */
	@ApiField("result")
	private String result;

	/**
	 * 本次核销的次序号信息
	 */
	@ApiField("serial_info_list")
	private CertificateSerialInfo serialInfoList;

	/**
	 * 核销操作单号,核销成功必填,撤销核销使用
	 */
	@ApiField("use_order_no")
	private String useOrderNo;

	public CertificateInstanceAmountInfo getAmountInfo() {
		return this.amountInfo;
	}
	public void setAmountInfo(CertificateInstanceAmountInfo amountInfo) {
		this.amountInfo = amountInfo;
	}

	public String getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getEncryptedCode() {
		return this.encryptedCode;
	}
	public void setEncryptedCode(String encryptedCode) {
		this.encryptedCode = encryptedCode;
	}

	public String getMsg() {
		return this.msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public CertificateSerialInfo getSerialInfoList() {
		return this.serialInfoList;
	}
	public void setSerialInfoList(CertificateSerialInfo serialInfoList) {
		this.serialInfoList = serialInfoList;
	}

	public String getUseOrderNo() {
		return this.useOrderNo;
	}
	public void setUseOrderNo(String useOrderNo) {
		this.useOrderNo = useOrderNo;
	}

}
