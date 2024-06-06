package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IcpSubjectTypeList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.icp.subjecttype.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-23 21:50:59
 */
public class AlipayOpenMiniIcpSubjecttypeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1661234722262131695L;

	/** 
	 * 单位性质列表
	 */
	@ApiListField("subject_types")
	@ApiField("icp_subject_type_list")
	private List<IcpSubjectTypeList> subjectTypes;

	public void setSubjectTypes(List<IcpSubjectTypeList> subjectTypes) {
		this.subjectTypes = subjectTypes;
	}
	public List<IcpSubjectTypeList> getSubjectTypes( ) {
		return this.subjectTypes;
	}

}
