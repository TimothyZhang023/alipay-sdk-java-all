package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ContactFollower;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.contact.follow.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 19:17:54
 */
public class AlipayOpenPublicContactFollowBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3186727758652144599L;

	/** 
	 * 联系人关注者列表
	 */
	@ApiListField("contact_follow_list")
	@ApiField("contact_follower")
	private List<ContactFollower> contactFollowList;

	public void setContactFollowList(List<ContactFollower> contactFollowList) {
		this.contactFollowList = contactFollowList;
	}
	public List<ContactFollower> getContactFollowList( ) {
		return this.contactFollowList;
	}

}
