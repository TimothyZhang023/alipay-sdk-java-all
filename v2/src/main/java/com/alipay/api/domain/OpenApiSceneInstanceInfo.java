package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景实例信息
 *
 * @author auto create
 * @since 1.0, 2023-05-25 11:49:41
 */
public class OpenApiSceneInstanceInfo extends AlipayObject {

	private static final long serialVersionUID = 5585643581152744838L;

	/**
	 * 外部租户id
	 */
	@ApiField("external_inst_id")
	private String externalInstId;

	public String getExternalInstId() {
		return this.externalInstId;
	}
	public void setExternalInstId(String externalInstId) {
		this.externalInstId = externalInstId;
	}

}
