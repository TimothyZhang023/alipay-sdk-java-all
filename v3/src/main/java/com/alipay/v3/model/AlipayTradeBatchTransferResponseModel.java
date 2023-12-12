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
 * AlipayTradeBatchTransferResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayTradeBatchTransferResponseModel {
  public static final String SERIALIZED_NAME_GMT_CREATE = "gmt_create";
  @SerializedName(SERIALIZED_NAME_GMT_CREATE)
  private String gmtCreate;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_RESULT_CODE = "result_code";
  @SerializedName(SERIALIZED_NAME_RESULT_CODE)
  private String resultCode;

  public static final String SERIALIZED_NAME_SETTLE_NO = "settle_no";
  @SerializedName(SERIALIZED_NAME_SETTLE_NO)
  private String settleNo;

  public AlipayTradeBatchTransferResponseModel() { 
  }

  public AlipayTradeBatchTransferResponseModel gmtCreate(String gmtCreate) {
    
    this.gmtCreate = gmtCreate;
    return this;
  }

   /**
   * 分账受理时间
   * @return gmtCreate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014-11-27 15:45:57", value = "分账受理时间")

  public String getGmtCreate() {
    return gmtCreate;
  }


  public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public AlipayTradeBatchTransferResponseModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 分账请求外部流水号
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2008121", value = "分账请求外部流水号")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public AlipayTradeBatchTransferResponseModel resultCode(String resultCode) {
    
    this.resultCode = resultCode;
    return this;
  }

   /**
   * 业务结果码。 ACCEPT_SUCCESS：受理成功； ACCEPT_FAIL：受理失败； SUCCESS：结算处理成功； FAIL：结算处理失败； SYSTEM_EXCEPTION：系统异常
   * @return resultCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACCEPT_SUCCESS", value = "业务结果码。 ACCEPT_SUCCESS：受理成功； ACCEPT_FAIL：受理失败； SUCCESS：结算处理成功； FAIL：结算处理失败； SYSTEM_EXCEPTION：系统异常")

  public String getResultCode() {
    return resultCode;
  }


  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }


  public AlipayTradeBatchTransferResponseModel settleNo(String settleNo) {
    
    this.settleNo = settleNo;
    return this;
  }

   /**
   * 分账单据号
   * @return settleNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018032310032002040000053220", value = "分账单据号")

  public String getSettleNo() {
    return settleNo;
  }


  public void setSettleNo(String settleNo) {
    this.settleNo = settleNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayTradeBatchTransferResponseModel alipayTradeBatchTransferResponseModel = (AlipayTradeBatchTransferResponseModel) o;
    return Objects.equals(this.gmtCreate, alipayTradeBatchTransferResponseModel.gmtCreate) &&
        Objects.equals(this.outRequestNo, alipayTradeBatchTransferResponseModel.outRequestNo) &&
        Objects.equals(this.resultCode, alipayTradeBatchTransferResponseModel.resultCode) &&
        Objects.equals(this.settleNo, alipayTradeBatchTransferResponseModel.settleNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gmtCreate, outRequestNo, resultCode, settleNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayTradeBatchTransferResponseModel {\n");
    sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    settleNo: ").append(toIndentedString(settleNo)).append("\n");
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
    openapiFields.add("gmt_create");
    openapiFields.add("out_request_no");
    openapiFields.add("result_code");
    openapiFields.add("settle_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayTradeBatchTransferResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayTradeBatchTransferResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayTradeBatchTransferResponseModel is not found in the empty JSON string", AlipayTradeBatchTransferResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayTradeBatchTransferResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayTradeBatchTransferResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("gmt_create") != null && !jsonObj.get("gmt_create").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_create` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_create").toString()));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      if (jsonObj.get("result_code") != null && !jsonObj.get("result_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result_code").toString()));
      }
      if (jsonObj.get("settle_no") != null && !jsonObj.get("settle_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settle_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settle_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayTradeBatchTransferResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayTradeBatchTransferResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayTradeBatchTransferResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayTradeBatchTransferResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayTradeBatchTransferResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayTradeBatchTransferResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayTradeBatchTransferResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayTradeBatchTransferResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayTradeBatchTransferResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayTradeBatchTransferResponseModel
  */
  public static AlipayTradeBatchTransferResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayTradeBatchTransferResponseModel.class);
  }

 /**
  * Convert an instance of AlipayTradeBatchTransferResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

