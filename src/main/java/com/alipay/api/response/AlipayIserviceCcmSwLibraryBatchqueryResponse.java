package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LibraryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.sw.library.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-26 15:11:54
 */
public class AlipayIserviceCcmSwLibraryBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5146719182165253247L;

	/** 
	 * 知识库集合
	 */
	@ApiListField("libraries")
	@ApiField("library_info")
	private List<LibraryInfo> libraries;

	public void setLibraries(List<LibraryInfo> libraries) {
		this.libraries = libraries;
	}
	public List<LibraryInfo> getLibraries( ) {
		return this.libraries;
	}

}
