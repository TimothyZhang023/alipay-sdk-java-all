package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.user.point.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 02:41:58
 */
public class AlipayCommerceOperationUserPointQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1543434996978755756L;

	/** 
	 * 用户当前可用积分
	 */
	@ApiField("current_point")
	private Long currentPoint;

	/** 
	 * 用户累计总积分
	 */
	@ApiField("total_point")
	private Long totalPoint;

	public void setCurrentPoint(Long currentPoint) {
		this.currentPoint = currentPoint;
	}
	public Long getCurrentPoint( ) {
		return this.currentPoint;
	}

	public void setTotalPoint(Long totalPoint) {
		this.totalPoint = totalPoint;
	}
	public Long getTotalPoint( ) {
		return this.totalPoint;
	}

}
