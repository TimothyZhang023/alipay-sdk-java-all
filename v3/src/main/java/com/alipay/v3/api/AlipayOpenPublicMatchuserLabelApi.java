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


import com.alipay.v3.model.AlipayOpenPublicMatchuserLabelCreateDefaultResponse;
import com.alipay.v3.model.AlipayOpenPublicMatchuserLabelCreateModel;
import com.alipay.v3.model.AlipayOpenPublicMatchuserLabelCreateResponseModel;
import com.alipay.v3.model.AlipayOpenPublicMatchuserLabelDeleteDefaultResponse;
import com.alipay.v3.model.AlipayOpenPublicMatchuserLabelDeleteModel;
import com.alipay.v3.model.AlipayOpenPublicMatchuserLabelDeleteResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayOpenPublicMatchuserLabelApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayOpenPublicMatchuserLabelApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayOpenPublicMatchuserLabelApi(ApiClient apiClient) {
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
     * @param alipayOpenPublicMatchuserLabelCreateModel  (optional)
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
    public okhttp3.Call createCall(AlipayOpenPublicMatchuserLabelCreateModel alipayOpenPublicMatchuserLabelCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOpenPublicMatchuserLabelCreateModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/public/matchuser/label/create";

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
    private okhttp3.Call createValidateBeforeCall(AlipayOpenPublicMatchuserLabelCreateModel alipayOpenPublicMatchuserLabelCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = createCall(alipayOpenPublicMatchuserLabelCreateModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 用户打标接口
     * 开发者可以使用此接口向匹配到的用户添加指定标签值，每个用户每个标签只能有一个标签值，当向同一个用户添加多个标签值时，最新的标签值会覆盖之前的标签值
     * @param alipayOpenPublicMatchuserLabelCreateModel  (optional)
     * @return AlipayOpenPublicMatchuserLabelCreateResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenPublicMatchuserLabelCreateResponseModel create(AlipayOpenPublicMatchuserLabelCreateModel alipayOpenPublicMatchuserLabelCreateModel) throws ApiException {
        ApiResponse<AlipayOpenPublicMatchuserLabelCreateResponseModel> localVarResp = createWithHttpInfo(alipayOpenPublicMatchuserLabelCreateModel, null);
        return localVarResp.getData();
    }

    public AlipayOpenPublicMatchuserLabelCreateResponseModel create(AlipayOpenPublicMatchuserLabelCreateModel alipayOpenPublicMatchuserLabelCreateModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenPublicMatchuserLabelCreateResponseModel> localVarResp = createWithHttpInfo(alipayOpenPublicMatchuserLabelCreateModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 用户打标接口
     * 开发者可以使用此接口向匹配到的用户添加指定标签值，每个用户每个标签只能有一个标签值，当向同一个用户添加多个标签值时，最新的标签值会覆盖之前的标签值
     * @param alipayOpenPublicMatchuserLabelCreateModel  (optional)
     * @return ApiResponse&lt;AlipayOpenPublicMatchuserLabelCreateResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenPublicMatchuserLabelCreateResponseModel> createWithHttpInfo(AlipayOpenPublicMatchuserLabelCreateModel alipayOpenPublicMatchuserLabelCreateModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(alipayOpenPublicMatchuserLabelCreateModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenPublicMatchuserLabelCreateResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenPublicMatchuserLabelCreateDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 用户打标接口 (asynchronously)
     * 开发者可以使用此接口向匹配到的用户添加指定标签值，每个用户每个标签只能有一个标签值，当向同一个用户添加多个标签值时，最新的标签值会覆盖之前的标签值
     * @param alipayOpenPublicMatchuserLabelCreateModel  (optional)
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
    public okhttp3.Call createAsync(AlipayOpenPublicMatchuserLabelCreateModel alipayOpenPublicMatchuserLabelCreateModel, final ApiCallback<AlipayOpenPublicMatchuserLabelCreateResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayOpenPublicMatchuserLabelCreateModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenPublicMatchuserLabelCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call createAsync(AlipayOpenPublicMatchuserLabelCreateModel alipayOpenPublicMatchuserLabelCreateModel, final ApiCallback<AlipayOpenPublicMatchuserLabelCreateResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayOpenPublicMatchuserLabelCreateModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenPublicMatchuserLabelCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for delete
     * @param alipayOpenPublicMatchuserLabelDeleteModel  (optional)
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
    public okhttp3.Call deleteCall(AlipayOpenPublicMatchuserLabelDeleteModel alipayOpenPublicMatchuserLabelDeleteModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOpenPublicMatchuserLabelDeleteModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/public/matchuser/label/delete";

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
    private okhttp3.Call deleteValidateBeforeCall(AlipayOpenPublicMatchuserLabelDeleteModel alipayOpenPublicMatchuserLabelDeleteModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = deleteCall(alipayOpenPublicMatchuserLabelDeleteModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 用户取消标签接口
     * 开发者可以使用此接口删除匹配到的支付宝用户的指定标签值
     * @param alipayOpenPublicMatchuserLabelDeleteModel  (optional)
     * @return AlipayOpenPublicMatchuserLabelDeleteResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenPublicMatchuserLabelDeleteResponseModel delete(AlipayOpenPublicMatchuserLabelDeleteModel alipayOpenPublicMatchuserLabelDeleteModel) throws ApiException {
        ApiResponse<AlipayOpenPublicMatchuserLabelDeleteResponseModel> localVarResp = deleteWithHttpInfo(alipayOpenPublicMatchuserLabelDeleteModel, null);
        return localVarResp.getData();
    }

    public AlipayOpenPublicMatchuserLabelDeleteResponseModel delete(AlipayOpenPublicMatchuserLabelDeleteModel alipayOpenPublicMatchuserLabelDeleteModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenPublicMatchuserLabelDeleteResponseModel> localVarResp = deleteWithHttpInfo(alipayOpenPublicMatchuserLabelDeleteModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 用户取消标签接口
     * 开发者可以使用此接口删除匹配到的支付宝用户的指定标签值
     * @param alipayOpenPublicMatchuserLabelDeleteModel  (optional)
     * @return ApiResponse&lt;AlipayOpenPublicMatchuserLabelDeleteResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenPublicMatchuserLabelDeleteResponseModel> deleteWithHttpInfo(AlipayOpenPublicMatchuserLabelDeleteModel alipayOpenPublicMatchuserLabelDeleteModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = deleteValidateBeforeCall(alipayOpenPublicMatchuserLabelDeleteModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenPublicMatchuserLabelDeleteResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenPublicMatchuserLabelDeleteDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 用户取消标签接口 (asynchronously)
     * 开发者可以使用此接口删除匹配到的支付宝用户的指定标签值
     * @param alipayOpenPublicMatchuserLabelDeleteModel  (optional)
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
    public okhttp3.Call deleteAsync(AlipayOpenPublicMatchuserLabelDeleteModel alipayOpenPublicMatchuserLabelDeleteModel, final ApiCallback<AlipayOpenPublicMatchuserLabelDeleteResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteValidateBeforeCall(alipayOpenPublicMatchuserLabelDeleteModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenPublicMatchuserLabelDeleteResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call deleteAsync(AlipayOpenPublicMatchuserLabelDeleteModel alipayOpenPublicMatchuserLabelDeleteModel, final ApiCallback<AlipayOpenPublicMatchuserLabelDeleteResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = deleteValidateBeforeCall(alipayOpenPublicMatchuserLabelDeleteModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenPublicMatchuserLabelDeleteResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
