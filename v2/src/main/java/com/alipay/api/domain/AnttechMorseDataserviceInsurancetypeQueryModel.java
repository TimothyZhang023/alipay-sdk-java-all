package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社保缴纳类型查询
 *
 * @author auto create
 * @since 1.0, 2024-03-11 18:14:18
 */
public class AnttechMorseDataserviceInsurancetypeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2735323521837713772L;

	/**
	 * id_card_sha256标识用户唯一信息，通过用户身份证号SHA256 哈希后获得
	 */
	@ApiField("id_card_sha_256")
	private String idCardSha256;

	public String getIdCardSha256() {
		return this.idCardSha256;
	}
	public void setIdCardSha256(String idCardSha256) {
		this.idCardSha256 = idCardSha256;
	}

}
