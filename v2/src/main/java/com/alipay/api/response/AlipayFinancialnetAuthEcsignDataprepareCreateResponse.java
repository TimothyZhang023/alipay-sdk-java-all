package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.ecsign.dataprepare.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 05:21:47
 */
public class AlipayFinancialnetAuthEcsignDataprepareCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8751763332368484633L;

	/** 
	 * 扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 跳转类型
	 */
	@ApiField("jump_type")
	private String jumpType;

	/** 
	 * 跳转至小程序的URL
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setJumpType(String jumpType) {
		this.jumpType = jumpType;
	}
	public String getJumpType( ) {
		return this.jumpType;
	}

	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}
	public String getJumpUrl( ) {
		return this.jumpUrl;
	}

}
