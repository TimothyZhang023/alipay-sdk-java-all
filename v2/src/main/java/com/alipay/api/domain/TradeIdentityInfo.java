package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收单身份信息
 *
 * @author auto create
 * @since 1.0, 2023-03-28 19:17:14
 */
public class TradeIdentityInfo extends AlipayObject {

	private static final long serialVersionUID = 1511478438187493759L;

	/**
	 * 交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 收单pid/smid
	 */
	@ApiField("trade_pid")
	private String tradePid;

	/**
	 * 收单shopId
	 */
	@ApiField("trade_shopid")
	private String tradeShopid;

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradePid() {
		return this.tradePid;
	}
	public void setTradePid(String tradePid) {
		this.tradePid = tradePid;
	}

	public String getTradeShopid() {
		return this.tradeShopid;
	}
	public void setTradeShopid(String tradeShopid) {
		this.tradeShopid = tradeShopid;
	}

}
