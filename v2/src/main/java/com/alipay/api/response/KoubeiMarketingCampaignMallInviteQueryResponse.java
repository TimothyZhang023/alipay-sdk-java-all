package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ActivityPlanInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.mall.invite.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 08:39:11
 */
public class KoubeiMarketingCampaignMallInviteQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4486421782459113947L;

	/** 
	 * 平台活动招商信息列表
	 */
	@ApiListField("activity_plan_info_list")
	@ApiField("activity_plan_info")
	private List<ActivityPlanInfo> activityPlanInfoList;

	public void setActivityPlanInfoList(List<ActivityPlanInfo> activityPlanInfoList) {
		this.activityPlanInfoList = activityPlanInfoList;
	}
	public List<ActivityPlanInfo> getActivityPlanInfoList( ) {
		return this.activityPlanInfoList;
	}

}
