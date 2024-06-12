package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁订单修改
 *
 * @author auto create
 * @since 1.0, 2024-05-15 14:52:50
 */
public class AlipayOpenMiniOrderModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4466255631269295326L;

	/**
	 * 分账条款
	 */
	@ApiField("alloc_amount_info")
	private AllocAmountInfoDTO allocAmountInfo;

	/**
	 * 商品修改信息
	 */
	@ApiListField("item_infos")
	@ApiField("goods_info_modify_d_t_o")
	private List<GoodsInfoModifyDTO> itemInfos;

	/**
	 * 用户openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 交易组件订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复。
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 订单价格修改信息
	 */
	@ApiField("price_info")
	private PriceInfoModifyDTO priceInfo;

	/**
	 * 阶段付款计划列表，请在修改付款计划时传入
	 */
	@ApiListField("stage_pay_plans")
	@ApiField("stage_pay_plan_d_t_o")
	private List<StagePayPlanDTO> stagePayPlans;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public AllocAmountInfoDTO getAllocAmountInfo() {
		return this.allocAmountInfo;
	}
	public void setAllocAmountInfo(AllocAmountInfoDTO allocAmountInfo) {
		this.allocAmountInfo = allocAmountInfo;
	}

	public List<GoodsInfoModifyDTO> getItemInfos() {
		return this.itemInfos;
	}
	public void setItemInfos(List<GoodsInfoModifyDTO> itemInfos) {
		this.itemInfos = itemInfos;
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

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public PriceInfoModifyDTO getPriceInfo() {
		return this.priceInfo;
	}
	public void setPriceInfo(PriceInfoModifyDTO priceInfo) {
		this.priceInfo = priceInfo;
	}

	public List<StagePayPlanDTO> getStagePayPlans() {
		return this.stagePayPlans;
	}
	public void setStagePayPlans(List<StagePayPlanDTO> stagePayPlans) {
		this.stagePayPlans = stagePayPlans;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
