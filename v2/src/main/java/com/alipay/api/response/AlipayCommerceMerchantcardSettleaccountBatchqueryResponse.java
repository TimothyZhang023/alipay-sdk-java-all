package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.settleaccount.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-15 17:07:21
 */
public class AlipayCommerceMerchantcardSettleaccountBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3565112984914361796L;

	/** 
	 * 结算收款的支付宝账号,登录号，非pid
	 */
	@ApiListField("settle_alipay_logon_id_list")
	@ApiField("string")
	private List<String> settleAlipayLogonIdList;

	public void setSettleAlipayLogonIdList(List<String> settleAlipayLogonIdList) {
		this.settleAlipayLogonIdList = settleAlipayLogonIdList;
	}
	public List<String> getSettleAlipayLogonIdList( ) {
		return this.settleAlipayLogonIdList;
	}

}
