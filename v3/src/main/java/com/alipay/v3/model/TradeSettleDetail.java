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
 * TradeSettleDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TradeSettleDetail {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_OPERATION_DT = "operation_dt";
  @SerializedName(SERIALIZED_NAME_OPERATION_DT)
  private String operationDt;

  public static final String SERIALIZED_NAME_OPERATION_SERIAL_NO = "operation_serial_no";
  @SerializedName(SERIALIZED_NAME_OPERATION_SERIAL_NO)
  private String operationSerialNo;

  public static final String SERIALIZED_NAME_OPERATION_TYPE = "operation_type";
  @SerializedName(SERIALIZED_NAME_OPERATION_TYPE)
  private String operationType;

  public static final String SERIALIZED_NAME_ORI_TRANS_IN = "ori_trans_in";
  @SerializedName(SERIALIZED_NAME_ORI_TRANS_IN)
  private String oriTransIn;

  public static final String SERIALIZED_NAME_ORI_TRANS_OUT = "ori_trans_out";
  @SerializedName(SERIALIZED_NAME_ORI_TRANS_OUT)
  private String oriTransOut;

  public static final String SERIALIZED_NAME_TRANS_IN = "trans_in";
  @SerializedName(SERIALIZED_NAME_TRANS_IN)
  private String transIn;

  public static final String SERIALIZED_NAME_TRANS_OUT = "trans_out";
  @SerializedName(SERIALIZED_NAME_TRANS_OUT)
  private String transOut;

  public TradeSettleDetail() { 
  }

  public TradeSettleDetail amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 实际操作金额，单位为元，两位小数。该参数的值为分账或补差或结算时传入
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.00", value = "实际操作金额，单位为元，两位小数。该参数的值为分账或补差或结算时传入")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public TradeSettleDetail operationDt(String operationDt) {
    
    this.operationDt = operationDt;
    return this;
  }

   /**
   * 操作日期
   * @return operationDt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-05-16 09:59:17", value = "操作日期")

  public String getOperationDt() {
    return operationDt;
  }


  public void setOperationDt(String operationDt) {
    this.operationDt = operationDt;
  }


  public TradeSettleDetail operationSerialNo(String operationSerialNo) {
    
    this.operationSerialNo = operationSerialNo;
    return this;
  }

   /**
   * 商户操作序列号。商户发起请求的外部请求号。
   * @return operationSerialNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2321232323232", value = "商户操作序列号。商户发起请求的外部请求号。")

  public String getOperationSerialNo() {
    return operationSerialNo;
  }


  public void setOperationSerialNo(String operationSerialNo) {
    this.operationSerialNo = operationSerialNo;
  }


  public TradeSettleDetail operationType(String operationType) {
    
    this.operationType = operationType;
    return this;
  }

   /**
   * 结算操作类型。有以下几种类型： replenish(补差)、replenish_refund(退补差)、transfer(分账)、transfer_refund(退分账)、settle(结算)、settle_refund(退结算)、on_settle(待结算)。
   * @return operationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "replenish", value = "结算操作类型。有以下几种类型： replenish(补差)、replenish_refund(退补差)、transfer(分账)、transfer_refund(退分账)、settle(结算)、settle_refund(退结算)、on_settle(待结算)。")

  public String getOperationType() {
    return operationType;
  }


  public void setOperationType(String operationType) {
    this.operationType = operationType;
  }


  public TradeSettleDetail oriTransIn(String oriTransIn) {
    
    this.oriTransIn = oriTransIn;
    return this;
  }

   /**
   * 商户请求的转入账号
   * @return oriTransIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088111111111111", value = "商户请求的转入账号")

  public String getOriTransIn() {
    return oriTransIn;
  }


  public void setOriTransIn(String oriTransIn) {
    this.oriTransIn = oriTransIn;
  }


  public TradeSettleDetail oriTransOut(String oriTransOut) {
    
    this.oriTransOut = oriTransOut;
    return this;
  }

   /**
   * 商户请求的转出账号
   * @return oriTransOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088111111111111", value = "商户请求的转出账号")

  public String getOriTransOut() {
    return oriTransOut;
  }


  public void setOriTransOut(String oriTransOut) {
    this.oriTransOut = oriTransOut;
  }


  public TradeSettleDetail transIn(String transIn) {
    
    this.transIn = transIn;
    return this;
  }

   /**
   * 转入账号
   * @return transIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088111111111111", value = "转入账号")

  public String getTransIn() {
    return transIn;
  }


  public void setTransIn(String transIn) {
    this.transIn = transIn;
  }


  public TradeSettleDetail transOut(String transOut) {
    
    this.transOut = transOut;
    return this;
  }

   /**
   * 转出账号
   * @return transOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088111111111111", value = "转出账号")

  public String getTransOut() {
    return transOut;
  }


  public void setTransOut(String transOut) {
    this.transOut = transOut;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradeSettleDetail tradeSettleDetail = (TradeSettleDetail) o;
    return Objects.equals(this.amount, tradeSettleDetail.amount) &&
        Objects.equals(this.operationDt, tradeSettleDetail.operationDt) &&
        Objects.equals(this.operationSerialNo, tradeSettleDetail.operationSerialNo) &&
        Objects.equals(this.operationType, tradeSettleDetail.operationType) &&
        Objects.equals(this.oriTransIn, tradeSettleDetail.oriTransIn) &&
        Objects.equals(this.oriTransOut, tradeSettleDetail.oriTransOut) &&
        Objects.equals(this.transIn, tradeSettleDetail.transIn) &&
        Objects.equals(this.transOut, tradeSettleDetail.transOut);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, operationDt, operationSerialNo, operationType, oriTransIn, oriTransOut, transIn, transOut);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeSettleDetail {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    operationDt: ").append(toIndentedString(operationDt)).append("\n");
    sb.append("    operationSerialNo: ").append(toIndentedString(operationSerialNo)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    oriTransIn: ").append(toIndentedString(oriTransIn)).append("\n");
    sb.append("    oriTransOut: ").append(toIndentedString(oriTransOut)).append("\n");
    sb.append("    transIn: ").append(toIndentedString(transIn)).append("\n");
    sb.append("    transOut: ").append(toIndentedString(transOut)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("operation_dt");
    openapiFields.add("operation_serial_no");
    openapiFields.add("operation_type");
    openapiFields.add("ori_trans_in");
    openapiFields.add("ori_trans_out");
    openapiFields.add("trans_in");
    openapiFields.add("trans_out");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TradeSettleDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TradeSettleDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TradeSettleDetail is not found in the empty JSON string", TradeSettleDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TradeSettleDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TradeSettleDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("operation_dt") != null && !jsonObj.get("operation_dt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation_dt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation_dt").toString()));
      }
      if (jsonObj.get("operation_serial_no") != null && !jsonObj.get("operation_serial_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation_serial_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation_serial_no").toString()));
      }
      if (jsonObj.get("operation_type") != null && !jsonObj.get("operation_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation_type").toString()));
      }
      if (jsonObj.get("ori_trans_in") != null && !jsonObj.get("ori_trans_in").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ori_trans_in` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ori_trans_in").toString()));
      }
      if (jsonObj.get("ori_trans_out") != null && !jsonObj.get("ori_trans_out").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ori_trans_out` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ori_trans_out").toString()));
      }
      if (jsonObj.get("trans_in") != null && !jsonObj.get("trans_in").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_in` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_in").toString()));
      }
      if (jsonObj.get("trans_out") != null && !jsonObj.get("trans_out").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_out` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_out").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TradeSettleDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TradeSettleDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TradeSettleDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TradeSettleDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<TradeSettleDetail>() {
           @Override
           public void write(JsonWriter out, TradeSettleDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TradeSettleDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TradeSettleDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TradeSettleDetail
  * @throws IOException if the JSON string is invalid with respect to TradeSettleDetail
  */
  public static TradeSettleDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TradeSettleDetail.class);
  }

 /**
  * Convert an instance of TradeSettleDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

