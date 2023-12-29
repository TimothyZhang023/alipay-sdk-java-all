package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序类目树查询
 *
 * @author auto create
 * @since 1.0, 2023-06-21 10:05:15
 */
public class AlipayOpenMiniCategoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1879411381425667436L;

	/**
	 * 是否过滤小程序不可用类目。枚举值如下：
* true：表示过滤不可用类目。
* false：表示不过滤不可用类目。
	 */
	@ApiField("is_filter")
	private Boolean isFilter;

	public Boolean getIsFilter() {
		return this.isFilter;
	}
	public void setIsFilter(Boolean isFilter) {
		this.isFilter = isFilter;
	}

}
