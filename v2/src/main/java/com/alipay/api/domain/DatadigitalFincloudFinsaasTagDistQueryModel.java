package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标签取值查询
 *
 * @author auto create
 * @since 1.0, 2022-05-26 09:37:35
 */
public class DatadigitalFincloudFinsaasTagDistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5178646185269395263L;

	/**
	 * 标签编码+唯一
	 */
	@ApiField("tag_code")
	private String tagCode;

	public String getTagCode() {
		return this.tagCode;
	}
	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

}
