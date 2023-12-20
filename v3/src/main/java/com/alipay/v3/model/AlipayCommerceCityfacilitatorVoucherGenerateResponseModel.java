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
 * AlipayCommerceCityfacilitatorVoucherGenerateResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceCityfacilitatorVoucherGenerateResponseModel {
  public static final String SERIALIZED_NAME_EXPIRED_DATE = "expired_date";
  @SerializedName(SERIALIZED_NAME_EXPIRED_DATE)
  private String expiredDate;

  public static final String SERIALIZED_NAME_QR_CODE_NO = "qr_code_no";
  @SerializedName(SERIALIZED_NAME_QR_CODE_NO)
  private String qrCodeNo;

  public static final String SERIALIZED_NAME_TICKET_NO = "ticket_no";
  @SerializedName(SERIALIZED_NAME_TICKET_NO)
  private String ticketNo;

  public AlipayCommerceCityfacilitatorVoucherGenerateResponseModel() { 
  }

  public AlipayCommerceCityfacilitatorVoucherGenerateResponseModel expiredDate(String expiredDate) {
    
    this.expiredDate = expiredDate;
    return this;
  }

   /**
   * 核销码过期时间
   * @return expiredDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-03-18 00:00:00", value = "核销码过期时间")

  public String getExpiredDate() {
    return expiredDate;
  }


  public void setExpiredDate(String expiredDate) {
    this.expiredDate = expiredDate;
  }


  public AlipayCommerceCityfacilitatorVoucherGenerateResponseModel qrCodeNo(String qrCodeNo) {
    
    this.qrCodeNo = qrCodeNo;
    return this;
  }

   /**
   * 地铁购票二维码编码，可自定义
   * @return qrCodeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "site_begin=6018&site_end=0608&ticket_num=2&ticket_price=3.00&total_fee=6.00&trade_no=201603182100&ticket_no=546600&source=alipay", value = "地铁购票二维码编码，可自定义")

  public String getQrCodeNo() {
    return qrCodeNo;
  }


  public void setQrCodeNo(String qrCodeNo) {
    this.qrCodeNo = qrCodeNo;
  }


  public AlipayCommerceCityfacilitatorVoucherGenerateResponseModel ticketNo(String ticketNo) {
    
    this.ticketNo = ticketNo;
    return this;
  }

   /**
   * 地铁购票的核销码
   * @return ticketNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0243567832", value = "地铁购票的核销码")

  public String getTicketNo() {
    return ticketNo;
  }


  public void setTicketNo(String ticketNo) {
    this.ticketNo = ticketNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayCommerceCityfacilitatorVoucherGenerateResponseModel alipayCommerceCityfacilitatorVoucherGenerateResponseModel = (AlipayCommerceCityfacilitatorVoucherGenerateResponseModel) o;
    return Objects.equals(this.expiredDate, alipayCommerceCityfacilitatorVoucherGenerateResponseModel.expiredDate) &&
        Objects.equals(this.qrCodeNo, alipayCommerceCityfacilitatorVoucherGenerateResponseModel.qrCodeNo) &&
        Objects.equals(this.ticketNo, alipayCommerceCityfacilitatorVoucherGenerateResponseModel.ticketNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiredDate, qrCodeNo, ticketNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceCityfacilitatorVoucherGenerateResponseModel {\n");
    sb.append("    expiredDate: ").append(toIndentedString(expiredDate)).append("\n");
    sb.append("    qrCodeNo: ").append(toIndentedString(qrCodeNo)).append("\n");
    sb.append("    ticketNo: ").append(toIndentedString(ticketNo)).append("\n");
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
    openapiFields.add("expired_date");
    openapiFields.add("qr_code_no");
    openapiFields.add("ticket_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceCityfacilitatorVoucherGenerateResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceCityfacilitatorVoucherGenerateResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceCityfacilitatorVoucherGenerateResponseModel is not found in the empty JSON string", AlipayCommerceCityfacilitatorVoucherGenerateResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayCommerceCityfacilitatorVoucherGenerateResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayCommerceCityfacilitatorVoucherGenerateResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("expired_date") != null && !jsonObj.get("expired_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expired_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expired_date").toString()));
      }
      if (jsonObj.get("qr_code_no") != null && !jsonObj.get("qr_code_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qr_code_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qr_code_no").toString()));
      }
      if (jsonObj.get("ticket_no") != null && !jsonObj.get("ticket_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ticket_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ticket_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceCityfacilitatorVoucherGenerateResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceCityfacilitatorVoucherGenerateResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceCityfacilitatorVoucherGenerateResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceCityfacilitatorVoucherGenerateResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceCityfacilitatorVoucherGenerateResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceCityfacilitatorVoucherGenerateResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayCommerceCityfacilitatorVoucherGenerateResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayCommerceCityfacilitatorVoucherGenerateResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceCityfacilitatorVoucherGenerateResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceCityfacilitatorVoucherGenerateResponseModel
  */
  public static AlipayCommerceCityfacilitatorVoucherGenerateResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceCityfacilitatorVoucherGenerateResponseModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceCityfacilitatorVoucherGenerateResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

