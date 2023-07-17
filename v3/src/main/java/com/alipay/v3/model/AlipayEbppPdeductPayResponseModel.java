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
 * AlipayEbppPdeductPayResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppPdeductPayResponseModel {
  public static final String SERIALIZED_NAME_AGREEMENT_ID = "agreement_id";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_ID)
  private String agreementId;

  public static final String SERIALIZED_NAME_BILL_NO = "bill_no";
  @SerializedName(SERIALIZED_NAME_BILL_NO)
  private String billNo;

  public static final String SERIALIZED_NAME_EXTEND_FIELD = "extend_field";
  @SerializedName(SERIALIZED_NAME_EXTEND_FIELD)
  private String extendField;

  public static final String SERIALIZED_NAME_OUT_ORDER_NO = "out_order_no";
  @SerializedName(SERIALIZED_NAME_OUT_ORDER_NO)
  private String outOrderNo;

  public static final String SERIALIZED_NAME_RESULT_CODE = "result_code";
  @SerializedName(SERIALIZED_NAME_RESULT_CODE)
  private String resultCode;

  public static final String SERIALIZED_NAME_RESULT_MSG = "result_msg";
  @SerializedName(SERIALIZED_NAME_RESULT_MSG)
  private String resultMsg;

  public static final String SERIALIZED_NAME_RESULT_STATUS = "result_status";
  @SerializedName(SERIALIZED_NAME_RESULT_STATUS)
  private String resultStatus;

  public AlipayEbppPdeductPayResponseModel() { 
  }

  public AlipayEbppPdeductPayResponseModel agreementId(String agreementId) {
    
    this.agreementId = agreementId;
    return this;
  }

   /**
   * 支付宝代扣协议ID
   * @return agreementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1231232132", value = "支付宝代扣协议ID")

  public String getAgreementId() {
    return agreementId;
  }


  public void setAgreementId(String agreementId) {
    this.agreementId = agreementId;
  }


  public AlipayEbppPdeductPayResponseModel billNo(String billNo) {
    
    this.billNo = billNo;
    return this;
  }

   /**
   * 支付宝订单流水号
   * @return billNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201323423234", value = "支付宝订单流水号")

  public String getBillNo() {
    return billNo;
  }


  public void setBillNo(String billNo) {
    this.billNo = billNo;
  }


  public AlipayEbppPdeductPayResponseModel extendField(String extendField) {
    
    this.extendField = extendField;
    return this;
  }

   /**
   * 扩展参数
   * @return extendField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"school_no\":\"SHNU\",  \"student_id\":\"20130516\"}", value = "扩展参数")

  public String getExtendField() {
    return extendField;
  }


  public void setExtendField(String extendField) {
    this.extendField = extendField;
  }


  public AlipayEbppPdeductPayResponseModel outOrderNo(String outOrderNo) {
    
    this.outOrderNo = outOrderNo;
    return this;
  }

   /**
   * 商户代扣业务流水
   * @return outOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "213134234", value = "商户代扣业务流水")

  public String getOutOrderNo() {
    return outOrderNo;
  }


  public void setOutOrderNo(String outOrderNo) {
    this.outOrderNo = outOrderNo;
  }


  public AlipayEbppPdeductPayResponseModel resultCode(String resultCode) {
    
    this.resultCode = resultCode;
    return this;
  }

   /**
   * 针对于支付失败时，给的对应错误明细，如果判断外围的错误码是INVOKE_PAYACCEPTANCE_EXCEPTION需要近一步再结合着结果模型中的result_code, result_msg来判断
   * @return resultCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AE0110270001", value = "针对于支付失败时，给的对应错误明细，如果判断外围的错误码是INVOKE_PAYACCEPTANCE_EXCEPTION需要近一步再结合着结果模型中的result_code, result_msg来判断")

  public String getResultCode() {
    return resultCode;
  }


  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }


  public AlipayEbppPdeductPayResponseModel resultMsg(String resultMsg) {
    
    this.resultMsg = resultMsg;
    return this;
  }

   /**
   * 针对于支付失败时，给的对应错误明细，如果判断外围的错误码是INVOKE_PAYACCEPTANCE_EXCEPTION需要近一步再结合着结果模型中的result_code, result_msg来判断
   * @return resultMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "支付金额不足", value = "针对于支付失败时，给的对应错误明细，如果判断外围的错误码是INVOKE_PAYACCEPTANCE_EXCEPTION需要近一步再结合着结果模型中的result_code, result_msg来判断")

  public String getResultMsg() {
    return resultMsg;
  }


  public void setResultMsg(String resultMsg) {
    this.resultMsg = resultMsg;
  }


  public AlipayEbppPdeductPayResponseModel resultStatus(String resultStatus) {
    
    this.resultStatus = resultStatus;
    return this;
  }

   /**
   * 订单支付状态。  0：未知  1：成功  2：失败
   * @return resultStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "订单支付状态。  0：未知  1：成功  2：失败")

  public String getResultStatus() {
    return resultStatus;
  }


  public void setResultStatus(String resultStatus) {
    this.resultStatus = resultStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppPdeductPayResponseModel alipayEbppPdeductPayResponseModel = (AlipayEbppPdeductPayResponseModel) o;
    return Objects.equals(this.agreementId, alipayEbppPdeductPayResponseModel.agreementId) &&
        Objects.equals(this.billNo, alipayEbppPdeductPayResponseModel.billNo) &&
        Objects.equals(this.extendField, alipayEbppPdeductPayResponseModel.extendField) &&
        Objects.equals(this.outOrderNo, alipayEbppPdeductPayResponseModel.outOrderNo) &&
        Objects.equals(this.resultCode, alipayEbppPdeductPayResponseModel.resultCode) &&
        Objects.equals(this.resultMsg, alipayEbppPdeductPayResponseModel.resultMsg) &&
        Objects.equals(this.resultStatus, alipayEbppPdeductPayResponseModel.resultStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementId, billNo, extendField, outOrderNo, resultCode, resultMsg, resultStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppPdeductPayResponseModel {\n");
    sb.append("    agreementId: ").append(toIndentedString(agreementId)).append("\n");
    sb.append("    billNo: ").append(toIndentedString(billNo)).append("\n");
    sb.append("    extendField: ").append(toIndentedString(extendField)).append("\n");
    sb.append("    outOrderNo: ").append(toIndentedString(outOrderNo)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    resultMsg: ").append(toIndentedString(resultMsg)).append("\n");
    sb.append("    resultStatus: ").append(toIndentedString(resultStatus)).append("\n");
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
    openapiFields.add("agreement_id");
    openapiFields.add("bill_no");
    openapiFields.add("extend_field");
    openapiFields.add("out_order_no");
    openapiFields.add("result_code");
    openapiFields.add("result_msg");
    openapiFields.add("result_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppPdeductPayResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppPdeductPayResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppPdeductPayResponseModel is not found in the empty JSON string", AlipayEbppPdeductPayResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppPdeductPayResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppPdeductPayResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("agreement_id") != null && !jsonObj.get("agreement_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_id").toString()));
      }
      if (jsonObj.get("bill_no") != null && !jsonObj.get("bill_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bill_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bill_no").toString()));
      }
      if (jsonObj.get("extend_field") != null && !jsonObj.get("extend_field").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extend_field` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extend_field").toString()));
      }
      if (jsonObj.get("out_order_no") != null && !jsonObj.get("out_order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_order_no").toString()));
      }
      if (jsonObj.get("result_code") != null && !jsonObj.get("result_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result_code").toString()));
      }
      if (jsonObj.get("result_msg") != null && !jsonObj.get("result_msg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result_msg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result_msg").toString()));
      }
      if (jsonObj.get("result_status") != null && !jsonObj.get("result_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result_status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppPdeductPayResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppPdeductPayResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppPdeductPayResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppPdeductPayResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppPdeductPayResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppPdeductPayResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppPdeductPayResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppPdeductPayResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppPdeductPayResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppPdeductPayResponseModel
  */
  public static AlipayEbppPdeductPayResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppPdeductPayResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEbppPdeductPayResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

