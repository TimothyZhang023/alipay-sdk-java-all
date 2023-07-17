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


import com.alipay.v3.model.AlipayOpenPublicQrcodeCreateDefaultResponse;
import com.alipay.v3.model.AlipayOpenPublicQrcodeCreateModel;
import com.alipay.v3.model.AlipayOpenPublicQrcodeCreateResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayOpenPublicQrcodeApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayOpenPublicQrcodeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayOpenPublicQrcodeApi(ApiClient apiClient) {
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
     * Build call for create
     * @param alipayOpenPublicQrcodeCreateModel  (optional)
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
    public okhttp3.Call createCall(AlipayOpenPublicQrcodeCreateModel alipayOpenPublicQrcodeCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOpenPublicQrcodeCreateModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/public/qrcode/create";

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
    private okhttp3.Call createValidateBeforeCall(AlipayOpenPublicQrcodeCreateModel alipayOpenPublicQrcodeCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = createCall(alipayOpenPublicQrcodeCreateModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 带参推广二维码接口
     * 为了满足用户渠道推广分析的需要，公众平台提供了生成带参数二维码的接口。使用该接口可以获得多个带不同场景值的二维码，用户扫描后，公众号可以接收到事件推送。目前有2种类型的二维码，分别是临时二维码、和永久二维码，前者有过期时间，最大为1800秒。 每次创建二维码ticket需要提供一个开发者自行设定的参数（scene_id）。
     * @param alipayOpenPublicQrcodeCreateModel  (optional)
     * @return AlipayOpenPublicQrcodeCreateResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenPublicQrcodeCreateResponseModel create(AlipayOpenPublicQrcodeCreateModel alipayOpenPublicQrcodeCreateModel) throws ApiException {
        ApiResponse<AlipayOpenPublicQrcodeCreateResponseModel> localVarResp = createWithHttpInfo(alipayOpenPublicQrcodeCreateModel, null);
        return localVarResp.getData();
    }

    public AlipayOpenPublicQrcodeCreateResponseModel create(AlipayOpenPublicQrcodeCreateModel alipayOpenPublicQrcodeCreateModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenPublicQrcodeCreateResponseModel> localVarResp = createWithHttpInfo(alipayOpenPublicQrcodeCreateModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 带参推广二维码接口
     * 为了满足用户渠道推广分析的需要，公众平台提供了生成带参数二维码的接口。使用该接口可以获得多个带不同场景值的二维码，用户扫描后，公众号可以接收到事件推送。目前有2种类型的二维码，分别是临时二维码、和永久二维码，前者有过期时间，最大为1800秒。 每次创建二维码ticket需要提供一个开发者自行设定的参数（scene_id）。
     * @param alipayOpenPublicQrcodeCreateModel  (optional)
     * @return ApiResponse&lt;AlipayOpenPublicQrcodeCreateResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenPublicQrcodeCreateResponseModel> createWithHttpInfo(AlipayOpenPublicQrcodeCreateModel alipayOpenPublicQrcodeCreateModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(alipayOpenPublicQrcodeCreateModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenPublicQrcodeCreateResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenPublicQrcodeCreateDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 带参推广二维码接口 (asynchronously)
     * 为了满足用户渠道推广分析的需要，公众平台提供了生成带参数二维码的接口。使用该接口可以获得多个带不同场景值的二维码，用户扫描后，公众号可以接收到事件推送。目前有2种类型的二维码，分别是临时二维码、和永久二维码，前者有过期时间，最大为1800秒。 每次创建二维码ticket需要提供一个开发者自行设定的参数（scene_id）。
     * @param alipayOpenPublicQrcodeCreateModel  (optional)
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
    public okhttp3.Call createAsync(AlipayOpenPublicQrcodeCreateModel alipayOpenPublicQrcodeCreateModel, final ApiCallback<AlipayOpenPublicQrcodeCreateResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayOpenPublicQrcodeCreateModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenPublicQrcodeCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call createAsync(AlipayOpenPublicQrcodeCreateModel alipayOpenPublicQrcodeCreateModel, final ApiCallback<AlipayOpenPublicQrcodeCreateResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayOpenPublicQrcodeCreateModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenPublicQrcodeCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
