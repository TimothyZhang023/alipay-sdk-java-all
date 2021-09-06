package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 统计AP应付账单金额
 *
 * @author auto create
 * @since 1.0, 2021-08-05 15:25:03
 */
public class AlipayBossFncGfsettleprodSumapsummarybillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5531587534135419527L;

	/**
	 * AP融合账单查询请求
	 */
	@ApiField("ap_summary_bill_view_query_orde")
	private ApSummaryBillViewQueryOrder apSummaryBillViewQueryOrde;

	public ApSummaryBillViewQueryOrder getApSummaryBillViewQueryOrde() {
		return this.apSummaryBillViewQueryOrde;
	}
	public void setApSummaryBillViewQueryOrde(ApSummaryBillViewQueryOrder apSummaryBillViewQueryOrde) {
		this.apSummaryBillViewQueryOrde = apSummaryBillViewQueryOrde;
	}

}
