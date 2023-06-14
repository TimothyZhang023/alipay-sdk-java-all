package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云业务安全风险咨询结果列表
 *
 * @author auto create
 * @since 1.0, 2023-06-09 14:59:23
 */
public class RiskImagePlusQueryResult extends AlipayObject {

	private static final long serialVersionUID = 3351447823353833619L;

	/**
	 * 风险分析-风险标签
	 */
	@ApiField("info_code")
	private String infoCode;

	/**
	 * 风险咨询结果描述
	 */
	@ApiField("risk_desc")
	private String riskDesc;

	/**
	 * 风险咨询类型
	 */
	@ApiField("risk_type")
	private String riskType;

	/**
	 * 风险咨询结果，匹配风险咨询类型
	 */
	@ApiField("risk_value")
	private String riskValue;

	public String getInfoCode() {
		return this.infoCode;
	}
	public void setInfoCode(String infoCode) {
		this.infoCode = infoCode;
	}

	public String getRiskDesc() {
		return this.riskDesc;
	}
	public void setRiskDesc(String riskDesc) {
		this.riskDesc = riskDesc;
	}

	public String getRiskType() {
		return this.riskType;
	}
	public void setRiskType(String riskType) {
		this.riskType = riskType;
	}

	public String getRiskValue() {
		return this.riskValue;
	}
	public void setRiskValue(String riskValue) {
		this.riskValue = riskValue;
	}

}
