package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DialogueAuditResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.rcsmart.qtdialogue.check response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 22:10:14
 */
public class AlipayFincoreComplianceRcsmartQtdialogueCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 6768554331883274447L;

	/** 
	 * 对话审核结果
	 */
	@ApiField("data")
	private DialogueAuditResult data;

	public void setData(DialogueAuditResult data) {
		this.data = data;
	}
	public DialogueAuditResult getData( ) {
		return this.data;
	}

}
