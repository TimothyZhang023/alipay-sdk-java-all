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


import com.alipay.v3.model.DatadigitalFincloudGeneralsaasFaceCertifyInitializeDefaultResponse;
import com.alipay.v3.model.DatadigitalFincloudGeneralsaasFaceCertifyInitializeModel;
import com.alipay.v3.model.DatadigitalFincloudGeneralsaasFaceCertifyInitializeResponseModel;
import com.alipay.v3.model.DatadigitalFincloudGeneralsaasFaceCertifyQueryDefaultResponse;
import com.alipay.v3.model.DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel;
import com.alipay.v3.model.DatadigitalFincloudGeneralsaasFaceCertifyVerifyDefaultResponse;
import com.alipay.v3.model.DatadigitalFincloudGeneralsaasFaceCertifyVerifyModel;
import com.alipay.v3.model.DatadigitalFincloudGeneralsaasFaceCertifyVerifyResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class DatadigitalFincloudGeneralsaasFaceCertifyApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DatadigitalFincloudGeneralsaasFaceCertifyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DatadigitalFincloudGeneralsaasFaceCertifyApi(ApiClient apiClient) {
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
     * Build call for initialize
     * @param datadigitalFincloudGeneralsaasFaceCertifyInitializeModel  (optional)
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
    public okhttp3.Call initializeCall(DatadigitalFincloudGeneralsaasFaceCertifyInitializeModel datadigitalFincloudGeneralsaasFaceCertifyInitializeModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : datadigitalFincloudGeneralsaasFaceCertifyInitializeModel;

        // create path and map variables
        String localVarPath = "/v3/datadigital/fincloud/generalsaas/face/certify/initialize";

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
    private okhttp3.Call initializeValidateBeforeCall(DatadigitalFincloudGeneralsaasFaceCertifyInitializeModel datadigitalFincloudGeneralsaasFaceCertifyInitializeModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = initializeCall(datadigitalFincloudGeneralsaasFaceCertifyInitializeModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * H5人脸核身初始化
     * 人脸核身初始化服务，用于创建认证流程。供外部客户使用该项服务。
     * @param datadigitalFincloudGeneralsaasFaceCertifyInitializeModel  (optional)
     * @return DatadigitalFincloudGeneralsaasFaceCertifyInitializeResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public DatadigitalFincloudGeneralsaasFaceCertifyInitializeResponseModel initialize(DatadigitalFincloudGeneralsaasFaceCertifyInitializeModel datadigitalFincloudGeneralsaasFaceCertifyInitializeModel) throws ApiException {
        ApiResponse<DatadigitalFincloudGeneralsaasFaceCertifyInitializeResponseModel> localVarResp = initializeWithHttpInfo(datadigitalFincloudGeneralsaasFaceCertifyInitializeModel, null);
        return localVarResp.getData();
    }

    public DatadigitalFincloudGeneralsaasFaceCertifyInitializeResponseModel initialize(DatadigitalFincloudGeneralsaasFaceCertifyInitializeModel datadigitalFincloudGeneralsaasFaceCertifyInitializeModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<DatadigitalFincloudGeneralsaasFaceCertifyInitializeResponseModel> localVarResp = initializeWithHttpInfo(datadigitalFincloudGeneralsaasFaceCertifyInitializeModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * H5人脸核身初始化
     * 人脸核身初始化服务，用于创建认证流程。供外部客户使用该项服务。
     * @param datadigitalFincloudGeneralsaasFaceCertifyInitializeModel  (optional)
     * @return ApiResponse&lt;DatadigitalFincloudGeneralsaasFaceCertifyInitializeResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DatadigitalFincloudGeneralsaasFaceCertifyInitializeResponseModel> initializeWithHttpInfo(DatadigitalFincloudGeneralsaasFaceCertifyInitializeModel datadigitalFincloudGeneralsaasFaceCertifyInitializeModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = initializeValidateBeforeCall(datadigitalFincloudGeneralsaasFaceCertifyInitializeModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<DatadigitalFincloudGeneralsaasFaceCertifyInitializeResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<DatadigitalFincloudGeneralsaasFaceCertifyInitializeDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * H5人脸核身初始化 (asynchronously)
     * 人脸核身初始化服务，用于创建认证流程。供外部客户使用该项服务。
     * @param datadigitalFincloudGeneralsaasFaceCertifyInitializeModel  (optional)
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
    public okhttp3.Call initializeAsync(DatadigitalFincloudGeneralsaasFaceCertifyInitializeModel datadigitalFincloudGeneralsaasFaceCertifyInitializeModel, final ApiCallback<DatadigitalFincloudGeneralsaasFaceCertifyInitializeResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = initializeValidateBeforeCall(datadigitalFincloudGeneralsaasFaceCertifyInitializeModel, _callback, null);
        Type localVarReturnType = new TypeToken<DatadigitalFincloudGeneralsaasFaceCertifyInitializeResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call initializeAsync(DatadigitalFincloudGeneralsaasFaceCertifyInitializeModel datadigitalFincloudGeneralsaasFaceCertifyInitializeModel, final ApiCallback<DatadigitalFincloudGeneralsaasFaceCertifyInitializeResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = initializeValidateBeforeCall(datadigitalFincloudGeneralsaasFaceCertifyInitializeModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<DatadigitalFincloudGeneralsaasFaceCertifyInitializeResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param certifyId 本次申请操作的唯一标识，通过datadigital.fincloud.generalsaas.face.certify.initialize 接口同步响应获取。 (optional)
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
    public okhttp3.Call queryCall(String certifyId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/datadigital/fincloud/generalsaas/face/certify/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (certifyId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("certify_id", certifyId));
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
    private okhttp3.Call queryValidateBeforeCall(String certifyId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(certifyId, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * H5人脸核身查询记录
     * 商户在用户使用支付宝完成刷脸之后，调用本接口查询核身结果状态及相关数据
     * @param certifyId 本次申请操作的唯一标识，通过datadigital.fincloud.generalsaas.face.certify.initialize 接口同步响应获取。 (optional)
     * @return DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel query(String certifyId) throws ApiException {
        ApiResponse<DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel> localVarResp = queryWithHttpInfo(certifyId, null);
        return localVarResp.getData();
    }

    public DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel query(String certifyId, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel> localVarResp = queryWithHttpInfo(certifyId, customizedParams);
        return localVarResp.getData();
    }

    /**
     * H5人脸核身查询记录
     * 商户在用户使用支付宝完成刷脸之后，调用本接口查询核身结果状态及相关数据
     * @param certifyId 本次申请操作的唯一标识，通过datadigital.fincloud.generalsaas.face.certify.initialize 接口同步响应获取。 (optional)
     * @return ApiResponse&lt;DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel> queryWithHttpInfo(String certifyId, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(certifyId, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<DatadigitalFincloudGeneralsaasFaceCertifyQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * H5人脸核身查询记录 (asynchronously)
     * 商户在用户使用支付宝完成刷脸之后，调用本接口查询核身结果状态及相关数据
     * @param certifyId 本次申请操作的唯一标识，通过datadigital.fincloud.generalsaas.face.certify.initialize 接口同步响应获取。 (optional)
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
    public okhttp3.Call queryAsync(String certifyId, final ApiCallback<DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(certifyId, _callback, null);
        Type localVarReturnType = new TypeToken<DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String certifyId, final ApiCallback<DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(certifyId, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for verify
     * @param datadigitalFincloudGeneralsaasFaceCertifyVerifyModel  (optional)
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
    public okhttp3.Call verifyCall(DatadigitalFincloudGeneralsaasFaceCertifyVerifyModel datadigitalFincloudGeneralsaasFaceCertifyVerifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : datadigitalFincloudGeneralsaasFaceCertifyVerifyModel;

        // create path and map variables
        String localVarPath = "/v3/datadigital/fincloud/generalsaas/face/certify/verify";

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
    private okhttp3.Call verifyValidateBeforeCall(DatadigitalFincloudGeneralsaasFaceCertifyVerifyModel datadigitalFincloudGeneralsaasFaceCertifyVerifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = verifyCall(datadigitalFincloudGeneralsaasFaceCertifyVerifyModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * H5人脸核身开始认证
     * H5人脸核身服务开始认证。请根据返回结果渲染页面。
     * @param datadigitalFincloudGeneralsaasFaceCertifyVerifyModel  (optional)
     * @return DatadigitalFincloudGeneralsaasFaceCertifyVerifyResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public DatadigitalFincloudGeneralsaasFaceCertifyVerifyResponseModel verify(DatadigitalFincloudGeneralsaasFaceCertifyVerifyModel datadigitalFincloudGeneralsaasFaceCertifyVerifyModel) throws ApiException {
        ApiResponse<DatadigitalFincloudGeneralsaasFaceCertifyVerifyResponseModel> localVarResp = verifyWithHttpInfo(datadigitalFincloudGeneralsaasFaceCertifyVerifyModel, null);
        return localVarResp.getData();
    }

    public DatadigitalFincloudGeneralsaasFaceCertifyVerifyResponseModel verify(DatadigitalFincloudGeneralsaasFaceCertifyVerifyModel datadigitalFincloudGeneralsaasFaceCertifyVerifyModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<DatadigitalFincloudGeneralsaasFaceCertifyVerifyResponseModel> localVarResp = verifyWithHttpInfo(datadigitalFincloudGeneralsaasFaceCertifyVerifyModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * H5人脸核身开始认证
     * H5人脸核身服务开始认证。请根据返回结果渲染页面。
     * @param datadigitalFincloudGeneralsaasFaceCertifyVerifyModel  (optional)
     * @return ApiResponse&lt;DatadigitalFincloudGeneralsaasFaceCertifyVerifyResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DatadigitalFincloudGeneralsaasFaceCertifyVerifyResponseModel> verifyWithHttpInfo(DatadigitalFincloudGeneralsaasFaceCertifyVerifyModel datadigitalFincloudGeneralsaasFaceCertifyVerifyModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = verifyValidateBeforeCall(datadigitalFincloudGeneralsaasFaceCertifyVerifyModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<DatadigitalFincloudGeneralsaasFaceCertifyVerifyResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<DatadigitalFincloudGeneralsaasFaceCertifyVerifyDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * H5人脸核身开始认证 (asynchronously)
     * H5人脸核身服务开始认证。请根据返回结果渲染页面。
     * @param datadigitalFincloudGeneralsaasFaceCertifyVerifyModel  (optional)
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
    public okhttp3.Call verifyAsync(DatadigitalFincloudGeneralsaasFaceCertifyVerifyModel datadigitalFincloudGeneralsaasFaceCertifyVerifyModel, final ApiCallback<DatadigitalFincloudGeneralsaasFaceCertifyVerifyResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = verifyValidateBeforeCall(datadigitalFincloudGeneralsaasFaceCertifyVerifyModel, _callback, null);
        Type localVarReturnType = new TypeToken<DatadigitalFincloudGeneralsaasFaceCertifyVerifyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call verifyAsync(DatadigitalFincloudGeneralsaasFaceCertifyVerifyModel datadigitalFincloudGeneralsaasFaceCertifyVerifyModel, final ApiCallback<DatadigitalFincloudGeneralsaasFaceCertifyVerifyResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = verifyValidateBeforeCall(datadigitalFincloudGeneralsaasFaceCertifyVerifyModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<DatadigitalFincloudGeneralsaasFaceCertifyVerifyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
