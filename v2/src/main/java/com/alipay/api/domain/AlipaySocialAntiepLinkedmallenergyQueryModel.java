package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * linkedmall查询蚂蚁森林能量
 *
 * @author auto create
 * @since 1.0, 2023-12-12 19:57:18
 */
public class AlipaySocialAntiepLinkedmallenergyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7761721997212254776L;

	/**
	 * 业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * sku_id
	 */
	@ApiField("sku_id")
	private Long skuId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getSkuId() {
		return this.skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
