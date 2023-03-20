package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EcoMockGroupInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.antest.mockgrouplist.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 01:21:44
 */
public class AlipayCommerceAntestMockgrouplistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8341769999384258481L;

	/** 
	 * 挡板集列表
	 */
	@ApiListField("data")
	@ApiField("eco_mock_group_info")
	private List<EcoMockGroupInfo> data;

	public void setData(List<EcoMockGroupInfo> data) {
		this.data = data;
	}
	public List<EcoMockGroupInfo> getData( ) {
		return this.data;
	}

}
