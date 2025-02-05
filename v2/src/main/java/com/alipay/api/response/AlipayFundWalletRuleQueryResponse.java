package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.WalletUseRule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.rule.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-28 18:02:22
 */
public class AlipayFundWalletRuleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5474823352751335266L;

	/** 
	 * 钱包使用规则
	 */
	@ApiField("wallet_use_rule")
	private WalletUseRule walletUseRule;

	public void setWalletUseRule(WalletUseRule walletUseRule) {
		this.walletUseRule = walletUseRule;
	}
	public WalletUseRule getWalletUseRule( ) {
		return this.walletUseRule;
	}

}
