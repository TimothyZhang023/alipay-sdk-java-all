package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询支付券
 *
 * @author auto create
 * @since 1.0, 2022-12-29 19:43:16
 */
public class AlipayMarketingActivityVoucherQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4399122513851113652L;

	/**
	 * 活动 id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 商户接入模式。
	 */
	@ApiField("merchant_access_mode")
	private String merchantAccessMode;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getMerchantAccessMode() {
		return this.merchantAccessMode;
	}
	public void setMerchantAccessMode(String merchantAccessMode) {
		this.merchantAccessMode = merchantAccessMode;
	}

}
