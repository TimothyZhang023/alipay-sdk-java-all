package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CommunityPartnerRelaData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.community.partner.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-28 20:29:40
 */
public class AlipayOpenAppCommunityPartnerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4888131945937335148L;

	/** 
	 * 关系数
	 */
	@ApiField("count")
	private Long count;

	/** 
	 * 关系对象
	 */
	@ApiListField("data_list")
	@ApiField("community_partner_rela_data")
	private List<CommunityPartnerRelaData> dataList;

	public void setCount(Long count) {
		this.count = count;
	}
	public Long getCount( ) {
		return this.count;
	}

	public void setDataList(List<CommunityPartnerRelaData> dataList) {
		this.dataList = dataList;
	}
	public List<CommunityPartnerRelaData> getDataList( ) {
		return this.dataList;
	}

}
