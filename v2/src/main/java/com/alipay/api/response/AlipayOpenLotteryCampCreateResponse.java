package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.lottery.camp.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 09:07:02
 */
public class AlipayOpenLotteryCampCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5614275788553255296L;

	/** 
	 * 返回新建的活动ID
	 */
	@ApiField("camp_id")
	private String campId;

	public void setCampId(String campId) {
		this.campId = campId;
	}
	public String getCampId( ) {
		return this.campId;
	}

}
