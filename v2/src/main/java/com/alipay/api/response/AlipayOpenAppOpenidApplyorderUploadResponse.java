package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.openid.applyorder.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 10:26:54
 */
public class AlipayOpenAppOpenidApplyorderUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5689978722854696581L;

	/** 
	 * 非法的用户ID参数，说明部分参数不是有效的用户ID
	 */
	@ApiListField("illegal_user_id_list")
	@ApiField("string")
	private List<String> illegalUserIdList;

	public void setIllegalUserIdList(List<String> illegalUserIdList) {
		this.illegalUserIdList = illegalUserIdList;
	}
	public List<String> getIllegalUserIdList( ) {
		return this.illegalUserIdList;
	}

}
