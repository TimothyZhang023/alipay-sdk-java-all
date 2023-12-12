/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2023-12-12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.api;

import com.alipay.v3.ApiCallback;
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.ApiResponse;
import com.alipay.v3.Configuration;
import com.alipay.v3.Pair;
import com.alipay.v3.ProgressRequestBody;
import com.alipay.v3.ProgressResponseBody;
import com.alipay.v3.util.AlipayLogger;
import com.alipay.v3.util.model.CustomizedParams;

import com.google.common.base.Strings;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.alipay.v3.model.AlipayOpenAgentCommonSignDefaultResponse;
import com.alipay.v3.model.AlipayOpenAgentCommonSignModel;
import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayOpenAgentCommonApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayOpenAgentCommonApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayOpenAgentCommonApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for sign
     * @param appAuthPic  (optional)
     * @param appDemo  (optional)
     * @param appHomeScreenshot  (optional)
     * @param appItemScreenshot  (optional)
     * @param appPayScreenshot  (optional)
     * @param businessLicenseAuthPic  (optional)
     * @param businessLicensePic  (optional)
     * @param data  (optional)
     * @param h5ExtraPic  (optional)
     * @param h5HomeScreenshot  (optional)
     * @param h5ItemScreenshot  (optional)
     * @param h5PayScreenshot  (optional)
     * @param h5SitesLoa  (optional)
     * @param miniAppScreenshot  (optional)
     * @param shopScenePic  (optional)
     * @param shopSignBoardPic  (optional)
     * @param specialLicensePic  (optional)
     * @param webHomeScreenshot  (optional)
     * @param webItemScreenshot  (optional)
     * @param webPayScreenshot  (optional)
     * @param webSitesLoa  (optional)
     * @param _callback Callback for upload/download progress
     * @param customizedParams
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call signCall(File appAuthPic, File appDemo, File appHomeScreenshot, File appItemScreenshot, File appPayScreenshot, File businessLicenseAuthPic, File businessLicensePic, AlipayOpenAgentCommonSignModel data, File h5ExtraPic, File h5HomeScreenshot, File h5ItemScreenshot, File h5PayScreenshot, File h5SitesLoa, File miniAppScreenshot, File shopScenePic, File shopSignBoardPic, File specialLicensePic, File webHomeScreenshot, File webItemScreenshot, File webPayScreenshot, File webSitesLoa, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/agent/common/sign";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (appAuthPic != null) {
            localVarFormParams.put("app_auth_pic", appAuthPic);
        }

        if (appDemo != null) {
            localVarFormParams.put("app_demo", appDemo);
        }

        if (appHomeScreenshot != null) {
            localVarFormParams.put("app_home_screenshot", appHomeScreenshot);
        }

        if (appItemScreenshot != null) {
            localVarFormParams.put("app_item_screenshot", appItemScreenshot);
        }

        if (appPayScreenshot != null) {
            localVarFormParams.put("app_pay_screenshot", appPayScreenshot);
        }

        if (businessLicenseAuthPic != null) {
            localVarFormParams.put("business_license_auth_pic", businessLicenseAuthPic);
        }

        if (businessLicensePic != null) {
            localVarFormParams.put("business_license_pic", businessLicensePic);
        }

        if (data != null) {
            localVarFormParams.put("data", data);
        }
        //自定义body内容
        if (customizedParams != null && !Strings.isNullOrEmpty(customizedParams.getBodyContent())) {
            localVarFormParams.put("data", customizedParams.getBodyContent());
        }

        if (h5ExtraPic != null) {
            localVarFormParams.put("h_5_extra_pic", h5ExtraPic);
        }

        if (h5HomeScreenshot != null) {
            localVarFormParams.put("h_5_home_screenshot", h5HomeScreenshot);
        }

        if (h5ItemScreenshot != null) {
            localVarFormParams.put("h_5_item_screenshot", h5ItemScreenshot);
        }

        if (h5PayScreenshot != null) {
            localVarFormParams.put("h_5_pay_screenshot", h5PayScreenshot);
        }

        if (h5SitesLoa != null) {
            localVarFormParams.put("h_5_sites_loa", h5SitesLoa);
        }

        if (miniAppScreenshot != null) {
            localVarFormParams.put("mini_app_screenshot", miniAppScreenshot);
        }

        if (shopScenePic != null) {
            localVarFormParams.put("shop_scene_pic", shopScenePic);
        }

        if (shopSignBoardPic != null) {
            localVarFormParams.put("shop_sign_board_pic", shopSignBoardPic);
        }

        if (specialLicensePic != null) {
            localVarFormParams.put("special_license_pic", specialLicensePic);
        }

        if (webHomeScreenshot != null) {
            localVarFormParams.put("web_home_screenshot", webHomeScreenshot);
        }

        if (webItemScreenshot != null) {
            localVarFormParams.put("web_item_screenshot", webItemScreenshot);
        }

        if (webPayScreenshot != null) {
            localVarFormParams.put("web_pay_screenshot", webPayScreenshot);
        }

        if (webSitesLoa != null) {
            localVarFormParams.put("web_sites_loa", webSitesLoa);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        if (customizedParams != null) {
            //额外query参数
            if (customizedParams.getQueryParams() != null && customizedParams.getQueryParams().size() > 0) {
                for (Map.Entry<String, String> entry : customizedParams.getQueryParams().entrySet()) {
                    localVarQueryParams.addAll(localVarApiClient.parameterToPair(entry.getKey(), entry.getValue()));
                }
            }

            if (!Strings.isNullOrEmpty(customizedParams.getAppAuthToken())) {
                localVarHeaderParams.put("alipay-app-auth-token", customizedParams.getAppAuthToken());
            }

            //额外非全局header参数
            if (customizedParams.getHeaderParams() != null && customizedParams.getHeaderParams().size() > 0) {
                localVarHeaderParams.putAll(customizedParams.getHeaderParams());
            }
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call signValidateBeforeCall(File appAuthPic, File appDemo, File appHomeScreenshot, File appItemScreenshot, File appPayScreenshot, File businessLicenseAuthPic, File businessLicensePic, AlipayOpenAgentCommonSignModel data, File h5ExtraPic, File h5HomeScreenshot, File h5ItemScreenshot, File h5PayScreenshot, File h5SitesLoa, File miniAppScreenshot, File shopScenePic, File shopSignBoardPic, File specialLicensePic, File webHomeScreenshot, File webItemScreenshot, File webPayScreenshot, File webSitesLoa, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = signCall(appAuthPic, appDemo, appHomeScreenshot, appItemScreenshot, appPayScreenshot, businessLicenseAuthPic, businessLicensePic, data, h5ExtraPic, h5HomeScreenshot, h5ItemScreenshot, h5PayScreenshot, h5SitesLoa, miniAppScreenshot, shopScenePic, shopSignBoardPic, specialLicensePic, webHomeScreenshot, webItemScreenshot, webPayScreenshot, webSitesLoa, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 代签约产品通用接口
     * 三方应用代理签约产品，需要配合开启事务接口使用
     * @param appAuthPic  (optional)
     * @param appDemo  (optional)
     * @param appHomeScreenshot  (optional)
     * @param appItemScreenshot  (optional)
     * @param appPayScreenshot  (optional)
     * @param businessLicenseAuthPic  (optional)
     * @param businessLicensePic  (optional)
     * @param data  (optional)
     * @param h5ExtraPic  (optional)
     * @param h5HomeScreenshot  (optional)
     * @param h5ItemScreenshot  (optional)
     * @param h5PayScreenshot  (optional)
     * @param h5SitesLoa  (optional)
     * @param miniAppScreenshot  (optional)
     * @param shopScenePic  (optional)
     * @param shopSignBoardPic  (optional)
     * @param specialLicensePic  (optional)
     * @param webHomeScreenshot  (optional)
     * @param webItemScreenshot  (optional)
     * @param webPayScreenshot  (optional)
     * @param webSitesLoa  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public Object sign(File appAuthPic, File appDemo, File appHomeScreenshot, File appItemScreenshot, File appPayScreenshot, File businessLicenseAuthPic, File businessLicensePic, AlipayOpenAgentCommonSignModel data, File h5ExtraPic, File h5HomeScreenshot, File h5ItemScreenshot, File h5PayScreenshot, File h5SitesLoa, File miniAppScreenshot, File shopScenePic, File shopSignBoardPic, File specialLicensePic, File webHomeScreenshot, File webItemScreenshot, File webPayScreenshot, File webSitesLoa) throws ApiException {
        ApiResponse<Object> localVarResp = signWithHttpInfo(appAuthPic, appDemo, appHomeScreenshot, appItemScreenshot, appPayScreenshot, businessLicenseAuthPic, businessLicensePic, data, h5ExtraPic, h5HomeScreenshot, h5ItemScreenshot, h5PayScreenshot, h5SitesLoa, miniAppScreenshot, shopScenePic, shopSignBoardPic, specialLicensePic, webHomeScreenshot, webItemScreenshot, webPayScreenshot, webSitesLoa, null);
        return localVarResp.getData();
    }

    public Object sign(File appAuthPic, File appDemo, File appHomeScreenshot, File appItemScreenshot, File appPayScreenshot, File businessLicenseAuthPic, File businessLicensePic, AlipayOpenAgentCommonSignModel data, File h5ExtraPic, File h5HomeScreenshot, File h5ItemScreenshot, File h5PayScreenshot, File h5SitesLoa, File miniAppScreenshot, File shopScenePic, File shopSignBoardPic, File specialLicensePic, File webHomeScreenshot, File webItemScreenshot, File webPayScreenshot, File webSitesLoa, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<Object> localVarResp = signWithHttpInfo(appAuthPic, appDemo, appHomeScreenshot, appItemScreenshot, appPayScreenshot, businessLicenseAuthPic, businessLicensePic, data, h5ExtraPic, h5HomeScreenshot, h5ItemScreenshot, h5PayScreenshot, h5SitesLoa, miniAppScreenshot, shopScenePic, shopSignBoardPic, specialLicensePic, webHomeScreenshot, webItemScreenshot, webPayScreenshot, webSitesLoa, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 代签约产品通用接口
     * 三方应用代理签约产品，需要配合开启事务接口使用
     * @param appAuthPic  (optional)
     * @param appDemo  (optional)
     * @param appHomeScreenshot  (optional)
     * @param appItemScreenshot  (optional)
     * @param appPayScreenshot  (optional)
     * @param businessLicenseAuthPic  (optional)
     * @param businessLicensePic  (optional)
     * @param data  (optional)
     * @param h5ExtraPic  (optional)
     * @param h5HomeScreenshot  (optional)
     * @param h5ItemScreenshot  (optional)
     * @param h5PayScreenshot  (optional)
     * @param h5SitesLoa  (optional)
     * @param miniAppScreenshot  (optional)
     * @param shopScenePic  (optional)
     * @param shopSignBoardPic  (optional)
     * @param specialLicensePic  (optional)
     * @param webHomeScreenshot  (optional)
     * @param webItemScreenshot  (optional)
     * @param webPayScreenshot  (optional)
     * @param webSitesLoa  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> signWithHttpInfo(File appAuthPic, File appDemo, File appHomeScreenshot, File appItemScreenshot, File appPayScreenshot, File businessLicenseAuthPic, File businessLicensePic, AlipayOpenAgentCommonSignModel data, File h5ExtraPic, File h5HomeScreenshot, File h5ItemScreenshot, File h5PayScreenshot, File h5SitesLoa, File miniAppScreenshot, File shopScenePic, File shopSignBoardPic, File specialLicensePic, File webHomeScreenshot, File webItemScreenshot, File webPayScreenshot, File webSitesLoa, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = signValidateBeforeCall(appAuthPic, appDemo, appHomeScreenshot, appItemScreenshot, appPayScreenshot, businessLicenseAuthPic, businessLicensePic, data, h5ExtraPic, h5HomeScreenshot, h5ItemScreenshot, h5PayScreenshot, h5SitesLoa, miniAppScreenshot, shopScenePic, shopSignBoardPic, specialLicensePic, webHomeScreenshot, webItemScreenshot, webPayScreenshot, webSitesLoa, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<Object>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenAgentCommonSignDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 代签约产品通用接口 (asynchronously)
     * 三方应用代理签约产品，需要配合开启事务接口使用
     * @param appAuthPic  (optional)
     * @param appDemo  (optional)
     * @param appHomeScreenshot  (optional)
     * @param appItemScreenshot  (optional)
     * @param appPayScreenshot  (optional)
     * @param businessLicenseAuthPic  (optional)
     * @param businessLicensePic  (optional)
     * @param data  (optional)
     * @param h5ExtraPic  (optional)
     * @param h5HomeScreenshot  (optional)
     * @param h5ItemScreenshot  (optional)
     * @param h5PayScreenshot  (optional)
     * @param h5SitesLoa  (optional)
     * @param miniAppScreenshot  (optional)
     * @param shopScenePic  (optional)
     * @param shopSignBoardPic  (optional)
     * @param specialLicensePic  (optional)
     * @param webHomeScreenshot  (optional)
     * @param webItemScreenshot  (optional)
     * @param webPayScreenshot  (optional)
     * @param webSitesLoa  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call signAsync(File appAuthPic, File appDemo, File appHomeScreenshot, File appItemScreenshot, File appPayScreenshot, File businessLicenseAuthPic, File businessLicensePic, AlipayOpenAgentCommonSignModel data, File h5ExtraPic, File h5HomeScreenshot, File h5ItemScreenshot, File h5PayScreenshot, File h5SitesLoa, File miniAppScreenshot, File shopScenePic, File shopSignBoardPic, File specialLicensePic, File webHomeScreenshot, File webItemScreenshot, File webPayScreenshot, File webSitesLoa, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = signValidateBeforeCall(appAuthPic, appDemo, appHomeScreenshot, appItemScreenshot, appPayScreenshot, businessLicenseAuthPic, businessLicensePic, data, h5ExtraPic, h5HomeScreenshot, h5ItemScreenshot, h5PayScreenshot, h5SitesLoa, miniAppScreenshot, shopScenePic, shopSignBoardPic, specialLicensePic, webHomeScreenshot, webItemScreenshot, webPayScreenshot, webSitesLoa, _callback, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call signAsync(File appAuthPic, File appDemo, File appHomeScreenshot, File appItemScreenshot, File appPayScreenshot, File businessLicenseAuthPic, File businessLicensePic, AlipayOpenAgentCommonSignModel data, File h5ExtraPic, File h5HomeScreenshot, File h5ItemScreenshot, File h5PayScreenshot, File h5SitesLoa, File miniAppScreenshot, File shopScenePic, File shopSignBoardPic, File specialLicensePic, File webHomeScreenshot, File webItemScreenshot, File webPayScreenshot, File webSitesLoa, final ApiCallback<Object> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = signValidateBeforeCall(appAuthPic, appDemo, appHomeScreenshot, appItemScreenshot, appPayScreenshot, businessLicenseAuthPic, businessLicensePic, data, h5ExtraPic, h5HomeScreenshot, h5ItemScreenshot, h5PayScreenshot, h5SitesLoa, miniAppScreenshot, shopScenePic, shopSignBoardPic, specialLicensePic, webHomeScreenshot, webItemScreenshot, webPayScreenshot, webSitesLoa, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
