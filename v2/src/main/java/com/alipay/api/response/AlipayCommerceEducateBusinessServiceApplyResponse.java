package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.business.service.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 01:29:50
 */
public class AlipayCommerceEducateBusinessServiceApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8259542311482437767L;

	/** 
	 * 学校编号
	 */
	@ApiField("school_no")
	private String schoolNo;

	public void setSchoolNo(String schoolNo) {
		this.schoolNo = schoolNo;
	}
	public String getSchoolNo( ) {
		return this.schoolNo;
	}

}
