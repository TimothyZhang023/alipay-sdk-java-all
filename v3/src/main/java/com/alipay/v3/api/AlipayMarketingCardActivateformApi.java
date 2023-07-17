/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2023-07-17
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


import com.alipay.v3.model.AlipayMarketingCardActivateformQueryDefaultResponse;
import com.alipay.v3.model.AlipayMarketingCardActivateformQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayMarketingCardActivateformApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayMarketingCardActivateformApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayMarketingCardActivateformApi(ApiClient apiClient) {
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
     * Build call for query
     * @param authToken 用户授权令牌 (optional)
     * @param bizType 开放表单信息查询业务类型，可选类型如下： MEMBER_CARD ：商家会员卡开卡 (optional)
     * @param templateId 会员卡模板id。使用会员卡模板创建接口(alipay.marketing.card.template.create)返回的结果 (optional)
     * @param requestId 查询用户表单提交信息的请求id。  网页移动应用&amp;小程序应用：与auth_code 一起通过alipay.marketing.card.activateurl.apply(获取会员卡领卡投放链接)接口callback地址回传。  注意：auth_code（用户授权码）用于换取用户授权令牌 accessToken，后续调用接口需传入accessToken。 (optional)
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
    public okhttp3.Call queryCall(String authToken, String bizType, String templateId, String requestId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/marketing/card/activateform/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (authToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("auth_token", authToken));
        }

        if (bizType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("biz_type", bizType));
        }

        if (templateId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("template_id", templateId));
        }

        if (requestId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("request_id", requestId));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call queryValidateBeforeCall(String authToken, String bizType, String templateId, String requestId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(authToken, bizType, templateId, requestId, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询用户提交的会员卡表单信息
     * 会员卡开卡场景下，用户确认领卡后，跳转到商户开卡处理页面，商户通过该接口查询用户表单信息。
     * @param authToken 用户授权令牌 (optional)
     * @param bizType 开放表单信息查询业务类型，可选类型如下： MEMBER_CARD ：商家会员卡开卡 (optional)
     * @param templateId 会员卡模板id。使用会员卡模板创建接口(alipay.marketing.card.template.create)返回的结果 (optional)
     * @param requestId 查询用户表单提交信息的请求id。  网页移动应用&amp;小程序应用：与auth_code 一起通过alipay.marketing.card.activateurl.apply(获取会员卡领卡投放链接)接口callback地址回传。  注意：auth_code（用户授权码）用于换取用户授权令牌 accessToken，后续调用接口需传入accessToken。 (optional)
     * @return AlipayMarketingCardActivateformQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayMarketingCardActivateformQueryResponseModel query(String authToken, String bizType, String templateId, String requestId) throws ApiException {
        ApiResponse<AlipayMarketingCardActivateformQueryResponseModel> localVarResp = queryWithHttpInfo(authToken, bizType, templateId, requestId, null);
        return localVarResp.getData();
    }

    public AlipayMarketingCardActivateformQueryResponseModel query(String authToken, String bizType, String templateId, String requestId, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayMarketingCardActivateformQueryResponseModel> localVarResp = queryWithHttpInfo(authToken, bizType, templateId, requestId, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询用户提交的会员卡表单信息
     * 会员卡开卡场景下，用户确认领卡后，跳转到商户开卡处理页面，商户通过该接口查询用户表单信息。
     * @param authToken 用户授权令牌 (optional)
     * @param bizType 开放表单信息查询业务类型，可选类型如下： MEMBER_CARD ：商家会员卡开卡 (optional)
     * @param templateId 会员卡模板id。使用会员卡模板创建接口(alipay.marketing.card.template.create)返回的结果 (optional)
     * @param requestId 查询用户表单提交信息的请求id。  网页移动应用&amp;小程序应用：与auth_code 一起通过alipay.marketing.card.activateurl.apply(获取会员卡领卡投放链接)接口callback地址回传。  注意：auth_code（用户授权码）用于换取用户授权令牌 accessToken，后续调用接口需传入accessToken。 (optional)
     * @return ApiResponse&lt;AlipayMarketingCardActivateformQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayMarketingCardActivateformQueryResponseModel> queryWithHttpInfo(String authToken, String bizType, String templateId, String requestId, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(authToken, bizType, templateId, requestId, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayMarketingCardActivateformQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMarketingCardActivateformQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询用户提交的会员卡表单信息 (asynchronously)
     * 会员卡开卡场景下，用户确认领卡后，跳转到商户开卡处理页面，商户通过该接口查询用户表单信息。
     * @param authToken 用户授权令牌 (optional)
     * @param bizType 开放表单信息查询业务类型，可选类型如下： MEMBER_CARD ：商家会员卡开卡 (optional)
     * @param templateId 会员卡模板id。使用会员卡模板创建接口(alipay.marketing.card.template.create)返回的结果 (optional)
     * @param requestId 查询用户表单提交信息的请求id。  网页移动应用&amp;小程序应用：与auth_code 一起通过alipay.marketing.card.activateurl.apply(获取会员卡领卡投放链接)接口callback地址回传。  注意：auth_code（用户授权码）用于换取用户授权令牌 accessToken，后续调用接口需传入accessToken。 (optional)
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
    public okhttp3.Call queryAsync(String authToken, String bizType, String templateId, String requestId, final ApiCallback<AlipayMarketingCardActivateformQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(authToken, bizType, templateId, requestId, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayMarketingCardActivateformQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String authToken, String bizType, String templateId, String requestId, final ApiCallback<AlipayMarketingCardActivateformQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(authToken, bizType, templateId, requestId, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayMarketingCardActivateformQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
