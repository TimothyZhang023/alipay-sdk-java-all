package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.department.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-08 14:02:00
 */
public class AlipayCommerceEcDepartmentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1154291971321786534L;

	/** 
	 * 新创建的部门id
	 */
	@ApiField("department_id")
	private String departmentId;

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentId( ) {
		return this.departmentId;
	}

}
