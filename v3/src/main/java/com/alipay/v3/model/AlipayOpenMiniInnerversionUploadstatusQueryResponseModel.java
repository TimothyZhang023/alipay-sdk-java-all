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
 * AlipayOpenMiniInnerversionUploadstatusQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniInnerversionUploadstatusQueryResponseModel {
  public static final String SERIALIZED_NAME_BUILD_INFO = "build_info";
  @SerializedName(SERIALIZED_NAME_BUILD_INFO)
  private String buildInfo;

  public static final String SERIALIZED_NAME_BUILD_PACKAGE_URL = "build_package_url";
  @SerializedName(SERIALIZED_NAME_BUILD_PACKAGE_URL)
  private String buildPackageUrl;

  public static final String SERIALIZED_NAME_BUILD_STATUS = "build_status";
  @SerializedName(SERIALIZED_NAME_BUILD_STATUS)
  private String buildStatus;

  public static final String SERIALIZED_NAME_LOG_URL = "log_url";
  @SerializedName(SERIALIZED_NAME_LOG_URL)
  private String logUrl;

  public static final String SERIALIZED_NAME_NEED_ROTATION = "need_rotation";
  @SerializedName(SERIALIZED_NAME_NEED_ROTATION)
  private String needRotation;

  public static final String SERIALIZED_NAME_NEW_BUILD_PACKAGE_URL = "new_build_package_url";
  @SerializedName(SERIALIZED_NAME_NEW_BUILD_PACKAGE_URL)
  private String newBuildPackageUrl;

  public static final String SERIALIZED_NAME_NEW_RESULT_URL = "new_result_url";
  @SerializedName(SERIALIZED_NAME_NEW_RESULT_URL)
  private String newResultUrl;

  public static final String SERIALIZED_NAME_RESULT_URL = "result_url";
  @SerializedName(SERIALIZED_NAME_RESULT_URL)
  private String resultUrl;

  public static final String SERIALIZED_NAME_VERSION_CREATED = "version_created";
  @SerializedName(SERIALIZED_NAME_VERSION_CREATED)
  private String versionCreated;

  public AlipayOpenMiniInnerversionUploadstatusQueryResponseModel() { 
  }

  public AlipayOpenMiniInnerversionUploadstatusQueryResponseModel buildInfo(String buildInfo) {
    
    this.buildInfo = buildInfo;
    return this;
  }

   /**
   * 构建信息
   * @return buildInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "构建信息", value = "构建信息")

  public String getBuildInfo() {
    return buildInfo;
  }


  public void setBuildInfo(String buildInfo) {
    this.buildInfo = buildInfo;
  }


  public AlipayOpenMiniInnerversionUploadstatusQueryResponseModel buildPackageUrl(String buildPackageUrl) {
    
    this.buildPackageUrl = buildPackageUrl;
    return this;
  }

   /**
   * 构建好的包地址
   * @return buildPackageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://alipay-rmsdeploy-image.cn-hangzhou.alipay.aliyun-inc.com/qcloud/build-target-c1d90a3bcf354803ad01b28cdccd83a4.tar", value = "构建好的包地址")

  public String getBuildPackageUrl() {
    return buildPackageUrl;
  }


  public void setBuildPackageUrl(String buildPackageUrl) {
    this.buildPackageUrl = buildPackageUrl;
  }


  public AlipayOpenMiniInnerversionUploadstatusQueryResponseModel buildStatus(String buildStatus) {
    
    this.buildStatus = buildStatus;
    return this;
  }

   /**
   * 构建状态
   * @return buildStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "构建状态", value = "构建状态")

  public String getBuildStatus() {
    return buildStatus;
  }


  public void setBuildStatus(String buildStatus) {
    this.buildStatus = buildStatus;
  }


  public AlipayOpenMiniInnerversionUploadstatusQueryResponseModel logUrl(String logUrl) {
    
    this.logUrl = logUrl;
    return this;
  }

   /**
   * 构建日志地址
   * @return logUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://tfapi.alipay.com/logs/5c1ac74d0c5e1d85b8c618dd", value = "构建日志地址")

  public String getLogUrl() {
    return logUrl;
  }


  public void setLogUrl(String logUrl) {
    this.logUrl = logUrl;
  }


  public AlipayOpenMiniInnerversionUploadstatusQueryResponseModel needRotation(String needRotation) {
    
    this.needRotation = needRotation;
    return this;
  }

   /**
   * 是否需要轮询
   * @return needRotation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TRUE", value = "是否需要轮询")

  public String getNeedRotation() {
    return needRotation;
  }


  public void setNeedRotation(String needRotation) {
    this.needRotation = needRotation;
  }


  public AlipayOpenMiniInnerversionUploadstatusQueryResponseModel newBuildPackageUrl(String newBuildPackageUrl) {
    
    this.newBuildPackageUrl = newBuildPackageUrl;
    return this;
  }

   /**
   * 构建好的appx2.0包地址
   * @return newBuildPackageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://alipay-rmsdeploy-image.cn-hangzhou.alipay.aliyun-inc.com/qcloud/build-target-c1d90a3bcf354803ad01b28cdccd83a4.tar", value = "构建好的appx2.0包地址")

  public String getNewBuildPackageUrl() {
    return newBuildPackageUrl;
  }


  public void setNewBuildPackageUrl(String newBuildPackageUrl) {
    this.newBuildPackageUrl = newBuildPackageUrl;
  }


  public AlipayOpenMiniInnerversionUploadstatusQueryResponseModel newResultUrl(String newResultUrl) {
    
    this.newResultUrl = newResultUrl;
    return this;
  }

   /**
   * 构建的结果地址
   * @return newResultUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://tfapi.alipay.com/logs/5c1ac75f4b6ce5884ced6f00", value = "构建的结果地址")

  public String getNewResultUrl() {
    return newResultUrl;
  }


  public void setNewResultUrl(String newResultUrl) {
    this.newResultUrl = newResultUrl;
  }


  public AlipayOpenMiniInnerversionUploadstatusQueryResponseModel resultUrl(String resultUrl) {
    
    this.resultUrl = resultUrl;
    return this;
  }

   /**
   * 构建的结果地址
   * @return resultUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://tfapi.alipay.com/logs/5c1ac75f4b6ce5884ced6f00", value = "构建的结果地址")

  public String getResultUrl() {
    return resultUrl;
  }


  public void setResultUrl(String resultUrl) {
    this.resultUrl = resultUrl;
  }


  public AlipayOpenMiniInnerversionUploadstatusQueryResponseModel versionCreated(String versionCreated) {
    
    this.versionCreated = versionCreated;
    return this;
  }

   /**
   * 创建版本结果
   * @return versionCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TRUE", value = "创建版本结果")

  public String getVersionCreated() {
    return versionCreated;
  }


  public void setVersionCreated(String versionCreated) {
    this.versionCreated = versionCreated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniInnerversionUploadstatusQueryResponseModel alipayOpenMiniInnerversionUploadstatusQueryResponseModel = (AlipayOpenMiniInnerversionUploadstatusQueryResponseModel) o;
    return Objects.equals(this.buildInfo, alipayOpenMiniInnerversionUploadstatusQueryResponseModel.buildInfo) &&
        Objects.equals(this.buildPackageUrl, alipayOpenMiniInnerversionUploadstatusQueryResponseModel.buildPackageUrl) &&
        Objects.equals(this.buildStatus, alipayOpenMiniInnerversionUploadstatusQueryResponseModel.buildStatus) &&
        Objects.equals(this.logUrl, alipayOpenMiniInnerversionUploadstatusQueryResponseModel.logUrl) &&
        Objects.equals(this.needRotation, alipayOpenMiniInnerversionUploadstatusQueryResponseModel.needRotation) &&
        Objects.equals(this.newBuildPackageUrl, alipayOpenMiniInnerversionUploadstatusQueryResponseModel.newBuildPackageUrl) &&
        Objects.equals(this.newResultUrl, alipayOpenMiniInnerversionUploadstatusQueryResponseModel.newResultUrl) &&
        Objects.equals(this.resultUrl, alipayOpenMiniInnerversionUploadstatusQueryResponseModel.resultUrl) &&
        Objects.equals(this.versionCreated, alipayOpenMiniInnerversionUploadstatusQueryResponseModel.versionCreated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildInfo, buildPackageUrl, buildStatus, logUrl, needRotation, newBuildPackageUrl, newResultUrl, resultUrl, versionCreated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniInnerversionUploadstatusQueryResponseModel {\n");
    sb.append("    buildInfo: ").append(toIndentedString(buildInfo)).append("\n");
    sb.append("    buildPackageUrl: ").append(toIndentedString(buildPackageUrl)).append("\n");
    sb.append("    buildStatus: ").append(toIndentedString(buildStatus)).append("\n");
    sb.append("    logUrl: ").append(toIndentedString(logUrl)).append("\n");
    sb.append("    needRotation: ").append(toIndentedString(needRotation)).append("\n");
    sb.append("    newBuildPackageUrl: ").append(toIndentedString(newBuildPackageUrl)).append("\n");
    sb.append("    newResultUrl: ").append(toIndentedString(newResultUrl)).append("\n");
    sb.append("    resultUrl: ").append(toIndentedString(resultUrl)).append("\n");
    sb.append("    versionCreated: ").append(toIndentedString(versionCreated)).append("\n");
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
    openapiFields.add("build_info");
    openapiFields.add("build_package_url");
    openapiFields.add("build_status");
    openapiFields.add("log_url");
    openapiFields.add("need_rotation");
    openapiFields.add("new_build_package_url");
    openapiFields.add("new_result_url");
    openapiFields.add("result_url");
    openapiFields.add("version_created");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniInnerversionUploadstatusQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniInnerversionUploadstatusQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniInnerversionUploadstatusQueryResponseModel is not found in the empty JSON string", AlipayOpenMiniInnerversionUploadstatusQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniInnerversionUploadstatusQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniInnerversionUploadstatusQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("build_info") != null && !jsonObj.get("build_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `build_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("build_info").toString()));
      }
      if (jsonObj.get("build_package_url") != null && !jsonObj.get("build_package_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `build_package_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("build_package_url").toString()));
      }
      if (jsonObj.get("build_status") != null && !jsonObj.get("build_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `build_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("build_status").toString()));
      }
      if (jsonObj.get("log_url") != null && !jsonObj.get("log_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `log_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("log_url").toString()));
      }
      if (jsonObj.get("need_rotation") != null && !jsonObj.get("need_rotation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `need_rotation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("need_rotation").toString()));
      }
      if (jsonObj.get("new_build_package_url") != null && !jsonObj.get("new_build_package_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new_build_package_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new_build_package_url").toString()));
      }
      if (jsonObj.get("new_result_url") != null && !jsonObj.get("new_result_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new_result_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new_result_url").toString()));
      }
      if (jsonObj.get("result_url") != null && !jsonObj.get("result_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result_url").toString()));
      }
      if (jsonObj.get("version_created") != null && !jsonObj.get("version_created").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version_created` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version_created").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniInnerversionUploadstatusQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniInnerversionUploadstatusQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniInnerversionUploadstatusQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniInnerversionUploadstatusQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniInnerversionUploadstatusQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniInnerversionUploadstatusQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniInnerversionUploadstatusQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniInnerversionUploadstatusQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniInnerversionUploadstatusQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniInnerversionUploadstatusQueryResponseModel
  */
  public static AlipayOpenMiniInnerversionUploadstatusQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniInnerversionUploadstatusQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniInnerversionUploadstatusQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

