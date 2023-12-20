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


import com.alipay.v3.model.AlipayCommerceEcEmployeeInviteQueryDefaultResponse;
import com.alipay.v3.model.AlipayCommerceEcEmployeeInviteQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayCommerceEcEmployeeInviteApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayCommerceEcEmployeeInviteApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayCommerceEcEmployeeInviteApi(ApiClient apiClient) {
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
     * @param enterpriseId 企业id (optional)
     * @param employeeId 企业码员工ID (optional)
     * @param pageContentCode 页面内容code (optional)
     * @param withholdingSignStr 代扣签约串 (optional)
     * @param createShareCode 是否生成签约吱口令，不传默认为N (optional)
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
    public okhttp3.Call queryCall(String enterpriseId, String employeeId, String pageContentCode, String withholdingSignStr, String createShareCode, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/commerce/ec/employee/invite";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (enterpriseId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("enterprise_id", enterpriseId));
        }

        if (employeeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("employee_id", employeeId));
        }

        if (pageContentCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_content_code", pageContentCode));
        }

        if (withholdingSignStr != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("withholding_sign_str", withholdingSignStr));
        }

        if (createShareCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("create_share_code", createShareCode));
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
    private okhttp3.Call queryValidateBeforeCall(String enterpriseId, String employeeId, String pageContentCode, String withholdingSignStr, String createShareCode, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(enterpriseId, employeeId, pageContentCode, withholdingSignStr, createShareCode, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 获取员工邀请链接
     * 获取员工邀请链接，若只传入企业ID企业则邀请链接对企业员工均有效，若传入了企业ID和员工ID则链接只对传入的员工ID有效
     * @param enterpriseId 企业id (optional)
     * @param employeeId 企业码员工ID (optional)
     * @param pageContentCode 页面内容code (optional)
     * @param withholdingSignStr 代扣签约串 (optional)
     * @param createShareCode 是否生成签约吱口令，不传默认为N (optional)
     * @return AlipayCommerceEcEmployeeInviteQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayCommerceEcEmployeeInviteQueryResponseModel query(String enterpriseId, String employeeId, String pageContentCode, String withholdingSignStr, String createShareCode) throws ApiException {
        ApiResponse<AlipayCommerceEcEmployeeInviteQueryResponseModel> localVarResp = queryWithHttpInfo(enterpriseId, employeeId, pageContentCode, withholdingSignStr, createShareCode, null);
        return localVarResp.getData();
    }

    public AlipayCommerceEcEmployeeInviteQueryResponseModel query(String enterpriseId, String employeeId, String pageContentCode, String withholdingSignStr, String createShareCode, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayCommerceEcEmployeeInviteQueryResponseModel> localVarResp = queryWithHttpInfo(enterpriseId, employeeId, pageContentCode, withholdingSignStr, createShareCode, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 获取员工邀请链接
     * 获取员工邀请链接，若只传入企业ID企业则邀请链接对企业员工均有效，若传入了企业ID和员工ID则链接只对传入的员工ID有效
     * @param enterpriseId 企业id (optional)
     * @param employeeId 企业码员工ID (optional)
     * @param pageContentCode 页面内容code (optional)
     * @param withholdingSignStr 代扣签约串 (optional)
     * @param createShareCode 是否生成签约吱口令，不传默认为N (optional)
     * @return ApiResponse&lt;AlipayCommerceEcEmployeeInviteQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayCommerceEcEmployeeInviteQueryResponseModel> queryWithHttpInfo(String enterpriseId, String employeeId, String pageContentCode, String withholdingSignStr, String createShareCode, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(enterpriseId, employeeId, pageContentCode, withholdingSignStr, createShareCode, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayCommerceEcEmployeeInviteQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayCommerceEcEmployeeInviteQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 获取员工邀请链接 (asynchronously)
     * 获取员工邀请链接，若只传入企业ID企业则邀请链接对企业员工均有效，若传入了企业ID和员工ID则链接只对传入的员工ID有效
     * @param enterpriseId 企业id (optional)
     * @param employeeId 企业码员工ID (optional)
     * @param pageContentCode 页面内容code (optional)
     * @param withholdingSignStr 代扣签约串 (optional)
     * @param createShareCode 是否生成签约吱口令，不传默认为N (optional)
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
    public okhttp3.Call queryAsync(String enterpriseId, String employeeId, String pageContentCode, String withholdingSignStr, String createShareCode, final ApiCallback<AlipayCommerceEcEmployeeInviteQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(enterpriseId, employeeId, pageContentCode, withholdingSignStr, createShareCode, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayCommerceEcEmployeeInviteQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String enterpriseId, String employeeId, String pageContentCode, String withholdingSignStr, String createShareCode, final ApiCallback<AlipayCommerceEcEmployeeInviteQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(enterpriseId, employeeId, pageContentCode, withholdingSignStr, createShareCode, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayCommerceEcEmployeeInviteQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
