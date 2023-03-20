package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AestheticData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.iotdata.imageaesthetic.bai.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 18:40:54
 */
public class AlipayDataIotdataImageaestheticBaiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8484413916827391771L;

	/** 
	 * 返回图片URL、打分结果和错误信息
	 */
	@ApiField("data")
	private AestheticData data;

	public void setData(AestheticData data) {
		this.data = data;
	}
	public AestheticData getData( ) {
		return this.data;
	}

}
