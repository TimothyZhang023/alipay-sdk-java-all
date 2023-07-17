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
 * OcrPlaneScanInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OcrPlaneScanInfo {
  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private String destination;

  public static final String SERIALIZED_NAME_FLIGHT_NO = "flight_no";
  @SerializedName(SERIALIZED_NAME_FLIGHT_NO)
  private String flightNo;

  public static final String SERIALIZED_NAME_INVOICE_DATE = "invoice_date";
  @SerializedName(SERIALIZED_NAME_INVOICE_DATE)
  private String invoiceDate;

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  private String origin;

  public static final String SERIALIZED_NAME_PASSENGER = "passenger";
  @SerializedName(SERIALIZED_NAME_PASSENGER)
  private String passenger;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private String price;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark;

  public static final String SERIALIZED_NAME_SEAT_CLASS = "seat_class";
  @SerializedName(SERIALIZED_NAME_SEAT_CLASS)
  private String seatClass;

  public OcrPlaneScanInfo() { 
  }

  public OcrPlaneScanInfo destination(String destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * 目的地
   * @return destination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "目的地")

  public String getDestination() {
    return destination;
  }


  public void setDestination(String destination) {
    this.destination = destination;
  }


  public OcrPlaneScanInfo flightNo(String flightNo) {
    
    this.flightNo = flightNo;
    return this;
  }

   /**
   * 航班号
   * @return flightNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "航班号")

  public String getFlightNo() {
    return flightNo;
  }


  public void setFlightNo(String flightNo) {
    this.flightNo = flightNo;
  }


  public OcrPlaneScanInfo invoiceDate(String invoiceDate) {
    
    this.invoiceDate = invoiceDate;
    return this;
  }

   /**
   * 乘机日期
   * @return invoiceDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "乘机日期")

  public String getInvoiceDate() {
    return invoiceDate;
  }


  public void setInvoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
  }


  public OcrPlaneScanInfo origin(String origin) {
    
    this.origin = origin;
    return this;
  }

   /**
   * 出发地
   * @return origin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "出发地")

  public String getOrigin() {
    return origin;
  }


  public void setOrigin(String origin) {
    this.origin = origin;
  }


  public OcrPlaneScanInfo passenger(String passenger) {
    
    this.passenger = passenger;
    return this;
  }

   /**
   * 乘客
   * @return passenger
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "乘客")

  public String getPassenger() {
    return passenger;
  }


  public void setPassenger(String passenger) {
    this.passenger = passenger;
  }


  public OcrPlaneScanInfo price(String price) {
    
    this.price = price;
    return this;
  }

   /**
   * 金额（元）
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "金额（元）")

  public String getPrice() {
    return price;
  }


  public void setPrice(String price) {
    this.price = price;
  }


  public OcrPlaneScanInfo remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * 明细事由
   * @return remark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "明细事由")

  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
  }


  public OcrPlaneScanInfo seatClass(String seatClass) {
    
    this.seatClass = seatClass;
    return this;
  }

   /**
   * 飞机舱位
   * @return seatClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "飞机舱位")

  public String getSeatClass() {
    return seatClass;
  }


  public void setSeatClass(String seatClass) {
    this.seatClass = seatClass;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcrPlaneScanInfo ocrPlaneScanInfo = (OcrPlaneScanInfo) o;
    return Objects.equals(this.destination, ocrPlaneScanInfo.destination) &&
        Objects.equals(this.flightNo, ocrPlaneScanInfo.flightNo) &&
        Objects.equals(this.invoiceDate, ocrPlaneScanInfo.invoiceDate) &&
        Objects.equals(this.origin, ocrPlaneScanInfo.origin) &&
        Objects.equals(this.passenger, ocrPlaneScanInfo.passenger) &&
        Objects.equals(this.price, ocrPlaneScanInfo.price) &&
        Objects.equals(this.remark, ocrPlaneScanInfo.remark) &&
        Objects.equals(this.seatClass, ocrPlaneScanInfo.seatClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, flightNo, invoiceDate, origin, passenger, price, remark, seatClass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcrPlaneScanInfo {\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    flightNo: ").append(toIndentedString(flightNo)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    passenger: ").append(toIndentedString(passenger)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    seatClass: ").append(toIndentedString(seatClass)).append("\n");
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
    openapiFields.add("destination");
    openapiFields.add("flight_no");
    openapiFields.add("invoice_date");
    openapiFields.add("origin");
    openapiFields.add("passenger");
    openapiFields.add("price");
    openapiFields.add("remark");
    openapiFields.add("seat_class");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OcrPlaneScanInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OcrPlaneScanInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OcrPlaneScanInfo is not found in the empty JSON string", OcrPlaneScanInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OcrPlaneScanInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OcrPlaneScanInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("destination") != null && !jsonObj.get("destination").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destination` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destination").toString()));
      }
      if (jsonObj.get("flight_no") != null && !jsonObj.get("flight_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `flight_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("flight_no").toString()));
      }
      if (jsonObj.get("invoice_date") != null && !jsonObj.get("invoice_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_date").toString()));
      }
      if (jsonObj.get("origin") != null && !jsonObj.get("origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin").toString()));
      }
      if (jsonObj.get("passenger") != null && !jsonObj.get("passenger").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passenger` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passenger").toString()));
      }
      if (jsonObj.get("price") != null && !jsonObj.get("price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("price").toString()));
      }
      if (jsonObj.get("remark") != null && !jsonObj.get("remark").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remark` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remark").toString()));
      }
      if (jsonObj.get("seat_class") != null && !jsonObj.get("seat_class").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seat_class` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seat_class").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OcrPlaneScanInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OcrPlaneScanInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OcrPlaneScanInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OcrPlaneScanInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OcrPlaneScanInfo>() {
           @Override
           public void write(JsonWriter out, OcrPlaneScanInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OcrPlaneScanInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OcrPlaneScanInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OcrPlaneScanInfo
  * @throws IOException if the JSON string is invalid with respect to OcrPlaneScanInfo
  */
  public static OcrPlaneScanInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OcrPlaneScanInfo.class);
  }

 /**
  * Convert an instance of OcrPlaneScanInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

