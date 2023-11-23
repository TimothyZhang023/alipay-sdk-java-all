package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应链商品属性描述信息
 *
 * @author auto create
 * @since 1.0, 2023-11-20 16:06:32
 */
public class SupplierItemAttrField extends AlipayObject {

	private static final long serialVersionUID = 6386743733464278591L;

	/**
	 * 属性CODE
	 */
	@ApiField("field_code")
	private String fieldCode;

	/**
	 * 属性名称描述
	 */
	@ApiField("field_name")
	private String fieldName;

	/**
	 * 属性值
	 */
	@ApiField("field_val")
	private String fieldVal;

	public String getFieldCode() {
		return this.fieldCode;
	}
	public void setFieldCode(String fieldCode) {
		this.fieldCode = fieldCode;
	}

	public String getFieldName() {
		return this.fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldVal() {
		return this.fieldVal;
	}
	public void setFieldVal(String fieldVal) {
		this.fieldVal = fieldVal;
	}

}
