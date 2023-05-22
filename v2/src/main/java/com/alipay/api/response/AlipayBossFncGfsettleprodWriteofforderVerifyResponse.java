package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.WriteOffProcessResponseOpenApiDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfsettleprod.writeofforder.verify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 05:18:59
 */
public class AlipayBossFncGfsettleprodWriteofforderVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6194826285294541447L;

	/** 
	 * 核销处理结果返回
	 */
	@ApiField("result_set")
	private WriteOffProcessResponseOpenApiDTO resultSet;

	public void setResultSet(WriteOffProcessResponseOpenApiDTO resultSet) {
		this.resultSet = resultSet;
	}
	public WriteOffProcessResponseOpenApiDTO getResultSet( ) {
		return this.resultSet;
	}

}
