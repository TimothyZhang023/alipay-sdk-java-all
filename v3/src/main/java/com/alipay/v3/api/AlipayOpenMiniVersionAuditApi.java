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


import com.alipay.v3.model.AlipayOpenMiniVersionAuditApplyDefaultResponse;
import com.alipay.v3.model.AlipayOpenMiniVersionAuditApplyModel;
import com.alipay.v3.model.AlipayOpenMiniVersionAuditApplyResponseModel;
import com.alipay.v3.model.AlipayOpenMiniVersionAuditCancelDefaultResponse;
import com.alipay.v3.model.AlipayOpenMiniVersionAuditCancelModel;
import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayOpenMiniVersionAuditApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayOpenMiniVersionAuditApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayOpenMiniVersionAuditApi(ApiClient apiClient) {
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
     * Build call for apply
     * @param appLogo  (optional)
     * @param data  (optional)
     * @param fifthLicensePic  (optional)
     * @param fifthScreenShot  (optional)
     * @param firstLicensePic  (optional)
     * @param firstScreenShot  (optional)
     * @param firstSpecialLicensePic  (optional)
     * @param fourthLicensePic  (optional)
     * @param fourthScreenShot  (optional)
     * @param outDoorPic  (optional)
     * @param secondLicensePic  (optional)
     * @param secondScreenShot  (optional)
     * @param secondSpecialLicensePic  (optional)
     * @param testFileName  (optional)
     * @param thirdLicensePic  (optional)
     * @param thirdScreenShot  (optional)
     * @param thirdSpecialLicensePic  (optional)
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
    public okhttp3.Call applyCall(File appLogo, AlipayOpenMiniVersionAuditApplyModel data, File fifthLicensePic, File fifthScreenShot, File firstLicensePic, File firstScreenShot, File firstSpecialLicensePic, File fourthLicensePic, File fourthScreenShot, File outDoorPic, File secondLicensePic, File secondScreenShot, File secondSpecialLicensePic, File testFileName, File thirdLicensePic, File thirdScreenShot, File thirdSpecialLicensePic, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/open/mini/version/audit/apply";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (appLogo != null) {
            localVarFormParams.put("app_logo", appLogo);
        }

        if (data != null) {
            localVarFormParams.put("data", data);
        }
        //自定义body内容
        if (customizedParams != null && !Strings.isNullOrEmpty(customizedParams.getBodyContent())) {
            localVarFormParams.put("data", customizedParams.getBodyContent());
        }

        if (fifthLicensePic != null) {
            localVarFormParams.put("fifth_license_pic", fifthLicensePic);
        }

        if (fifthScreenShot != null) {
            localVarFormParams.put("fifth_screen_shot", fifthScreenShot);
        }

        if (firstLicensePic != null) {
            localVarFormParams.put("first_license_pic", firstLicensePic);
        }

        if (firstScreenShot != null) {
            localVarFormParams.put("first_screen_shot", firstScreenShot);
        }

        if (firstSpecialLicensePic != null) {
            localVarFormParams.put("first_special_license_pic", firstSpecialLicensePic);
        }

        if (fourthLicensePic != null) {
            localVarFormParams.put("fourth_license_pic", fourthLicensePic);
        }

        if (fourthScreenShot != null) {
            localVarFormParams.put("fourth_screen_shot", fourthScreenShot);
        }

        if (outDoorPic != null) {
            localVarFormParams.put("out_door_pic", outDoorPic);
        }

        if (secondLicensePic != null) {
            localVarFormParams.put("second_license_pic", secondLicensePic);
        }

        if (secondScreenShot != null) {
            localVarFormParams.put("second_screen_shot", secondScreenShot);
        }

        if (secondSpecialLicensePic != null) {
            localVarFormParams.put("second_special_license_pic", secondSpecialLicensePic);
        }

        if (testFileName != null) {
            localVarFormParams.put("test_file_name", testFileName);
        }

        if (thirdLicensePic != null) {
            localVarFormParams.put("third_license_pic", thirdLicensePic);
        }

        if (thirdScreenShot != null) {
            localVarFormParams.put("third_screen_shot", thirdScreenShot);
        }

        if (thirdSpecialLicensePic != null) {
            localVarFormParams.put("third_special_license_pic", thirdSpecialLicensePic);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
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
    private okhttp3.Call applyValidateBeforeCall(File appLogo, AlipayOpenMiniVersionAuditApplyModel data, File fifthLicensePic, File fifthScreenShot, File firstLicensePic, File firstScreenShot, File firstSpecialLicensePic, File fourthLicensePic, File fourthScreenShot, File outDoorPic, File secondLicensePic, File secondScreenShot, File secondSpecialLicensePic, File testFileName, File thirdLicensePic, File thirdScreenShot, File thirdSpecialLicensePic, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = applyCall(appLogo, data, fifthLicensePic, fifthScreenShot, firstLicensePic, firstScreenShot, firstSpecialLicensePic, fourthLicensePic, fourthScreenShot, outDoorPic, secondLicensePic, secondScreenShot, secondSpecialLicensePic, testFileName, thirdLicensePic, thirdScreenShot, thirdSpecialLicensePic, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 小程序提交审核
     * 小程序提交审核。 1、本接口中关于小程序基础信息的一些字段例如小程序名称、小程序logo、客服电话等，这些信息如果你前期已经设置过，平台将会在你本次调用接口的时候，将上一次设置的信息自动填入，所以允许你本次调用时不传入。如果你前期还未设置过这些信息，则本次调用是需要必传的。具体的字段要求详见每个字段的描述。你可以用alipay.open.mini.version.detail.query接口查询小程序信息之前是否已经设置。 2、小程序版本信息例如小程序版本号、小程序版本描述，这些信息是需要你每次调用接口必传的。 3、本接口涉及到“审核流程拆分”、“审核加急”、“自动上架”的功能，具体功能详见接口字段audit_rule、speed_up、auto_online描述。 4、普通模板构建的商家小程序限 5个小程序/模板/日，可以升级为标准版，标准版没有数量限制。
     * @param appLogo  (optional)
     * @param data  (optional)
     * @param fifthLicensePic  (optional)
     * @param fifthScreenShot  (optional)
     * @param firstLicensePic  (optional)
     * @param firstScreenShot  (optional)
     * @param firstSpecialLicensePic  (optional)
     * @param fourthLicensePic  (optional)
     * @param fourthScreenShot  (optional)
     * @param outDoorPic  (optional)
     * @param secondLicensePic  (optional)
     * @param secondScreenShot  (optional)
     * @param secondSpecialLicensePic  (optional)
     * @param testFileName  (optional)
     * @param thirdLicensePic  (optional)
     * @param thirdScreenShot  (optional)
     * @param thirdSpecialLicensePic  (optional)
     * @return AlipayOpenMiniVersionAuditApplyResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenMiniVersionAuditApplyResponseModel apply(File appLogo, AlipayOpenMiniVersionAuditApplyModel data, File fifthLicensePic, File fifthScreenShot, File firstLicensePic, File firstScreenShot, File firstSpecialLicensePic, File fourthLicensePic, File fourthScreenShot, File outDoorPic, File secondLicensePic, File secondScreenShot, File secondSpecialLicensePic, File testFileName, File thirdLicensePic, File thirdScreenShot, File thirdSpecialLicensePic) throws ApiException {
        ApiResponse<AlipayOpenMiniVersionAuditApplyResponseModel> localVarResp = applyWithHttpInfo(appLogo, data, fifthLicensePic, fifthScreenShot, firstLicensePic, firstScreenShot, firstSpecialLicensePic, fourthLicensePic, fourthScreenShot, outDoorPic, secondLicensePic, secondScreenShot, secondSpecialLicensePic, testFileName, thirdLicensePic, thirdScreenShot, thirdSpecialLicensePic, null);
        return localVarResp.getData();
    }

    public AlipayOpenMiniVersionAuditApplyResponseModel apply(File appLogo, AlipayOpenMiniVersionAuditApplyModel data, File fifthLicensePic, File fifthScreenShot, File firstLicensePic, File firstScreenShot, File firstSpecialLicensePic, File fourthLicensePic, File fourthScreenShot, File outDoorPic, File secondLicensePic, File secondScreenShot, File secondSpecialLicensePic, File testFileName, File thirdLicensePic, File thirdScreenShot, File thirdSpecialLicensePic, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenMiniVersionAuditApplyResponseModel> localVarResp = applyWithHttpInfo(appLogo, data, fifthLicensePic, fifthScreenShot, firstLicensePic, firstScreenShot, firstSpecialLicensePic, fourthLicensePic, fourthScreenShot, outDoorPic, secondLicensePic, secondScreenShot, secondSpecialLicensePic, testFileName, thirdLicensePic, thirdScreenShot, thirdSpecialLicensePic, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 小程序提交审核
     * 小程序提交审核。 1、本接口中关于小程序基础信息的一些字段例如小程序名称、小程序logo、客服电话等，这些信息如果你前期已经设置过，平台将会在你本次调用接口的时候，将上一次设置的信息自动填入，所以允许你本次调用时不传入。如果你前期还未设置过这些信息，则本次调用是需要必传的。具体的字段要求详见每个字段的描述。你可以用alipay.open.mini.version.detail.query接口查询小程序信息之前是否已经设置。 2、小程序版本信息例如小程序版本号、小程序版本描述，这些信息是需要你每次调用接口必传的。 3、本接口涉及到“审核流程拆分”、“审核加急”、“自动上架”的功能，具体功能详见接口字段audit_rule、speed_up、auto_online描述。 4、普通模板构建的商家小程序限 5个小程序/模板/日，可以升级为标准版，标准版没有数量限制。
     * @param appLogo  (optional)
     * @param data  (optional)
     * @param fifthLicensePic  (optional)
     * @param fifthScreenShot  (optional)
     * @param firstLicensePic  (optional)
     * @param firstScreenShot  (optional)
     * @param firstSpecialLicensePic  (optional)
     * @param fourthLicensePic  (optional)
     * @param fourthScreenShot  (optional)
     * @param outDoorPic  (optional)
     * @param secondLicensePic  (optional)
     * @param secondScreenShot  (optional)
     * @param secondSpecialLicensePic  (optional)
     * @param testFileName  (optional)
     * @param thirdLicensePic  (optional)
     * @param thirdScreenShot  (optional)
     * @param thirdSpecialLicensePic  (optional)
     * @return ApiResponse&lt;AlipayOpenMiniVersionAuditApplyResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenMiniVersionAuditApplyResponseModel> applyWithHttpInfo(File appLogo, AlipayOpenMiniVersionAuditApplyModel data, File fifthLicensePic, File fifthScreenShot, File firstLicensePic, File firstScreenShot, File firstSpecialLicensePic, File fourthLicensePic, File fourthScreenShot, File outDoorPic, File secondLicensePic, File secondScreenShot, File secondSpecialLicensePic, File testFileName, File thirdLicensePic, File thirdScreenShot, File thirdSpecialLicensePic, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = applyValidateBeforeCall(appLogo, data, fifthLicensePic, fifthScreenShot, firstLicensePic, firstScreenShot, firstSpecialLicensePic, fourthLicensePic, fourthScreenShot, outDoorPic, secondLicensePic, secondScreenShot, secondSpecialLicensePic, testFileName, thirdLicensePic, thirdScreenShot, thirdSpecialLicensePic, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenMiniVersionAuditApplyResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenMiniVersionAuditApplyDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 小程序提交审核 (asynchronously)
     * 小程序提交审核。 1、本接口中关于小程序基础信息的一些字段例如小程序名称、小程序logo、客服电话等，这些信息如果你前期已经设置过，平台将会在你本次调用接口的时候，将上一次设置的信息自动填入，所以允许你本次调用时不传入。如果你前期还未设置过这些信息，则本次调用是需要必传的。具体的字段要求详见每个字段的描述。你可以用alipay.open.mini.version.detail.query接口查询小程序信息之前是否已经设置。 2、小程序版本信息例如小程序版本号、小程序版本描述，这些信息是需要你每次调用接口必传的。 3、本接口涉及到“审核流程拆分”、“审核加急”、“自动上架”的功能，具体功能详见接口字段audit_rule、speed_up、auto_online描述。 4、普通模板构建的商家小程序限 5个小程序/模板/日，可以升级为标准版，标准版没有数量限制。
     * @param appLogo  (optional)
     * @param data  (optional)
     * @param fifthLicensePic  (optional)
     * @param fifthScreenShot  (optional)
     * @param firstLicensePic  (optional)
     * @param firstScreenShot  (optional)
     * @param firstSpecialLicensePic  (optional)
     * @param fourthLicensePic  (optional)
     * @param fourthScreenShot  (optional)
     * @param outDoorPic  (optional)
     * @param secondLicensePic  (optional)
     * @param secondScreenShot  (optional)
     * @param secondSpecialLicensePic  (optional)
     * @param testFileName  (optional)
     * @param thirdLicensePic  (optional)
     * @param thirdScreenShot  (optional)
     * @param thirdSpecialLicensePic  (optional)
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
    public okhttp3.Call applyAsync(File appLogo, AlipayOpenMiniVersionAuditApplyModel data, File fifthLicensePic, File fifthScreenShot, File firstLicensePic, File firstScreenShot, File firstSpecialLicensePic, File fourthLicensePic, File fourthScreenShot, File outDoorPic, File secondLicensePic, File secondScreenShot, File secondSpecialLicensePic, File testFileName, File thirdLicensePic, File thirdScreenShot, File thirdSpecialLicensePic, final ApiCallback<AlipayOpenMiniVersionAuditApplyResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = applyValidateBeforeCall(appLogo, data, fifthLicensePic, fifthScreenShot, firstLicensePic, firstScreenShot, firstSpecialLicensePic, fourthLicensePic, fourthScreenShot, outDoorPic, secondLicensePic, secondScreenShot, secondSpecialLicensePic, testFileName, thirdLicensePic, thirdScreenShot, thirdSpecialLicensePic, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenMiniVersionAuditApplyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call applyAsync(File appLogo, AlipayOpenMiniVersionAuditApplyModel data, File fifthLicensePic, File fifthScreenShot, File firstLicensePic, File firstScreenShot, File firstSpecialLicensePic, File fourthLicensePic, File fourthScreenShot, File outDoorPic, File secondLicensePic, File secondScreenShot, File secondSpecialLicensePic, File testFileName, File thirdLicensePic, File thirdScreenShot, File thirdSpecialLicensePic, final ApiCallback<AlipayOpenMiniVersionAuditApplyResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = applyValidateBeforeCall(appLogo, data, fifthLicensePic, fifthScreenShot, firstLicensePic, firstScreenShot, firstSpecialLicensePic, fourthLicensePic, fourthScreenShot, outDoorPic, secondLicensePic, secondScreenShot, secondSpecialLicensePic, testFileName, thirdLicensePic, thirdScreenShot, thirdSpecialLicensePic, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenMiniVersionAuditApplyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for cancel
     * @param alipayOpenMiniVersionAuditCancelModel  (optional)
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
    public okhttp3.Call cancelCall(AlipayOpenMiniVersionAuditCancelModel alipayOpenMiniVersionAuditCancelModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOpenMiniVersionAuditCancelModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/mini/version/audit/cancel";

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
    private okhttp3.Call cancelValidateBeforeCall(AlipayOpenMiniVersionAuditCancelModel alipayOpenMiniVersionAuditCancelModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = cancelCall(alipayOpenMiniVersionAuditCancelModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 小程序撤销审核
     * 三方实例化小程序撤销审核
     * @param alipayOpenMiniVersionAuditCancelModel  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public Object cancel(AlipayOpenMiniVersionAuditCancelModel alipayOpenMiniVersionAuditCancelModel) throws ApiException {
        ApiResponse<Object> localVarResp = cancelWithHttpInfo(alipayOpenMiniVersionAuditCancelModel, null);
        return localVarResp.getData();
    }

    public Object cancel(AlipayOpenMiniVersionAuditCancelModel alipayOpenMiniVersionAuditCancelModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<Object> localVarResp = cancelWithHttpInfo(alipayOpenMiniVersionAuditCancelModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 小程序撤销审核
     * 三方实例化小程序撤销审核
     * @param alipayOpenMiniVersionAuditCancelModel  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> cancelWithHttpInfo(AlipayOpenMiniVersionAuditCancelModel alipayOpenMiniVersionAuditCancelModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = cancelValidateBeforeCall(alipayOpenMiniVersionAuditCancelModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<Object>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenMiniVersionAuditCancelDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 小程序撤销审核 (asynchronously)
     * 三方实例化小程序撤销审核
     * @param alipayOpenMiniVersionAuditCancelModel  (optional)
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
    public okhttp3.Call cancelAsync(AlipayOpenMiniVersionAuditCancelModel alipayOpenMiniVersionAuditCancelModel, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = cancelValidateBeforeCall(alipayOpenMiniVersionAuditCancelModel, _callback, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call cancelAsync(AlipayOpenMiniVersionAuditCancelModel alipayOpenMiniVersionAuditCancelModel, final ApiCallback<Object> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = cancelValidateBeforeCall(alipayOpenMiniVersionAuditCancelModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
