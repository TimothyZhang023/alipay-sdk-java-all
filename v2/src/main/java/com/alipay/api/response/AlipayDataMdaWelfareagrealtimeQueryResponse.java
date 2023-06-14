package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.welfareagrealtime.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 09:41:49
 */
public class AlipayDataMdaWelfareagrealtimeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1548656258339485229L;

	/** 
	 * 今日完成火苗捐赠人数
	 */
	@ApiField("total_donate")
	private Long totalDonate;

	/** 
	 * 今日获取火苗人数
	 */
	@ApiField("total_obtain")
	private Long totalObtain;

	public void setTotalDonate(Long totalDonate) {
		this.totalDonate = totalDonate;
	}
	public Long getTotalDonate( ) {
		return this.totalDonate;
	}

	public void setTotalObtain(Long totalObtain) {
		this.totalObtain = totalObtain;
	}
	public Long getTotalObtain( ) {
		return this.totalObtain;
	}

}
