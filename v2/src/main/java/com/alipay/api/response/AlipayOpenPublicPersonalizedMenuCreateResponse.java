package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.personalized.menu.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:36
 */
public class AlipayOpenPublicPersonalizedMenuCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1771458444565431754L;

	/** 
	 * 该套个性化菜单key
	 */
	@ApiField("menu_key")
	private String menuKey;

	public void setMenuKey(String menuKey) {
		this.menuKey = menuKey;
	}
	public String getMenuKey( ) {
		return this.menuKey;
	}

}
