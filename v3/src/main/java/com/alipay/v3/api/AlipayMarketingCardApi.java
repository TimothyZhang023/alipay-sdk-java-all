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


import com.alipay.v3.model.AlipayMarketingCardDeleteDefaultResponse;
import com.alipay.v3.model.AlipayMarketingCardDeleteResponseModel;
import com.alipay.v3.model.AlipayMarketingCardOpenDefaultResponse;
import com.alipay.v3.model.AlipayMarketingCardOpenModel;
import com.alipay.v3.model.AlipayMarketingCardOpenResponseModel;
import com.alipay.v3.model.AlipayMarketingCardQueryDefaultResponse;
import com.alipay.v3.model.AlipayMarketingCardQueryModel;
import com.alipay.v3.model.AlipayMarketingCardQueryResponseModel;
import com.alipay.v3.model.AlipayMarketingCardUpdateDefaultResponse;
import com.alipay.v3.model.AlipayMarketingCardUpdateModel;
import com.alipay.v3.model.AlipayMarketingCardUpdateResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayMarketingCardApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayMarketingCardApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayMarketingCardApi(ApiClient apiClient) {
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
     * Build call for delete
     * @param outSerialNo 商户端删卡业务流水号，商户自定义且需确保流水号唯一性。 (optional)
     * @param targetCardNo 支付宝业务卡号。即开卡接口返回结果中的card_info.biz_card_no。 (optional)
     * @param targetCardNoType 卡号ID类型 (optional)
     * @param reasonCode 删卡原因  USER_UNBUND：用户解绑（可以重新绑定）  CANCEL：销户（完成销户后，就不能再重新绑定）  PRESENT：转赠（可以重新绑定） (optional)
     * @param extInfo 删卡扩展参数，json格式。  用于商户的特定业务信息的传递，只有商户与支付宝约定了传递此参数且约定了参数含义，此参数才有效。  目前支持如下key：  new_card_no：新卡号  donee_user_id：受赠人userId (optional)
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
    public okhttp3.Call deleteCall(String outSerialNo, String targetCardNo, String targetCardNoType, String reasonCode, String extInfo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/marketing/card/delete";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (outSerialNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("out_serial_no", outSerialNo));
        }

        if (targetCardNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("target_card_no", targetCardNo));
        }

        if (targetCardNoType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("target_card_no_type", targetCardNoType));
        }

        if (reasonCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("reason_code", reasonCode));
        }

        if (extInfo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ext_info", extInfo));
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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteValidateBeforeCall(String outSerialNo, String targetCardNo, String targetCardNoType, String reasonCode, String extInfo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = deleteCall(outSerialNo, targetCardNo, targetCardNoType, reasonCode, extInfo, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 会员卡删卡
     * 通过 API 接口删除商家会员卡。
     * @param outSerialNo 商户端删卡业务流水号，商户自定义且需确保流水号唯一性。 (optional)
     * @param targetCardNo 支付宝业务卡号。即开卡接口返回结果中的card_info.biz_card_no。 (optional)
     * @param targetCardNoType 卡号ID类型 (optional)
     * @param reasonCode 删卡原因  USER_UNBUND：用户解绑（可以重新绑定）  CANCEL：销户（完成销户后，就不能再重新绑定）  PRESENT：转赠（可以重新绑定） (optional)
     * @param extInfo 删卡扩展参数，json格式。  用于商户的特定业务信息的传递，只有商户与支付宝约定了传递此参数且约定了参数含义，此参数才有效。  目前支持如下key：  new_card_no：新卡号  donee_user_id：受赠人userId (optional)
     * @return AlipayMarketingCardDeleteResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayMarketingCardDeleteResponseModel delete(String outSerialNo, String targetCardNo, String targetCardNoType, String reasonCode, String extInfo) throws ApiException {
        ApiResponse<AlipayMarketingCardDeleteResponseModel> localVarResp = deleteWithHttpInfo(outSerialNo, targetCardNo, targetCardNoType, reasonCode, extInfo, null);
        return localVarResp.getData();
    }

    public AlipayMarketingCardDeleteResponseModel delete(String outSerialNo, String targetCardNo, String targetCardNoType, String reasonCode, String extInfo, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayMarketingCardDeleteResponseModel> localVarResp = deleteWithHttpInfo(outSerialNo, targetCardNo, targetCardNoType, reasonCode, extInfo, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 会员卡删卡
     * 通过 API 接口删除商家会员卡。
     * @param outSerialNo 商户端删卡业务流水号，商户自定义且需确保流水号唯一性。 (optional)
     * @param targetCardNo 支付宝业务卡号。即开卡接口返回结果中的card_info.biz_card_no。 (optional)
     * @param targetCardNoType 卡号ID类型 (optional)
     * @param reasonCode 删卡原因  USER_UNBUND：用户解绑（可以重新绑定）  CANCEL：销户（完成销户后，就不能再重新绑定）  PRESENT：转赠（可以重新绑定） (optional)
     * @param extInfo 删卡扩展参数，json格式。  用于商户的特定业务信息的传递，只有商户与支付宝约定了传递此参数且约定了参数含义，此参数才有效。  目前支持如下key：  new_card_no：新卡号  donee_user_id：受赠人userId (optional)
     * @return ApiResponse&lt;AlipayMarketingCardDeleteResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayMarketingCardDeleteResponseModel> deleteWithHttpInfo(String outSerialNo, String targetCardNo, String targetCardNoType, String reasonCode, String extInfo, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = deleteValidateBeforeCall(outSerialNo, targetCardNo, targetCardNoType, reasonCode, extInfo, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayMarketingCardDeleteResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMarketingCardDeleteDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 会员卡删卡 (asynchronously)
     * 通过 API 接口删除商家会员卡。
     * @param outSerialNo 商户端删卡业务流水号，商户自定义且需确保流水号唯一性。 (optional)
     * @param targetCardNo 支付宝业务卡号。即开卡接口返回结果中的card_info.biz_card_no。 (optional)
     * @param targetCardNoType 卡号ID类型 (optional)
     * @param reasonCode 删卡原因  USER_UNBUND：用户解绑（可以重新绑定）  CANCEL：销户（完成销户后，就不能再重新绑定）  PRESENT：转赠（可以重新绑定） (optional)
     * @param extInfo 删卡扩展参数，json格式。  用于商户的特定业务信息的传递，只有商户与支付宝约定了传递此参数且约定了参数含义，此参数才有效。  目前支持如下key：  new_card_no：新卡号  donee_user_id：受赠人userId (optional)
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
    public okhttp3.Call deleteAsync(String outSerialNo, String targetCardNo, String targetCardNoType, String reasonCode, String extInfo, final ApiCallback<AlipayMarketingCardDeleteResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteValidateBeforeCall(outSerialNo, targetCardNo, targetCardNoType, reasonCode, extInfo, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayMarketingCardDeleteResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call deleteAsync(String outSerialNo, String targetCardNo, String targetCardNoType, String reasonCode, String extInfo, final ApiCallback<AlipayMarketingCardDeleteResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = deleteValidateBeforeCall(outSerialNo, targetCardNo, targetCardNoType, reasonCode, extInfo, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayMarketingCardDeleteResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for open
     * @param authToken 用户授权令牌 (optional)
     * @param alipayMarketingCardOpenModel  (optional)
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
    public okhttp3.Call openCall(String authToken, AlipayMarketingCardOpenModel alipayMarketingCardOpenModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayMarketingCardOpenModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/marketing/card/open";

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
    private okhttp3.Call openValidateBeforeCall(String authToken, AlipayMarketingCardOpenModel alipayMarketingCardOpenModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = openCall(authToken, alipayMarketingCardOpenModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 会员卡开卡
     * 商户通过API接口，进行会员卡开卡。
     * @param authToken 用户授权令牌 (optional)
     * @param alipayMarketingCardOpenModel  (optional)
     * @return AlipayMarketingCardOpenResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayMarketingCardOpenResponseModel open(String authToken, AlipayMarketingCardOpenModel alipayMarketingCardOpenModel) throws ApiException {
        ApiResponse<AlipayMarketingCardOpenResponseModel> localVarResp = openWithHttpInfo(authToken, alipayMarketingCardOpenModel, null);
        return localVarResp.getData();
    }

    public AlipayMarketingCardOpenResponseModel open(String authToken, AlipayMarketingCardOpenModel alipayMarketingCardOpenModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayMarketingCardOpenResponseModel> localVarResp = openWithHttpInfo(authToken, alipayMarketingCardOpenModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 会员卡开卡
     * 商户通过API接口，进行会员卡开卡。
     * @param authToken 用户授权令牌 (optional)
     * @param alipayMarketingCardOpenModel  (optional)
     * @return ApiResponse&lt;AlipayMarketingCardOpenResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayMarketingCardOpenResponseModel> openWithHttpInfo(String authToken, AlipayMarketingCardOpenModel alipayMarketingCardOpenModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = openValidateBeforeCall(authToken, alipayMarketingCardOpenModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayMarketingCardOpenResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMarketingCardOpenDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 会员卡开卡 (asynchronously)
     * 商户通过API接口，进行会员卡开卡。
     * @param authToken 用户授权令牌 (optional)
     * @param alipayMarketingCardOpenModel  (optional)
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
    public okhttp3.Call openAsync(String authToken, AlipayMarketingCardOpenModel alipayMarketingCardOpenModel, final ApiCallback<AlipayMarketingCardOpenResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = openValidateBeforeCall(authToken, alipayMarketingCardOpenModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayMarketingCardOpenResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call openAsync(String authToken, AlipayMarketingCardOpenModel alipayMarketingCardOpenModel, final ApiCallback<AlipayMarketingCardOpenResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = openValidateBeforeCall(authToken, alipayMarketingCardOpenModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayMarketingCardOpenResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param alipayMarketingCardQueryModel  (optional)
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
    public okhttp3.Call queryCall(AlipayMarketingCardQueryModel alipayMarketingCardQueryModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayMarketingCardQueryModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/marketing/card/query";

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
    private okhttp3.Call queryValidateBeforeCall(AlipayMarketingCardQueryModel alipayMarketingCardQueryModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(alipayMarketingCardQueryModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 会员卡查询
     * 根据卡号或者持卡人信息查询会员卡信息
     * @param alipayMarketingCardQueryModel  (optional)
     * @return AlipayMarketingCardQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayMarketingCardQueryResponseModel query(AlipayMarketingCardQueryModel alipayMarketingCardQueryModel) throws ApiException {
        ApiResponse<AlipayMarketingCardQueryResponseModel> localVarResp = queryWithHttpInfo(alipayMarketingCardQueryModel, null);
        return localVarResp.getData();
    }

    public AlipayMarketingCardQueryResponseModel query(AlipayMarketingCardQueryModel alipayMarketingCardQueryModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayMarketingCardQueryResponseModel> localVarResp = queryWithHttpInfo(alipayMarketingCardQueryModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 会员卡查询
     * 根据卡号或者持卡人信息查询会员卡信息
     * @param alipayMarketingCardQueryModel  (optional)
     * @return ApiResponse&lt;AlipayMarketingCardQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayMarketingCardQueryResponseModel> queryWithHttpInfo(AlipayMarketingCardQueryModel alipayMarketingCardQueryModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(alipayMarketingCardQueryModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayMarketingCardQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMarketingCardQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 会员卡查询 (asynchronously)
     * 根据卡号或者持卡人信息查询会员卡信息
     * @param alipayMarketingCardQueryModel  (optional)
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
    public okhttp3.Call queryAsync(AlipayMarketingCardQueryModel alipayMarketingCardQueryModel, final ApiCallback<AlipayMarketingCardQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(alipayMarketingCardQueryModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayMarketingCardQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(AlipayMarketingCardQueryModel alipayMarketingCardQueryModel, final ApiCallback<AlipayMarketingCardQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(alipayMarketingCardQueryModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayMarketingCardQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for update
     * @param alipayMarketingCardUpdateModel  (optional)
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
    public okhttp3.Call updateCall(AlipayMarketingCardUpdateModel alipayMarketingCardUpdateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayMarketingCardUpdateModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/marketing/card/update";

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
    private okhttp3.Call updateValidateBeforeCall(AlipayMarketingCardUpdateModel alipayMarketingCardUpdateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = updateCall(alipayMarketingCardUpdateModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 会员卡更新
     * 会员卡更新
     * @param alipayMarketingCardUpdateModel  (optional)
     * @return AlipayMarketingCardUpdateResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayMarketingCardUpdateResponseModel update(AlipayMarketingCardUpdateModel alipayMarketingCardUpdateModel) throws ApiException {
        ApiResponse<AlipayMarketingCardUpdateResponseModel> localVarResp = updateWithHttpInfo(alipayMarketingCardUpdateModel, null);
        return localVarResp.getData();
    }

    public AlipayMarketingCardUpdateResponseModel update(AlipayMarketingCardUpdateModel alipayMarketingCardUpdateModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayMarketingCardUpdateResponseModel> localVarResp = updateWithHttpInfo(alipayMarketingCardUpdateModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 会员卡更新
     * 会员卡更新
     * @param alipayMarketingCardUpdateModel  (optional)
     * @return ApiResponse&lt;AlipayMarketingCardUpdateResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayMarketingCardUpdateResponseModel> updateWithHttpInfo(AlipayMarketingCardUpdateModel alipayMarketingCardUpdateModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = updateValidateBeforeCall(alipayMarketingCardUpdateModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayMarketingCardUpdateResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMarketingCardUpdateDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 会员卡更新 (asynchronously)
     * 会员卡更新
     * @param alipayMarketingCardUpdateModel  (optional)
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
    public okhttp3.Call updateAsync(AlipayMarketingCardUpdateModel alipayMarketingCardUpdateModel, final ApiCallback<AlipayMarketingCardUpdateResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateValidateBeforeCall(alipayMarketingCardUpdateModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayMarketingCardUpdateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call updateAsync(AlipayMarketingCardUpdateModel alipayMarketingCardUpdateModel, final ApiCallback<AlipayMarketingCardUpdateResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = updateValidateBeforeCall(alipayMarketingCardUpdateModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayMarketingCardUpdateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
