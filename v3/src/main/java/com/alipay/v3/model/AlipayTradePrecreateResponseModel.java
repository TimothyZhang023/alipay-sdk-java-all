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
 * AlipayTradePrecreateResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayTradePrecreateResponseModel {
  public static final String SERIALIZED_NAME_OUT_TRADE_NO = "out_trade_no";
  @SerializedName(SERIALIZED_NAME_OUT_TRADE_NO)
  private String outTradeNo;

  public static final String SERIALIZED_NAME_QR_CODE = "qr_code";
  @SerializedName(SERIALIZED_NAME_QR_CODE)
  private String qrCode;

  public static final String SERIALIZED_NAME_SHARE_CODE = "share_code";
  @SerializedName(SERIALIZED_NAME_SHARE_CODE)
  private String shareCode;

  public AlipayTradePrecreateResponseModel() { 
  }

  public AlipayTradePrecreateResponseModel outTradeNo(String outTradeNo) {
    
    this.outTradeNo = outTradeNo;
    return this;
  }

   /**
   * 商户的订单号
   * @return outTradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6823789339978248", value = "商户的订单号")

  public String getOutTradeNo() {
    return outTradeNo;
  }


  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }


  public AlipayTradePrecreateResponseModel qrCode(String qrCode) {
    
    this.qrCode = qrCode;
    return this;
  }

   /**
   * 当前预下单请求生成的二维码码串，有效时间2小时，可以用二维码生成工具根据该码串值生成对应的二维码
   * @return qrCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://qr.alipay.com/bavh4wjlxf12tper3a", value = "当前预下单请求生成的二维码码串，有效时间2小时，可以用二维码生成工具根据该码串值生成对应的二维码")

  public String getQrCode() {
    return qrCode;
  }


  public void setQrCode(String qrCode) {
    this.qrCode = qrCode;
  }


  public AlipayTradePrecreateResponseModel shareCode(String shareCode) {
    
    this.shareCode = shareCode;
    return this;
  }

   /**
   * 当前预下单请求生成的吱口令码串，有效时间2小时，可以在支付宝app端访问对应内容
   * @return shareCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "chb4n8A94Qc", value = "当前预下单请求生成的吱口令码串，有效时间2小时，可以在支付宝app端访问对应内容")

  public String getShareCode() {
    return shareCode;
  }


  public void setShareCode(String shareCode) {
    this.shareCode = shareCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayTradePrecreateResponseModel alipayTradePrecreateResponseModel = (AlipayTradePrecreateResponseModel) o;
    return Objects.equals(this.outTradeNo, alipayTradePrecreateResponseModel.outTradeNo) &&
        Objects.equals(this.qrCode, alipayTradePrecreateResponseModel.qrCode) &&
        Objects.equals(this.shareCode, alipayTradePrecreateResponseModel.shareCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outTradeNo, qrCode, shareCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayTradePrecreateResponseModel {\n");
    sb.append("    outTradeNo: ").append(toIndentedString(outTradeNo)).append("\n");
    sb.append("    qrCode: ").append(toIndentedString(qrCode)).append("\n");
    sb.append("    shareCode: ").append(toIndentedString(shareCode)).append("\n");
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
    openapiFields.add("out_trade_no");
    openapiFields.add("qr_code");
    openapiFields.add("share_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayTradePrecreateResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayTradePrecreateResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayTradePrecreateResponseModel is not found in the empty JSON string", AlipayTradePrecreateResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayTradePrecreateResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayTradePrecreateResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("out_trade_no") != null && !jsonObj.get("out_trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_trade_no").toString()));
      }
      if (jsonObj.get("qr_code") != null && !jsonObj.get("qr_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qr_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qr_code").toString()));
      }
      if (jsonObj.get("share_code") != null && !jsonObj.get("share_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `share_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("share_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayTradePrecreateResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayTradePrecreateResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayTradePrecreateResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayTradePrecreateResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayTradePrecreateResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayTradePrecreateResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayTradePrecreateResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayTradePrecreateResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayTradePrecreateResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayTradePrecreateResponseModel
  */
  public static AlipayTradePrecreateResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayTradePrecreateResponseModel.class);
  }

 /**
  * Convert an instance of AlipayTradePrecreateResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

