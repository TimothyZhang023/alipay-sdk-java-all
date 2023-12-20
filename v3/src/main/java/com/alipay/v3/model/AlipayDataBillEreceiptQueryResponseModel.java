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
 * AlipayDataBillEreceiptQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayDataBillEreceiptQueryResponseModel {
  public static final String SERIALIZED_NAME_DOWNLOAD_URL = "download_url";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URL)
  private String downloadUrl;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "error_message";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public AlipayDataBillEreceiptQueryResponseModel() { 
  }

  public AlipayDataBillEreceiptQueryResponseModel downloadUrl(String downloadUrl) {
    
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * 下载链接，status 为 SUCCESS 时返回。用户可以使用此http链接下载文件内容。有效时间为 30s。  生成文件为PDF格式，下载即可获取电子回单 PDF 内容。
   * @return downloadUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://dwbillcenter.alipay.com/xxx", value = "下载链接，status 为 SUCCESS 时返回。用户可以使用此http链接下载文件内容。有效时间为 30s。  生成文件为PDF格式，下载即可获取电子回单 PDF 内容。")

  public String getDownloadUrl() {
    return downloadUrl;
  }


  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  public AlipayDataBillEreceiptQueryResponseModel errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * 如果生成失败，则会返回失败原因
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "key不存在", value = "如果生成失败，则会返回失败原因")

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public AlipayDataBillEreceiptQueryResponseModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 处理状态。枚举值如下： INIT：初始化。 PROCESS：处理中。 SUCCESS：成功。 FAIL：失败。
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUCCESS", value = "处理状态。枚举值如下： INIT：初始化。 PROCESS：处理中。 SUCCESS：成功。 FAIL：失败。")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayDataBillEreceiptQueryResponseModel alipayDataBillEreceiptQueryResponseModel = (AlipayDataBillEreceiptQueryResponseModel) o;
    return Objects.equals(this.downloadUrl, alipayDataBillEreceiptQueryResponseModel.downloadUrl) &&
        Objects.equals(this.errorMessage, alipayDataBillEreceiptQueryResponseModel.errorMessage) &&
        Objects.equals(this.status, alipayDataBillEreceiptQueryResponseModel.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadUrl, errorMessage, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayDataBillEreceiptQueryResponseModel {\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("download_url");
    openapiFields.add("error_message");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayDataBillEreceiptQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayDataBillEreceiptQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayDataBillEreceiptQueryResponseModel is not found in the empty JSON string", AlipayDataBillEreceiptQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayDataBillEreceiptQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayDataBillEreceiptQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("download_url") != null && !jsonObj.get("download_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `download_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("download_url").toString()));
      }
      if (jsonObj.get("error_message") != null && !jsonObj.get("error_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_message").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayDataBillEreceiptQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayDataBillEreceiptQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayDataBillEreceiptQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayDataBillEreceiptQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayDataBillEreceiptQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayDataBillEreceiptQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayDataBillEreceiptQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayDataBillEreceiptQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayDataBillEreceiptQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayDataBillEreceiptQueryResponseModel
  */
  public static AlipayDataBillEreceiptQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayDataBillEreceiptQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayDataBillEreceiptQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

