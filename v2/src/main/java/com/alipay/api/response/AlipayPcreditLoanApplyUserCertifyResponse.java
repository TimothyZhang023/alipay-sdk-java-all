package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.apply.user.certify response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:34:45
 */
public class AlipayPcreditLoanApplyUserCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6895546152759174999L;

	/** 
	 * 校验结果：目前可能返回的认证结果有：
000-认证OK
100-姓名不匹配
101-证件号不匹配
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
