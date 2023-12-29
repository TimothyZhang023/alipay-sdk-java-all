package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序备案人脸核验结果查询接口
 *
 * @author auto create
 * @since 1.0, 2023-12-27 10:55:17
 */
public class AlipayOpenMiniIcpFaceauthQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8349623823639684617L;

	/**
	 * 人脸核验凭证certify_id
	 */
	@ApiField("certify_id")
	private String certifyId;

	public String getCertifyId() {
		return this.certifyId;
	}
	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
	}

}
