package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.detect.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-23 10:57:57
 */
public class AlipayEbppDetectCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5431917817684885986L;

	/** 
	 * 外部业务标识，同入参的out_biz_no
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
