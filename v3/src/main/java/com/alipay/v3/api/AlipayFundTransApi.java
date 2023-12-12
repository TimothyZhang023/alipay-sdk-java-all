/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2023-12-12
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


import com.alipay.v3.model.AlipayFundTransPayDefaultResponse;
import com.alipay.v3.model.AlipayFundTransPayModel;
import com.alipay.v3.model.AlipayFundTransPayResponseModel;
import com.alipay.v3.model.AlipayFundTransRefundDefaultResponse;
import com.alipay.v3.model.AlipayFundTransRefundModel;
import com.alipay.v3.model.AlipayFundTransRefundResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayFundTransApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayFundTransApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayFundTransApi(ApiClient apiClient) {
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
     * Build call for pay
     * @param alipayFundTransPayModel  (optional)
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
    public okhttp3.Call payCall(AlipayFundTransPayModel alipayFundTransPayModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayFundTransPayModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/fund/trans/pay";

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
    private okhttp3.Call payValidateBeforeCall(AlipayFundTransPayModel alipayFundTransPayModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = payCall(alipayFundTransPayModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 资金支付接口
     * 付款方通过协议、二维码、声波、人脸等方式，通过本接口提交给支付宝直接完成支付。
     * @param alipayFundTransPayModel  (optional)
     * @return AlipayFundTransPayResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayFundTransPayResponseModel pay(AlipayFundTransPayModel alipayFundTransPayModel) throws ApiException {
        ApiResponse<AlipayFundTransPayResponseModel> localVarResp = payWithHttpInfo(alipayFundTransPayModel, null);
        return localVarResp.getData();
    }

    public AlipayFundTransPayResponseModel pay(AlipayFundTransPayModel alipayFundTransPayModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayFundTransPayResponseModel> localVarResp = payWithHttpInfo(alipayFundTransPayModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 资金支付接口
     * 付款方通过协议、二维码、声波、人脸等方式，通过本接口提交给支付宝直接完成支付。
     * @param alipayFundTransPayModel  (optional)
     * @return ApiResponse&lt;AlipayFundTransPayResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayFundTransPayResponseModel> payWithHttpInfo(AlipayFundTransPayModel alipayFundTransPayModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = payValidateBeforeCall(alipayFundTransPayModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayFundTransPayResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayFundTransPayDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 资金支付接口 (asynchronously)
     * 付款方通过协议、二维码、声波、人脸等方式，通过本接口提交给支付宝直接完成支付。
     * @param alipayFundTransPayModel  (optional)
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
    public okhttp3.Call payAsync(AlipayFundTransPayModel alipayFundTransPayModel, final ApiCallback<AlipayFundTransPayResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = payValidateBeforeCall(alipayFundTransPayModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayFundTransPayResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call payAsync(AlipayFundTransPayModel alipayFundTransPayModel, final ApiCallback<AlipayFundTransPayResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = payValidateBeforeCall(alipayFundTransPayModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayFundTransPayResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for refund
     * @param alipayFundTransRefundModel  (optional)
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
    public okhttp3.Call refundCall(AlipayFundTransRefundModel alipayFundTransRefundModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayFundTransRefundModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/fund/trans/refund";

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
    private okhttp3.Call refundValidateBeforeCall(AlipayFundTransRefundModel alipayFundTransRefundModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = refundCall(alipayFundTransRefundModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 资金退回接口
     * 当资金支付一段时间后，由于收款方一直没有收钱（比如抢红包），可以通过退款接口将资金退换给付款方。支付宝将会按照退款规则将支付款按原路退到付款方帐号上。   交易超过约定时间（签约时设置的可退款时间）的订单无法进行退款。支付宝退款支持单笔交易分多次退回，多次退款需要提交原支付订单的商户订单号和设置不同的退款单号。一笔退款失败后重新提交，要采用原来的退款单号。总退款金额不能超过（用户实际支付金额-已领红包）的金额。
     * @param alipayFundTransRefundModel  (optional)
     * @return AlipayFundTransRefundResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayFundTransRefundResponseModel refund(AlipayFundTransRefundModel alipayFundTransRefundModel) throws ApiException {
        ApiResponse<AlipayFundTransRefundResponseModel> localVarResp = refundWithHttpInfo(alipayFundTransRefundModel, null);
        return localVarResp.getData();
    }

    public AlipayFundTransRefundResponseModel refund(AlipayFundTransRefundModel alipayFundTransRefundModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayFundTransRefundResponseModel> localVarResp = refundWithHttpInfo(alipayFundTransRefundModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 资金退回接口
     * 当资金支付一段时间后，由于收款方一直没有收钱（比如抢红包），可以通过退款接口将资金退换给付款方。支付宝将会按照退款规则将支付款按原路退到付款方帐号上。   交易超过约定时间（签约时设置的可退款时间）的订单无法进行退款。支付宝退款支持单笔交易分多次退回，多次退款需要提交原支付订单的商户订单号和设置不同的退款单号。一笔退款失败后重新提交，要采用原来的退款单号。总退款金额不能超过（用户实际支付金额-已领红包）的金额。
     * @param alipayFundTransRefundModel  (optional)
     * @return ApiResponse&lt;AlipayFundTransRefundResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayFundTransRefundResponseModel> refundWithHttpInfo(AlipayFundTransRefundModel alipayFundTransRefundModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = refundValidateBeforeCall(alipayFundTransRefundModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayFundTransRefundResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayFundTransRefundDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 资金退回接口 (asynchronously)
     * 当资金支付一段时间后，由于收款方一直没有收钱（比如抢红包），可以通过退款接口将资金退换给付款方。支付宝将会按照退款规则将支付款按原路退到付款方帐号上。   交易超过约定时间（签约时设置的可退款时间）的订单无法进行退款。支付宝退款支持单笔交易分多次退回，多次退款需要提交原支付订单的商户订单号和设置不同的退款单号。一笔退款失败后重新提交，要采用原来的退款单号。总退款金额不能超过（用户实际支付金额-已领红包）的金额。
     * @param alipayFundTransRefundModel  (optional)
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
    public okhttp3.Call refundAsync(AlipayFundTransRefundModel alipayFundTransRefundModel, final ApiCallback<AlipayFundTransRefundResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = refundValidateBeforeCall(alipayFundTransRefundModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayFundTransRefundResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call refundAsync(AlipayFundTransRefundModel alipayFundTransRefundModel, final ApiCallback<AlipayFundTransRefundResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = refundValidateBeforeCall(alipayFundTransRefundModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayFundTransRefundResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
