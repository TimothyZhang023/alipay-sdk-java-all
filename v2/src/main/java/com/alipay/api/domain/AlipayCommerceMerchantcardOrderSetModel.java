package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 周期卡订单操作接口
 *
 * @author auto create
 * @since 1.0, 2024-08-28 16:01:53
 */
public class AlipayCommerceMerchantcardOrderSetModel extends AlipayObject {

	private static final long serialVersionUID = 8212278875972399996L;

	/**
	 * 取消期数列表
	 */
	@ApiListField("cancel_period_list")
	@ApiField("string")
	private List<String> cancelPeriodList;

	/**
	 * 售卖订单ID
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 操作类型
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public List<String> getCancelPeriodList() {
		return this.cancelPeriodList;
	}
	public void setCancelPeriodList(List<String> cancelPeriodList) {
		this.cancelPeriodList = cancelPeriodList;
	}

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
