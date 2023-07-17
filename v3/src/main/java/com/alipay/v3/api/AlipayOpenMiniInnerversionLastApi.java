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


import com.alipay.v3.model.AlipayOpenMiniInnerversionLastQueryDefaultResponse;
import com.alipay.v3.model.AlipayOpenMiniInnerversionLastQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayOpenMiniInnerversionLastApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayOpenMiniInnerversionLastApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayOpenMiniInnerversionLastApi(ApiClient apiClient) {
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
     * @param miniAppId 小程序ID，仅特殊场景使用，普通业务方无需关注该参数。 (optional)
     * @param bundleId 端信息 (optional)
     * @param appOrigin 业务来源场景 (optional)
     * @param pid 小程序主体 (optional)
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
    public okhttp3.Call queryCall(String miniAppId, String bundleId, String appOrigin, String pid, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/open/mini/innerversion/last/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (miniAppId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("mini_app_id", miniAppId));
        }

        if (bundleId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("bundle_id", bundleId));
        }

        if (appOrigin != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("app_origin", appOrigin));
        }

        if (pid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pid", pid));
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
    private okhttp3.Call queryValidateBeforeCall(String miniAppId, String bundleId, String appOrigin, String pid, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(miniAppId, bundleId, appOrigin, pid, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 内部链路查询最新版本号
     * 针对一二方场景的开发者，小程序提供一套统一的内部能力体系，定向输出赋能，本接口主要用于查询最新版本号 
     * @param miniAppId 小程序ID，仅特殊场景使用，普通业务方无需关注该参数。 (optional)
     * @param bundleId 端信息 (optional)
     * @param appOrigin 业务来源场景 (optional)
     * @param pid 小程序主体 (optional)
     * @return AlipayOpenMiniInnerversionLastQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenMiniInnerversionLastQueryResponseModel query(String miniAppId, String bundleId, String appOrigin, String pid) throws ApiException {
        ApiResponse<AlipayOpenMiniInnerversionLastQueryResponseModel> localVarResp = queryWithHttpInfo(miniAppId, bundleId, appOrigin, pid, null);
        return localVarResp.getData();
    }

    public AlipayOpenMiniInnerversionLastQueryResponseModel query(String miniAppId, String bundleId, String appOrigin, String pid, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenMiniInnerversionLastQueryResponseModel> localVarResp = queryWithHttpInfo(miniAppId, bundleId, appOrigin, pid, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 内部链路查询最新版本号
     * 针对一二方场景的开发者，小程序提供一套统一的内部能力体系，定向输出赋能，本接口主要用于查询最新版本号 
     * @param miniAppId 小程序ID，仅特殊场景使用，普通业务方无需关注该参数。 (optional)
     * @param bundleId 端信息 (optional)
     * @param appOrigin 业务来源场景 (optional)
     * @param pid 小程序主体 (optional)
     * @return ApiResponse&lt;AlipayOpenMiniInnerversionLastQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenMiniInnerversionLastQueryResponseModel> queryWithHttpInfo(String miniAppId, String bundleId, String appOrigin, String pid, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(miniAppId, bundleId, appOrigin, pid, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenMiniInnerversionLastQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenMiniInnerversionLastQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 内部链路查询最新版本号 (asynchronously)
     * 针对一二方场景的开发者，小程序提供一套统一的内部能力体系，定向输出赋能，本接口主要用于查询最新版本号 
     * @param miniAppId 小程序ID，仅特殊场景使用，普通业务方无需关注该参数。 (optional)
     * @param bundleId 端信息 (optional)
     * @param appOrigin 业务来源场景 (optional)
     * @param pid 小程序主体 (optional)
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
    public okhttp3.Call queryAsync(String miniAppId, String bundleId, String appOrigin, String pid, final ApiCallback<AlipayOpenMiniInnerversionLastQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(miniAppId, bundleId, appOrigin, pid, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenMiniInnerversionLastQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String miniAppId, String bundleId, String appOrigin, String pid, final ApiCallback<AlipayOpenMiniInnerversionLastQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(miniAppId, bundleId, appOrigin, pid, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenMiniInnerversionLastQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
