package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道对应的运营信息
 *
 * @author auto create
 * @since 1.0, 2023-11-03 15:52:00
 */
public class PrePayOperationInfo extends AlipayObject {

	private static final long serialVersionUID = 3348983382674699257L;

	/**
	 * 运营场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 运营展示数据
	 */
	@ApiField("view_data")
	private PrePayOperationInfoViewData viewData;

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public PrePayOperationInfoViewData getViewData() {
		return this.viewData;
	}
	public void setViewData(PrePayOperationInfoViewData viewData) {
		this.viewData = viewData;
	}

}
