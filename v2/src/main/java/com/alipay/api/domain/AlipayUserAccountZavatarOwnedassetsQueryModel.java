package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 亚运一站通获得服装展示列表
 *
 * @author auto create
 * @since 1.0, 2023-01-06 14:52:04
 */
public class AlipayUserAccountZavatarOwnedassetsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4754628226717911383L;

	/**
	 * 场景信息
	 */
	@ApiField("scene")
	private String scene;

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
