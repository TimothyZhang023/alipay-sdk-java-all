package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.mall.item.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-12 11:52:05
 */
public class AlipayCloudCloudpromoMallItemSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1714251115823632233L;

	/** 
	 * 同步任务创建状态
	 */
	@ApiField("sync_result")
	private Boolean syncResult;

	public void setSyncResult(Boolean syncResult) {
		this.syncResult = syncResult;
	}
	public Boolean getSyncResult( ) {
		return this.syncResult;
	}

}
