package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.dmpservice.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-08 15:06:48
 */
public class AlipayDataDataserviceDmpserviceCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6489448541132126112L;

	/** 
	 * 服务端的处理时间
	 */
	@ApiField("event_time")
	private String eventTime;

	/** 
	 * 0: 提交成功
1: 提交失败
	 */
	@ApiField("status")
	private Long status;

	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}
	public String getEventTime( ) {
		return this.eventTime;
	}

	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getStatus( ) {
		return this.status;
	}

}
