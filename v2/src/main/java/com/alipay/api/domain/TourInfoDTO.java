package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单出游信息
 *
 * @author auto create
 * @since 1.0, 2024-04-18 21:19:15
 */
public class TourInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5623521414556538838L;

	/**
	 * 始发地
	 */
	@ApiField("from_location")
	private String fromLocation;

	/**
	 * 出游套餐信息
	 */
	@ApiField("package_info")
	private TourPackageInfoDTO packageInfo;

	/**
	 * 目的地
	 */
	@ApiField("to_location")
	private String toLocation;

	public String getFromLocation() {
		return this.fromLocation;
	}
	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public TourPackageInfoDTO getPackageInfo() {
		return this.packageInfo;
	}
	public void setPackageInfo(TourPackageInfoDTO packageInfo) {
		this.packageInfo = packageInfo;
	}

	public String getToLocation() {
		return this.toLocation;
	}
	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

}
