package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BusinessDistrictInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.searchbox.businessdistrict.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-11 23:17:02
 */
public class AlipayOpenSearchboxBusinessdistrictQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8749375546393756972L;

	/** 
	 * 商圈信息
	 */
	@ApiListField("business_district_info_list")
	@ApiField("business_district_info")
	private List<BusinessDistrictInfo> businessDistrictInfoList;

	public void setBusinessDistrictInfoList(List<BusinessDistrictInfo> businessDistrictInfoList) {
		this.businessDistrictInfoList = businessDistrictInfoList;
	}
	public List<BusinessDistrictInfo> getBusinessDistrictInfoList( ) {
		return this.businessDistrictInfoList;
	}

}
