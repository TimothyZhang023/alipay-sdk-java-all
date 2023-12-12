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
 * AlipayOpenPublicLifeAgentcreateQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenPublicLifeAgentcreateQueryResponseModel {
  public static final String SERIALIZED_NAME_LIFE_APP_ID = "life_app_id";
  @SerializedName(SERIALIZED_NAME_LIFE_APP_ID)
  private String lifeAppId;

  public static final String SERIALIZED_NAME_MERCHANT_PID = "merchant_pid";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PID)
  private String merchantPid;

  public static final String SERIALIZED_NAME_ORDER_STATUS_BIZ_DESC = "order_status_biz_desc";
  @SerializedName(SERIALIZED_NAME_ORDER_STATUS_BIZ_DESC)
  private String orderStatusBizDesc;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_REFUSED_REASON = "refused_reason";
  @SerializedName(SERIALIZED_NAME_REFUSED_REASON)
  private String refusedReason;

  public AlipayOpenPublicLifeAgentcreateQueryResponseModel() { 
  }

  public AlipayOpenPublicLifeAgentcreateQueryResponseModel lifeAppId(String lifeAppId) {
    
    this.lifeAppId = lifeAppId;
    return this;
  }

   /**
   * 只有审核通过，且商户在支付宝发送的授权邮件中确认授权，此时生活号才会正式创建，查询才会返回该值
   * @return lifeAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017062501320531", value = "只有审核通过，且商户在支付宝发送的授权邮件中确认授权，此时生活号才会正式创建，查询才会返回该值")

  public String getLifeAppId() {
    return lifeAppId;
  }


  public void setLifeAppId(String lifeAppId) {
    this.lifeAppId = lifeAppId;
  }


  public AlipayOpenPublicLifeAgentcreateQueryResponseModel merchantPid(String merchantPid) {
    
    this.merchantPid = merchantPid;
    return this;
  }

   /**
   * 商户pid
   * @return merchantPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088302109396986", value = "商户pid")

  public String getMerchantPid() {
    return merchantPid;
  }


  public void setMerchantPid(String merchantPid) {
    this.merchantPid = merchantPid;
  }


  public AlipayOpenPublicLifeAgentcreateQueryResponseModel orderStatusBizDesc(String orderStatusBizDesc) {
    
    this.orderStatusBizDesc = orderStatusBizDesc;
    return this;
  }

   /**
   * 支付宝商户入驻申请单状态，申请单状态包括：暂存、审核中、待商户确认、成功、失败。 说明：暂存是审核前的中间状态，如出现暂存状态请再次提交代创建生活号申请。
   * @return orderStatusBizDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "审核成功", value = "支付宝商户入驻申请单状态，申请单状态包括：暂存、审核中、待商户确认、成功、失败。 说明：暂存是审核前的中间状态，如出现暂存状态请再次提交代创建生活号申请。")

  public String getOrderStatusBizDesc() {
    return orderStatusBizDesc;
  }


  public void setOrderStatusBizDesc(String orderStatusBizDesc) {
    this.orderStatusBizDesc = orderStatusBizDesc;
  }


  public AlipayOpenPublicLifeAgentcreateQueryResponseModel outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 由开发者创建的外部入驻申请单据号
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016070788301823878", value = "由开发者创建的外部入驻申请单据号")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public AlipayOpenPublicLifeAgentcreateQueryResponseModel refusedReason(String refusedReason) {
    
    this.refusedReason = refusedReason;
    return this;
  }

   /**
   * 只有审核失败才会返回该值
   * @return refusedReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "提供的资质证明不符合要求，请重新上传再试", value = "只有审核失败才会返回该值")

  public String getRefusedReason() {
    return refusedReason;
  }


  public void setRefusedReason(String refusedReason) {
    this.refusedReason = refusedReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenPublicLifeAgentcreateQueryResponseModel alipayOpenPublicLifeAgentcreateQueryResponseModel = (AlipayOpenPublicLifeAgentcreateQueryResponseModel) o;
    return Objects.equals(this.lifeAppId, alipayOpenPublicLifeAgentcreateQueryResponseModel.lifeAppId) &&
        Objects.equals(this.merchantPid, alipayOpenPublicLifeAgentcreateQueryResponseModel.merchantPid) &&
        Objects.equals(this.orderStatusBizDesc, alipayOpenPublicLifeAgentcreateQueryResponseModel.orderStatusBizDesc) &&
        Objects.equals(this.outBizNo, alipayOpenPublicLifeAgentcreateQueryResponseModel.outBizNo) &&
        Objects.equals(this.refusedReason, alipayOpenPublicLifeAgentcreateQueryResponseModel.refusedReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifeAppId, merchantPid, orderStatusBizDesc, outBizNo, refusedReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenPublicLifeAgentcreateQueryResponseModel {\n");
    sb.append("    lifeAppId: ").append(toIndentedString(lifeAppId)).append("\n");
    sb.append("    merchantPid: ").append(toIndentedString(merchantPid)).append("\n");
    sb.append("    orderStatusBizDesc: ").append(toIndentedString(orderStatusBizDesc)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    refusedReason: ").append(toIndentedString(refusedReason)).append("\n");
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
    openapiFields.add("life_app_id");
    openapiFields.add("merchant_pid");
    openapiFields.add("order_status_biz_desc");
    openapiFields.add("out_biz_no");
    openapiFields.add("refused_reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenPublicLifeAgentcreateQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenPublicLifeAgentcreateQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenPublicLifeAgentcreateQueryResponseModel is not found in the empty JSON string", AlipayOpenPublicLifeAgentcreateQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenPublicLifeAgentcreateQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenPublicLifeAgentcreateQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("life_app_id") != null && !jsonObj.get("life_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `life_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("life_app_id").toString()));
      }
      if (jsonObj.get("merchant_pid") != null && !jsonObj.get("merchant_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_pid").toString()));
      }
      if (jsonObj.get("order_status_biz_desc") != null && !jsonObj.get("order_status_biz_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_status_biz_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_status_biz_desc").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("refused_reason") != null && !jsonObj.get("refused_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refused_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refused_reason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenPublicLifeAgentcreateQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenPublicLifeAgentcreateQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenPublicLifeAgentcreateQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenPublicLifeAgentcreateQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenPublicLifeAgentcreateQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenPublicLifeAgentcreateQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenPublicLifeAgentcreateQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenPublicLifeAgentcreateQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenPublicLifeAgentcreateQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenPublicLifeAgentcreateQueryResponseModel
  */
  public static AlipayOpenPublicLifeAgentcreateQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenPublicLifeAgentcreateQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenPublicLifeAgentcreateQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

