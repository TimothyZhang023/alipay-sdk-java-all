package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息模版参数列表
 *
 * @author auto create
 * @since 1.0, 2024-04-26 16:32:08
 */
public class MedicalNoSubscribeMsgSendArg extends AlipayObject {

	private static final long serialVersionUID = 2659525946999178151L;

	/**
	 * 消息模板中参数的一个参数的键
	 */
	@ApiField("key")
	private String key;

	/**
	 * 消息模板中参数的一个参数的值
	 */
	@ApiField("value")
	private String value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
