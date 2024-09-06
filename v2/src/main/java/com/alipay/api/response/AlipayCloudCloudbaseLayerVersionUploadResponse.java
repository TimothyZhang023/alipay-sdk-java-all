package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.layer.version.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-19 14:31:44
 */
public class AlipayCloudCloudbaseLayerVersionUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5442235649398666167L;

	/** 
	 * 上传id
	 */
	@ApiField("upload_id")
	private String uploadId;

	/** 
	 * 文件当前保存路径
	 */
	@ApiField("url")
	private String url;

	public void setUploadId(String uploadId) {
		this.uploadId = uploadId;
	}
	public String getUploadId( ) {
		return this.uploadId;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
