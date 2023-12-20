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
 * TradeFundBillDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TradeFundBillDetail {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_ASSET_TYPE_CODE = "asset_type_code";
  @SerializedName(SERIALIZED_NAME_ASSET_TYPE_CODE)
  private String assetTypeCode;

  public static final String SERIALIZED_NAME_ASSET_USER_ID = "asset_user_id";
  @SerializedName(SERIALIZED_NAME_ASSET_USER_ID)
  private String assetUserId;

  public static final String SERIALIZED_NAME_ASSET_USER_OPEN_ID = "asset_user_open_id";
  @SerializedName(SERIALIZED_NAME_ASSET_USER_OPEN_ID)
  private String assetUserOpenId;

  public static final String SERIALIZED_NAME_BIZ_PAY_TYPE = "biz_pay_type";
  @SerializedName(SERIALIZED_NAME_BIZ_PAY_TYPE)
  private String bizPayType;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_PAYMENT_NO = "payment_no";
  @SerializedName(SERIALIZED_NAME_PAYMENT_NO)
  private String paymentNo;

  public TradeFundBillDetail() { 
  }

  public TradeFundBillDetail amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 交易金额
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "交易金额")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public TradeFundBillDetail assetTypeCode(String assetTypeCode) {
    
    this.assetTypeCode = assetTypeCode;
    return this;
  }

   /**
   * 资产类型编码
   * @return assetTypeCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "资产类型编码")

  public String getAssetTypeCode() {
    return assetTypeCode;
  }


  public void setAssetTypeCode(String assetTypeCode) {
    this.assetTypeCode = assetTypeCode;
  }


  public TradeFundBillDetail assetUserId(String assetUserId) {
    
    this.assetUserId = assetUserId;
    return this;
  }

   /**
   * 资产的属主
   * @return assetUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "资产的属主")

  public String getAssetUserId() {
    return assetUserId;
  }


  public void setAssetUserId(String assetUserId) {
    this.assetUserId = assetUserId;
  }


  public TradeFundBillDetail assetUserOpenId(String assetUserOpenId) {
    
    this.assetUserOpenId = assetUserOpenId;
    return this;
  }

   /**
   * 资产的属主openid
   * @return assetUserOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "资产的属主openid")

  public String getAssetUserOpenId() {
    return assetUserOpenId;
  }


  public void setAssetUserOpenId(String assetUserOpenId) {
    this.assetUserOpenId = assetUserOpenId;
  }


  public TradeFundBillDetail bizPayType(String bizPayType) {
    
    this.bizPayType = bizPayType;
    return this;
  }

   /**
   * 支付业务类型  PAY-支付  REFUND-退款
   * @return bizPayType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支付业务类型  PAY-支付  REFUND-退款")

  public String getBizPayType() {
    return bizPayType;
  }


  public void setBizPayType(String bizPayType) {
    this.bizPayType = bizPayType;
  }


  public TradeFundBillDetail createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "创建时间")

  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public TradeFundBillDetail paymentNo(String paymentNo) {
    
    this.paymentNo = paymentNo;
    return this;
  }

   /**
   * 支付单据号
   * @return paymentNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支付单据号")

  public String getPaymentNo() {
    return paymentNo;
  }


  public void setPaymentNo(String paymentNo) {
    this.paymentNo = paymentNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradeFundBillDetail tradeFundBillDetail = (TradeFundBillDetail) o;
    return Objects.equals(this.amount, tradeFundBillDetail.amount) &&
        Objects.equals(this.assetTypeCode, tradeFundBillDetail.assetTypeCode) &&
        Objects.equals(this.assetUserId, tradeFundBillDetail.assetUserId) &&
        Objects.equals(this.assetUserOpenId, tradeFundBillDetail.assetUserOpenId) &&
        Objects.equals(this.bizPayType, tradeFundBillDetail.bizPayType) &&
        Objects.equals(this.createTime, tradeFundBillDetail.createTime) &&
        Objects.equals(this.paymentNo, tradeFundBillDetail.paymentNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, assetTypeCode, assetUserId, assetUserOpenId, bizPayType, createTime, paymentNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeFundBillDetail {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    assetTypeCode: ").append(toIndentedString(assetTypeCode)).append("\n");
    sb.append("    assetUserId: ").append(toIndentedString(assetUserId)).append("\n");
    sb.append("    assetUserOpenId: ").append(toIndentedString(assetUserOpenId)).append("\n");
    sb.append("    bizPayType: ").append(toIndentedString(bizPayType)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    paymentNo: ").append(toIndentedString(paymentNo)).append("\n");
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
    openapiFields.add("asset_type_code");
    openapiFields.add("asset_user_id");
    openapiFields.add("asset_user_open_id");
    openapiFields.add("biz_pay_type");
    openapiFields.add("create_time");
    openapiFields.add("payment_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TradeFundBillDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TradeFundBillDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TradeFundBillDetail is not found in the empty JSON string", TradeFundBillDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TradeFundBillDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TradeFundBillDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("asset_type_code") != null && !jsonObj.get("asset_type_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asset_type_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asset_type_code").toString()));
      }
      if (jsonObj.get("asset_user_id") != null && !jsonObj.get("asset_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asset_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asset_user_id").toString()));
      }
      if (jsonObj.get("asset_user_open_id") != null && !jsonObj.get("asset_user_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asset_user_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asset_user_open_id").toString()));
      }
      if (jsonObj.get("biz_pay_type") != null && !jsonObj.get("biz_pay_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_pay_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_pay_type").toString()));
      }
      if (jsonObj.get("create_time") != null && !jsonObj.get("create_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_time").toString()));
      }
      if (jsonObj.get("payment_no") != null && !jsonObj.get("payment_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TradeFundBillDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TradeFundBillDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TradeFundBillDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TradeFundBillDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<TradeFundBillDetail>() {
           @Override
           public void write(JsonWriter out, TradeFundBillDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TradeFundBillDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TradeFundBillDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TradeFundBillDetail
  * @throws IOException if the JSON string is invalid with respect to TradeFundBillDetail
  */
  public static TradeFundBillDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TradeFundBillDetail.class);
  }

 /**
  * Convert an instance of TradeFundBillDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

