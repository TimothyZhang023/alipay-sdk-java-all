package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.image.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-11 22:33:38
 */
public class AntMerchantExpandIndirectImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6683493724752262614L;

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
