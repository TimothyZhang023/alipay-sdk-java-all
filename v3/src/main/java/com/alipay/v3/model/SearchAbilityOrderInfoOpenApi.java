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


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alipay.v3.JSON;

/**
 * SearchAbilityOrderInfoOpenApi
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchAbilityOrderInfoOpenApi {
  public static final String SERIALIZED_NAME_ACCESS_TYPE = "access_type";
  @SerializedName(SERIALIZED_NAME_ACCESS_TYPE)
  private String accessType;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName;

  public static final String SERIALIZED_NAME_APP_STATUS = "app_status";
  @SerializedName(SERIALIZED_NAME_APP_STATUS)
  private String appStatus;

  public static final String SERIALIZED_NAME_AUDIT_STATUS = "audit_status";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private String auditStatus;

  public static final String SERIALIZED_NAME_BIZ_ID = "biz_id";
  @SerializedName(SERIALIZED_NAME_BIZ_ID)
  private String bizId;

  public static final String SERIALIZED_NAME_BOX_STATUS = "box_status";
  @SerializedName(SERIALIZED_NAME_BOX_STATUS)
  private String boxStatus;

  public static final String SERIALIZED_NAME_BRAND_TEMPLATE_ID = "brand_template_id";
  @SerializedName(SERIALIZED_NAME_BRAND_TEMPLATE_ID)
  private String brandTemplateId;

  public static final String SERIALIZED_NAME_DATA_KEY = "data_key";
  @SerializedName(SERIALIZED_NAME_DATA_KEY)
  private String dataKey;

  public static final String SERIALIZED_NAME_GMT_MODIFIED = "gmt_modified";
  @SerializedName(SERIALIZED_NAME_GMT_MODIFIED)
  private String gmtModified;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_OLD_DATA = "is_old_data";
  @SerializedName(SERIALIZED_NAME_IS_OLD_DATA)
  private Boolean isOldData;

  public static final String SERIALIZED_NAME_MAJOR_STATUS = "major_status";
  @SerializedName(SERIALIZED_NAME_MAJOR_STATUS)
  private String majorStatus;

  public static final String SERIALIZED_NAME_ONLINE_TIME = "online_time";
  @SerializedName(SERIALIZED_NAME_ONLINE_TIME)
  private String onlineTime;

  public static final String SERIALIZED_NAME_OPEN_STATUS = "open_status";
  @SerializedName(SERIALIZED_NAME_OPEN_STATUS)
  private Boolean openStatus;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator;

  public static final String SERIALIZED_NAME_REJECT_REASON = "reject_reason";
  @SerializedName(SERIALIZED_NAME_REJECT_REASON)
  private String rejectReason;

  public static final String SERIALIZED_NAME_SCENE_CODE = "scene_code";
  @SerializedName(SERIALIZED_NAME_SCENE_CODE)
  private String sceneCode;

  public static final String SERIALIZED_NAME_SCENE_NAME = "scene_name";
  @SerializedName(SERIALIZED_NAME_SCENE_NAME)
  private String sceneName;

  public static final String SERIALIZED_NAME_SEARCH_APP_ID = "search_app_id";
  @SerializedName(SERIALIZED_NAME_SEARCH_APP_ID)
  private String searchAppId;

  public static final String SERIALIZED_NAME_SEPC_CODE = "sepc_code";
  @SerializedName(SERIALIZED_NAME_SEPC_CODE)
  private String sepcCode;

  public static final String SERIALIZED_NAME_SERVICE_CODE = "service_code";
  @SerializedName(SERIALIZED_NAME_SERVICE_CODE)
  private String serviceCode;

  public static final String SERIALIZED_NAME_SUB_SERVICE_DESC = "sub_service_desc";
  @SerializedName(SERIALIZED_NAME_SUB_SERVICE_DESC)
  private String subServiceDesc;

  public static final String SERIALIZED_NAME_SUB_SERVICE_NAME = "sub_service_name";
  @SerializedName(SERIALIZED_NAME_SUB_SERVICE_NAME)
  private String subServiceName;

  public SearchAbilityOrderInfoOpenApi() { 
  }

  public SearchAbilityOrderInfoOpenApi accessType(String accessType) {
    
    this.accessType = accessType;
    return this;
  }

   /**
   * 申请单类型
   * @return accessType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BASE", value = "申请单类型")

  public String getAccessType() {
    return accessType;
  }


  public void setAccessType(String accessType) {
    this.accessType = accessType;
  }


  public SearchAbilityOrderInfoOpenApi appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 小程序名称
   * @return appName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "搜索1", value = "小程序名称")

  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public SearchAbilityOrderInfoOpenApi appStatus(String appStatus) {
    
    this.appStatus = appStatus;
    return this;
  }

   /**
   * 小程序状态
   * @return appStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ON_LINE", value = "小程序状态")

  public String getAppStatus() {
    return appStatus;
  }


  public void setAppStatus(String appStatus) {
    this.appStatus = appStatus;
  }


  public SearchAbilityOrderInfoOpenApi auditStatus(String auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * 审核状态
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AUDIT_PASS", value = "审核状态")

  public String getAuditStatus() {
    return auditStatus;
  }


  public void setAuditStatus(String auditStatus) {
    this.auditStatus = auditStatus;
  }


  public SearchAbilityOrderInfoOpenApi bizId(String bizId) {
    
    this.bizId = bizId;
    return this;
  }

   /**
   * 运营申请单详情biz_id
   * @return bizId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021001105610428", value = "运营申请单详情biz_id")

  public String getBizId() {
    return bizId;
  }


  public void setBizId(String bizId) {
    this.bizId = bizId;
  }


  public SearchAbilityOrderInfoOpenApi boxStatus(String boxStatus) {
    
    this.boxStatus = boxStatus;
    return this;
  }

   /**
   * 上架状态
   * @return boxStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ONLINE", value = "上架状态")

  public String getBoxStatus() {
    return boxStatus;
  }


  public void setBoxStatus(String boxStatus) {
    this.boxStatus = boxStatus;
  }


  public SearchAbilityOrderInfoOpenApi brandTemplateId(String brandTemplateId) {
    
    this.brandTemplateId = brandTemplateId;
    return this;
  }

   /**
   * 品牌模板id
   * @return brandTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ONE_WITH_TWO", value = "品牌模板id")

  public String getBrandTemplateId() {
    return brandTemplateId;
  }


  public void setBrandTemplateId(String brandTemplateId) {
    this.brandTemplateId = brandTemplateId;
  }


  public SearchAbilityOrderInfoOpenApi dataKey(String dataKey) {
    
    this.dataKey = dataKey;
    return this;
  }

   /**
   * 二级服务唯一标识
   * @return dataKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "23232234", value = "二级服务唯一标识")

  public String getDataKey() {
    return dataKey;
  }


  public void setDataKey(String dataKey) {
    this.dataKey = dataKey;
  }


  public SearchAbilityOrderInfoOpenApi gmtModified(String gmtModified) {
    
    this.gmtModified = gmtModified;
    return this;
  }

   /**
   * 最近更新时间
   * @return gmtModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-12-11", value = "最近更新时间")

  public String getGmtModified() {
    return gmtModified;
  }


  public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
  }


  public SearchAbilityOrderInfoOpenApi id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 唯一id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123424", value = "唯一id")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SearchAbilityOrderInfoOpenApi isOldData(Boolean isOldData) {
    
    this.isOldData = isOldData;
    return this;
  }

   /**
   * 是否老工单
   * @return isOldData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "是否老工单")

  public Boolean getIsOldData() {
    return isOldData;
  }


  public void setIsOldData(Boolean isOldData) {
    this.isOldData = isOldData;
  }


  public SearchAbilityOrderInfoOpenApi majorStatus(String majorStatus) {
    
    this.majorStatus = majorStatus;
    return this;
  }

   /**
   * 服务主状态
   * @return majorStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VALID", value = "服务主状态")

  public String getMajorStatus() {
    return majorStatus;
  }


  public void setMajorStatus(String majorStatus) {
    this.majorStatus = majorStatus;
  }


  public SearchAbilityOrderInfoOpenApi onlineTime(String onlineTime) {
    
    this.onlineTime = onlineTime;
    return this;
  }

   /**
   * 上架时间
   * @return onlineTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-12", value = "上架时间")

  public String getOnlineTime() {
    return onlineTime;
  }


  public void setOnlineTime(String onlineTime) {
    this.onlineTime = onlineTime;
  }


  public SearchAbilityOrderInfoOpenApi openStatus(Boolean openStatus) {
    
    this.openStatus = openStatus;
    return this;
  }

   /**
   * 小程序可见性
   * @return openStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "小程序可见性")

  public Boolean getOpenStatus() {
    return openStatus;
  }


  public void setOpenStatus(Boolean openStatus) {
    this.openStatus = openStatus;
  }


  public SearchAbilityOrderInfoOpenApi operator(String operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * 下架操作者
   * @return operator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "232323", value = "下架操作者")

  public String getOperator() {
    return operator;
  }


  public void setOperator(String operator) {
    this.operator = operator;
  }


  public SearchAbilityOrderInfoOpenApi rejectReason(String rejectReason) {
    
    this.rejectReason = rejectReason;
    return this;
  }

   /**
   * 驳回原因
   * @return rejectReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "驳回原因", value = "驳回原因")

  public String getRejectReason() {
    return rejectReason;
  }


  public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
  }


  public SearchAbilityOrderInfoOpenApi sceneCode(String sceneCode) {
    
    this.sceneCode = sceneCode;
    return this;
  }

   /**
   * 场景码
   * @return sceneCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "sss", value = "场景码")

  public String getSceneCode() {
    return sceneCode;
  }


  public void setSceneCode(String sceneCode) {
    this.sceneCode = sceneCode;
  }


  public SearchAbilityOrderInfoOpenApi sceneName(String sceneName) {
    
    this.sceneName = sceneName;
    return this;
  }

   /**
   * 场景名称
   * @return sceneName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "aaa", value = "场景名称")

  public String getSceneName() {
    return sceneName;
  }


  public void setSceneName(String sceneName) {
    this.sceneName = sceneName;
  }


  public SearchAbilityOrderInfoOpenApi searchAppId(String searchAppId) {
    
    this.searchAppId = searchAppId;
    return this;
  }

   /**
   * 小程序id
   * @return searchAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021001105610428", value = "小程序id")

  public String getSearchAppId() {
    return searchAppId;
  }


  public void setSearchAppId(String searchAppId) {
    this.searchAppId = searchAppId;
  }


  public SearchAbilityOrderInfoOpenApi sepcCode(String sepcCode) {
    
    this.sepcCode = sepcCode;
    return this;
  }

   /**
   * 应用标识
   * @return sepcCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SP_MINI_APP", value = "应用标识")

  public String getSepcCode() {
    return sepcCode;
  }


  public void setSepcCode(String sepcCode) {
    this.sepcCode = sepcCode;
  }


  public SearchAbilityOrderInfoOpenApi serviceCode(String serviceCode) {
    
    this.serviceCode = serviceCode;
    return this;
  }

   /**
   * 服务码
   * @return serviceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "234345454", value = "服务码")

  public String getServiceCode() {
    return serviceCode;
  }


  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }


  public SearchAbilityOrderInfoOpenApi subServiceDesc(String subServiceDesc) {
    
    this.subServiceDesc = subServiceDesc;
    return this;
  }

   /**
   * 子功能描述
   * @return subServiceDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "111", value = "子功能描述")

  public String getSubServiceDesc() {
    return subServiceDesc;
  }


  public void setSubServiceDesc(String subServiceDesc) {
    this.subServiceDesc = subServiceDesc;
  }


  public SearchAbilityOrderInfoOpenApi subServiceName(String subServiceName) {
    
    this.subServiceName = subServiceName;
    return this;
  }

   /**
   * 子功能名称
   * @return subServiceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "子功能", value = "子功能名称")

  public String getSubServiceName() {
    return subServiceName;
  }


  public void setSubServiceName(String subServiceName) {
    this.subServiceName = subServiceName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchAbilityOrderInfoOpenApi searchAbilityOrderInfoOpenApi = (SearchAbilityOrderInfoOpenApi) o;
    return Objects.equals(this.accessType, searchAbilityOrderInfoOpenApi.accessType) &&
        Objects.equals(this.appName, searchAbilityOrderInfoOpenApi.appName) &&
        Objects.equals(this.appStatus, searchAbilityOrderInfoOpenApi.appStatus) &&
        Objects.equals(this.auditStatus, searchAbilityOrderInfoOpenApi.auditStatus) &&
        Objects.equals(this.bizId, searchAbilityOrderInfoOpenApi.bizId) &&
        Objects.equals(this.boxStatus, searchAbilityOrderInfoOpenApi.boxStatus) &&
        Objects.equals(this.brandTemplateId, searchAbilityOrderInfoOpenApi.brandTemplateId) &&
        Objects.equals(this.dataKey, searchAbilityOrderInfoOpenApi.dataKey) &&
        Objects.equals(this.gmtModified, searchAbilityOrderInfoOpenApi.gmtModified) &&
        Objects.equals(this.id, searchAbilityOrderInfoOpenApi.id) &&
        Objects.equals(this.isOldData, searchAbilityOrderInfoOpenApi.isOldData) &&
        Objects.equals(this.majorStatus, searchAbilityOrderInfoOpenApi.majorStatus) &&
        Objects.equals(this.onlineTime, searchAbilityOrderInfoOpenApi.onlineTime) &&
        Objects.equals(this.openStatus, searchAbilityOrderInfoOpenApi.openStatus) &&
        Objects.equals(this.operator, searchAbilityOrderInfoOpenApi.operator) &&
        Objects.equals(this.rejectReason, searchAbilityOrderInfoOpenApi.rejectReason) &&
        Objects.equals(this.sceneCode, searchAbilityOrderInfoOpenApi.sceneCode) &&
        Objects.equals(this.sceneName, searchAbilityOrderInfoOpenApi.sceneName) &&
        Objects.equals(this.searchAppId, searchAbilityOrderInfoOpenApi.searchAppId) &&
        Objects.equals(this.sepcCode, searchAbilityOrderInfoOpenApi.sepcCode) &&
        Objects.equals(this.serviceCode, searchAbilityOrderInfoOpenApi.serviceCode) &&
        Objects.equals(this.subServiceDesc, searchAbilityOrderInfoOpenApi.subServiceDesc) &&
        Objects.equals(this.subServiceName, searchAbilityOrderInfoOpenApi.subServiceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessType, appName, appStatus, auditStatus, bizId, boxStatus, brandTemplateId, dataKey, gmtModified, id, isOldData, majorStatus, onlineTime, openStatus, operator, rejectReason, sceneCode, sceneName, searchAppId, sepcCode, serviceCode, subServiceDesc, subServiceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchAbilityOrderInfoOpenApi {\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appStatus: ").append(toIndentedString(appStatus)).append("\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    bizId: ").append(toIndentedString(bizId)).append("\n");
    sb.append("    boxStatus: ").append(toIndentedString(boxStatus)).append("\n");
    sb.append("    brandTemplateId: ").append(toIndentedString(brandTemplateId)).append("\n");
    sb.append("    dataKey: ").append(toIndentedString(dataKey)).append("\n");
    sb.append("    gmtModified: ").append(toIndentedString(gmtModified)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isOldData: ").append(toIndentedString(isOldData)).append("\n");
    sb.append("    majorStatus: ").append(toIndentedString(majorStatus)).append("\n");
    sb.append("    onlineTime: ").append(toIndentedString(onlineTime)).append("\n");
    sb.append("    openStatus: ").append(toIndentedString(openStatus)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
    sb.append("    sceneCode: ").append(toIndentedString(sceneCode)).append("\n");
    sb.append("    sceneName: ").append(toIndentedString(sceneName)).append("\n");
    sb.append("    searchAppId: ").append(toIndentedString(searchAppId)).append("\n");
    sb.append("    sepcCode: ").append(toIndentedString(sepcCode)).append("\n");
    sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
    sb.append("    subServiceDesc: ").append(toIndentedString(subServiceDesc)).append("\n");
    sb.append("    subServiceName: ").append(toIndentedString(subServiceName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("access_type");
    openapiFields.add("app_name");
    openapiFields.add("app_status");
    openapiFields.add("audit_status");
    openapiFields.add("biz_id");
    openapiFields.add("box_status");
    openapiFields.add("brand_template_id");
    openapiFields.add("data_key");
    openapiFields.add("gmt_modified");
    openapiFields.add("id");
    openapiFields.add("is_old_data");
    openapiFields.add("major_status");
    openapiFields.add("online_time");
    openapiFields.add("open_status");
    openapiFields.add("operator");
    openapiFields.add("reject_reason");
    openapiFields.add("scene_code");
    openapiFields.add("scene_name");
    openapiFields.add("search_app_id");
    openapiFields.add("sepc_code");
    openapiFields.add("service_code");
    openapiFields.add("sub_service_desc");
    openapiFields.add("sub_service_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchAbilityOrderInfoOpenApi
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SearchAbilityOrderInfoOpenApi.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchAbilityOrderInfoOpenApi is not found in the empty JSON string", SearchAbilityOrderInfoOpenApi.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SearchAbilityOrderInfoOpenApi.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchAbilityOrderInfoOpenApi` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("access_type") != null && !jsonObj.get("access_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_type").toString()));
      }
      if (jsonObj.get("app_name") != null && !jsonObj.get("app_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_name").toString()));
      }
      if (jsonObj.get("app_status") != null && !jsonObj.get("app_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_status").toString()));
      }
      if (jsonObj.get("audit_status") != null && !jsonObj.get("audit_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audit_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audit_status").toString()));
      }
      if (jsonObj.get("biz_id") != null && !jsonObj.get("biz_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_id").toString()));
      }
      if (jsonObj.get("box_status") != null && !jsonObj.get("box_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box_status").toString()));
      }
      if (jsonObj.get("brand_template_id") != null && !jsonObj.get("brand_template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_template_id").toString()));
      }
      if (jsonObj.get("data_key") != null && !jsonObj.get("data_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_key").toString()));
      }
      if (jsonObj.get("gmt_modified") != null && !jsonObj.get("gmt_modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_modified").toString()));
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("major_status") != null && !jsonObj.get("major_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `major_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("major_status").toString()));
      }
      if (jsonObj.get("online_time") != null && !jsonObj.get("online_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `online_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("online_time").toString()));
      }
      if (jsonObj.get("operator") != null && !jsonObj.get("operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator").toString()));
      }
      if (jsonObj.get("reject_reason") != null && !jsonObj.get("reject_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reject_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reject_reason").toString()));
      }
      if (jsonObj.get("scene_code") != null && !jsonObj.get("scene_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scene_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scene_code").toString()));
      }
      if (jsonObj.get("scene_name") != null && !jsonObj.get("scene_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scene_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scene_name").toString()));
      }
      if (jsonObj.get("search_app_id") != null && !jsonObj.get("search_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `search_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("search_app_id").toString()));
      }
      if (jsonObj.get("sepc_code") != null && !jsonObj.get("sepc_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sepc_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sepc_code").toString()));
      }
      if (jsonObj.get("service_code") != null && !jsonObj.get("service_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_code").toString()));
      }
      if (jsonObj.get("sub_service_desc") != null && !jsonObj.get("sub_service_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_service_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_service_desc").toString()));
      }
      if (jsonObj.get("sub_service_name") != null && !jsonObj.get("sub_service_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_service_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_service_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchAbilityOrderInfoOpenApi.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchAbilityOrderInfoOpenApi' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchAbilityOrderInfoOpenApi> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchAbilityOrderInfoOpenApi.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchAbilityOrderInfoOpenApi>() {
           @Override
           public void write(JsonWriter out, SearchAbilityOrderInfoOpenApi value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchAbilityOrderInfoOpenApi read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchAbilityOrderInfoOpenApi given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchAbilityOrderInfoOpenApi
  * @throws IOException if the JSON string is invalid with respect to SearchAbilityOrderInfoOpenApi
  */
  public static SearchAbilityOrderInfoOpenApi fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchAbilityOrderInfoOpenApi.class);
  }

 /**
  * Convert an instance of SearchAbilityOrderInfoOpenApi to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

