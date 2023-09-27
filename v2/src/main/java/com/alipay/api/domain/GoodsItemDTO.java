package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品信息
 *
 * @author auto create
 * @since 1.0, 2023-09-12 15:20:30
 */
public class GoodsItemDTO extends AlipayObject {

	private static final long serialVersionUID = 3717874854678266674L;

	/**
	 * 商户侧商品的编号，应与alipay.open.mini.order.create接口所传的商品goods_id保持一致
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品数量
	 */
	@ApiField("item_cnt")
	private Long itemCnt;

	/**
	 * 商户商品ID
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商户商品sku_id，提报商品库的商品，该字段必传
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public Long getItemCnt() {
		return this.itemCnt;
	}
	public void setItemCnt(Long itemCnt) {
		this.itemCnt = itemCnt;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

}
