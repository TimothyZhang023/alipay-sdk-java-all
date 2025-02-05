package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv解绑设备
 *
 * @author auto create
 * @since 1.0, 2024-06-20 16:31:51
 */
public class AlipayOpenIotmbsIsvdeviceUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 3374829467434611855L;

	/**
	 * project_id+酒店项目id
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * sn+需要解除绑定设备的sn
	 */
	@ApiField("sn")
	private String sn;

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

}
