package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HealthServiceFamilyDoctorDrugDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.familydoctor.item.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 06:31:25
 */
public class AlipayInsSceneFamilydoctorItemBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1112177398672116882L;

	/** 
	 * 药品列表
	 */
	@ApiListField("drugs")
	@ApiField("health_service_family_doctor_drug_d_t_o")
	private List<HealthServiceFamilyDoctorDrugDTO> drugs;

	public void setDrugs(List<HealthServiceFamilyDoctorDrugDTO> drugs) {
		this.drugs = drugs;
	}
	public List<HealthServiceFamilyDoctorDrugDTO> getDrugs( ) {
		return this.drugs;
	}

}
