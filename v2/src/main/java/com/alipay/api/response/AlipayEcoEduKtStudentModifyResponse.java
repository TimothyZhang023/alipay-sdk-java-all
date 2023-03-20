package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.kt.student.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 19:14:42
 */
public class AlipayEcoEduKtStudentModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8548421726439883137L;

	/** 
	 * Y：代表成功；N：代表失败
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
