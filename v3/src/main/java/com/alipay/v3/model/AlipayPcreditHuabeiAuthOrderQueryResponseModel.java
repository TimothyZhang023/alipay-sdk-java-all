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
 * AlipayPcreditHuabeiAuthOrderQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayPcreditHuabeiAuthOrderQueryResponseModel {
  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_ALIPAY_USER_ID = "alipay_user_id";
  @SerializedName(SERIALIZED_NAME_ALIPAY_USER_ID)
  private String alipayUserId;

  public static final String SERIALIZED_NAME_AUTH_OPT_ID = "auth_opt_id";
  @SerializedName(SERIALIZED_NAME_AUTH_OPT_ID)
  private String authOptId;

  public static final String SERIALIZED_NAME_GMT_TRANS = "gmt_trans";
  @SerializedName(SERIALIZED_NAME_GMT_TRANS)
  private String gmtTrans;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_ORDER_TITLE = "order_title";
  @SerializedName(SERIALIZED_NAME_ORDER_TITLE)
  private String orderTitle;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_REST_FREEZE_AMOUNT = "rest_freeze_amount";
  @SerializedName(SERIALIZED_NAME_REST_FREEZE_AMOUNT)
  private String restFreezeAmount;

  public static final String SERIALIZED_NAME_SELLER_ID = "seller_id";
  @SerializedName(SERIALIZED_NAME_SELLER_ID)
  private String sellerId;

  public static final String SERIALIZED_NAME_TRANS_AMOUNT = "trans_amount";
  @SerializedName(SERIALIZED_NAME_TRANS_AMOUNT)
  private String transAmount;

  public static final String SERIALIZED_NAME_TRANS_STATUS = "trans_status";
  @SerializedName(SERIALIZED_NAME_TRANS_STATUS)
  private String transStatus;

  public static final String SERIALIZED_NAME_TRANS_TYPE = "trans_type";
  @SerializedName(SERIALIZED_NAME_TRANS_TYPE)
  private String transType;

  public AlipayPcreditHuabeiAuthOrderQueryResponseModel() { 
  }

  public AlipayPcreditHuabeiAuthOrderQueryResponseModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 支付宝系统中用以唯一标识用户签约记录的编号，即花呗先享协议号。
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20185513447859192007", value = "支付宝系统中用以唯一标识用户签约记录的编号，即花呗先享协议号。")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayPcreditHuabeiAuthOrderQueryResponseModel alipayUserId(String alipayUserId) {
    
    this.alipayUserId = alipayUserId;
    return this;
  }

   /**
   * 支付宝用户userId
   * @return alipayUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088302424419340", value = "支付宝用户userId")

  public String getAlipayUserId() {
    return alipayUserId;
  }


  public void setAlipayUserId(String alipayUserId) {
    this.alipayUserId = alipayUserId;
  }


  public AlipayPcreditHuabeiAuthOrderQueryResponseModel authOptId(String authOptId) {
    
    this.authOptId = authOptId;
    return this;
  }

   /**
   * 支付宝侧花呗冻结解冻操作单据id
   * @return authOptId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018081010020817070009689955", value = "支付宝侧花呗冻结解冻操作单据id")

  public String getAuthOptId() {
    return authOptId;
  }


  public void setAuthOptId(String authOptId) {
    this.authOptId = authOptId;
  }


  public AlipayPcreditHuabeiAuthOrderQueryResponseModel gmtTrans(String gmtTrans) {
    
    this.gmtTrans = gmtTrans;
    return this;
  }

   /**
   * 业务操作完成时间
   * @return gmtTrans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-09-15 11:23:04", value = "业务操作完成时间")

  public String getGmtTrans() {
    return gmtTrans;
  }


  public void setGmtTrans(String gmtTrans) {
    this.gmtTrans = gmtTrans;
  }


  public AlipayPcreditHuabeiAuthOrderQueryResponseModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 支付宝用户userId
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "支付宝用户userId")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public AlipayPcreditHuabeiAuthOrderQueryResponseModel orderTitle(String orderTitle) {
    
    this.orderTitle = orderTitle;
    return this;
  }

   /**
   * 商户业务订单的简单描述，如商品名称等，长度不超过100个字母或50个汉字
   * @return orderTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "饿了么花呗先享超级会员续费冻结", value = "商户业务订单的简单描述，如商品名称等，长度不超过100个字母或50个汉字")

  public String getOrderTitle() {
    return orderTitle;
  }


  public void setOrderTitle(String orderTitle) {
    this.orderTitle = orderTitle;
  }


  public AlipayPcreditHuabeiAuthOrderQueryResponseModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 商户本次操作的请求流水号
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8077735255938032", value = "商户本次操作的请求流水号")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public AlipayPcreditHuabeiAuthOrderQueryResponseModel restFreezeAmount(String restFreezeAmount) {
    
    this.restFreezeAmount = restFreezeAmount;
    return this;
  }

   /**
   * 完成本次操作时，用户资金池余额快照。仅作提示用，请勿用于核对，并发情况下数值有可能不准确。两位小数，单位元。
   * @return restFreezeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200.00", value = "完成本次操作时，用户资金池余额快照。仅作提示用，请勿用于核对，并发情况下数值有可能不准确。两位小数，单位元。")

  public String getRestFreezeAmount() {
    return restFreezeAmount;
  }


  public void setRestFreezeAmount(String restFreezeAmount) {
    this.restFreezeAmount = restFreezeAmount;
  }


  public AlipayPcreditHuabeiAuthOrderQueryResponseModel sellerId(String sellerId) {
    
    this.sellerId = sellerId;
    return this;
  }

   /**
   * 商户的支付宝用户id
   * @return sellerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088102146225135", value = "商户的支付宝用户id")

  public String getSellerId() {
    return sellerId;
  }


  public void setSellerId(String sellerId) {
    this.sellerId = sellerId;
  }


  public AlipayPcreditHuabeiAuthOrderQueryResponseModel transAmount(String transAmount) {
    
    this.transAmount = transAmount;
    return this;
  }

   /**
   * 冻结或者解冻金额
   * @return transAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "操作金额", value = "冻结或者解冻金额")

  public String getTransAmount() {
    return transAmount;
  }


  public void setTransAmount(String transAmount) {
    this.transAmount = transAmount;
  }


  public AlipayPcreditHuabeiAuthOrderQueryResponseModel transStatus(String transStatus) {
    
    this.transStatus = transStatus;
    return this;
  }

   /**
   * 业务操作状态，Y表示成功结束；N表示失败结束；I表示进行中。
   * @return transStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Y", value = "业务操作状态，Y表示成功结束；N表示失败结束；I表示进行中。")

  public String getTransStatus() {
    return transStatus;
  }


  public void setTransStatus(String transStatus) {
    this.transStatus = transStatus;
  }


  public AlipayPcreditHuabeiAuthOrderQueryResponseModel transType(String transType) {
    
    this.transType = transType;
    return this;
  }

   /**
   * 操作类型，FREEZE表示冻结操作；UNFREEZE表示解冻操作；PAY表示支付操作；SETTLE表示结算操作
   * @return transType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FREEZE", value = "操作类型，FREEZE表示冻结操作；UNFREEZE表示解冻操作；PAY表示支付操作；SETTLE表示结算操作")

  public String getTransType() {
    return transType;
  }


  public void setTransType(String transType) {
    this.transType = transType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayPcreditHuabeiAuthOrderQueryResponseModel alipayPcreditHuabeiAuthOrderQueryResponseModel = (AlipayPcreditHuabeiAuthOrderQueryResponseModel) o;
    return Objects.equals(this.agreementNo, alipayPcreditHuabeiAuthOrderQueryResponseModel.agreementNo) &&
        Objects.equals(this.alipayUserId, alipayPcreditHuabeiAuthOrderQueryResponseModel.alipayUserId) &&
        Objects.equals(this.authOptId, alipayPcreditHuabeiAuthOrderQueryResponseModel.authOptId) &&
        Objects.equals(this.gmtTrans, alipayPcreditHuabeiAuthOrderQueryResponseModel.gmtTrans) &&
        Objects.equals(this.openId, alipayPcreditHuabeiAuthOrderQueryResponseModel.openId) &&
        Objects.equals(this.orderTitle, alipayPcreditHuabeiAuthOrderQueryResponseModel.orderTitle) &&
        Objects.equals(this.outRequestNo, alipayPcreditHuabeiAuthOrderQueryResponseModel.outRequestNo) &&
        Objects.equals(this.restFreezeAmount, alipayPcreditHuabeiAuthOrderQueryResponseModel.restFreezeAmount) &&
        Objects.equals(this.sellerId, alipayPcreditHuabeiAuthOrderQueryResponseModel.sellerId) &&
        Objects.equals(this.transAmount, alipayPcreditHuabeiAuthOrderQueryResponseModel.transAmount) &&
        Objects.equals(this.transStatus, alipayPcreditHuabeiAuthOrderQueryResponseModel.transStatus) &&
        Objects.equals(this.transType, alipayPcreditHuabeiAuthOrderQueryResponseModel.transType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementNo, alipayUserId, authOptId, gmtTrans, openId, orderTitle, outRequestNo, restFreezeAmount, sellerId, transAmount, transStatus, transType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayPcreditHuabeiAuthOrderQueryResponseModel {\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    alipayUserId: ").append(toIndentedString(alipayUserId)).append("\n");
    sb.append("    authOptId: ").append(toIndentedString(authOptId)).append("\n");
    sb.append("    gmtTrans: ").append(toIndentedString(gmtTrans)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    orderTitle: ").append(toIndentedString(orderTitle)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    restFreezeAmount: ").append(toIndentedString(restFreezeAmount)).append("\n");
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
    sb.append("    transAmount: ").append(toIndentedString(transAmount)).append("\n");
    sb.append("    transStatus: ").append(toIndentedString(transStatus)).append("\n");
    sb.append("    transType: ").append(toIndentedString(transType)).append("\n");
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
    openapiFields.add("agreement_no");
    openapiFields.add("alipay_user_id");
    openapiFields.add("auth_opt_id");
    openapiFields.add("gmt_trans");
    openapiFields.add("open_id");
    openapiFields.add("order_title");
    openapiFields.add("out_request_no");
    openapiFields.add("rest_freeze_amount");
    openapiFields.add("seller_id");
    openapiFields.add("trans_amount");
    openapiFields.add("trans_status");
    openapiFields.add("trans_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayPcreditHuabeiAuthOrderQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayPcreditHuabeiAuthOrderQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayPcreditHuabeiAuthOrderQueryResponseModel is not found in the empty JSON string", AlipayPcreditHuabeiAuthOrderQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayPcreditHuabeiAuthOrderQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayPcreditHuabeiAuthOrderQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("alipay_user_id") != null && !jsonObj.get("alipay_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_user_id").toString()));
      }
      if (jsonObj.get("auth_opt_id") != null && !jsonObj.get("auth_opt_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_opt_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_opt_id").toString()));
      }
      if (jsonObj.get("gmt_trans") != null && !jsonObj.get("gmt_trans").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_trans` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_trans").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("order_title") != null && !jsonObj.get("order_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_title").toString()));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      if (jsonObj.get("rest_freeze_amount") != null && !jsonObj.get("rest_freeze_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rest_freeze_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rest_freeze_amount").toString()));
      }
      if (jsonObj.get("seller_id") != null && !jsonObj.get("seller_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seller_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seller_id").toString()));
      }
      if (jsonObj.get("trans_amount") != null && !jsonObj.get("trans_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_amount").toString()));
      }
      if (jsonObj.get("trans_status") != null && !jsonObj.get("trans_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_status").toString()));
      }
      if (jsonObj.get("trans_type") != null && !jsonObj.get("trans_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayPcreditHuabeiAuthOrderQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayPcreditHuabeiAuthOrderQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayPcreditHuabeiAuthOrderQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayPcreditHuabeiAuthOrderQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayPcreditHuabeiAuthOrderQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayPcreditHuabeiAuthOrderQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayPcreditHuabeiAuthOrderQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayPcreditHuabeiAuthOrderQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayPcreditHuabeiAuthOrderQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayPcreditHuabeiAuthOrderQueryResponseModel
  */
  public static AlipayPcreditHuabeiAuthOrderQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayPcreditHuabeiAuthOrderQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayPcreditHuabeiAuthOrderQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

