package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扫一扫查询桌码信息
 *
 * @author auto create
 * @since 1.0, 2022-10-11 12:08:03
 */
public class KoubeiCateringTablecodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6465163269947518672L;

	/**
	 * 用户在isv界面通过扫一扫传入的url文本
	 */
	@ApiField("url_context")
	private String urlContext;

	public String getUrlContext() {
		return this.urlContext;
	}
	public void setUrlContext(String urlContext) {
		this.urlContext = urlContext;
	}

}
