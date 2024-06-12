package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡模板批量查询
 *
 * @author auto create
 * @since 1.0, 2024-04-10 16:32:45
 */
public class AlipayMarketingCardTemplateBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6267855254411286897L;

	/**
	 * 查询起始页码，第一页为 1。
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页数据大小，默认 20条，最大支持20条。
	 */
	@ApiField("page_size")
	private Long pageSize;

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
