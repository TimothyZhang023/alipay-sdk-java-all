package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 终止合作关系
 *
 * @author auto create
 * @since 1.0, 2023-10-25 16:01:56
 */
public class AlipayMarketingPartnershipsStopModel extends AlipayObject {

	private static final long serialVersionUID = 1333184579813371245L;

	/**
	 * 本次终止授权给合作方的营销资源。
	 */
	@ApiField("authorized_data")
	private MarketingAuthorizedData authorizedData;

	/**
	 * 合作方相关信息
	 */
	@ApiField("partner")
	private MarketingPartner partner;

	public MarketingAuthorizedData getAuthorizedData() {
		return this.authorizedData;
	}
	public void setAuthorizedData(MarketingAuthorizedData authorizedData) {
		this.authorizedData = authorizedData;
	}

	public MarketingPartner getPartner() {
		return this.partner;
	}
	public void setPartner(MarketingPartner partner) {
		this.partner = partner;
	}

}
