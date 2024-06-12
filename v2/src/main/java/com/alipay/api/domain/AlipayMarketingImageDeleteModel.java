package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 图删除接口
 *
 * @author auto create
 * @since 1.0, 2024-03-13 10:32:08
 */
public class AlipayMarketingImageDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8364257451746691822L;

	/**
	 * 需要操作删除的图片索引id列表。
	 */
	@ApiListField("image_index_id_list")
	@ApiField("string")
	private List<String> imageIndexIdList;

	public List<String> getImageIndexIdList() {
		return this.imageIndexIdList;
	}
	public void setImageIndexIdList(List<String> imageIndexIdList) {
		this.imageIndexIdList = imageIndexIdList;
	}

}
