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
 * PayParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PayParams {
  public static final String SERIALIZED_NAME_ASYNC_TYPE = "async_type";
  @SerializedName(SERIALIZED_NAME_ASYNC_TYPE)
  private String asyncType;

  public static final String SERIALIZED_NAME_RETRY_TYPE = "retry_type";
  @SerializedName(SERIALIZED_NAME_RETRY_TYPE)
  private String retryType;

  public PayParams() { 
  }

  public PayParams asyncType(String asyncType) {
    
    this.asyncType = asyncType;
    return this;
  }

   /**
   * 普通异步支付, 传入该参数时，如果满足受理条件，会先同步受理支付，然后在异步调度推进支付  NORMAL_ASYNC: 普通异步，受理成功之后，会在交易关单之前通过一定的策略重试  NEAR_REAL_TIME_ASYNC: 准实时异步，受理成功之后，会准实时发起1次调度
   * @return asyncType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NORMAL_ASYNC", value = "普通异步支付, 传入该参数时，如果满足受理条件，会先同步受理支付，然后在异步调度推进支付  NORMAL_ASYNC: 普通异步，受理成功之后，会在交易关单之前通过一定的策略重试  NEAR_REAL_TIME_ASYNC: 准实时异步，受理成功之后，会准实时发起1次调度")

  public String getAsyncType() {
    return asyncType;
  }


  public void setAsyncType(String asyncType) {
    this.asyncType = asyncType;
  }


  public PayParams retryType(String retryType) {
    
    this.retryType = retryType;
    return this;
  }

   /**
   * 重试类型，当async_type传入NORMAL_ASYNC时，可以设置该参数，选择是否要重试，retry_type 可选，不设置时，可重试。 ● NONE_AND_CLOSETRADE：不重试，支付请求只会被执行1次，执行完成后如果交易未成功，会关闭交易 ● NONE：不重试，支付请求只会被执行1次，执行完成后，不做任何处理。交易到达了timeout_express指定的时间后，关闭交易。 ● RETY: 重试，支付请求在超时关单前，会按照策略重试
   * @return retryType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NONE", value = "重试类型，当async_type传入NORMAL_ASYNC时，可以设置该参数，选择是否要重试，retry_type 可选，不设置时，可重试。 ● NONE_AND_CLOSETRADE：不重试，支付请求只会被执行1次，执行完成后如果交易未成功，会关闭交易 ● NONE：不重试，支付请求只会被执行1次，执行完成后，不做任何处理。交易到达了timeout_express指定的时间后，关闭交易。 ● RETY: 重试，支付请求在超时关单前，会按照策略重试")

  public String getRetryType() {
    return retryType;
  }


  public void setRetryType(String retryType) {
    this.retryType = retryType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayParams payParams = (PayParams) o;
    return Objects.equals(this.asyncType, payParams.asyncType) &&
        Objects.equals(this.retryType, payParams.retryType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asyncType, retryType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayParams {\n");
    sb.append("    asyncType: ").append(toIndentedString(asyncType)).append("\n");
    sb.append("    retryType: ").append(toIndentedString(retryType)).append("\n");
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
    openapiFields.add("async_type");
    openapiFields.add("retry_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PayParams
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PayParams.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayParams is not found in the empty JSON string", PayParams.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PayParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PayParams` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("async_type") != null && !jsonObj.get("async_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `async_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("async_type").toString()));
      }
      if (jsonObj.get("retry_type") != null && !jsonObj.get("retry_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `retry_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("retry_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PayParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayParams.class));

       return (TypeAdapter<T>) new TypeAdapter<PayParams>() {
           @Override
           public void write(JsonWriter out, PayParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PayParams read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PayParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayParams
  * @throws IOException if the JSON string is invalid with respect to PayParams
  */
  public static PayParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayParams.class);
  }

 /**
  * Convert an instance of PayParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

