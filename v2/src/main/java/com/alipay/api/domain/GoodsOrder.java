package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品信息
 *
 * @author auto create
 * @since 1.0, 2022-11-10 17:01:24
 */
public class GoodsOrder extends AlipayObject {

	private static final long serialVersionUID = 6871789778184254748L;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商品图片素材Id；商品文件上传接口返回material_id。不传则暂时默认约定图片，具体可以咨询支付宝行业小二
	 */
	@ApiField("goods_picture_id")
	private String goodsPictureId;

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsPictureId() {
		return this.goodsPictureId;
	}
	public void setGoodsPictureId(String goodsPictureId) {
		this.goodsPictureId = goodsPictureId;
	}

}
