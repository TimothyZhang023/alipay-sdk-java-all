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
 * AlipayDataBillBalanceQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayDataBillBalanceQueryResponseModel {
  public static final String SERIALIZED_NAME_AVAILABLE_AMOUNT = "available_amount";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_AMOUNT)
  private String availableAmount;

  public static final String SERIALIZED_NAME_FREEZE_AMOUNT = "freeze_amount";
  @SerializedName(SERIALIZED_NAME_FREEZE_AMOUNT)
  private String freezeAmount;

  public static final String SERIALIZED_NAME_SETTLE_AMOUNT = "settle_amount";
  @SerializedName(SERIALIZED_NAME_SETTLE_AMOUNT)
  private String settleAmount;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private String totalAmount;

  public AlipayDataBillBalanceQueryResponseModel() { 
  }

  public AlipayDataBillBalanceQueryResponseModel availableAmount(String availableAmount) {
    
    this.availableAmount = availableAmount;
    return this;
  }

   /**
   * 账户可用余额
   * @return availableAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9000.00", value = "账户可用余额")

  public String getAvailableAmount() {
    return availableAmount;
  }


  public void setAvailableAmount(String availableAmount) {
    this.availableAmount = availableAmount;
  }


  public AlipayDataBillBalanceQueryResponseModel freezeAmount(String freezeAmount) {
    
    this.freezeAmount = freezeAmount;
    return this;
  }

   /**
   * 冻结金额。单位（元）
   * @return freezeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000.00", value = "冻结金额。单位（元）")

  public String getFreezeAmount() {
    return freezeAmount;
  }


  public void setFreezeAmount(String freezeAmount) {
    this.freezeAmount = freezeAmount;
  }


  public AlipayDataBillBalanceQueryResponseModel settleAmount(String settleAmount) {
    
    this.settleAmount = settleAmount;
    return this;
  }

   /**
   * 待结算金额，单位（元）
   * @return settleAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "500.00", value = "待结算金额，单位（元）")

  public String getSettleAmount() {
    return settleAmount;
  }


  public void setSettleAmount(String settleAmount) {
    this.settleAmount = settleAmount;
  }


  public AlipayDataBillBalanceQueryResponseModel totalAmount(String totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * 支付宝账户余额
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000.00", value = "支付宝账户余额")

  public String getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayDataBillBalanceQueryResponseModel alipayDataBillBalanceQueryResponseModel = (AlipayDataBillBalanceQueryResponseModel) o;
    return Objects.equals(this.availableAmount, alipayDataBillBalanceQueryResponseModel.availableAmount) &&
        Objects.equals(this.freezeAmount, alipayDataBillBalanceQueryResponseModel.freezeAmount) &&
        Objects.equals(this.settleAmount, alipayDataBillBalanceQueryResponseModel.settleAmount) &&
        Objects.equals(this.totalAmount, alipayDataBillBalanceQueryResponseModel.totalAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableAmount, freezeAmount, settleAmount, totalAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayDataBillBalanceQueryResponseModel {\n");
    sb.append("    availableAmount: ").append(toIndentedString(availableAmount)).append("\n");
    sb.append("    freezeAmount: ").append(toIndentedString(freezeAmount)).append("\n");
    sb.append("    settleAmount: ").append(toIndentedString(settleAmount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
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
    openapiFields.add("available_amount");
    openapiFields.add("freeze_amount");
    openapiFields.add("settle_amount");
    openapiFields.add("total_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayDataBillBalanceQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayDataBillBalanceQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayDataBillBalanceQueryResponseModel is not found in the empty JSON string", AlipayDataBillBalanceQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayDataBillBalanceQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayDataBillBalanceQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("available_amount") != null && !jsonObj.get("available_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `available_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("available_amount").toString()));
      }
      if (jsonObj.get("freeze_amount") != null && !jsonObj.get("freeze_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `freeze_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("freeze_amount").toString()));
      }
      if (jsonObj.get("settle_amount") != null && !jsonObj.get("settle_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settle_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settle_amount").toString()));
      }
      if (jsonObj.get("total_amount") != null && !jsonObj.get("total_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayDataBillBalanceQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayDataBillBalanceQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayDataBillBalanceQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayDataBillBalanceQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayDataBillBalanceQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayDataBillBalanceQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayDataBillBalanceQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayDataBillBalanceQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayDataBillBalanceQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayDataBillBalanceQueryResponseModel
  */
  public static AlipayDataBillBalanceQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayDataBillBalanceQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayDataBillBalanceQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

