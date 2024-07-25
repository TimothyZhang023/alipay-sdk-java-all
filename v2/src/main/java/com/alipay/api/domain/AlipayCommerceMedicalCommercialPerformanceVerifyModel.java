package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗行业商业化核销接口
 *
 * @author auto create
 * @since 1.0, 2024-07-18 18:49:29
 */
public class AlipayCommerceMedicalCommercialPerformanceVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 5249875766768443968L;

	/**
	 * 商品订单id，支付宝侧用户对商户某一商品的唯一订单子单id。该订单记录了用户的核销次数与总次数，以及订单状态
	 */
	@ApiField("biz_order_id")
	private String bizOrderId;

	/**
	 * 该参数当业务完结时，需要提供的业务url结果
	 */
	@ApiField("biz_url")
	private String bizUrl;

	/**
	 * 用户user_id，做了open_id映射
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 用户实际在机构侧核销商品的时间
	 */
	@ApiField("consume_time")
	private Date consumeTime;

	/**
	 * 用户openid，唯一映射用户userid，用于唯一标识用户
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户在支付宝支付后，医疗行业生成的唯一订单id。在履约通知接口会传递给商户。
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部业务号，必须保证商户下唯一，用作幂等。当用户在商户侧核销时，商户生成唯一订单号并调用接口时传递
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * out_product_id为商户侧唯一的权商品id标识
	 */
	@ApiField("out_product_id")
	private String outProductId;

	/**
	 * status核销或确认场景使用，枚举值为S\C\R\N，正常核销或确认商品时传S、核销权益次数完结传C、拒绝核销或确认传入N、逆向核销回补使用次数时传递R。
	 */
	@ApiField("status")
	private String status;

	/**
	 * total_count标记用户所拥有商品的总可核销次数，商户在用户核销时传递该字段，可选。
	 */
	@ApiField("total_count")
	private String totalCount;

	/**
	 * usage_count用于记录用户对某一商品的使用次数，每次核销时商户侧进行累加。该字段不影响主逻辑，用于支付宝侧日志监控
	 */
	@ApiField("usage_count")
	private String usageCount;

	/**
	 * 确认场景类型，枚举值用户核销，USER_PERFORMANCE。取消预约，RESERVE_CANCEL。修改预约，RESERVE_MODIFY。上传报告，REPORT_UPLOAD
	 */
	@ApiField("verify_type")
	private String verifyType;

	public String getBizOrderId() {
		return this.bizOrderId;
	}
	public void setBizOrderId(String bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public String getBizUrl() {
		return this.bizUrl;
	}
	public void setBizUrl(String bizUrl) {
		this.bizUrl = bizUrl;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public Date getConsumeTime() {
		return this.consumeTime;
	}
	public void setConsumeTime(Date consumeTime) {
		this.consumeTime = consumeTime;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutProductId() {
		return this.outProductId;
	}
	public void setOutProductId(String outProductId) {
		this.outProductId = outProductId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getUsageCount() {
		return this.usageCount;
	}
	public void setUsageCount(String usageCount) {
		this.usageCount = usageCount;
	}

	public String getVerifyType() {
		return this.verifyType;
	}
	public void setVerifyType(String verifyType) {
		this.verifyType = verifyType;
	}

}
