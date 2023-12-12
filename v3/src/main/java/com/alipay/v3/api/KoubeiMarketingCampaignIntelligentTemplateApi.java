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


import com.alipay.v3.model.KoubeiMarketingCampaignIntelligentTemplateConsultDefaultResponse;
import com.alipay.v3.model.KoubeiMarketingCampaignIntelligentTemplateConsultModel;
import com.alipay.v3.model.KoubeiMarketingCampaignIntelligentTemplateConsultResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class KoubeiMarketingCampaignIntelligentTemplateApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public KoubeiMarketingCampaignIntelligentTemplateApi() {
        this(Configuration.getDefaultApiClient());
    }

    public KoubeiMarketingCampaignIntelligentTemplateApi(ApiClient apiClient) {
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
     * Build call for consult
     * @param koubeiMarketingCampaignIntelligentTemplateConsultModel  (optional)
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
    public okhttp3.Call consultCall(KoubeiMarketingCampaignIntelligentTemplateConsultModel koubeiMarketingCampaignIntelligentTemplateConsultModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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

        Object localVarPostBody = (customizedParams != null && !Strings.isNullOrEmpty(customizedParams.getBodyContent()))
                ? customizedParams.getBodyContent() : koubeiMarketingCampaignIntelligentTemplateConsultModel;

        // create path and map variables
        String localVarPath = "/v3/koubei/marketing/campaign/intelligent/template/consult";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
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
    private okhttp3.Call consultValidateBeforeCall(KoubeiMarketingCampaignIntelligentTemplateConsultModel koubeiMarketingCampaignIntelligentTemplateConsultModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = consultCall(koubeiMarketingCampaignIntelligentTemplateConsultModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 智能营销模板咨询
     * 咨询可使用的智能营销模板
     * @param koubeiMarketingCampaignIntelligentTemplateConsultModel  (optional)
     * @return KoubeiMarketingCampaignIntelligentTemplateConsultResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public KoubeiMarketingCampaignIntelligentTemplateConsultResponseModel consult(KoubeiMarketingCampaignIntelligentTemplateConsultModel koubeiMarketingCampaignIntelligentTemplateConsultModel) throws ApiException {
        ApiResponse<KoubeiMarketingCampaignIntelligentTemplateConsultResponseModel> localVarResp = consultWithHttpInfo(koubeiMarketingCampaignIntelligentTemplateConsultModel, null);
        return localVarResp.getData();
    }

    public KoubeiMarketingCampaignIntelligentTemplateConsultResponseModel consult(KoubeiMarketingCampaignIntelligentTemplateConsultModel koubeiMarketingCampaignIntelligentTemplateConsultModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<KoubeiMarketingCampaignIntelligentTemplateConsultResponseModel> localVarResp = consultWithHttpInfo(koubeiMarketingCampaignIntelligentTemplateConsultModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 智能营销模板咨询
     * 咨询可使用的智能营销模板
     * @param koubeiMarketingCampaignIntelligentTemplateConsultModel  (optional)
     * @return ApiResponse&lt;KoubeiMarketingCampaignIntelligentTemplateConsultResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<KoubeiMarketingCampaignIntelligentTemplateConsultResponseModel> consultWithHttpInfo(KoubeiMarketingCampaignIntelligentTemplateConsultModel koubeiMarketingCampaignIntelligentTemplateConsultModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = consultValidateBeforeCall(koubeiMarketingCampaignIntelligentTemplateConsultModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<KoubeiMarketingCampaignIntelligentTemplateConsultResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<KoubeiMarketingCampaignIntelligentTemplateConsultDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 智能营销模板咨询 (asynchronously)
     * 咨询可使用的智能营销模板
     * @param koubeiMarketingCampaignIntelligentTemplateConsultModel  (optional)
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
    public okhttp3.Call consultAsync(KoubeiMarketingCampaignIntelligentTemplateConsultModel koubeiMarketingCampaignIntelligentTemplateConsultModel, final ApiCallback<KoubeiMarketingCampaignIntelligentTemplateConsultResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = consultValidateBeforeCall(koubeiMarketingCampaignIntelligentTemplateConsultModel, _callback, null);
        Type localVarReturnType = new TypeToken<KoubeiMarketingCampaignIntelligentTemplateConsultResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call consultAsync(KoubeiMarketingCampaignIntelligentTemplateConsultModel koubeiMarketingCampaignIntelligentTemplateConsultModel, final ApiCallback<KoubeiMarketingCampaignIntelligentTemplateConsultResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = consultValidateBeforeCall(koubeiMarketingCampaignIntelligentTemplateConsultModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<KoubeiMarketingCampaignIntelligentTemplateConsultResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
