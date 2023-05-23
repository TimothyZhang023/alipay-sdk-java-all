package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取登录凭证
 *
 * @author auto create
 * @since 1.0, 2022-11-22 20:38:53
 */
public class AlipayUserLoginCodeGetModel extends AlipayObject {

	private static final long serialVersionUID = 4294152139532532498L;

	/**
	 * 代理的小程序appid，用于生成openId和unionId
	 */
	@ApiField("agent_app_id")
	private String agentAppId;

	/**
	 * 代理的小程序pid，用于生成loginCode
	 */
	@ApiField("agent_pid")
	private String agentPid;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("agent_user_id")
	private String agentUserId;

	public String getAgentAppId() {
		return this.agentAppId;
	}
	public void setAgentAppId(String agentAppId) {
		this.agentAppId = agentAppId;
	}

	public String getAgentPid() {
		return this.agentPid;
	}
	public void setAgentPid(String agentPid) {
		this.agentPid = agentPid;
	}

	public String getAgentUserId() {
		return this.agentUserId;
	}
	public void setAgentUserId(String agentUserId) {
		this.agentUserId = agentUserId;
	}

}
