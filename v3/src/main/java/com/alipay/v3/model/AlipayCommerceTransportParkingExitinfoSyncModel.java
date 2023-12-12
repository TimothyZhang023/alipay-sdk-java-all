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
 * AlipayCommerceTransportParkingExitinfoSyncModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceTransportParkingExitinfoSyncModel {
  public static final String SERIALIZED_NAME_IS_ENCRYPT_PLATE_NO = "is_encrypt_plate_no";
  @SerializedName(SERIALIZED_NAME_IS_ENCRYPT_PLATE_NO)
  private Boolean isEncryptPlateNo;

  public static final String SERIALIZED_NAME_OPEN_APPID = "open_appid";
  @SerializedName(SERIALIZED_NAME_OPEN_APPID)
  private String openAppid;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_OUT_SERIAL_NO = "out_serial_no";
  @SerializedName(SERIALIZED_NAME_OUT_SERIAL_NO)
  private String outSerialNo;

  public static final String SERIALIZED_NAME_OUT_TIME = "out_time";
  @SerializedName(SERIALIZED_NAME_OUT_TIME)
  private String outTime;

  public static final String SERIALIZED_NAME_PLATE_COLOR = "plate_color";
  @SerializedName(SERIALIZED_NAME_PLATE_COLOR)
  private String plateColor;

  public static final String SERIALIZED_NAME_PLATE_NO = "plate_no";
  @SerializedName(SERIALIZED_NAME_PLATE_NO)
  private String plateNo;

  public static final String SERIALIZED_NAME_SERVICE_URL = "service_url";
  @SerializedName(SERIALIZED_NAME_SERVICE_URL)
  private String serviceUrl;

  public AlipayCommerceTransportParkingExitinfoSyncModel() { 
  }

  public AlipayCommerceTransportParkingExitinfoSyncModel isEncryptPlateNo(Boolean isEncryptPlateNo) {
    
    this.isEncryptPlateNo = isEncryptPlateNo;
    return this;
  }

   /**
   * 车牌是否加密，true为加密，false为不加密，默认为false
   * @return isEncryptPlateNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "车牌是否加密，true为加密，false为不加密，默认为false")

  public Boolean getIsEncryptPlateNo() {
    return isEncryptPlateNo;
  }


  public void setIsEncryptPlateNo(Boolean isEncryptPlateNo) {
    this.isEncryptPlateNo = isEncryptPlateNo;
  }


  public AlipayCommerceTransportParkingExitinfoSyncModel openAppid(String openAppid) {
    
    this.openAppid = openAppid;
    return this;
  }

   /**
   * 蚂蚁会员统一ID对应的归属应用appid
   * @return openAppid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023xxxxxxxxxxxx", value = "蚂蚁会员统一ID对应的归属应用appid")

  public String getOpenAppid() {
    return openAppid;
  }


  public void setOpenAppid(String openAppid) {
    this.openAppid = openAppid;
  }


  public AlipayCommerceTransportParkingExitinfoSyncModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 蚂蚁会员统一ID
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "蚂蚁会员统一ID")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public AlipayCommerceTransportParkingExitinfoSyncModel outSerialNo(String outSerialNo) {
    
    this.outSerialNo = outSerialNo;
    return this;
  }

   /**
   * 外部停车流水号(用于串通进场与出场信息)
   * @return outSerialNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020090711003017233600000001", value = "外部停车流水号(用于串通进场与出场信息)")

  public String getOutSerialNo() {
    return outSerialNo;
  }


  public void setOutSerialNo(String outSerialNo) {
    this.outSerialNo = outSerialNo;
  }


  public AlipayCommerceTransportParkingExitinfoSyncModel outTime(String outTime) {
    
    this.outTime = outTime;
    return this;
  }

   /**
   * 车辆出场的时间，格式\&quot;YYYY-MM-DD HH:mm:ss\&quot;，24小时制，请保证服务器时间准确，出场时间不应晚于当前网络时间，也不当早于入场时间。
   * @return outTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-07-24 03:07:50", value = "车辆出场的时间，格式\"YYYY-MM-DD HH:mm:ss\"，24小时制，请保证服务器时间准确，出场时间不应晚于当前网络时间，也不当早于入场时间。")

  public String getOutTime() {
    return outTime;
  }


  public void setOutTime(String outTime) {
    this.outTime = outTime;
  }


  public AlipayCommerceTransportParkingExitinfoSyncModel plateColor(String plateColor) {
    
    this.plateColor = plateColor;
    return this;
  }

   /**
   * 车牌颜色，车牌颜色，枚举支持： *BLUE：蓝。 *GREEN：绿。 *YELLOW：黄。 *WHITE：白。 *BLACK：黑。 *LIMEGREEN：黄绿色。
   * @return plateColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BLUE", value = "车牌颜色，车牌颜色，枚举支持： *BLUE：蓝。 *GREEN：绿。 *YELLOW：黄。 *WHITE：白。 *BLACK：黑。 *LIMEGREEN：黄绿色。")

  public String getPlateColor() {
    return plateColor;
  }


  public void setPlateColor(String plateColor) {
    this.plateColor = plateColor;
  }


  public AlipayCommerceTransportParkingExitinfoSyncModel plateNo(String plateNo) {
    
    this.plateNo = plateNo;
    return this;
  }

   /**
   * 车牌号（支持加密格式）
   * @return plateNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "豫C33333", value = "车牌号（支持加密格式）")

  public String getPlateNo() {
    return plateNo;
  }


  public void setPlateNo(String plateNo) {
    this.plateNo = plateNo;
  }


  public AlipayCommerceTransportParkingExitinfoSyncModel serviceUrl(String serviceUrl) {
    
    this.serviceUrl = serviceUrl;
    return this;
  }

   /**
   * 停车服务页面地址。 1、服务商停车服务页面地址必须是支付宝小程序URL（无需转换https），详见：https://opendocs.alipay.com/support/01rb18#URL%20%E6%A0%BC%E5%BC%8F 2、若服务商没有服务链接，可传输支付宝停车官方小程序的服务链接：alipays://platformapi/startapp?appId&#x3D;2021001102642986&amp;page&#x3D;pages%2Fparking-fee%2Findex 3、若此次对接的是无感支付，则服务链接传输为：alipays://platformapi/startapp?appId&#x3D;2021001102642986&amp;page&#x3D;%2Fpages%2Fparking-bill%2Findex
   * @return serviceUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alipays://xxxxx", value = "停车服务页面地址。 1、服务商停车服务页面地址必须是支付宝小程序URL（无需转换https），详见：https://opendocs.alipay.com/support/01rb18#URL%20%E6%A0%BC%E5%BC%8F 2、若服务商没有服务链接，可传输支付宝停车官方小程序的服务链接：alipays://platformapi/startapp?appId=2021001102642986&page=pages%2Fparking-fee%2Findex 3、若此次对接的是无感支付，则服务链接传输为：alipays://platformapi/startapp?appId=2021001102642986&page=%2Fpages%2Fparking-bill%2Findex")

  public String getServiceUrl() {
    return serviceUrl;
  }


  public void setServiceUrl(String serviceUrl) {
    this.serviceUrl = serviceUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayCommerceTransportParkingExitinfoSyncModel alipayCommerceTransportParkingExitinfoSyncModel = (AlipayCommerceTransportParkingExitinfoSyncModel) o;
    return Objects.equals(this.isEncryptPlateNo, alipayCommerceTransportParkingExitinfoSyncModel.isEncryptPlateNo) &&
        Objects.equals(this.openAppid, alipayCommerceTransportParkingExitinfoSyncModel.openAppid) &&
        Objects.equals(this.openId, alipayCommerceTransportParkingExitinfoSyncModel.openId) &&
        Objects.equals(this.outSerialNo, alipayCommerceTransportParkingExitinfoSyncModel.outSerialNo) &&
        Objects.equals(this.outTime, alipayCommerceTransportParkingExitinfoSyncModel.outTime) &&
        Objects.equals(this.plateColor, alipayCommerceTransportParkingExitinfoSyncModel.plateColor) &&
        Objects.equals(this.plateNo, alipayCommerceTransportParkingExitinfoSyncModel.plateNo) &&
        Objects.equals(this.serviceUrl, alipayCommerceTransportParkingExitinfoSyncModel.serviceUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEncryptPlateNo, openAppid, openId, outSerialNo, outTime, plateColor, plateNo, serviceUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceTransportParkingExitinfoSyncModel {\n");
    sb.append("    isEncryptPlateNo: ").append(toIndentedString(isEncryptPlateNo)).append("\n");
    sb.append("    openAppid: ").append(toIndentedString(openAppid)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    outSerialNo: ").append(toIndentedString(outSerialNo)).append("\n");
    sb.append("    outTime: ").append(toIndentedString(outTime)).append("\n");
    sb.append("    plateColor: ").append(toIndentedString(plateColor)).append("\n");
    sb.append("    plateNo: ").append(toIndentedString(plateNo)).append("\n");
    sb.append("    serviceUrl: ").append(toIndentedString(serviceUrl)).append("\n");
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
    openapiFields.add("is_encrypt_plate_no");
    openapiFields.add("open_appid");
    openapiFields.add("open_id");
    openapiFields.add("out_serial_no");
    openapiFields.add("out_time");
    openapiFields.add("plate_color");
    openapiFields.add("plate_no");
    openapiFields.add("service_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceTransportParkingExitinfoSyncModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceTransportParkingExitinfoSyncModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceTransportParkingExitinfoSyncModel is not found in the empty JSON string", AlipayCommerceTransportParkingExitinfoSyncModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayCommerceTransportParkingExitinfoSyncModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayCommerceTransportParkingExitinfoSyncModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("open_appid") != null && !jsonObj.get("open_appid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_appid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_appid").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("out_serial_no") != null && !jsonObj.get("out_serial_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_serial_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_serial_no").toString()));
      }
      if (jsonObj.get("out_time") != null && !jsonObj.get("out_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_time").toString()));
      }
      if (jsonObj.get("plate_color") != null && !jsonObj.get("plate_color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plate_color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plate_color").toString()));
      }
      if (jsonObj.get("plate_no") != null && !jsonObj.get("plate_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plate_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plate_no").toString()));
      }
      if (jsonObj.get("service_url") != null && !jsonObj.get("service_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceTransportParkingExitinfoSyncModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceTransportParkingExitinfoSyncModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceTransportParkingExitinfoSyncModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceTransportParkingExitinfoSyncModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceTransportParkingExitinfoSyncModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceTransportParkingExitinfoSyncModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayCommerceTransportParkingExitinfoSyncModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayCommerceTransportParkingExitinfoSyncModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceTransportParkingExitinfoSyncModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceTransportParkingExitinfoSyncModel
  */
  public static AlipayCommerceTransportParkingExitinfoSyncModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceTransportParkingExitinfoSyncModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceTransportParkingExitinfoSyncModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

