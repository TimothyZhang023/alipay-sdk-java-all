package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.template.instance.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 18:19:33
 */
public class AlipayFincoreComplianceTemplateInstanceCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3349812111997115626L;

	/** 
	 * 模版业务实例id
	 */
	@ApiField("biz_instance_id")
	private String bizInstanceId;

	public void setBizInstanceId(String bizInstanceId) {
		this.bizInstanceId = bizInstanceId;
	}
	public String getBizInstanceId( ) {
		return this.bizInstanceId;
	}

}
