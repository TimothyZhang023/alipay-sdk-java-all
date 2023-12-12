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
 * AlipayTradeOverseasSettleResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayTradeOverseasSettleResponseModel {
  public static final String SERIALIZED_NAME_EXCHANGE_RATE = "exchange_rate";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_RATE)
  private String exchangeRate;

  public static final String SERIALIZED_NAME_FOREIGN_SETTLE_AMOUNT = "foreign_settle_amount";
  @SerializedName(SERIALIZED_NAME_FOREIGN_SETTLE_AMOUNT)
  private String foreignSettleAmount;

  public static final String SERIALIZED_NAME_FOREIGN_SETTLE_CURRENCY = "foreign_settle_currency";
  @SerializedName(SERIALIZED_NAME_FOREIGN_SETTLE_CURRENCY)
  private String foreignSettleCurrency;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_SETTLE_AMOUNT = "settle_amount";
  @SerializedName(SERIALIZED_NAME_SETTLE_AMOUNT)
  private String settleAmount;

  public static final String SERIALIZED_NAME_TRADE_NO = "trade_no";
  @SerializedName(SERIALIZED_NAME_TRADE_NO)
  private String tradeNo;

  public AlipayTradeOverseasSettleResponseModel() { 
  }

  public AlipayTradeOverseasSettleResponseModel exchangeRate(String exchangeRate) {
    
    this.exchangeRate = exchangeRate;
    return this;
  }

   /**
   * 本笔跨境结算使用的汇率，精度 8 位小数
   * @return exchangeRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6.83950000", value = "本笔跨境结算使用的汇率，精度 8 位小数")

  public String getExchangeRate() {
    return exchangeRate;
  }


  public void setExchangeRate(String exchangeRate) {
    this.exchangeRate = exchangeRate;
  }


  public AlipayTradeOverseasSettleResponseModel foreignSettleAmount(String foreignSettleAmount) {
    
    this.foreignSettleAmount = foreignSettleAmount;
    return this;
  }

   /**
   * 本次跨境结算的实际结算外币金额
   * @return foreignSettleAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.00", value = "本次跨境结算的实际结算外币金额")

  public String getForeignSettleAmount() {
    return foreignSettleAmount;
  }


  public void setForeignSettleAmount(String foreignSettleAmount) {
    this.foreignSettleAmount = foreignSettleAmount;
  }


  public AlipayTradeOverseasSettleResponseModel foreignSettleCurrency(String foreignSettleCurrency) {
    
    this.foreignSettleCurrency = foreignSettleCurrency;
    return this;
  }

   /**
   * 本笔跨境结算实际结算的外币币种
   * @return foreignSettleCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "本笔跨境结算实际结算的外币币种")

  public String getForeignSettleCurrency() {
    return foreignSettleCurrency;
  }


  public void setForeignSettleCurrency(String foreignSettleCurrency) {
    this.foreignSettleCurrency = foreignSettleCurrency;
  }


  public AlipayTradeOverseasSettleResponseModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 请求流水号，开发者自行生成并保证唯一性，作为业务幂等性控制
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20160727001", value = "请求流水号，开发者自行生成并保证唯一性，作为业务幂等性控制")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public AlipayTradeOverseasSettleResponseModel settleAmount(String settleAmount) {
    
    this.settleAmount = settleAmount;
    return this;
  }

   /**
   * 本次跨境结算的实际结算人民币金额
   * @return settleAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6.00", value = "本次跨境结算的实际结算人民币金额")

  public String getSettleAmount() {
    return settleAmount;
  }


  public void setSettleAmount(String settleAmount) {
    this.settleAmount = settleAmount;
  }


  public AlipayTradeOverseasSettleResponseModel tradeNo(String tradeNo) {
    
    this.tradeNo = tradeNo;
    return this;
  }

   /**
   * 支付宝交易号
   * @return tradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020121921001004130000127421", value = "支付宝交易号")

  public String getTradeNo() {
    return tradeNo;
  }


  public void setTradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayTradeOverseasSettleResponseModel alipayTradeOverseasSettleResponseModel = (AlipayTradeOverseasSettleResponseModel) o;
    return Objects.equals(this.exchangeRate, alipayTradeOverseasSettleResponseModel.exchangeRate) &&
        Objects.equals(this.foreignSettleAmount, alipayTradeOverseasSettleResponseModel.foreignSettleAmount) &&
        Objects.equals(this.foreignSettleCurrency, alipayTradeOverseasSettleResponseModel.foreignSettleCurrency) &&
        Objects.equals(this.outRequestNo, alipayTradeOverseasSettleResponseModel.outRequestNo) &&
        Objects.equals(this.settleAmount, alipayTradeOverseasSettleResponseModel.settleAmount) &&
        Objects.equals(this.tradeNo, alipayTradeOverseasSettleResponseModel.tradeNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeRate, foreignSettleAmount, foreignSettleCurrency, outRequestNo, settleAmount, tradeNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayTradeOverseasSettleResponseModel {\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    foreignSettleAmount: ").append(toIndentedString(foreignSettleAmount)).append("\n");
    sb.append("    foreignSettleCurrency: ").append(toIndentedString(foreignSettleCurrency)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    settleAmount: ").append(toIndentedString(settleAmount)).append("\n");
    sb.append("    tradeNo: ").append(toIndentedString(tradeNo)).append("\n");
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
    openapiFields.add("exchange_rate");
    openapiFields.add("foreign_settle_amount");
    openapiFields.add("foreign_settle_currency");
    openapiFields.add("out_request_no");
    openapiFields.add("settle_amount");
    openapiFields.add("trade_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayTradeOverseasSettleResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayTradeOverseasSettleResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayTradeOverseasSettleResponseModel is not found in the empty JSON string", AlipayTradeOverseasSettleResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayTradeOverseasSettleResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayTradeOverseasSettleResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("exchange_rate") != null && !jsonObj.get("exchange_rate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exchange_rate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exchange_rate").toString()));
      }
      if (jsonObj.get("foreign_settle_amount") != null && !jsonObj.get("foreign_settle_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `foreign_settle_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("foreign_settle_amount").toString()));
      }
      if (jsonObj.get("foreign_settle_currency") != null && !jsonObj.get("foreign_settle_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `foreign_settle_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("foreign_settle_currency").toString()));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      if (jsonObj.get("settle_amount") != null && !jsonObj.get("settle_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settle_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settle_amount").toString()));
      }
      if (jsonObj.get("trade_no") != null && !jsonObj.get("trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayTradeOverseasSettleResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayTradeOverseasSettleResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayTradeOverseasSettleResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayTradeOverseasSettleResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayTradeOverseasSettleResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayTradeOverseasSettleResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayTradeOverseasSettleResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayTradeOverseasSettleResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayTradeOverseasSettleResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayTradeOverseasSettleResponseModel
  */
  public static AlipayTradeOverseasSettleResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayTradeOverseasSettleResponseModel.class);
  }

 /**
  * Convert an instance of AlipayTradeOverseasSettleResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

