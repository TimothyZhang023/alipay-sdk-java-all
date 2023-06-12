package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业注销
 *
 * @author auto create
 * @since 1.0, 2023-06-07 19:31:23
 */
public class AlipayCommerceEcEnterpriseDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6445921735594589572L;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

}
