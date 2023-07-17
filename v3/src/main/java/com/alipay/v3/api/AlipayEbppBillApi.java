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


import com.alipay.v3.model.AlipayEbppBillAddDefaultResponse;
import com.alipay.v3.model.AlipayEbppBillAddModel;
import com.alipay.v3.model.AlipayEbppBillAddResponseModel;
import com.alipay.v3.model.AlipayEbppBillGetDefaultResponse;
import com.alipay.v3.model.AlipayEbppBillGetResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayEbppBillApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayEbppBillApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayEbppBillApi(ApiClient apiClient) {
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
     * Build call for add
     * @param authToken 用户授权令牌 (optional)
     * @param alipayEbppBillAddModel  (optional)
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
    public okhttp3.Call addCall(String authToken, AlipayEbppBillAddModel alipayEbppBillAddModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayEbppBillAddModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/ebpp/bill/add";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (authToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("auth_token", authToken));
        }

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
    private okhttp3.Call addValidateBeforeCall(String authToken, AlipayEbppBillAddModel alipayEbppBillAddModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = addCall(authToken, alipayEbppBillAddModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 创建账单
     * 创建账单
     * @param authToken 用户授权令牌 (optional)
     * @param alipayEbppBillAddModel  (optional)
     * @return AlipayEbppBillAddResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEbppBillAddResponseModel add(String authToken, AlipayEbppBillAddModel alipayEbppBillAddModel) throws ApiException {
        ApiResponse<AlipayEbppBillAddResponseModel> localVarResp = addWithHttpInfo(authToken, alipayEbppBillAddModel, null);
        return localVarResp.getData();
    }

    public AlipayEbppBillAddResponseModel add(String authToken, AlipayEbppBillAddModel alipayEbppBillAddModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEbppBillAddResponseModel> localVarResp = addWithHttpInfo(authToken, alipayEbppBillAddModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 创建账单
     * 创建账单
     * @param authToken 用户授权令牌 (optional)
     * @param alipayEbppBillAddModel  (optional)
     * @return ApiResponse&lt;AlipayEbppBillAddResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEbppBillAddResponseModel> addWithHttpInfo(String authToken, AlipayEbppBillAddModel alipayEbppBillAddModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = addValidateBeforeCall(authToken, alipayEbppBillAddModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEbppBillAddResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEbppBillAddDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 创建账单 (asynchronously)
     * 创建账单
     * @param authToken 用户授权令牌 (optional)
     * @param alipayEbppBillAddModel  (optional)
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
    public okhttp3.Call addAsync(String authToken, AlipayEbppBillAddModel alipayEbppBillAddModel, final ApiCallback<AlipayEbppBillAddResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = addValidateBeforeCall(authToken, alipayEbppBillAddModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEbppBillAddResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call addAsync(String authToken, AlipayEbppBillAddModel alipayEbppBillAddModel, final ApiCallback<AlipayEbppBillAddResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = addValidateBeforeCall(authToken, alipayEbppBillAddModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEbppBillAddResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for get
     * @param authToken 用户授权令牌 (optional)
     * @param orderType 支付宝订单类型。公共事业缴纳JF,信用卡还款HK (optional)
     * @param merchantOrderNo 输出机构的业务流水号，需要保证唯一性。 (optional)
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
    public okhttp3.Call getCall(String authToken, String orderType, String merchantOrderNo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/ebpp/bill/get";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (authToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("auth_token", authToken));
        }

        if (orderType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_type", orderType));
        }

        if (merchantOrderNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("merchant_order_no", merchantOrderNo));
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
    private okhttp3.Call getValidateBeforeCall(String authToken, String orderType, String merchantOrderNo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = getCall(authToken, orderType, merchantOrderNo, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询账单
     * 查询账单
     * @param authToken 用户授权令牌 (optional)
     * @param orderType 支付宝订单类型。公共事业缴纳JF,信用卡还款HK (optional)
     * @param merchantOrderNo 输出机构的业务流水号，需要保证唯一性。 (optional)
     * @return AlipayEbppBillGetResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEbppBillGetResponseModel get(String authToken, String orderType, String merchantOrderNo) throws ApiException {
        ApiResponse<AlipayEbppBillGetResponseModel> localVarResp = getWithHttpInfo(authToken, orderType, merchantOrderNo, null);
        return localVarResp.getData();
    }

    public AlipayEbppBillGetResponseModel get(String authToken, String orderType, String merchantOrderNo, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEbppBillGetResponseModel> localVarResp = getWithHttpInfo(authToken, orderType, merchantOrderNo, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询账单
     * 查询账单
     * @param authToken 用户授权令牌 (optional)
     * @param orderType 支付宝订单类型。公共事业缴纳JF,信用卡还款HK (optional)
     * @param merchantOrderNo 输出机构的业务流水号，需要保证唯一性。 (optional)
     * @return ApiResponse&lt;AlipayEbppBillGetResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEbppBillGetResponseModel> getWithHttpInfo(String authToken, String orderType, String merchantOrderNo, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = getValidateBeforeCall(authToken, orderType, merchantOrderNo, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEbppBillGetResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEbppBillGetDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询账单 (asynchronously)
     * 查询账单
     * @param authToken 用户授权令牌 (optional)
     * @param orderType 支付宝订单类型。公共事业缴纳JF,信用卡还款HK (optional)
     * @param merchantOrderNo 输出机构的业务流水号，需要保证唯一性。 (optional)
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
    public okhttp3.Call getAsync(String authToken, String orderType, String merchantOrderNo, final ApiCallback<AlipayEbppBillGetResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = getValidateBeforeCall(authToken, orderType, merchantOrderNo, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEbppBillGetResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call getAsync(String authToken, String orderType, String merchantOrderNo, final ApiCallback<AlipayEbppBillGetResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = getValidateBeforeCall(authToken, orderType, merchantOrderNo, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEbppBillGetResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
