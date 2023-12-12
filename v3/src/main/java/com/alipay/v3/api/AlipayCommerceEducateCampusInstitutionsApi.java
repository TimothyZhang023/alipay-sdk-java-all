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


import com.alipay.v3.model.AlipayCommerceEducateCampusInstitutionsAddDefaultResponse;
import com.alipay.v3.model.AlipayCommerceEducateCampusInstitutionsAddModel;
import com.alipay.v3.model.AlipayCommerceEducateCampusInstitutionsAddResponseModel;
import com.alipay.v3.model.AlipayCommerceEducateCampusInstitutionsQueryDefaultResponse;
import com.alipay.v3.model.AlipayCommerceEducateCampusInstitutionsQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayCommerceEducateCampusInstitutionsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayCommerceEducateCampusInstitutionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayCommerceEducateCampusInstitutionsApi(ApiClient apiClient) {
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
     * Build call for add
     * @param alipayCommerceEducateCampusInstitutionsAddModel  (optional)
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
    public okhttp3.Call addCall(AlipayCommerceEducateCampusInstitutionsAddModel alipayCommerceEducateCampusInstitutionsAddModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayCommerceEducateCampusInstitutionsAddModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/commerce/educate/campus/institutions/add";

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
    private okhttp3.Call addValidateBeforeCall(AlipayCommerceEducateCampusInstitutionsAddModel alipayCommerceEducateCampusInstitutionsAddModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = addCall(alipayCommerceEducateCampusInstitutionsAddModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 入驻学校信息
     * 学校信息入驻
     * @param alipayCommerceEducateCampusInstitutionsAddModel  (optional)
     * @return AlipayCommerceEducateCampusInstitutionsAddResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayCommerceEducateCampusInstitutionsAddResponseModel add(AlipayCommerceEducateCampusInstitutionsAddModel alipayCommerceEducateCampusInstitutionsAddModel) throws ApiException {
        ApiResponse<AlipayCommerceEducateCampusInstitutionsAddResponseModel> localVarResp = addWithHttpInfo(alipayCommerceEducateCampusInstitutionsAddModel, null);
        return localVarResp.getData();
    }

    public AlipayCommerceEducateCampusInstitutionsAddResponseModel add(AlipayCommerceEducateCampusInstitutionsAddModel alipayCommerceEducateCampusInstitutionsAddModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayCommerceEducateCampusInstitutionsAddResponseModel> localVarResp = addWithHttpInfo(alipayCommerceEducateCampusInstitutionsAddModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 入驻学校信息
     * 学校信息入驻
     * @param alipayCommerceEducateCampusInstitutionsAddModel  (optional)
     * @return ApiResponse&lt;AlipayCommerceEducateCampusInstitutionsAddResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayCommerceEducateCampusInstitutionsAddResponseModel> addWithHttpInfo(AlipayCommerceEducateCampusInstitutionsAddModel alipayCommerceEducateCampusInstitutionsAddModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = addValidateBeforeCall(alipayCommerceEducateCampusInstitutionsAddModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayCommerceEducateCampusInstitutionsAddResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayCommerceEducateCampusInstitutionsAddDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 入驻学校信息 (asynchronously)
     * 学校信息入驻
     * @param alipayCommerceEducateCampusInstitutionsAddModel  (optional)
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
    public okhttp3.Call addAsync(AlipayCommerceEducateCampusInstitutionsAddModel alipayCommerceEducateCampusInstitutionsAddModel, final ApiCallback<AlipayCommerceEducateCampusInstitutionsAddResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = addValidateBeforeCall(alipayCommerceEducateCampusInstitutionsAddModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayCommerceEducateCampusInstitutionsAddResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call addAsync(AlipayCommerceEducateCampusInstitutionsAddModel alipayCommerceEducateCampusInstitutionsAddModel, final ApiCallback<AlipayCommerceEducateCampusInstitutionsAddResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = addValidateBeforeCall(alipayCommerceEducateCampusInstitutionsAddModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayCommerceEducateCampusInstitutionsAddResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param instName 学校名称 (optional)
     * @param provinceCode 省份编码，编码标准为中华人民共和国行政区划代码，参见 2020年12月中华人民共和国县以上行政区划代码。 (optional)
     * @param cityCode 城市编码，编码标准为中华人民共和国行政区划代码，参见 2020年12月中华人民共和国县以上行政区划代码。 (optional)
     * @param instId 学校内标：支付宝内部学校唯一编号。使用内标查询时，默认使用内标进行精确匹配。 (optional)
     * @param instStdCode 学校外标：统一社会信用编码或教育部提供的学校标识码。使用学校外标查询时，默认使用外标进行精确匹配。 (optional)
     * @param likeProperty 是否使用学校名称模糊匹配进行查询，默认精确匹配。 枚举值如下： 1：精确匹配； 0：模糊匹配 (optional)
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
    public okhttp3.Call queryCall(String instName, String provinceCode, String cityCode, String instId, String instStdCode, String likeProperty, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/commerce/educate/campus/institutions/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (instName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("inst_name", instName));
        }

        if (provinceCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("province_code", provinceCode));
        }

        if (cityCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("city_code", cityCode));
        }

        if (instId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("inst_id", instId));
        }

        if (instStdCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("inst_std_code", instStdCode));
        }

        if (likeProperty != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("like_property", likeProperty));
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
    private okhttp3.Call queryValidateBeforeCall(String instName, String provinceCode, String cityCode, String instId, String instStdCode, String likeProperty, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(instName, provinceCode, cityCode, instId, instStdCode, likeProperty, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询学校信息
     * 可以通过学校库产品查询支付宝系统中是否已存在对应的学校，避免重复入驻，以及通过该接口查询入驻的进度：入驻成功则会返回学校信息，失败则不会返回
     * @param instName 学校名称 (optional)
     * @param provinceCode 省份编码，编码标准为中华人民共和国行政区划代码，参见 2020年12月中华人民共和国县以上行政区划代码。 (optional)
     * @param cityCode 城市编码，编码标准为中华人民共和国行政区划代码，参见 2020年12月中华人民共和国县以上行政区划代码。 (optional)
     * @param instId 学校内标：支付宝内部学校唯一编号。使用内标查询时，默认使用内标进行精确匹配。 (optional)
     * @param instStdCode 学校外标：统一社会信用编码或教育部提供的学校标识码。使用学校外标查询时，默认使用外标进行精确匹配。 (optional)
     * @param likeProperty 是否使用学校名称模糊匹配进行查询，默认精确匹配。 枚举值如下： 1：精确匹配； 0：模糊匹配 (optional)
     * @return AlipayCommerceEducateCampusInstitutionsQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayCommerceEducateCampusInstitutionsQueryResponseModel query(String instName, String provinceCode, String cityCode, String instId, String instStdCode, String likeProperty) throws ApiException {
        ApiResponse<AlipayCommerceEducateCampusInstitutionsQueryResponseModel> localVarResp = queryWithHttpInfo(instName, provinceCode, cityCode, instId, instStdCode, likeProperty, null);
        return localVarResp.getData();
    }

    public AlipayCommerceEducateCampusInstitutionsQueryResponseModel query(String instName, String provinceCode, String cityCode, String instId, String instStdCode, String likeProperty, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayCommerceEducateCampusInstitutionsQueryResponseModel> localVarResp = queryWithHttpInfo(instName, provinceCode, cityCode, instId, instStdCode, likeProperty, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询学校信息
     * 可以通过学校库产品查询支付宝系统中是否已存在对应的学校，避免重复入驻，以及通过该接口查询入驻的进度：入驻成功则会返回学校信息，失败则不会返回
     * @param instName 学校名称 (optional)
     * @param provinceCode 省份编码，编码标准为中华人民共和国行政区划代码，参见 2020年12月中华人民共和国县以上行政区划代码。 (optional)
     * @param cityCode 城市编码，编码标准为中华人民共和国行政区划代码，参见 2020年12月中华人民共和国县以上行政区划代码。 (optional)
     * @param instId 学校内标：支付宝内部学校唯一编号。使用内标查询时，默认使用内标进行精确匹配。 (optional)
     * @param instStdCode 学校外标：统一社会信用编码或教育部提供的学校标识码。使用学校外标查询时，默认使用外标进行精确匹配。 (optional)
     * @param likeProperty 是否使用学校名称模糊匹配进行查询，默认精确匹配。 枚举值如下： 1：精确匹配； 0：模糊匹配 (optional)
     * @return ApiResponse&lt;AlipayCommerceEducateCampusInstitutionsQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayCommerceEducateCampusInstitutionsQueryResponseModel> queryWithHttpInfo(String instName, String provinceCode, String cityCode, String instId, String instStdCode, String likeProperty, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(instName, provinceCode, cityCode, instId, instStdCode, likeProperty, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayCommerceEducateCampusInstitutionsQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayCommerceEducateCampusInstitutionsQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询学校信息 (asynchronously)
     * 可以通过学校库产品查询支付宝系统中是否已存在对应的学校，避免重复入驻，以及通过该接口查询入驻的进度：入驻成功则会返回学校信息，失败则不会返回
     * @param instName 学校名称 (optional)
     * @param provinceCode 省份编码，编码标准为中华人民共和国行政区划代码，参见 2020年12月中华人民共和国县以上行政区划代码。 (optional)
     * @param cityCode 城市编码，编码标准为中华人民共和国行政区划代码，参见 2020年12月中华人民共和国县以上行政区划代码。 (optional)
     * @param instId 学校内标：支付宝内部学校唯一编号。使用内标查询时，默认使用内标进行精确匹配。 (optional)
     * @param instStdCode 学校外标：统一社会信用编码或教育部提供的学校标识码。使用学校外标查询时，默认使用外标进行精确匹配。 (optional)
     * @param likeProperty 是否使用学校名称模糊匹配进行查询，默认精确匹配。 枚举值如下： 1：精确匹配； 0：模糊匹配 (optional)
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
    public okhttp3.Call queryAsync(String instName, String provinceCode, String cityCode, String instId, String instStdCode, String likeProperty, final ApiCallback<AlipayCommerceEducateCampusInstitutionsQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(instName, provinceCode, cityCode, instId, instStdCode, likeProperty, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayCommerceEducateCampusInstitutionsQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String instName, String provinceCode, String cityCode, String instId, String instStdCode, String likeProperty, final ApiCallback<AlipayCommerceEducateCampusInstitutionsQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(instName, provinceCode, cityCode, instId, instStdCode, likeProperty, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayCommerceEducateCampusInstitutionsQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
