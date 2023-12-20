/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2023-12-20
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


import com.alipay.v3.model.AlipayOpenMiniTipsDeliveryBatchqueryDefaultResponse;
import com.alipay.v3.model.AlipayOpenMiniTipsDeliveryBatchqueryModel;
import com.alipay.v3.model.AlipayOpenMiniTipsDeliveryBatchqueryResponseModel;
import com.alipay.v3.model.AlipayOpenMiniTipsDeliveryCreateDefaultResponse;
import com.alipay.v3.model.AlipayOpenMiniTipsDeliveryCreateModel;
import com.alipay.v3.model.AlipayOpenMiniTipsDeliveryCreateResponseModel;
import com.alipay.v3.model.AlipayOpenMiniTipsDeliveryModifyDefaultResponse;
import com.alipay.v3.model.AlipayOpenMiniTipsDeliveryModifyModel;
import com.alipay.v3.model.AlipayOpenMiniTipsDeliveryQueryDefaultResponse;
import com.alipay.v3.model.AlipayOpenMiniTipsDeliveryQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayOpenMiniTipsDeliveryApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayOpenMiniTipsDeliveryApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayOpenMiniTipsDeliveryApi(ApiClient apiClient) {
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
     * Build call for batchquery
     * @param alipayOpenMiniTipsDeliveryBatchqueryModel  (optional)
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
    public okhttp3.Call batchqueryCall(AlipayOpenMiniTipsDeliveryBatchqueryModel alipayOpenMiniTipsDeliveryBatchqueryModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOpenMiniTipsDeliveryBatchqueryModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/mini/tips/delivery/batchquery";

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
    private okhttp3.Call batchqueryValidateBeforeCall(AlipayOpenMiniTipsDeliveryBatchqueryModel alipayOpenMiniTipsDeliveryBatchqueryModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = batchqueryCall(alipayOpenMiniTipsDeliveryBatchqueryModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 小程序收藏引导投放活动配置批量查询
     * 小程序收藏引导投放活动配置批量查询接口，获取该小程序下所有活动配置及状态信息。
     * @param alipayOpenMiniTipsDeliveryBatchqueryModel  (optional)
     * @return AlipayOpenMiniTipsDeliveryBatchqueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenMiniTipsDeliveryBatchqueryResponseModel batchquery(AlipayOpenMiniTipsDeliveryBatchqueryModel alipayOpenMiniTipsDeliveryBatchqueryModel) throws ApiException {
        ApiResponse<AlipayOpenMiniTipsDeliveryBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(alipayOpenMiniTipsDeliveryBatchqueryModel, null);
        return localVarResp.getData();
    }

    public AlipayOpenMiniTipsDeliveryBatchqueryResponseModel batchquery(AlipayOpenMiniTipsDeliveryBatchqueryModel alipayOpenMiniTipsDeliveryBatchqueryModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenMiniTipsDeliveryBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(alipayOpenMiniTipsDeliveryBatchqueryModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 小程序收藏引导投放活动配置批量查询
     * 小程序收藏引导投放活动配置批量查询接口，获取该小程序下所有活动配置及状态信息。
     * @param alipayOpenMiniTipsDeliveryBatchqueryModel  (optional)
     * @return ApiResponse&lt;AlipayOpenMiniTipsDeliveryBatchqueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenMiniTipsDeliveryBatchqueryResponseModel> batchqueryWithHttpInfo(AlipayOpenMiniTipsDeliveryBatchqueryModel alipayOpenMiniTipsDeliveryBatchqueryModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(alipayOpenMiniTipsDeliveryBatchqueryModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenMiniTipsDeliveryBatchqueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenMiniTipsDeliveryBatchqueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 小程序收藏引导投放活动配置批量查询 (asynchronously)
     * 小程序收藏引导投放活动配置批量查询接口，获取该小程序下所有活动配置及状态信息。
     * @param alipayOpenMiniTipsDeliveryBatchqueryModel  (optional)
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
    public okhttp3.Call batchqueryAsync(AlipayOpenMiniTipsDeliveryBatchqueryModel alipayOpenMiniTipsDeliveryBatchqueryModel, final ApiCallback<AlipayOpenMiniTipsDeliveryBatchqueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(alipayOpenMiniTipsDeliveryBatchqueryModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenMiniTipsDeliveryBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call batchqueryAsync(AlipayOpenMiniTipsDeliveryBatchqueryModel alipayOpenMiniTipsDeliveryBatchqueryModel, final ApiCallback<AlipayOpenMiniTipsDeliveryBatchqueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(alipayOpenMiniTipsDeliveryBatchqueryModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenMiniTipsDeliveryBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for create
     * @param alipayOpenMiniTipsDeliveryCreateModel  (optional)
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
    public okhttp3.Call createCall(AlipayOpenMiniTipsDeliveryCreateModel alipayOpenMiniTipsDeliveryCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOpenMiniTipsDeliveryCreateModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/mini/tips/delivery/create";

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
    private okhttp3.Call createValidateBeforeCall(AlipayOpenMiniTipsDeliveryCreateModel alipayOpenMiniTipsDeliveryCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = createCall(alipayOpenMiniTipsDeliveryCreateModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 小程序收藏引导投放活动配置创建
     * 小程序收藏引导投放活动配置创建。通过配置有效的小程序收藏引导（tips）文案，创建小程序收藏引导活动。用户在活动有效期内等于相应页面，将展示配置的个性化文案，帮助用户收藏小程序。请结合您的小程序及页面，配置个性化文案。 
     * @param alipayOpenMiniTipsDeliveryCreateModel  (optional)
     * @return AlipayOpenMiniTipsDeliveryCreateResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenMiniTipsDeliveryCreateResponseModel create(AlipayOpenMiniTipsDeliveryCreateModel alipayOpenMiniTipsDeliveryCreateModel) throws ApiException {
        ApiResponse<AlipayOpenMiniTipsDeliveryCreateResponseModel> localVarResp = createWithHttpInfo(alipayOpenMiniTipsDeliveryCreateModel, null);
        return localVarResp.getData();
    }

    public AlipayOpenMiniTipsDeliveryCreateResponseModel create(AlipayOpenMiniTipsDeliveryCreateModel alipayOpenMiniTipsDeliveryCreateModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenMiniTipsDeliveryCreateResponseModel> localVarResp = createWithHttpInfo(alipayOpenMiniTipsDeliveryCreateModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 小程序收藏引导投放活动配置创建
     * 小程序收藏引导投放活动配置创建。通过配置有效的小程序收藏引导（tips）文案，创建小程序收藏引导活动。用户在活动有效期内等于相应页面，将展示配置的个性化文案，帮助用户收藏小程序。请结合您的小程序及页面，配置个性化文案。 
     * @param alipayOpenMiniTipsDeliveryCreateModel  (optional)
     * @return ApiResponse&lt;AlipayOpenMiniTipsDeliveryCreateResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenMiniTipsDeliveryCreateResponseModel> createWithHttpInfo(AlipayOpenMiniTipsDeliveryCreateModel alipayOpenMiniTipsDeliveryCreateModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(alipayOpenMiniTipsDeliveryCreateModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenMiniTipsDeliveryCreateResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenMiniTipsDeliveryCreateDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 小程序收藏引导投放活动配置创建 (asynchronously)
     * 小程序收藏引导投放活动配置创建。通过配置有效的小程序收藏引导（tips）文案，创建小程序收藏引导活动。用户在活动有效期内等于相应页面，将展示配置的个性化文案，帮助用户收藏小程序。请结合您的小程序及页面，配置个性化文案。 
     * @param alipayOpenMiniTipsDeliveryCreateModel  (optional)
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
    public okhttp3.Call createAsync(AlipayOpenMiniTipsDeliveryCreateModel alipayOpenMiniTipsDeliveryCreateModel, final ApiCallback<AlipayOpenMiniTipsDeliveryCreateResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayOpenMiniTipsDeliveryCreateModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenMiniTipsDeliveryCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call createAsync(AlipayOpenMiniTipsDeliveryCreateModel alipayOpenMiniTipsDeliveryCreateModel, final ApiCallback<AlipayOpenMiniTipsDeliveryCreateResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayOpenMiniTipsDeliveryCreateModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenMiniTipsDeliveryCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for modify
     * @param alipayOpenMiniTipsDeliveryModifyModel  (optional)
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
    public okhttp3.Call modifyCall(AlipayOpenMiniTipsDeliveryModifyModel alipayOpenMiniTipsDeliveryModifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOpenMiniTipsDeliveryModifyModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/mini/tips/delivery/modify";

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
    private okhttp3.Call modifyValidateBeforeCall(AlipayOpenMiniTipsDeliveryModifyModel alipayOpenMiniTipsDeliveryModifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = modifyCall(alipayOpenMiniTipsDeliveryModifyModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 小程序收藏引导投放活动修改
     * 小程序收藏引导投放活动修改接口，目前支持活动状态的修改，包括暂停、恢复、终止单个收藏引导活动。
     * @param alipayOpenMiniTipsDeliveryModifyModel  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public Object modify(AlipayOpenMiniTipsDeliveryModifyModel alipayOpenMiniTipsDeliveryModifyModel) throws ApiException {
        ApiResponse<Object> localVarResp = modifyWithHttpInfo(alipayOpenMiniTipsDeliveryModifyModel, null);
        return localVarResp.getData();
    }

    public Object modify(AlipayOpenMiniTipsDeliveryModifyModel alipayOpenMiniTipsDeliveryModifyModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<Object> localVarResp = modifyWithHttpInfo(alipayOpenMiniTipsDeliveryModifyModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 小程序收藏引导投放活动修改
     * 小程序收藏引导投放活动修改接口，目前支持活动状态的修改，包括暂停、恢复、终止单个收藏引导活动。
     * @param alipayOpenMiniTipsDeliveryModifyModel  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> modifyWithHttpInfo(AlipayOpenMiniTipsDeliveryModifyModel alipayOpenMiniTipsDeliveryModifyModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayOpenMiniTipsDeliveryModifyModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<Object>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenMiniTipsDeliveryModifyDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 小程序收藏引导投放活动修改 (asynchronously)
     * 小程序收藏引导投放活动修改接口，目前支持活动状态的修改，包括暂停、恢复、终止单个收藏引导活动。
     * @param alipayOpenMiniTipsDeliveryModifyModel  (optional)
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
    public okhttp3.Call modifyAsync(AlipayOpenMiniTipsDeliveryModifyModel alipayOpenMiniTipsDeliveryModifyModel, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayOpenMiniTipsDeliveryModifyModel, _callback, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call modifyAsync(AlipayOpenMiniTipsDeliveryModifyModel alipayOpenMiniTipsDeliveryModifyModel, final ApiCallback<Object> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayOpenMiniTipsDeliveryModifyModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param deliveryId 收藏引导投放活动ID，查询收藏引导活动必填参数 (optional)
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
    public okhttp3.Call queryCall(String deliveryId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/open/mini/tips/delivery/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (deliveryId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("delivery_id", deliveryId));
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
    private okhttp3.Call queryValidateBeforeCall(String deliveryId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(deliveryId, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 小程序收藏引导投放活动详情查询
     * 小程序收藏引导投放活动配置详情查询接口，获取当前活动ID对应活动的配置及状态信息。
     * @param deliveryId 收藏引导投放活动ID，查询收藏引导活动必填参数 (optional)
     * @return AlipayOpenMiniTipsDeliveryQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenMiniTipsDeliveryQueryResponseModel query(String deliveryId) throws ApiException {
        ApiResponse<AlipayOpenMiniTipsDeliveryQueryResponseModel> localVarResp = queryWithHttpInfo(deliveryId, null);
        return localVarResp.getData();
    }

    public AlipayOpenMiniTipsDeliveryQueryResponseModel query(String deliveryId, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenMiniTipsDeliveryQueryResponseModel> localVarResp = queryWithHttpInfo(deliveryId, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 小程序收藏引导投放活动详情查询
     * 小程序收藏引导投放活动配置详情查询接口，获取当前活动ID对应活动的配置及状态信息。
     * @param deliveryId 收藏引导投放活动ID，查询收藏引导活动必填参数 (optional)
     * @return ApiResponse&lt;AlipayOpenMiniTipsDeliveryQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenMiniTipsDeliveryQueryResponseModel> queryWithHttpInfo(String deliveryId, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(deliveryId, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenMiniTipsDeliveryQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenMiniTipsDeliveryQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 小程序收藏引导投放活动详情查询 (asynchronously)
     * 小程序收藏引导投放活动配置详情查询接口，获取当前活动ID对应活动的配置及状态信息。
     * @param deliveryId 收藏引导投放活动ID，查询收藏引导活动必填参数 (optional)
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
    public okhttp3.Call queryAsync(String deliveryId, final ApiCallback<AlipayOpenMiniTipsDeliveryQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(deliveryId, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenMiniTipsDeliveryQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String deliveryId, final ApiCallback<AlipayOpenMiniTipsDeliveryQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(deliveryId, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenMiniTipsDeliveryQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
