package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.chat.gmember.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 07:10:53
 */
public class AlipaySocialBaseChatGmemberDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 2417836452311189927L;

	/** 
	 * 删除结果
	 */
	@ApiField("result_delete")
	private Boolean resultDelete;

	public void setResultDelete(Boolean resultDelete) {
		this.resultDelete = resultDelete;
	}
	public Boolean getResultDelete( ) {
		return this.resultDelete;
	}

}
