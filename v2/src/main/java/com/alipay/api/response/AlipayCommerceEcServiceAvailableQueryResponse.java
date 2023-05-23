package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ServiceBaseInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.service.available.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 10:01:59
 */
public class AlipayCommerceEcServiceAvailableQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5889663667166397218L;

	/** 
	 * 可用的服务列表
	 */
	@ApiListField("service_base_info_list")
	@ApiField("service_base_info")
	private List<ServiceBaseInfo> serviceBaseInfoList;

	public void setServiceBaseInfoList(List<ServiceBaseInfo> serviceBaseInfoList) {
		this.serviceBaseInfoList = serviceBaseInfoList;
	}
	public List<ServiceBaseInfo> getServiceBaseInfoList( ) {
		return this.serviceBaseInfoList;
	}

}
