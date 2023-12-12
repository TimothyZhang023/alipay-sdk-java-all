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


import com.alipay.v3.model.AlipayTradeSettleConfirmDefaultResponse;
import com.alipay.v3.model.AlipayTradeSettleConfirmModel;
import com.alipay.v3.model.AlipayTradeSettleConfirmResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayTradeSettleApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayTradeSettleApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayTradeSettleApi(ApiClient apiClient) {
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
     * Build call for confirm
     * @param alipayTradeSettleConfirmModel  (optional)
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
    public okhttp3.Call confirmCall(AlipayTradeSettleConfirmModel alipayTradeSettleConfirmModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayTradeSettleConfirmModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/trade/settle/confirm";

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
    private okhttp3.Call confirmValidateBeforeCall(AlipayTradeSettleConfirmModel alipayTradeSettleConfirmModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = confirmCall(alipayTradeSettleConfirmModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 统一收单确认结算接口
     * 用户付款后，平台上的卖家发货，用户收到商品确认收货后，平台通过确认结算接口，将交易款结算给指定的卖家账户。 单笔结算到卖家余额的场景支持分账冻结。在确认结算时，传入冻结标识 royalty_freeze&#x3D;true，资金结算到卖家支付宝余额后，会先冻结在不可用余额中，后续分账将自动从冻结余额划出，平台商可调用分账完结释放冻结资金，系统默认在冻结30天后自动解冻。解冻后，仍可以发起分账。为保证分账成功率，请尽可能在分账冻结期内分账。
     * @param alipayTradeSettleConfirmModel  (optional)
     * @return AlipayTradeSettleConfirmResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayTradeSettleConfirmResponseModel confirm(AlipayTradeSettleConfirmModel alipayTradeSettleConfirmModel) throws ApiException {
        ApiResponse<AlipayTradeSettleConfirmResponseModel> localVarResp = confirmWithHttpInfo(alipayTradeSettleConfirmModel, null);
        return localVarResp.getData();
    }

    public AlipayTradeSettleConfirmResponseModel confirm(AlipayTradeSettleConfirmModel alipayTradeSettleConfirmModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayTradeSettleConfirmResponseModel> localVarResp = confirmWithHttpInfo(alipayTradeSettleConfirmModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 统一收单确认结算接口
     * 用户付款后，平台上的卖家发货，用户收到商品确认收货后，平台通过确认结算接口，将交易款结算给指定的卖家账户。 单笔结算到卖家余额的场景支持分账冻结。在确认结算时，传入冻结标识 royalty_freeze&#x3D;true，资金结算到卖家支付宝余额后，会先冻结在不可用余额中，后续分账将自动从冻结余额划出，平台商可调用分账完结释放冻结资金，系统默认在冻结30天后自动解冻。解冻后，仍可以发起分账。为保证分账成功率，请尽可能在分账冻结期内分账。
     * @param alipayTradeSettleConfirmModel  (optional)
     * @return ApiResponse&lt;AlipayTradeSettleConfirmResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayTradeSettleConfirmResponseModel> confirmWithHttpInfo(AlipayTradeSettleConfirmModel alipayTradeSettleConfirmModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = confirmValidateBeforeCall(alipayTradeSettleConfirmModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayTradeSettleConfirmResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayTradeSettleConfirmDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 统一收单确认结算接口 (asynchronously)
     * 用户付款后，平台上的卖家发货，用户收到商品确认收货后，平台通过确认结算接口，将交易款结算给指定的卖家账户。 单笔结算到卖家余额的场景支持分账冻结。在确认结算时，传入冻结标识 royalty_freeze&#x3D;true，资金结算到卖家支付宝余额后，会先冻结在不可用余额中，后续分账将自动从冻结余额划出，平台商可调用分账完结释放冻结资金，系统默认在冻结30天后自动解冻。解冻后，仍可以发起分账。为保证分账成功率，请尽可能在分账冻结期内分账。
     * @param alipayTradeSettleConfirmModel  (optional)
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
    public okhttp3.Call confirmAsync(AlipayTradeSettleConfirmModel alipayTradeSettleConfirmModel, final ApiCallback<AlipayTradeSettleConfirmResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = confirmValidateBeforeCall(alipayTradeSettleConfirmModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayTradeSettleConfirmResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call confirmAsync(AlipayTradeSettleConfirmModel alipayTradeSettleConfirmModel, final ApiCallback<AlipayTradeSettleConfirmResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = confirmValidateBeforeCall(alipayTradeSettleConfirmModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayTradeSettleConfirmResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
