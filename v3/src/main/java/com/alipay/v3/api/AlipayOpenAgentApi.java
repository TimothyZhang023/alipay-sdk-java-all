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


import com.alipay.v3.model.AlipayOpenAgentCancelDefaultResponse;
import com.alipay.v3.model.AlipayOpenAgentCancelModel;
import com.alipay.v3.model.AlipayOpenAgentConfirmDefaultResponse;
import com.alipay.v3.model.AlipayOpenAgentConfirmModel;
import com.alipay.v3.model.AlipayOpenAgentConfirmResponseModel;
import com.alipay.v3.model.AlipayOpenAgentCreateDefaultResponse;
import com.alipay.v3.model.AlipayOpenAgentCreateModel;
import com.alipay.v3.model.AlipayOpenAgentCreateResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayOpenAgentApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayOpenAgentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayOpenAgentApi(ApiClient apiClient) {
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
     * Build call for cancel
     * @param alipayOpenAgentCancelModel  (optional)
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
    public okhttp3.Call cancelCall(AlipayOpenAgentCancelModel alipayOpenAgentCancelModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOpenAgentCancelModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/agent/cancel";

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
    private okhttp3.Call cancelValidateBeforeCall(AlipayOpenAgentCancelModel alipayOpenAgentCancelModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = cancelCall(alipayOpenAgentCancelModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 取消代商户签约、创建应用事务
     * 取消代商户签约、创建应用事务
     * @param alipayOpenAgentCancelModel  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public Object cancel(AlipayOpenAgentCancelModel alipayOpenAgentCancelModel) throws ApiException {
        ApiResponse<Object> localVarResp = cancelWithHttpInfo(alipayOpenAgentCancelModel, null);
        return localVarResp.getData();
    }

    public Object cancel(AlipayOpenAgentCancelModel alipayOpenAgentCancelModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<Object> localVarResp = cancelWithHttpInfo(alipayOpenAgentCancelModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 取消代商户签约、创建应用事务
     * 取消代商户签约、创建应用事务
     * @param alipayOpenAgentCancelModel  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> cancelWithHttpInfo(AlipayOpenAgentCancelModel alipayOpenAgentCancelModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = cancelValidateBeforeCall(alipayOpenAgentCancelModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<Object>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenAgentCancelDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 取消代商户签约、创建应用事务 (asynchronously)
     * 取消代商户签约、创建应用事务
     * @param alipayOpenAgentCancelModel  (optional)
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
    public okhttp3.Call cancelAsync(AlipayOpenAgentCancelModel alipayOpenAgentCancelModel, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = cancelValidateBeforeCall(alipayOpenAgentCancelModel, _callback, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call cancelAsync(AlipayOpenAgentCancelModel alipayOpenAgentCancelModel, final ApiCallback<Object> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = cancelValidateBeforeCall(alipayOpenAgentCancelModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for confirm
     * @param alipayOpenAgentConfirmModel  (optional)
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
    public okhttp3.Call confirmCall(AlipayOpenAgentConfirmModel alipayOpenAgentConfirmModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOpenAgentConfirmModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/agent/confirm";

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
    private okhttp3.Call confirmValidateBeforeCall(AlipayOpenAgentConfirmModel alipayOpenAgentConfirmModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = confirmCall(alipayOpenAgentConfirmModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 提交代商户签约、创建应用事务
     * 提交事务。只允许提交init状态的事务，submit|cancel|timeout 状态的都是终态，不允许提交，且不允许提交空事务，需要先调用代创建小程序、代签约当面付等业务接口，再提交事务。服务市场订购及授权，使用订单授权凭证order_ticket开启的事务，提交后会有应用授权令牌返回。
     * @param alipayOpenAgentConfirmModel  (optional)
     * @return AlipayOpenAgentConfirmResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenAgentConfirmResponseModel confirm(AlipayOpenAgentConfirmModel alipayOpenAgentConfirmModel) throws ApiException {
        ApiResponse<AlipayOpenAgentConfirmResponseModel> localVarResp = confirmWithHttpInfo(alipayOpenAgentConfirmModel, null);
        return localVarResp.getData();
    }

    public AlipayOpenAgentConfirmResponseModel confirm(AlipayOpenAgentConfirmModel alipayOpenAgentConfirmModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenAgentConfirmResponseModel> localVarResp = confirmWithHttpInfo(alipayOpenAgentConfirmModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 提交代商户签约、创建应用事务
     * 提交事务。只允许提交init状态的事务，submit|cancel|timeout 状态的都是终态，不允许提交，且不允许提交空事务，需要先调用代创建小程序、代签约当面付等业务接口，再提交事务。服务市场订购及授权，使用订单授权凭证order_ticket开启的事务，提交后会有应用授权令牌返回。
     * @param alipayOpenAgentConfirmModel  (optional)
     * @return ApiResponse&lt;AlipayOpenAgentConfirmResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenAgentConfirmResponseModel> confirmWithHttpInfo(AlipayOpenAgentConfirmModel alipayOpenAgentConfirmModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = confirmValidateBeforeCall(alipayOpenAgentConfirmModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenAgentConfirmResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenAgentConfirmDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 提交代商户签约、创建应用事务 (asynchronously)
     * 提交事务。只允许提交init状态的事务，submit|cancel|timeout 状态的都是终态，不允许提交，且不允许提交空事务，需要先调用代创建小程序、代签约当面付等业务接口，再提交事务。服务市场订购及授权，使用订单授权凭证order_ticket开启的事务，提交后会有应用授权令牌返回。
     * @param alipayOpenAgentConfirmModel  (optional)
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
    public okhttp3.Call confirmAsync(AlipayOpenAgentConfirmModel alipayOpenAgentConfirmModel, final ApiCallback<AlipayOpenAgentConfirmResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = confirmValidateBeforeCall(alipayOpenAgentConfirmModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenAgentConfirmResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call confirmAsync(AlipayOpenAgentConfirmModel alipayOpenAgentConfirmModel, final ApiCallback<AlipayOpenAgentConfirmResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = confirmValidateBeforeCall(alipayOpenAgentConfirmModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenAgentConfirmResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for create
     * @param alipayOpenAgentCreateModel  (optional)
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
    public okhttp3.Call createCall(AlipayOpenAgentCreateModel alipayOpenAgentCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOpenAgentCreateModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/agent/create";

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
    private okhttp3.Call createValidateBeforeCall(AlipayOpenAgentCreateModel alipayOpenAgentCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = createCall(alipayOpenAgentCreateModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 开启代商户签约、创建应用事务
     * 在 ISV 代商户进行应用创建、产品签约时，用于开启一个操作事务，必须是第一个调用的接口。场景1：ISV 代商户进行应用创建、产品签约，最后提交事务后需要商户确认才能完成流程；场景2：服务市场订购及授权，使用订单授权凭证order_ticket开启预授权模式，该模式下提交事务后无需商户确认。
     * @param alipayOpenAgentCreateModel  (optional)
     * @return AlipayOpenAgentCreateResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenAgentCreateResponseModel create(AlipayOpenAgentCreateModel alipayOpenAgentCreateModel) throws ApiException {
        ApiResponse<AlipayOpenAgentCreateResponseModel> localVarResp = createWithHttpInfo(alipayOpenAgentCreateModel, null);
        return localVarResp.getData();
    }

    public AlipayOpenAgentCreateResponseModel create(AlipayOpenAgentCreateModel alipayOpenAgentCreateModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenAgentCreateResponseModel> localVarResp = createWithHttpInfo(alipayOpenAgentCreateModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 开启代商户签约、创建应用事务
     * 在 ISV 代商户进行应用创建、产品签约时，用于开启一个操作事务，必须是第一个调用的接口。场景1：ISV 代商户进行应用创建、产品签约，最后提交事务后需要商户确认才能完成流程；场景2：服务市场订购及授权，使用订单授权凭证order_ticket开启预授权模式，该模式下提交事务后无需商户确认。
     * @param alipayOpenAgentCreateModel  (optional)
     * @return ApiResponse&lt;AlipayOpenAgentCreateResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenAgentCreateResponseModel> createWithHttpInfo(AlipayOpenAgentCreateModel alipayOpenAgentCreateModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(alipayOpenAgentCreateModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenAgentCreateResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenAgentCreateDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 开启代商户签约、创建应用事务 (asynchronously)
     * 在 ISV 代商户进行应用创建、产品签约时，用于开启一个操作事务，必须是第一个调用的接口。场景1：ISV 代商户进行应用创建、产品签约，最后提交事务后需要商户确认才能完成流程；场景2：服务市场订购及授权，使用订单授权凭证order_ticket开启预授权模式，该模式下提交事务后无需商户确认。
     * @param alipayOpenAgentCreateModel  (optional)
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
    public okhttp3.Call createAsync(AlipayOpenAgentCreateModel alipayOpenAgentCreateModel, final ApiCallback<AlipayOpenAgentCreateResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayOpenAgentCreateModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenAgentCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call createAsync(AlipayOpenAgentCreateModel alipayOpenAgentCreateModel, final ApiCallback<AlipayOpenAgentCreateResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayOpenAgentCreateModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenAgentCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
