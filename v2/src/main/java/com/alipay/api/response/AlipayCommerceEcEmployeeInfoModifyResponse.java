package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.employee.info.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-08 14:02:05
 */
public class AlipayCommerceEcEmployeeInfoModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5741259389331594239L;

	/** 
	 * 员工id
	 */
	@ApiField("employee_id")
	private String employeeId;

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeId( ) {
		return this.employeeId;
	}

}
