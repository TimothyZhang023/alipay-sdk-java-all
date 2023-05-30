package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.content.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 23:53:56
 */
public class AlipayOverseasTravelContentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8244163191815579467L;

	/** 
	 * 可选，仅当请求中的modified_date等于已落地内容的modified_date并且内容状态一致，认为幂等成功，返回Success
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
