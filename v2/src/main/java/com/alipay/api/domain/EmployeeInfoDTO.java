package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 员工信息
 *
 * @author auto create
 * @since 1.0, 2023-04-03 19:18:09
 */
public class EmployeeInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8228977517336272136L;

	/**
	 * 是否激活
	 */
	@ApiField("activate")
	private String activate;

	/**
	 * 员工所属部门列表
	 */
	@ApiListField("department_list")
	@ApiField("employee_department_d_t_o")
	private List<EmployeeDepartmentDTO> departmentList;

	/**
	 * 邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 员工id
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 员工姓名
	 */
	@ApiField("employee_name")
	private String employeeName;

	/**
	 * 员工工号
	 */
	@ApiField("employee_no")
	private String employeeNo;

	/**
	 * 变更时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 变更时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 员工是否人脸在库
	 */
	@ApiField("iot_face_status")
	private String iotFaceStatus;

	/**
	 * 员工在企业人脸库的人脸唯一标识
	 */
	@ApiField("iot_vid")
	private String iotVid;

	/**
	 * 手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 角色列表
	 */
	@ApiListField("role_list")
	@ApiField("string")
	private List<String> roleList;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivate() {
		return this.activate;
	}
	public void setActivate(String activate) {
		this.activate = activate;
	}

	public List<EmployeeDepartmentDTO> getDepartmentList() {
		return this.departmentList;
	}
	public void setDepartmentList(List<EmployeeDepartmentDTO> departmentList) {
		this.departmentList = departmentList;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return this.employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeNo() {
		return this.employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getIotFaceStatus() {
		return this.iotFaceStatus;
	}
	public void setIotFaceStatus(String iotFaceStatus) {
		this.iotFaceStatus = iotFaceStatus;
	}

	public String getIotVid() {
		return this.iotVid;
	}
	public void setIotVid(String iotVid) {
		this.iotVid = iotVid;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<String> getRoleList() {
		return this.roleList;
	}
	public void setRoleList(List<String> roleList) {
		this.roleList = roleList;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
