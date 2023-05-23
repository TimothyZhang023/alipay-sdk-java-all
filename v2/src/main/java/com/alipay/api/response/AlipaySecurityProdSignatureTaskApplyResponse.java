package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SignTaskResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.signature.task.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 07:26:07
 */
public class AlipaySecurityProdSignatureTaskApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8483914838648123269L;

	/** 
	 * 签约订单id，关联了若干个签约任务id。
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 签约认证任务列表
	 */
	@ApiListField("task_list")
	@ApiField("sign_task_result")
	private List<SignTaskResult> taskList;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setTaskList(List<SignTaskResult> taskList) {
		this.taskList = taskList;
	}
	public List<SignTaskResult> getTaskList( ) {
		return this.taskList;
	}

}
