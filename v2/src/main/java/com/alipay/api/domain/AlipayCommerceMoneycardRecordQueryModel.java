package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询核销订单详情
 *
 * @author auto create
 * @since 1.0, 2024-09-03 16:43:38
 */
public class AlipayCommerceMoneycardRecordQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2311333169741439618L;

	/**
	 * 交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
