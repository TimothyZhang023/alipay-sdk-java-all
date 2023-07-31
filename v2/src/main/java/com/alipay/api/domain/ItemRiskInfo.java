package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品问题描述
 *
 * @author auto create
 * @since 1.0, 2023-07-05 09:59:30
 */
public class ItemRiskInfo extends AlipayObject {

	private static final long serialVersionUID = 4424174619744897167L;

	/**
	 * 该商品最近一次审核完结时间
	 */
	@ApiField("audit_time")
	private Date auditTime;

	/**
	 * 具体问题描述
	 */
	@ApiField("risk_infos")
	private Reasons riskInfos;

	public Date getAuditTime() {
		return this.auditTime;
	}
	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}

	public Reasons getRiskInfos() {
		return this.riskInfos;
	}
	public void setRiskInfos(Reasons riskInfos) {
		this.riskInfos = riskInfos;
	}

}
