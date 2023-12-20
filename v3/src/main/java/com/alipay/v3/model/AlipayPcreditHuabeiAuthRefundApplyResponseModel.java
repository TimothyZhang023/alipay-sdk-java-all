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
 * AlipayPcreditHuabeiAuthRefundApplyResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayPcreditHuabeiAuthRefundApplyResponseModel {
  public static final String SERIALIZED_NAME_AUTH_OPT_ID = "auth_opt_id";
  @SerializedName(SERIALIZED_NAME_AUTH_OPT_ID)
  private String authOptId;

  public static final String SERIALIZED_NAME_FAIL_REASON = "fail_reason";
  @SerializedName(SERIALIZED_NAME_FAIL_REASON)
  private String failReason;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_RETRY = "retry";
  @SerializedName(SERIALIZED_NAME_RETRY)
  private Boolean retry;

  public AlipayPcreditHuabeiAuthRefundApplyResponseModel() { 
  }

  public AlipayPcreditHuabeiAuthRefundApplyResponseModel authOptId(String authOptId) {
    
    this.authOptId = authOptId;
    return this;
  }

   /**
   * 授权支付单ID
   * @return authOptId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018041721001001230571065758", value = "授权支付单ID")

  public String getAuthOptId() {
    return authOptId;
  }


  public void setAuthOptId(String authOptId) {
    this.authOptId = authOptId;
  }


  public AlipayPcreditHuabeiAuthRefundApplyResponseModel failReason(String failReason) {
    
    this.failReason = failReason;
    return this;
  }

   /**
   * 退款操作错误原因描述
   * @return failReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "退款金额超限", value = "退款操作错误原因描述")

  public String getFailReason() {
    return failReason;
  }


  public void setFailReason(String failReason) {
    this.failReason = failReason;
  }


  public AlipayPcreditHuabeiAuthRefundApplyResponseModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 外部请求号
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "99202005050100930053707258", value = "外部请求号")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public AlipayPcreditHuabeiAuthRefundApplyResponseModel retry(Boolean retry) {
    
    this.retry = retry;
    return this;
  }

   /**
   * 是否可重试
   * @return retry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否可重试")

  public Boolean getRetry() {
    return retry;
  }


  public void setRetry(Boolean retry) {
    this.retry = retry;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayPcreditHuabeiAuthRefundApplyResponseModel alipayPcreditHuabeiAuthRefundApplyResponseModel = (AlipayPcreditHuabeiAuthRefundApplyResponseModel) o;
    return Objects.equals(this.authOptId, alipayPcreditHuabeiAuthRefundApplyResponseModel.authOptId) &&
        Objects.equals(this.failReason, alipayPcreditHuabeiAuthRefundApplyResponseModel.failReason) &&
        Objects.equals(this.outRequestNo, alipayPcreditHuabeiAuthRefundApplyResponseModel.outRequestNo) &&
        Objects.equals(this.retry, alipayPcreditHuabeiAuthRefundApplyResponseModel.retry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authOptId, failReason, outRequestNo, retry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayPcreditHuabeiAuthRefundApplyResponseModel {\n");
    sb.append("    authOptId: ").append(toIndentedString(authOptId)).append("\n");
    sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    retry: ").append(toIndentedString(retry)).append("\n");
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
    openapiFields.add("auth_opt_id");
    openapiFields.add("fail_reason");
    openapiFields.add("out_request_no");
    openapiFields.add("retry");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayPcreditHuabeiAuthRefundApplyResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayPcreditHuabeiAuthRefundApplyResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayPcreditHuabeiAuthRefundApplyResponseModel is not found in the empty JSON string", AlipayPcreditHuabeiAuthRefundApplyResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayPcreditHuabeiAuthRefundApplyResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayPcreditHuabeiAuthRefundApplyResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("auth_opt_id") != null && !jsonObj.get("auth_opt_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_opt_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_opt_id").toString()));
      }
      if (jsonObj.get("fail_reason") != null && !jsonObj.get("fail_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fail_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fail_reason").toString()));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayPcreditHuabeiAuthRefundApplyResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayPcreditHuabeiAuthRefundApplyResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayPcreditHuabeiAuthRefundApplyResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayPcreditHuabeiAuthRefundApplyResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayPcreditHuabeiAuthRefundApplyResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayPcreditHuabeiAuthRefundApplyResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayPcreditHuabeiAuthRefundApplyResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayPcreditHuabeiAuthRefundApplyResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayPcreditHuabeiAuthRefundApplyResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayPcreditHuabeiAuthRefundApplyResponseModel
  */
  public static AlipayPcreditHuabeiAuthRefundApplyResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayPcreditHuabeiAuthRefundApplyResponseModel.class);
  }

 /**
  * Convert an instance of AlipayPcreditHuabeiAuthRefundApplyResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

