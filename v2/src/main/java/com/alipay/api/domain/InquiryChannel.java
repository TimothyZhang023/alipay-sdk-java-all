package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医生在线问诊渠道（问诊方式，价格，服务链接）
 *
 * @author auto create
 * @since 1.0, 2024-06-25 15:02:50
 */
public class InquiryChannel extends AlipayObject {

	private static final long serialVersionUID = 4659941891536248444L;

	/**
	 * 问诊医生排班信息列表
	 */
	@ApiListField("inquiry_doctor_shift_case_list")
	@ApiField("inquiry_doctor_shift_case_data")
	private List<InquiryDoctorShiftCaseData> inquiryDoctorShiftCaseList;

	/**
	 * 问诊方式：IMAGE_INQUIRY(图文问诊)/PHONE_INQUIRY(电话问诊)/VEDIO_INQUIRY(视频问诊)
	 */
	@ApiField("inquiry_mode")
	private String inquiryMode;

	/**
	 * 问诊价格（中间必须有小数点，后面两位小数），单位元
	 */
	@ApiField("inquiry_price")
	private String inquiryPrice;

	/**
	 * 问诊类型
	 */
	@ApiField("inquiry_type")
	private String inquiryType;

	/**
	 * 问诊方式对应服务链接
	 */
	@ApiField("inquiry_url")
	private String inquiryUrl;

	/**
	 * 是否为预约制
若不填，则默认为否
	 */
	@ApiField("register_flag")
	private Boolean registerFlag;

	public List<InquiryDoctorShiftCaseData> getInquiryDoctorShiftCaseList() {
		return this.inquiryDoctorShiftCaseList;
	}
	public void setInquiryDoctorShiftCaseList(List<InquiryDoctorShiftCaseData> inquiryDoctorShiftCaseList) {
		this.inquiryDoctorShiftCaseList = inquiryDoctorShiftCaseList;
	}

	public String getInquiryMode() {
		return this.inquiryMode;
	}
	public void setInquiryMode(String inquiryMode) {
		this.inquiryMode = inquiryMode;
	}

	public String getInquiryPrice() {
		return this.inquiryPrice;
	}
	public void setInquiryPrice(String inquiryPrice) {
		this.inquiryPrice = inquiryPrice;
	}

	public String getInquiryType() {
		return this.inquiryType;
	}
	public void setInquiryType(String inquiryType) {
		this.inquiryType = inquiryType;
	}

	public String getInquiryUrl() {
		return this.inquiryUrl;
	}
	public void setInquiryUrl(String inquiryUrl) {
		this.inquiryUrl = inquiryUrl;
	}

	public Boolean getRegisterFlag() {
		return this.registerFlag;
	}
	public void setRegisterFlag(Boolean registerFlag) {
		this.registerFlag = registerFlag;
	}

}
