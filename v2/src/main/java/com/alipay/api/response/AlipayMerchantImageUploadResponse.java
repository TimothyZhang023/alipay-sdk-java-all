package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.image.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 14:22:28
 */
public class AlipayMerchantImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8135778613516612895L;

	/** 
	 * 图片在文件存储平台的标识
	 */
	@ApiField("image_id")
	private String imageId;

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public String getImageId( ) {
		return this.imageId;
	}

}
