package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.sign.list.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:59:08
 */
public class AlipayFincoreComplianceSignListApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4516992735628611425L;

	/** 
	 * 业务请求单号
	 */
	@ApiField("business_id")
	private String businessId;

	/** 
	 * 用印记录id
	 */
	@ApiField("file_code")
	private String fileCode;

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public String getBusinessId( ) {
		return this.businessId;
	}

	public void setFileCode(String fileCode) {
		this.fileCode = fileCode;
	}
	public String getFileCode( ) {
		return this.fileCode;
	}

}
