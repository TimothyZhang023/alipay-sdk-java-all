package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.indirect.filetask.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 07:51:42
 */
public class AlipayMerchantIndirectFiletaskSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 8644363595377236487L;

	/** 
	 * 数据文件任务提交后，为任务文件分配的编号
	 */
	@ApiField("task_file_no")
	private String taskFileNo;

	/** 
	 * 文件任务处理结果
	 */
	@ApiField("task_state")
	private String taskState;

	/** 
	 * 文件任务状态描述
	 */
	@ApiField("task_state_desc")
	private String taskStateDesc;

	public void setTaskFileNo(String taskFileNo) {
		this.taskFileNo = taskFileNo;
	}
	public String getTaskFileNo( ) {
		return this.taskFileNo;
	}

	public void setTaskState(String taskState) {
		this.taskState = taskState;
	}
	public String getTaskState( ) {
		return this.taskState;
	}

	public void setTaskStateDesc(String taskStateDesc) {
		this.taskStateDesc = taskStateDesc;
	}
	public String getTaskStateDesc( ) {
		return this.taskStateDesc;
	}

}
