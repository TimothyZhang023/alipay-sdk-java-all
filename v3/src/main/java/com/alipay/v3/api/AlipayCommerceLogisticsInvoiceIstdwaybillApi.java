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


import com.alipay.v3.model.AlipayCommerceLogisticsInvoiceIstdwaybillCreateDefaultResponse;
import com.alipay.v3.model.AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel;
import com.alipay.v3.model.AlipayCommerceLogisticsInvoiceIstdwaybillCreateResponseModel;
import com.alipay.v3.model.AlipayCommerceLogisticsInvoiceIstdwaybillQueryDefaultResponse;
import com.alipay.v3.model.AlipayCommerceLogisticsInvoiceIstdwaybillQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayCommerceLogisticsInvoiceIstdwaybillApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayCommerceLogisticsInvoiceIstdwaybillApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayCommerceLogisticsInvoiceIstdwaybillApi(ApiClient apiClient) {
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
     * @param alipayCommerceLogisticsInvoiceIstdwaybillCreateModel  (optional)
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
    public okhttp3.Call createCall(AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel alipayCommerceLogisticsInvoiceIstdwaybillCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayCommerceLogisticsInvoiceIstdwaybillCreateModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/commerce/logistics/invoice/istdwaybill/create";

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
    private okhttp3.Call createValidateBeforeCall(AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel alipayCommerceLogisticsInvoiceIstdwaybillCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = createCall(alipayCommerceLogisticsInvoiceIstdwaybillCreateModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 开即时配送订单发票
     * 开即时配送订单发票
     * @param alipayCommerceLogisticsInvoiceIstdwaybillCreateModel  (optional)
     * @return AlipayCommerceLogisticsInvoiceIstdwaybillCreateResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayCommerceLogisticsInvoiceIstdwaybillCreateResponseModel create(AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel alipayCommerceLogisticsInvoiceIstdwaybillCreateModel) throws ApiException {
        ApiResponse<AlipayCommerceLogisticsInvoiceIstdwaybillCreateResponseModel> localVarResp = createWithHttpInfo(alipayCommerceLogisticsInvoiceIstdwaybillCreateModel, null);
        return localVarResp.getData();
    }

    public AlipayCommerceLogisticsInvoiceIstdwaybillCreateResponseModel create(AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel alipayCommerceLogisticsInvoiceIstdwaybillCreateModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayCommerceLogisticsInvoiceIstdwaybillCreateResponseModel> localVarResp = createWithHttpInfo(alipayCommerceLogisticsInvoiceIstdwaybillCreateModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 开即时配送订单发票
     * 开即时配送订单发票
     * @param alipayCommerceLogisticsInvoiceIstdwaybillCreateModel  (optional)
     * @return ApiResponse&lt;AlipayCommerceLogisticsInvoiceIstdwaybillCreateResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayCommerceLogisticsInvoiceIstdwaybillCreateResponseModel> createWithHttpInfo(AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel alipayCommerceLogisticsInvoiceIstdwaybillCreateModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(alipayCommerceLogisticsInvoiceIstdwaybillCreateModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayCommerceLogisticsInvoiceIstdwaybillCreateResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayCommerceLogisticsInvoiceIstdwaybillCreateDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 开即时配送订单发票 (asynchronously)
     * 开即时配送订单发票
     * @param alipayCommerceLogisticsInvoiceIstdwaybillCreateModel  (optional)
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
    public okhttp3.Call createAsync(AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel alipayCommerceLogisticsInvoiceIstdwaybillCreateModel, final ApiCallback<AlipayCommerceLogisticsInvoiceIstdwaybillCreateResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayCommerceLogisticsInvoiceIstdwaybillCreateModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayCommerceLogisticsInvoiceIstdwaybillCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call createAsync(AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel alipayCommerceLogisticsInvoiceIstdwaybillCreateModel, final ApiCallback<AlipayCommerceLogisticsInvoiceIstdwaybillCreateResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayCommerceLogisticsInvoiceIstdwaybillCreateModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayCommerceLogisticsInvoiceIstdwaybillCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param logisticsCode 即时配送公司编码 (optional)
     * @param outInvoiceRequestNo 开票请求流水号 (optional)
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
    public okhttp3.Call queryCall(String logisticsCode, String outInvoiceRequestNo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/commerce/logistics/invoice/istdwaybill/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (logisticsCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("logistics_code", logisticsCode));
        }

        if (outInvoiceRequestNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("out_invoice_request_no", outInvoiceRequestNo));
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
    private okhttp3.Call queryValidateBeforeCall(String logisticsCode, String outInvoiceRequestNo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(logisticsCode, outInvoiceRequestNo, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询即时配送订单的开票结果
     * 查询即时配送订单的开票结果
     * @param logisticsCode 即时配送公司编码 (optional)
     * @param outInvoiceRequestNo 开票请求流水号 (optional)
     * @return AlipayCommerceLogisticsInvoiceIstdwaybillQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayCommerceLogisticsInvoiceIstdwaybillQueryResponseModel query(String logisticsCode, String outInvoiceRequestNo) throws ApiException {
        ApiResponse<AlipayCommerceLogisticsInvoiceIstdwaybillQueryResponseModel> localVarResp = queryWithHttpInfo(logisticsCode, outInvoiceRequestNo, null);
        return localVarResp.getData();
    }

    public AlipayCommerceLogisticsInvoiceIstdwaybillQueryResponseModel query(String logisticsCode, String outInvoiceRequestNo, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayCommerceLogisticsInvoiceIstdwaybillQueryResponseModel> localVarResp = queryWithHttpInfo(logisticsCode, outInvoiceRequestNo, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询即时配送订单的开票结果
     * 查询即时配送订单的开票结果
     * @param logisticsCode 即时配送公司编码 (optional)
     * @param outInvoiceRequestNo 开票请求流水号 (optional)
     * @return ApiResponse&lt;AlipayCommerceLogisticsInvoiceIstdwaybillQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayCommerceLogisticsInvoiceIstdwaybillQueryResponseModel> queryWithHttpInfo(String logisticsCode, String outInvoiceRequestNo, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(logisticsCode, outInvoiceRequestNo, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayCommerceLogisticsInvoiceIstdwaybillQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayCommerceLogisticsInvoiceIstdwaybillQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询即时配送订单的开票结果 (asynchronously)
     * 查询即时配送订单的开票结果
     * @param logisticsCode 即时配送公司编码 (optional)
     * @param outInvoiceRequestNo 开票请求流水号 (optional)
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
    public okhttp3.Call queryAsync(String logisticsCode, String outInvoiceRequestNo, final ApiCallback<AlipayCommerceLogisticsInvoiceIstdwaybillQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(logisticsCode, outInvoiceRequestNo, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayCommerceLogisticsInvoiceIstdwaybillQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String logisticsCode, String outInvoiceRequestNo, final ApiCallback<AlipayCommerceLogisticsInvoiceIstdwaybillQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(logisticsCode, outInvoiceRequestNo, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayCommerceLogisticsInvoiceIstdwaybillQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
