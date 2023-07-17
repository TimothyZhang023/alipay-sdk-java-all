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
 * AlipayUserTwostageCommonUseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayUserTwostageCommonUseModel {
  public static final String SERIALIZED_NAME_DYNAMIC_ID = "dynamic_id";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_ID)
  private String dynamicId;

  public static final String SERIALIZED_NAME_PAY_CHECK_STRATEGY = "pay_check_strategy";
  @SerializedName(SERIALIZED_NAME_PAY_CHECK_STRATEGY)
  private String payCheckStrategy;

  public static final String SERIALIZED_NAME_PAY_PID = "pay_pid";
  @SerializedName(SERIALIZED_NAME_PAY_PID)
  private String payPid;

  public static final String SERIALIZED_NAME_SENCE_NO = "sence_no";
  @SerializedName(SERIALIZED_NAME_SENCE_NO)
  private String senceNo;

  public AlipayUserTwostageCommonUseModel() { 
  }

  public AlipayUserTwostageCommonUseModel dynamicId(String dynamicId) {
    
    this.dynamicId = dynamicId;
    return this;
  }

   /**
   * 商户扫描用户的付款码值。
   * @return dynamicId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "286861260475412123", value = "商户扫描用户的付款码值。")

  public String getDynamicId() {
    return dynamicId;
  }


  public void setDynamicId(String dynamicId) {
    this.dynamicId = dynamicId;
  }


  public AlipayUserTwostageCommonUseModel payCheckStrategy(String payCheckStrategy) {
    
    this.payCheckStrategy = payCheckStrategy;
    return this;
  }

   /**
   * 传1表示 校验pid(pay_pid)和来支付的时候的pid一致性； 传2表示校验pid(pay_pid)和来支付的时候的pid一致性、校验scene_no和来支付时DYNAMIC_TOKEN_OUT_BIZ_NO属性一致；                        不传值和value&#x3D;2的表现一致
   * @return payCheckStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "传1表示 校验pid(pay_pid)和来支付的时候的pid一致性； 传2表示校验pid(pay_pid)和来支付的时候的pid一致性、校验scene_no和来支付时DYNAMIC_TOKEN_OUT_BIZ_NO属性一致；                        不传值和value=2的表现一致")

  public String getPayCheckStrategy() {
    return payCheckStrategy;
  }


  public void setPayCheckStrategy(String payCheckStrategy) {
    this.payCheckStrategy = payCheckStrategy;
  }


  public AlipayUserTwostageCommonUseModel payPid(String payPid) {
    
    this.payPid = payPid;
    return this;
  }

   /**
   * 商家进行二阶段支付的PID信息。
   * @return payPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088702093900999", value = "商家进行二阶段支付的PID信息。")

  public String getPayPid() {
    return payPid;
  }


  public void setPayPid(String payPid) {
    this.payPid = payPid;
  }


  public AlipayUserTwostageCommonUseModel senceNo(String senceNo) {
    
    this.senceNo = senceNo;
    return this;
  }

   /**
   * 外部业务号，用于标识这笔解码请求，对同一个码的重复解码请求，sence_no必须与上一次保持一致，每次请求的sence_no必须不一样，如alipay.user.twostage.common.use接口配合alipay.trade.pay（统一收单交易支付接口）一并使用时，alipay.trade.pay接口的extend_params属性中必须设置DYNAMIC_TOKEN_OUT_BIZ_NO，且值必须与sence_no保持一致。
   * @return senceNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20170718xxxxxxxx", value = "外部业务号，用于标识这笔解码请求，对同一个码的重复解码请求，sence_no必须与上一次保持一致，每次请求的sence_no必须不一样，如alipay.user.twostage.common.use接口配合alipay.trade.pay（统一收单交易支付接口）一并使用时，alipay.trade.pay接口的extend_params属性中必须设置DYNAMIC_TOKEN_OUT_BIZ_NO，且值必须与sence_no保持一致。")

  public String getSenceNo() {
    return senceNo;
  }


  public void setSenceNo(String senceNo) {
    this.senceNo = senceNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayUserTwostageCommonUseModel alipayUserTwostageCommonUseModel = (AlipayUserTwostageCommonUseModel) o;
    return Objects.equals(this.dynamicId, alipayUserTwostageCommonUseModel.dynamicId) &&
        Objects.equals(this.payCheckStrategy, alipayUserTwostageCommonUseModel.payCheckStrategy) &&
        Objects.equals(this.payPid, alipayUserTwostageCommonUseModel.payPid) &&
        Objects.equals(this.senceNo, alipayUserTwostageCommonUseModel.senceNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dynamicId, payCheckStrategy, payPid, senceNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayUserTwostageCommonUseModel {\n");
    sb.append("    dynamicId: ").append(toIndentedString(dynamicId)).append("\n");
    sb.append("    payCheckStrategy: ").append(toIndentedString(payCheckStrategy)).append("\n");
    sb.append("    payPid: ").append(toIndentedString(payPid)).append("\n");
    sb.append("    senceNo: ").append(toIndentedString(senceNo)).append("\n");
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
    openapiFields.add("dynamic_id");
    openapiFields.add("pay_check_strategy");
    openapiFields.add("pay_pid");
    openapiFields.add("sence_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayUserTwostageCommonUseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayUserTwostageCommonUseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayUserTwostageCommonUseModel is not found in the empty JSON string", AlipayUserTwostageCommonUseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayUserTwostageCommonUseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayUserTwostageCommonUseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("dynamic_id") != null && !jsonObj.get("dynamic_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dynamic_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dynamic_id").toString()));
      }
      if (jsonObj.get("pay_check_strategy") != null && !jsonObj.get("pay_check_strategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_check_strategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_check_strategy").toString()));
      }
      if (jsonObj.get("pay_pid") != null && !jsonObj.get("pay_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_pid").toString()));
      }
      if (jsonObj.get("sence_no") != null && !jsonObj.get("sence_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sence_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sence_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayUserTwostageCommonUseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayUserTwostageCommonUseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayUserTwostageCommonUseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayUserTwostageCommonUseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayUserTwostageCommonUseModel>() {
           @Override
           public void write(JsonWriter out, AlipayUserTwostageCommonUseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayUserTwostageCommonUseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayUserTwostageCommonUseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayUserTwostageCommonUseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayUserTwostageCommonUseModel
  */
  public static AlipayUserTwostageCommonUseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayUserTwostageCommonUseModel.class);
  }

 /**
  * Convert an instance of AlipayUserTwostageCommonUseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

