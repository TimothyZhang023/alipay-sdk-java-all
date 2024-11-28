package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用企业风险探查接口
 *
 * @author auto create
 * @since 1.0, 2024-11-05 10:27:33
 */
public class ZhimaCreditEpRiskSummaryCheckModel extends AlipayObject {

	private static final long serialVersionUID = 2195558781527363254L;

	/**
	 * 统一社会信用代码或营业执照注册号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

}
