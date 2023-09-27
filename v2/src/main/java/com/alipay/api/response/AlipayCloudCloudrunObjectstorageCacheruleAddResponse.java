package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CacheRule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.objectstorage.cacherule.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-22 09:56:45
 */
public class AlipayCloudCloudrunObjectstorageCacheruleAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 1825485378244449444L;

	/** 
	 * 缓存规则
	 */
	@ApiField("cacherule")
	private CacheRule cacherule;

	public void setCacherule(CacheRule cacherule) {
		this.cacherule = cacherule;
	}
	public CacheRule getCacherule( ) {
		return this.cacherule;
	}

}
