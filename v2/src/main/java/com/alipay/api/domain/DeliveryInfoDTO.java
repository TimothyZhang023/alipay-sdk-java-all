package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 快递信息
 *
 * @author auto create
 * @since 1.0, 2023-04-07 09:59:39
 */
public class DeliveryInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6741845549422478577L;

	/**
	 * 232
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	/**
	 * 是
商品信息
	 */
	@ApiListField("item_info_list")
	@ApiField("goods_item_d_t_o")
	private List<GoodsItemDTO> itemInfoList;

	/**
	 * 快递单号
	 */
	@ApiField("waybill_id")
	private String waybillId;

	public String getDeliveryId() {
		return this.deliveryId;
	}
	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}

	public List<GoodsItemDTO> getItemInfoList() {
		return this.itemInfoList;
	}
	public void setItemInfoList(List<GoodsItemDTO> itemInfoList) {
		this.itemInfoList = itemInfoList;
	}

	public String getWaybillId() {
		return this.waybillId;
	}
	public void setWaybillId(String waybillId) {
		this.waybillId = waybillId;
	}

}
