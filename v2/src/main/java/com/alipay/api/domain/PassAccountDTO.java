package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通行证账号
 *
 * @author auto create
 * @since 1.0, 2022-12-28 10:06:41
 */
public class PassAccountDTO extends AlipayObject {

	private static final long serialVersionUID = 4865175541989541289L;

	/**
	 * 账号名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 通行证id
	 */
	@ApiField("passport_id")
	private String passportId;

	/**
	 * 账号类型
	 */
	@ApiField("type")
	private String type;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPassportId() {
		return this.passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
