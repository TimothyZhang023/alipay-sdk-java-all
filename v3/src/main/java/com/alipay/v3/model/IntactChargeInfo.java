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
 * IntactChargeInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IntactChargeInfo {
  public static final String SERIALIZED_NAME_ACTUAL_AMOUNT = "actual_amount";
  @SerializedName(SERIALIZED_NAME_ACTUAL_AMOUNT)
  private String actualAmount;

  public static final String SERIALIZED_NAME_BILL_TYPE = "bill_type";
  @SerializedName(SERIALIZED_NAME_BILL_TYPE)
  private String billType;

  public static final String SERIALIZED_NAME_GMT_PAY = "gmt_pay";
  @SerializedName(SERIALIZED_NAME_GMT_PAY)
  private String gmtPay;

  public static final String SERIALIZED_NAME_IS_REFUND = "is_refund";
  @SerializedName(SERIALIZED_NAME_IS_REFUND)
  private Boolean isRefund;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_PLAN_AMOUNT = "plan_amount";
  @SerializedName(SERIALIZED_NAME_PLAN_AMOUNT)
  private String planAmount;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "product_name";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName;

  public static final String SERIALIZED_NAME_SERVICE_TARGET = "service_target";
  @SerializedName(SERIALIZED_NAME_SERVICE_TARGET)
  private String serviceTarget;

  public static final String SERIALIZED_NAME_SERVICE_TYPE = "service_type";
  @SerializedName(SERIALIZED_NAME_SERVICE_TYPE)
  private String serviceType;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TARGET_ACCOUNT_NO = "target_account_no";
  @SerializedName(SERIALIZED_NAME_TARGET_ACCOUNT_NO)
  private String targetAccountNo;

  public static final String SERIALIZED_NAME_TARGET_USER_ID = "target_user_id";
  @SerializedName(SERIALIZED_NAME_TARGET_USER_ID)
  private String targetUserId;

  public IntactChargeInfo() { 
  }

  public IntactChargeInfo actualAmount(String actualAmount) {
    
    this.actualAmount = actualAmount;
    return this;
  }

   /**
   * 实际收费金额，单位元
   * @return actualAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.01", value = "实际收费金额，单位元")

  public String getActualAmount() {
    return actualAmount;
  }


  public void setActualAmount(String actualAmount) {
    this.actualAmount = actualAmount;
  }


  public IntactChargeInfo billType(String billType) {
    
    this.billType = billType;
    return this;
  }

   /**
   * 收费类型
   * @return billType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "收费类型")

  public String getBillType() {
    return billType;
  }


  public void setBillType(String billType) {
    this.billType = billType;
  }


  public IntactChargeInfo gmtPay(String gmtPay) {
    
    this.gmtPay = gmtPay;
    return this;
  }

   /**
   * 收费时间,时间精确到秒
   * @return gmtPay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-05-16 22:22:22", value = "收费时间,时间精确到秒")

  public String getGmtPay() {
    return gmtPay;
  }


  public void setGmtPay(String gmtPay) {
    this.gmtPay = gmtPay;
  }


  public IntactChargeInfo isRefund(Boolean isRefund) {
    
    this.isRefund = isRefund;
    return this;
  }

   /**
   * 是否退费
   * @return isRefund
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否退费")

  public Boolean getIsRefund() {
    return isRefund;
  }


  public void setIsRefund(Boolean isRefund) {
    this.isRefund = isRefund;
  }


  public IntactChargeInfo outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 外部请求号
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2323232323", value = "外部请求号")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public IntactChargeInfo planAmount(String planAmount) {
    
    this.planAmount = planAmount;
    return this;
  }

   /**
   * 应收费金额，单位元
   * @return planAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.02", value = "应收费金额，单位元")

  public String getPlanAmount() {
    return planAmount;
  }


  public void setPlanAmount(String planAmount) {
    this.planAmount = planAmount;
  }


  public IntactChargeInfo productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * 收费产品
   * @return productName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ALI_ESCROW", value = "收费产品")

  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public IntactChargeInfo serviceTarget(String serviceTarget) {
    
    this.serviceTarget = serviceTarget;
    return this;
  }

   /**
   * 收费唯一id
   * @return serviceTarget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023232", value = "收费唯一id")

  public String getServiceTarget() {
    return serviceTarget;
  }


  public void setServiceTarget(String serviceTarget) {
    this.serviceTarget = serviceTarget;
  }


  public IntactChargeInfo serviceType(String serviceType) {
    
    this.serviceType = serviceType;
    return this;
  }

   /**
   * 收费类型
   * @return serviceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TRADE", value = "收费类型")

  public String getServiceType() {
    return serviceType;
  }


  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }


  public IntactChargeInfo status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "状态")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public IntactChargeInfo targetAccountNo(String targetAccountNo) {
    
    this.targetAccountNo = targetAccountNo;
    return this;
  }

   /**
   * 收费目标账号
   * @return targetAccountNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20880156", value = "收费目标账号")

  public String getTargetAccountNo() {
    return targetAccountNo;
  }


  public void setTargetAccountNo(String targetAccountNo) {
    this.targetAccountNo = targetAccountNo;
  }


  public IntactChargeInfo targetUserId(String targetUserId) {
    
    this.targetUserId = targetUserId;
    return this;
  }

   /**
   * 收费目标uid
   * @return targetUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088", value = "收费目标uid")

  public String getTargetUserId() {
    return targetUserId;
  }


  public void setTargetUserId(String targetUserId) {
    this.targetUserId = targetUserId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntactChargeInfo intactChargeInfo = (IntactChargeInfo) o;
    return Objects.equals(this.actualAmount, intactChargeInfo.actualAmount) &&
        Objects.equals(this.billType, intactChargeInfo.billType) &&
        Objects.equals(this.gmtPay, intactChargeInfo.gmtPay) &&
        Objects.equals(this.isRefund, intactChargeInfo.isRefund) &&
        Objects.equals(this.outBizNo, intactChargeInfo.outBizNo) &&
        Objects.equals(this.planAmount, intactChargeInfo.planAmount) &&
        Objects.equals(this.productName, intactChargeInfo.productName) &&
        Objects.equals(this.serviceTarget, intactChargeInfo.serviceTarget) &&
        Objects.equals(this.serviceType, intactChargeInfo.serviceType) &&
        Objects.equals(this.status, intactChargeInfo.status) &&
        Objects.equals(this.targetAccountNo, intactChargeInfo.targetAccountNo) &&
        Objects.equals(this.targetUserId, intactChargeInfo.targetUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualAmount, billType, gmtPay, isRefund, outBizNo, planAmount, productName, serviceTarget, serviceType, status, targetAccountNo, targetUserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntactChargeInfo {\n");
    sb.append("    actualAmount: ").append(toIndentedString(actualAmount)).append("\n");
    sb.append("    billType: ").append(toIndentedString(billType)).append("\n");
    sb.append("    gmtPay: ").append(toIndentedString(gmtPay)).append("\n");
    sb.append("    isRefund: ").append(toIndentedString(isRefund)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    planAmount: ").append(toIndentedString(planAmount)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    serviceTarget: ").append(toIndentedString(serviceTarget)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    targetAccountNo: ").append(toIndentedString(targetAccountNo)).append("\n");
    sb.append("    targetUserId: ").append(toIndentedString(targetUserId)).append("\n");
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
    openapiFields.add("actual_amount");
    openapiFields.add("bill_type");
    openapiFields.add("gmt_pay");
    openapiFields.add("is_refund");
    openapiFields.add("out_biz_no");
    openapiFields.add("plan_amount");
    openapiFields.add("product_name");
    openapiFields.add("service_target");
    openapiFields.add("service_type");
    openapiFields.add("status");
    openapiFields.add("target_account_no");
    openapiFields.add("target_user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IntactChargeInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IntactChargeInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IntactChargeInfo is not found in the empty JSON string", IntactChargeInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IntactChargeInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IntactChargeInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("actual_amount") != null && !jsonObj.get("actual_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actual_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actual_amount").toString()));
      }
      if (jsonObj.get("bill_type") != null && !jsonObj.get("bill_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bill_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bill_type").toString()));
      }
      if (jsonObj.get("gmt_pay") != null && !jsonObj.get("gmt_pay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_pay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_pay").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("plan_amount") != null && !jsonObj.get("plan_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_amount").toString()));
      }
      if (jsonObj.get("product_name") != null && !jsonObj.get("product_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_name").toString()));
      }
      if (jsonObj.get("service_target") != null && !jsonObj.get("service_target").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_target` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_target").toString()));
      }
      if (jsonObj.get("service_type") != null && !jsonObj.get("service_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_type").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("target_account_no") != null && !jsonObj.get("target_account_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_account_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_account_no").toString()));
      }
      if (jsonObj.get("target_user_id") != null && !jsonObj.get("target_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IntactChargeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IntactChargeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IntactChargeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IntactChargeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<IntactChargeInfo>() {
           @Override
           public void write(JsonWriter out, IntactChargeInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IntactChargeInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IntactChargeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IntactChargeInfo
  * @throws IOException if the JSON string is invalid with respect to IntactChargeInfo
  */
  public static IntactChargeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IntactChargeInfo.class);
  }

 /**
  * Convert an instance of IntactChargeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

