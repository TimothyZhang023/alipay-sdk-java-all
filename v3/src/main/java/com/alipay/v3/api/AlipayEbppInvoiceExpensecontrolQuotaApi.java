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


import com.alipay.v3.model.AlipayEbppInvoiceExpensecontrolQuotaCreateDefaultResponse;
import com.alipay.v3.model.AlipayEbppInvoiceExpensecontrolQuotaCreateModel;
import com.alipay.v3.model.AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel;
import com.alipay.v3.model.AlipayEbppInvoiceExpensecontrolQuotaModifyDefaultResponse;
import com.alipay.v3.model.AlipayEbppInvoiceExpensecontrolQuotaModifyModel;
import com.alipay.v3.model.AlipayEbppInvoiceExpensecontrolQuotaModifyResponseModel;
import com.alipay.v3.model.AlipayEbppInvoiceExpensecontrolQuotaQueryDefaultResponse;
import com.alipay.v3.model.AlipayEbppInvoiceExpensecontrolQuotaQueryModel;
import com.alipay.v3.model.AlipayEbppInvoiceExpensecontrolQuotaQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayEbppInvoiceExpensecontrolQuotaApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayEbppInvoiceExpensecontrolQuotaApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayEbppInvoiceExpensecontrolQuotaApi(ApiClient apiClient) {
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
     * @param alipayEbppInvoiceExpensecontrolQuotaCreateModel  (optional)
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
    public okhttp3.Call createCall(AlipayEbppInvoiceExpensecontrolQuotaCreateModel alipayEbppInvoiceExpensecontrolQuotaCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayEbppInvoiceExpensecontrolQuotaCreateModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/ebpp/invoice/expensecontrol/quota/create";

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
    private okhttp3.Call createValidateBeforeCall(AlipayEbppInvoiceExpensecontrolQuotaCreateModel alipayEbppInvoiceExpensecontrolQuotaCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = createCall(alipayEbppInvoiceExpensecontrolQuotaCreateModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 创建余额/点券
     * 创建余额或者点券
     * @param alipayEbppInvoiceExpensecontrolQuotaCreateModel  (optional)
     * @return AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel create(AlipayEbppInvoiceExpensecontrolQuotaCreateModel alipayEbppInvoiceExpensecontrolQuotaCreateModel) throws ApiException {
        ApiResponse<AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel> localVarResp = createWithHttpInfo(alipayEbppInvoiceExpensecontrolQuotaCreateModel, null);
        return localVarResp.getData();
    }

    public AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel create(AlipayEbppInvoiceExpensecontrolQuotaCreateModel alipayEbppInvoiceExpensecontrolQuotaCreateModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel> localVarResp = createWithHttpInfo(alipayEbppInvoiceExpensecontrolQuotaCreateModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 创建余额/点券
     * 创建余额或者点券
     * @param alipayEbppInvoiceExpensecontrolQuotaCreateModel  (optional)
     * @return ApiResponse&lt;AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel> createWithHttpInfo(AlipayEbppInvoiceExpensecontrolQuotaCreateModel alipayEbppInvoiceExpensecontrolQuotaCreateModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(alipayEbppInvoiceExpensecontrolQuotaCreateModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEbppInvoiceExpensecontrolQuotaCreateDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 创建余额/点券 (asynchronously)
     * 创建余额或者点券
     * @param alipayEbppInvoiceExpensecontrolQuotaCreateModel  (optional)
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
    public okhttp3.Call createAsync(AlipayEbppInvoiceExpensecontrolQuotaCreateModel alipayEbppInvoiceExpensecontrolQuotaCreateModel, final ApiCallback<AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayEbppInvoiceExpensecontrolQuotaCreateModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call createAsync(AlipayEbppInvoiceExpensecontrolQuotaCreateModel alipayEbppInvoiceExpensecontrolQuotaCreateModel, final ApiCallback<AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayEbppInvoiceExpensecontrolQuotaCreateModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for modify
     * @param alipayEbppInvoiceExpensecontrolQuotaModifyModel  (optional)
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
    public okhttp3.Call modifyCall(AlipayEbppInvoiceExpensecontrolQuotaModifyModel alipayEbppInvoiceExpensecontrolQuotaModifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayEbppInvoiceExpensecontrolQuotaModifyModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/ebpp/invoice/expensecontrol/quota/modify";

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
    private okhttp3.Call modifyValidateBeforeCall(AlipayEbppInvoiceExpensecontrolQuotaModifyModel alipayEbppInvoiceExpensecontrolQuotaModifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = modifyCall(alipayEbppInvoiceExpensecontrolQuotaModifyModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 修改余额/点券
     * 修改余额或点券
     * @param alipayEbppInvoiceExpensecontrolQuotaModifyModel  (optional)
     * @return AlipayEbppInvoiceExpensecontrolQuotaModifyResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEbppInvoiceExpensecontrolQuotaModifyResponseModel modify(AlipayEbppInvoiceExpensecontrolQuotaModifyModel alipayEbppInvoiceExpensecontrolQuotaModifyModel) throws ApiException {
        ApiResponse<AlipayEbppInvoiceExpensecontrolQuotaModifyResponseModel> localVarResp = modifyWithHttpInfo(alipayEbppInvoiceExpensecontrolQuotaModifyModel, null);
        return localVarResp.getData();
    }

    public AlipayEbppInvoiceExpensecontrolQuotaModifyResponseModel modify(AlipayEbppInvoiceExpensecontrolQuotaModifyModel alipayEbppInvoiceExpensecontrolQuotaModifyModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEbppInvoiceExpensecontrolQuotaModifyResponseModel> localVarResp = modifyWithHttpInfo(alipayEbppInvoiceExpensecontrolQuotaModifyModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 修改余额/点券
     * 修改余额或点券
     * @param alipayEbppInvoiceExpensecontrolQuotaModifyModel  (optional)
     * @return ApiResponse&lt;AlipayEbppInvoiceExpensecontrolQuotaModifyResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEbppInvoiceExpensecontrolQuotaModifyResponseModel> modifyWithHttpInfo(AlipayEbppInvoiceExpensecontrolQuotaModifyModel alipayEbppInvoiceExpensecontrolQuotaModifyModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayEbppInvoiceExpensecontrolQuotaModifyModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpensecontrolQuotaModifyResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEbppInvoiceExpensecontrolQuotaModifyDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 修改余额/点券 (asynchronously)
     * 修改余额或点券
     * @param alipayEbppInvoiceExpensecontrolQuotaModifyModel  (optional)
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
    public okhttp3.Call modifyAsync(AlipayEbppInvoiceExpensecontrolQuotaModifyModel alipayEbppInvoiceExpensecontrolQuotaModifyModel, final ApiCallback<AlipayEbppInvoiceExpensecontrolQuotaModifyResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayEbppInvoiceExpensecontrolQuotaModifyModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpensecontrolQuotaModifyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call modifyAsync(AlipayEbppInvoiceExpensecontrolQuotaModifyModel alipayEbppInvoiceExpensecontrolQuotaModifyModel, final ApiCallback<AlipayEbppInvoiceExpensecontrolQuotaModifyResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayEbppInvoiceExpensecontrolQuotaModifyModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpensecontrolQuotaModifyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param alipayEbppInvoiceExpensecontrolQuotaQueryModel  (optional)
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
    public okhttp3.Call queryCall(AlipayEbppInvoiceExpensecontrolQuotaQueryModel alipayEbppInvoiceExpensecontrolQuotaQueryModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayEbppInvoiceExpensecontrolQuotaQueryModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/ebpp/invoice/expensecontrol/quota/query";

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
    private okhttp3.Call queryValidateBeforeCall(AlipayEbppInvoiceExpensecontrolQuotaQueryModel alipayEbppInvoiceExpensecontrolQuotaQueryModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(alipayEbppInvoiceExpensecontrolQuotaQueryModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询余额/点券
     * 查询余额或者点券
     * @param alipayEbppInvoiceExpensecontrolQuotaQueryModel  (optional)
     * @return AlipayEbppInvoiceExpensecontrolQuotaQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEbppInvoiceExpensecontrolQuotaQueryResponseModel query(AlipayEbppInvoiceExpensecontrolQuotaQueryModel alipayEbppInvoiceExpensecontrolQuotaQueryModel) throws ApiException {
        ApiResponse<AlipayEbppInvoiceExpensecontrolQuotaQueryResponseModel> localVarResp = queryWithHttpInfo(alipayEbppInvoiceExpensecontrolQuotaQueryModel, null);
        return localVarResp.getData();
    }

    public AlipayEbppInvoiceExpensecontrolQuotaQueryResponseModel query(AlipayEbppInvoiceExpensecontrolQuotaQueryModel alipayEbppInvoiceExpensecontrolQuotaQueryModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEbppInvoiceExpensecontrolQuotaQueryResponseModel> localVarResp = queryWithHttpInfo(alipayEbppInvoiceExpensecontrolQuotaQueryModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询余额/点券
     * 查询余额或者点券
     * @param alipayEbppInvoiceExpensecontrolQuotaQueryModel  (optional)
     * @return ApiResponse&lt;AlipayEbppInvoiceExpensecontrolQuotaQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEbppInvoiceExpensecontrolQuotaQueryResponseModel> queryWithHttpInfo(AlipayEbppInvoiceExpensecontrolQuotaQueryModel alipayEbppInvoiceExpensecontrolQuotaQueryModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(alipayEbppInvoiceExpensecontrolQuotaQueryModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpensecontrolQuotaQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEbppInvoiceExpensecontrolQuotaQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询余额/点券 (asynchronously)
     * 查询余额或者点券
     * @param alipayEbppInvoiceExpensecontrolQuotaQueryModel  (optional)
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
    public okhttp3.Call queryAsync(AlipayEbppInvoiceExpensecontrolQuotaQueryModel alipayEbppInvoiceExpensecontrolQuotaQueryModel, final ApiCallback<AlipayEbppInvoiceExpensecontrolQuotaQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(alipayEbppInvoiceExpensecontrolQuotaQueryModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpensecontrolQuotaQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(AlipayEbppInvoiceExpensecontrolQuotaQueryModel alipayEbppInvoiceExpensecontrolQuotaQueryModel, final ApiCallback<AlipayEbppInvoiceExpensecontrolQuotaQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(alipayEbppInvoiceExpensecontrolQuotaQueryModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpensecontrolQuotaQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
