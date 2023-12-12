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
 * AlipayEbppInvoiceApplyResultSyncResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceApplyResultSyncResponseModel {
  public static final String SERIALIZED_NAME_RETRY_FLAG = "retry_flag";
  @SerializedName(SERIALIZED_NAME_RETRY_FLAG)
  private Boolean retryFlag;

  public AlipayEbppInvoiceApplyResultSyncResponseModel() { 
  }

  public AlipayEbppInvoiceApplyResultSyncResponseModel retryFlag(Boolean retryFlag) {
    
    this.retryFlag = retryFlag;
    return this;
  }

   /**
   * 标注是否需要调用方重试。  当结果返回失败时（code 不等于 10000 且 msg 不等于 SUCCESS  ），如果该字段返回true表明该失败的情况通过重试补偿可解决，为false表明失败情况通过重试无法解决，可以停止重试，根据返回的错误码尝试解决。
   * @return retryFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "标注是否需要调用方重试。  当结果返回失败时（code 不等于 10000 且 msg 不等于 SUCCESS  ），如果该字段返回true表明该失败的情况通过重试补偿可解决，为false表明失败情况通过重试无法解决，可以停止重试，根据返回的错误码尝试解决。")

  public Boolean getRetryFlag() {
    return retryFlag;
  }


  public void setRetryFlag(Boolean retryFlag) {
    this.retryFlag = retryFlag;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppInvoiceApplyResultSyncResponseModel alipayEbppInvoiceApplyResultSyncResponseModel = (AlipayEbppInvoiceApplyResultSyncResponseModel) o;
    return Objects.equals(this.retryFlag, alipayEbppInvoiceApplyResultSyncResponseModel.retryFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retryFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceApplyResultSyncResponseModel {\n");
    sb.append("    retryFlag: ").append(toIndentedString(retryFlag)).append("\n");
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
    openapiFields.add("retry_flag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceApplyResultSyncResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceApplyResultSyncResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceApplyResultSyncResponseModel is not found in the empty JSON string", AlipayEbppInvoiceApplyResultSyncResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceApplyResultSyncResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceApplyResultSyncResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceApplyResultSyncResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceApplyResultSyncResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceApplyResultSyncResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceApplyResultSyncResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceApplyResultSyncResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceApplyResultSyncResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceApplyResultSyncResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceApplyResultSyncResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceApplyResultSyncResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceApplyResultSyncResponseModel
  */
  public static AlipayEbppInvoiceApplyResultSyncResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceApplyResultSyncResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceApplyResultSyncResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

