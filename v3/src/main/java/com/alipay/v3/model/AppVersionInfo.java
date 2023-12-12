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
 * AppVersionInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AppVersionInfo {
  public static final String SERIALIZED_NAME_APP_VERSION = "app_version";
  @SerializedName(SERIALIZED_NAME_APP_VERSION)
  private String appVersion;

  public static final String SERIALIZED_NAME_BASE_AUDIT = "base_audit";
  @SerializedName(SERIALIZED_NAME_BASE_AUDIT)
  private String baseAudit;

  public static final String SERIALIZED_NAME_BUNDLE_ID = "bundle_id";
  @SerializedName(SERIALIZED_NAME_BUNDLE_ID)
  private String bundleId;

  public static final String SERIALIZED_NAME_CAN_RELEASE = "can_release";
  @SerializedName(SERIALIZED_NAME_CAN_RELEASE)
  private String canRelease;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_PROMOTE_AUDIT = "promote_audit";
  @SerializedName(SERIALIZED_NAME_PROMOTE_AUDIT)
  private String promoteAudit;

  public static final String SERIALIZED_NAME_VERSION_DESCRIPTION = "version_description";
  @SerializedName(SERIALIZED_NAME_VERSION_DESCRIPTION)
  private String versionDescription;

  public static final String SERIALIZED_NAME_VERSION_STATUS = "version_status";
  @SerializedName(SERIALIZED_NAME_VERSION_STATUS)
  private String versionStatus;

  public AppVersionInfo() { 
  }

  public AppVersionInfo appVersion(String appVersion) {
    
    this.appVersion = appVersion;
    return this;
  }

   /**
   * 版本号，一般为x.y.x格式，其中x、y、z都是数字
   * @return appVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.2.9", value = "版本号，一般为x.y.x格式，其中x、y、z都是数字")

  public String getAppVersion() {
    return appVersion;
  }


  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }


  public AppVersionInfo baseAudit(String baseAudit) {
    
    this.baseAudit = baseAudit;
    return this;
  }

   /**
   * 准入审核结果 （提审时 audit_rule 传 BASE_PROMOTE 时有该字段）
   * @return baseAudit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PASS", value = "准入审核结果 （提审时 audit_rule 传 BASE_PROMOTE 时有该字段）")

  public String getBaseAudit() {
    return baseAudit;
  }


  public void setBaseAudit(String baseAudit) {
    this.baseAudit = baseAudit;
  }


  public AppVersionInfo bundleId(String bundleId) {
    
    this.bundleId = bundleId;
    return this;
  }

   /**
   * 小程序客户端类型，默认为支付宝端。常见支持如下客户端： com.alipay.alipaywallet：支付宝端； com.alibaba.android.rimet：DINGDING端； com.amap.app：高德端； com.alibaba.ailabs.genie.webapps：天猫精灵端； com.alipay.iot.xpaas：支付宝IoT端。 如需更多端投放，请联系业务BD。
   * @return bundleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "com.alipay.alipaywallet", value = "小程序客户端类型，默认为支付宝端。常见支持如下客户端： com.alipay.alipaywallet：支付宝端； com.alibaba.android.rimet：DINGDING端； com.amap.app：高德端； com.alibaba.ailabs.genie.webapps：天猫精灵端； com.alipay.iot.xpaas：支付宝IoT端。 如需更多端投放，请联系业务BD。")

  public String getBundleId() {
    return bundleId;
  }


  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }


  public AppVersionInfo canRelease(String canRelease) {
    
    this.canRelease = canRelease;
    return this;
  }

   /**
   * 是否可上架 true：可上架 false：不可上架 （version_status 为PROMOTE_AUDIT_REJECT有值） （提审时 audit_rule 传 BASE_PROMOTE 时有该字段）
   * @return canRelease
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否可上架 true：可上架 false：不可上架 （version_status 为PROMOTE_AUDIT_REJECT有值） （提审时 audit_rule 传 BASE_PROMOTE 时有该字段）")

  public String getCanRelease() {
    return canRelease;
  }


  public void setCanRelease(String canRelease) {
    this.canRelease = canRelease;
  }


  public AppVersionInfo createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 版本创建时间，精确到秒
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-12-11 19:00:12", value = "版本创建时间，精确到秒")

  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public AppVersionInfo promoteAudit(String promoteAudit) {
    
    this.promoteAudit = promoteAudit;
    return this;
  }

   /**
   * 营销审核结果： PASS：通过 REJECT：驳回 （提审时 audit_rule 传 BASE_PROMOTE 时有该字段）
   * @return promoteAudit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PASS", value = "营销审核结果： PASS：通过 REJECT：驳回 （提审时 audit_rule 传 BASE_PROMOTE 时有该字段）")

  public String getPromoteAudit() {
    return promoteAudit;
  }


  public void setPromoteAudit(String promoteAudit) {
    this.promoteAudit = promoteAudit;
  }


  public AppVersionInfo versionDescription(String versionDescription) {
    
    this.versionDescription = versionDescription;
    return this;
  }

   /**
   * 小程序版本描述，介绍此版本的主要变更和功能，5-500个字符。
   * @return versionDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "该版本新增了XXX功能，修复了XXX的bug，优化了用户体验。", value = "小程序版本描述，介绍此版本的主要变更和功能，5-500个字符。")

  public String getVersionDescription() {
    return versionDescription;
  }


  public void setVersionDescription(String versionDescription) {
    this.versionDescription = versionDescription;
  }


  public AppVersionInfo versionStatus(String versionStatus) {
    
    this.versionStatus = versionStatus;
    return this;
  }

   /**
   * 版本状态，可选值为：INIT: 开发中, AUDITING: 审核中, AUDIT_REJECT: 审核驳回, WAIT_RELEASE: 待上架, BASE_AUDIT_PASS: 准入不可营销, GRAY: 灰度中, RELEASE: 已上架, OFFLINE: 已下架, AUDIT_OFFLINE: 被强制下架;
   * @return versionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AUDITING", value = "版本状态，可选值为：INIT: 开发中, AUDITING: 审核中, AUDIT_REJECT: 审核驳回, WAIT_RELEASE: 待上架, BASE_AUDIT_PASS: 准入不可营销, GRAY: 灰度中, RELEASE: 已上架, OFFLINE: 已下架, AUDIT_OFFLINE: 被强制下架;")

  public String getVersionStatus() {
    return versionStatus;
  }


  public void setVersionStatus(String versionStatus) {
    this.versionStatus = versionStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppVersionInfo appVersionInfo = (AppVersionInfo) o;
    return Objects.equals(this.appVersion, appVersionInfo.appVersion) &&
        Objects.equals(this.baseAudit, appVersionInfo.baseAudit) &&
        Objects.equals(this.bundleId, appVersionInfo.bundleId) &&
        Objects.equals(this.canRelease, appVersionInfo.canRelease) &&
        Objects.equals(this.createTime, appVersionInfo.createTime) &&
        Objects.equals(this.promoteAudit, appVersionInfo.promoteAudit) &&
        Objects.equals(this.versionDescription, appVersionInfo.versionDescription) &&
        Objects.equals(this.versionStatus, appVersionInfo.versionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appVersion, baseAudit, bundleId, canRelease, createTime, promoteAudit, versionDescription, versionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppVersionInfo {\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    baseAudit: ").append(toIndentedString(baseAudit)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    canRelease: ").append(toIndentedString(canRelease)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    promoteAudit: ").append(toIndentedString(promoteAudit)).append("\n");
    sb.append("    versionDescription: ").append(toIndentedString(versionDescription)).append("\n");
    sb.append("    versionStatus: ").append(toIndentedString(versionStatus)).append("\n");
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
    openapiFields.add("app_version");
    openapiFields.add("base_audit");
    openapiFields.add("bundle_id");
    openapiFields.add("can_release");
    openapiFields.add("create_time");
    openapiFields.add("promote_audit");
    openapiFields.add("version_description");
    openapiFields.add("version_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AppVersionInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AppVersionInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppVersionInfo is not found in the empty JSON string", AppVersionInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AppVersionInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppVersionInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("app_version") != null && !jsonObj.get("app_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_version").toString()));
      }
      if (jsonObj.get("base_audit") != null && !jsonObj.get("base_audit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `base_audit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("base_audit").toString()));
      }
      if (jsonObj.get("bundle_id") != null && !jsonObj.get("bundle_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bundle_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bundle_id").toString()));
      }
      if (jsonObj.get("can_release") != null && !jsonObj.get("can_release").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `can_release` to be a primitive type in the JSON string but got `%s`", jsonObj.get("can_release").toString()));
      }
      if (jsonObj.get("create_time") != null && !jsonObj.get("create_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_time").toString()));
      }
      if (jsonObj.get("promote_audit") != null && !jsonObj.get("promote_audit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promote_audit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promote_audit").toString()));
      }
      if (jsonObj.get("version_description") != null && !jsonObj.get("version_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version_description").toString()));
      }
      if (jsonObj.get("version_status") != null && !jsonObj.get("version_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version_status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppVersionInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppVersionInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppVersionInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppVersionInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AppVersionInfo>() {
           @Override
           public void write(JsonWriter out, AppVersionInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppVersionInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppVersionInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppVersionInfo
  * @throws IOException if the JSON string is invalid with respect to AppVersionInfo
  */
  public static AppVersionInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppVersionInfo.class);
  }

 /**
  * Convert an instance of AppVersionInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

