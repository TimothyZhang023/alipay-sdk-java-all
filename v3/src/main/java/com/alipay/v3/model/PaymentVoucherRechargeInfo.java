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
import com.alipay.v3.model.PaymentVoucherAlipayBalanceRechargeInfo;
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
 * PaymentVoucherRechargeInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentVoucherRechargeInfo {
  public static final String SERIALIZED_NAME_ALIPAY_BALANCE_RECHARGE_INFO = "alipay_balance_recharge_info";
  @SerializedName(SERIALIZED_NAME_ALIPAY_BALANCE_RECHARGE_INFO)
  private PaymentVoucherAlipayBalanceRechargeInfo alipayBalanceRechargeInfo;

  public static final String SERIALIZED_NAME_RECHARGE_TYPE = "recharge_type";
  @SerializedName(SERIALIZED_NAME_RECHARGE_TYPE)
  private String rechargeType;

  public PaymentVoucherRechargeInfo() { 
  }

  public PaymentVoucherRechargeInfo alipayBalanceRechargeInfo(PaymentVoucherAlipayBalanceRechargeInfo alipayBalanceRechargeInfo) {
    
    this.alipayBalanceRechargeInfo = alipayBalanceRechargeInfo;
    return this;
  }

   /**
   * Get alipayBalanceRechargeInfo
   * @return alipayBalanceRechargeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentVoucherAlipayBalanceRechargeInfo getAlipayBalanceRechargeInfo() {
    return alipayBalanceRechargeInfo;
  }


  public void setAlipayBalanceRechargeInfo(PaymentVoucherAlipayBalanceRechargeInfo alipayBalanceRechargeInfo) {
    this.alipayBalanceRechargeInfo = alipayBalanceRechargeInfo;
  }


  public PaymentVoucherRechargeInfo rechargeType(String rechargeType) {
    
    this.rechargeType = rechargeType;
    return this;
  }

   /**
   * 预充值方式
   * @return rechargeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "预充值方式")

  public String getRechargeType() {
    return rechargeType;
  }


  public void setRechargeType(String rechargeType) {
    this.rechargeType = rechargeType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentVoucherRechargeInfo paymentVoucherRechargeInfo = (PaymentVoucherRechargeInfo) o;
    return Objects.equals(this.alipayBalanceRechargeInfo, paymentVoucherRechargeInfo.alipayBalanceRechargeInfo) &&
        Objects.equals(this.rechargeType, paymentVoucherRechargeInfo.rechargeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alipayBalanceRechargeInfo, rechargeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentVoucherRechargeInfo {\n");
    sb.append("    alipayBalanceRechargeInfo: ").append(toIndentedString(alipayBalanceRechargeInfo)).append("\n");
    sb.append("    rechargeType: ").append(toIndentedString(rechargeType)).append("\n");
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
    openapiFields.add("alipay_balance_recharge_info");
    openapiFields.add("recharge_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentVoucherRechargeInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentVoucherRechargeInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentVoucherRechargeInfo is not found in the empty JSON string", PaymentVoucherRechargeInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentVoucherRechargeInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentVoucherRechargeInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `alipay_balance_recharge_info`
      if (jsonObj.getAsJsonObject("alipay_balance_recharge_info") != null) {
        PaymentVoucherAlipayBalanceRechargeInfo.validateJsonObject(jsonObj.getAsJsonObject("alipay_balance_recharge_info"));
      }
      if (jsonObj.get("recharge_type") != null && !jsonObj.get("recharge_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recharge_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recharge_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentVoucherRechargeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentVoucherRechargeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentVoucherRechargeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentVoucherRechargeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentVoucherRechargeInfo>() {
           @Override
           public void write(JsonWriter out, PaymentVoucherRechargeInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentVoucherRechargeInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentVoucherRechargeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentVoucherRechargeInfo
  * @throws IOException if the JSON string is invalid with respect to PaymentVoucherRechargeInfo
  */
  public static PaymentVoucherRechargeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentVoucherRechargeInfo.class);
  }

 /**
  * Convert an instance of PaymentVoucherRechargeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

