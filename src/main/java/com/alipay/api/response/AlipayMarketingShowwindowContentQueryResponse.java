package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeviceContent;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.showwindow.content.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-05 00:38:20
 */
public class AlipayMarketingShowwindowContentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1317623922597733418L;

	/** 
	 * 每个设备的节目投放状态
	 */
	@ApiListField("device_content_list")
	@ApiField("device_content")
	private List<DeviceContent> deviceContentList;

	public void setDeviceContentList(List<DeviceContent> deviceContentList) {
		this.deviceContentList = deviceContentList;
	}
	public List<DeviceContent> getDeviceContentList( ) {
		return this.deviceContentList;
	}

}
