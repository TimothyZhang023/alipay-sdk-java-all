package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家群群组推广链接查询
 *
 * @author auto create
 * @since 1.0, 2024-05-30 15:40:17
 */
public class AlipayMerchantGroupPromotionurlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7732251363218425769L;

	/**
	 * 群组id，表里唯一键，创建群组自动生成，编辑群组必填
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 推广渠道
	 */
	@ApiField("promotion_channel")
	private String promotionChannel;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getPromotionChannel() {
		return this.promotionChannel;
	}
	public void setPromotionChannel(String promotionChannel) {
		this.promotionChannel = promotionChannel;
	}

}
