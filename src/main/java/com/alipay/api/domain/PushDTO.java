package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推进数据DTO,包含推进类型和推进值等属性
 *
 * @author auto create
 * @since 1.0, 2021-06-18 09:38:39
 */
public class PushDTO extends AlipayObject {

	private static final long serialVersionUID = 3491438789578398339L;

	/**
	 * 推进计算类型，如计次:cal_count
	 */
	@ApiField("cal_type")
	private String calType;

	/**
	 * 推进值
	 */
	@ApiField("inc_value")
	private Long incValue;

	public String getCalType() {
		return this.calType;
	}
	public void setCalType(String calType) {
		this.calType = calType;
	}

	public Long getIncValue() {
		return this.incValue;
	}
	public void setIncValue(Long incValue) {
		this.incValue = incValue;
	}

}
