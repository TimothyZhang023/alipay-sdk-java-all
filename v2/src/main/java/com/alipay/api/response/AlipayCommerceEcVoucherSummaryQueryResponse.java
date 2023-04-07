package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EcVoucherInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.voucher.summary.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 14:45:30
 */
public class AlipayCommerceEcVoucherSummaryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1479181323769844141L;

	/** 
	 * 发票信息列表
	 */
	@ApiListField("voucher_info_list")
	@ApiField("ec_voucher_info")
	private List<EcVoucherInfo> voucherInfoList;

	public void setVoucherInfoList(List<EcVoucherInfo> voucherInfoList) {
		this.voucherInfoList = voucherInfoList;
	}
	public List<EcVoucherInfo> getVoucherInfoList( ) {
		return this.voucherInfoList;
	}

}
