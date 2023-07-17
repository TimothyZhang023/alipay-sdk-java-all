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
 * AlipayFundTransUniTransferResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundTransUniTransferResponseModel {
  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_PAY_FUND_ORDER_ID = "pay_fund_order_id";
  @SerializedName(SERIALIZED_NAME_PAY_FUND_ORDER_ID)
  private String payFundOrderId;

  public static final String SERIALIZED_NAME_SETTLE_SERIAL_NO = "settle_serial_no";
  @SerializedName(SERIALIZED_NAME_SETTLE_SERIAL_NO)
  private String settleSerialNo;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TRANS_DATE = "trans_date";
  @SerializedName(SERIALIZED_NAME_TRANS_DATE)
  private String transDate;

  public AlipayFundTransUniTransferResponseModel() { 
  }

  public AlipayFundTransUniTransferResponseModel orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 支付宝转账订单号
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20190801110070000006380000250621", value = "支付宝转账订单号")

  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public AlipayFundTransUniTransferResponseModel outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 商户订单号
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201808080001", value = "商户订单号")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public AlipayFundTransUniTransferResponseModel payFundOrderId(String payFundOrderId) {
    
    this.payFundOrderId = payFundOrderId;
    return this;
  }

   /**
   * 支付宝支付资金流水号
   * @return payFundOrderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20190801110070001506380000251556", value = "支付宝支付资金流水号")

  public String getPayFundOrderId() {
    return payFundOrderId;
  }


  public void setPayFundOrderId(String payFundOrderId) {
    this.payFundOrderId = payFundOrderId;
  }


  public AlipayFundTransUniTransferResponseModel settleSerialNo(String settleSerialNo) {
    
    this.settleSerialNo = settleSerialNo;
    return this;
  }

   /**
   * 金融机构发起签约类、支付类、差错类业务时，应为每笔业务分配唯一的交易流水号。31位交易流水号组成规则为：“8位日期”+“16位序列号”+“1位预留位”+“6位控制位”，其中： a）“8位日期”为系统当前日期，ISODate格式：“YYYYMMDD” b）“16位序列号”由金融机构生成，金融机构应确保该值在网联当日唯一 c）“1位预留位”由平台分配 d）“6位控制位”由金融机构通过平台获取 例如：2023052993044491260542090100400
   * @return settleSerialNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023052993044491260542090100400", value = "金融机构发起签约类、支付类、差错类业务时，应为每笔业务分配唯一的交易流水号。31位交易流水号组成规则为：“8位日期”+“16位序列号”+“1位预留位”+“6位控制位”，其中： a）“8位日期”为系统当前日期，ISODate格式：“YYYYMMDD” b）“16位序列号”由金融机构生成，金融机构应确保该值在网联当日唯一 c）“1位预留位”由平台分配 d）“6位控制位”由金融机构通过平台获取 例如：2023052993044491260542090100400")

  public String getSettleSerialNo() {
    return settleSerialNo;
  }


  public void setSettleSerialNo(String settleSerialNo) {
    this.settleSerialNo = settleSerialNo;
  }


  public AlipayFundTransUniTransferResponseModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 转账单据状态。 SUCCESS（该笔转账交易成功）：成功； FAIL：失败（具体失败原因请参见error_code以及fail_reason返回值）； DEALING：处理中（转账到支付宝账户不涉及）； REFUND：退票（转账到支付宝账户不涉及）；
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUCCESS", value = "转账单据状态。 SUCCESS（该笔转账交易成功）：成功； FAIL：失败（具体失败原因请参见error_code以及fail_reason返回值）； DEALING：处理中（转账到支付宝账户不涉及）； REFUND：退票（转账到支付宝账户不涉及）；")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AlipayFundTransUniTransferResponseModel transDate(String transDate) {
    
    this.transDate = transDate;
    return this;
  }

   /**
   * 订单支付时间，格式为yyyy-MM-dd HH:mm:ss
   * @return transDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-08-21 00:00:00", value = "订单支付时间，格式为yyyy-MM-dd HH:mm:ss")

  public String getTransDate() {
    return transDate;
  }


  public void setTransDate(String transDate) {
    this.transDate = transDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayFundTransUniTransferResponseModel alipayFundTransUniTransferResponseModel = (AlipayFundTransUniTransferResponseModel) o;
    return Objects.equals(this.orderId, alipayFundTransUniTransferResponseModel.orderId) &&
        Objects.equals(this.outBizNo, alipayFundTransUniTransferResponseModel.outBizNo) &&
        Objects.equals(this.payFundOrderId, alipayFundTransUniTransferResponseModel.payFundOrderId) &&
        Objects.equals(this.settleSerialNo, alipayFundTransUniTransferResponseModel.settleSerialNo) &&
        Objects.equals(this.status, alipayFundTransUniTransferResponseModel.status) &&
        Objects.equals(this.transDate, alipayFundTransUniTransferResponseModel.transDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, outBizNo, payFundOrderId, settleSerialNo, status, transDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundTransUniTransferResponseModel {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    payFundOrderId: ").append(toIndentedString(payFundOrderId)).append("\n");
    sb.append("    settleSerialNo: ").append(toIndentedString(settleSerialNo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transDate: ").append(toIndentedString(transDate)).append("\n");
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
    openapiFields.add("order_id");
    openapiFields.add("out_biz_no");
    openapiFields.add("pay_fund_order_id");
    openapiFields.add("settle_serial_no");
    openapiFields.add("status");
    openapiFields.add("trans_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundTransUniTransferResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundTransUniTransferResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundTransUniTransferResponseModel is not found in the empty JSON string", AlipayFundTransUniTransferResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayFundTransUniTransferResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayFundTransUniTransferResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("pay_fund_order_id") != null && !jsonObj.get("pay_fund_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_fund_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_fund_order_id").toString()));
      }
      if (jsonObj.get("settle_serial_no") != null && !jsonObj.get("settle_serial_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settle_serial_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settle_serial_no").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("trans_date") != null && !jsonObj.get("trans_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundTransUniTransferResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundTransUniTransferResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundTransUniTransferResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundTransUniTransferResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundTransUniTransferResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundTransUniTransferResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundTransUniTransferResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundTransUniTransferResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundTransUniTransferResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundTransUniTransferResponseModel
  */
  public static AlipayFundTransUniTransferResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundTransUniTransferResponseModel.class);
  }

 /**
  * Convert an instance of AlipayFundTransUniTransferResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

