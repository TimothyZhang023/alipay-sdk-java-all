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


import com.alipay.v3.model.AlipayDataBillBailQueryDefaultResponse;
import com.alipay.v3.model.AlipayDataBillBailQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayDataBillBailApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayDataBillBailApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayDataBillBailApi(ApiClient apiClient) {
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
     * @param startTime 保证金流水创建时间的起始范围 (optional)
     * @param endTime 保证金流水创建时间的结束范围。与起始时间间隔不超过31天。查询结果为起始时间至结束时间的左闭右开区间 (optional)
     * @param bailType 保证金类型，目前支持TMALL_S_BAIL-天猫保证金，TAOBAO_BAIL-淘宝保证金 (optional)
     * @param transLogId 保证金流水号。如果查询参数中指定流水号，则只查询流水号相关的记录 (optional)
     * @param bizOrigNo 业务基础订单号。如果查询参数中指定订单号，则只查询相关的记录 (optional)
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
    public okhttp3.Call queryCall(String startTime, String endTime, String bailType, String transLogId, String bizOrigNo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/data/bill/bail/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_time", startTime));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
        }

        if (bailType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("bail_type", bailType));
        }

        if (transLogId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("trans_log_id", transLogId));
        }

        if (bizOrigNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("biz_orig_no", bizOrigNo));
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
    private okhttp3.Call queryValidateBeforeCall(String startTime, String endTime, String bailType, String transLogId, String bizOrigNo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(startTime, endTime, bailType, transLogId, bizOrigNo, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 支付宝商家账户保证金查询
     * 为支付宝商家提供支付宝账户保证金信息，供对账使用。
     * @param startTime 保证金流水创建时间的起始范围 (optional)
     * @param endTime 保证金流水创建时间的结束范围。与起始时间间隔不超过31天。查询结果为起始时间至结束时间的左闭右开区间 (optional)
     * @param bailType 保证金类型，目前支持TMALL_S_BAIL-天猫保证金，TAOBAO_BAIL-淘宝保证金 (optional)
     * @param transLogId 保证金流水号。如果查询参数中指定流水号，则只查询流水号相关的记录 (optional)
     * @param bizOrigNo 业务基础订单号。如果查询参数中指定订单号，则只查询相关的记录 (optional)
     * @return AlipayDataBillBailQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayDataBillBailQueryResponseModel query(String startTime, String endTime, String bailType, String transLogId, String bizOrigNo) throws ApiException {
        ApiResponse<AlipayDataBillBailQueryResponseModel> localVarResp = queryWithHttpInfo(startTime, endTime, bailType, transLogId, bizOrigNo, null);
        return localVarResp.getData();
    }

    public AlipayDataBillBailQueryResponseModel query(String startTime, String endTime, String bailType, String transLogId, String bizOrigNo, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayDataBillBailQueryResponseModel> localVarResp = queryWithHttpInfo(startTime, endTime, bailType, transLogId, bizOrigNo, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 支付宝商家账户保证金查询
     * 为支付宝商家提供支付宝账户保证金信息，供对账使用。
     * @param startTime 保证金流水创建时间的起始范围 (optional)
     * @param endTime 保证金流水创建时间的结束范围。与起始时间间隔不超过31天。查询结果为起始时间至结束时间的左闭右开区间 (optional)
     * @param bailType 保证金类型，目前支持TMALL_S_BAIL-天猫保证金，TAOBAO_BAIL-淘宝保证金 (optional)
     * @param transLogId 保证金流水号。如果查询参数中指定流水号，则只查询流水号相关的记录 (optional)
     * @param bizOrigNo 业务基础订单号。如果查询参数中指定订单号，则只查询相关的记录 (optional)
     * @return ApiResponse&lt;AlipayDataBillBailQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayDataBillBailQueryResponseModel> queryWithHttpInfo(String startTime, String endTime, String bailType, String transLogId, String bizOrigNo, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(startTime, endTime, bailType, transLogId, bizOrigNo, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayDataBillBailQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayDataBillBailQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 支付宝商家账户保证金查询 (asynchronously)
     * 为支付宝商家提供支付宝账户保证金信息，供对账使用。
     * @param startTime 保证金流水创建时间的起始范围 (optional)
     * @param endTime 保证金流水创建时间的结束范围。与起始时间间隔不超过31天。查询结果为起始时间至结束时间的左闭右开区间 (optional)
     * @param bailType 保证金类型，目前支持TMALL_S_BAIL-天猫保证金，TAOBAO_BAIL-淘宝保证金 (optional)
     * @param transLogId 保证金流水号。如果查询参数中指定流水号，则只查询流水号相关的记录 (optional)
     * @param bizOrigNo 业务基础订单号。如果查询参数中指定订单号，则只查询相关的记录 (optional)
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
    public okhttp3.Call queryAsync(String startTime, String endTime, String bailType, String transLogId, String bizOrigNo, final ApiCallback<AlipayDataBillBailQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(startTime, endTime, bailType, transLogId, bizOrigNo, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayDataBillBailQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String startTime, String endTime, String bailType, String transLogId, String bizOrigNo, final ApiCallback<AlipayDataBillBailQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(startTime, endTime, bailType, transLogId, bizOrigNo, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayDataBillBailQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
