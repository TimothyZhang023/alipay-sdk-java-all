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
 * AlipayCommerceTransportParkingEnterinfoSyncModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceTransportParkingEnterinfoSyncModel {
  public static final String SERIALIZED_NAME_AGREEMENT_QUERY = "agreement_query";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_QUERY)
  private Boolean agreementQuery;

  public static final String SERIALIZED_NAME_FREE_ENTER_MINUTES = "free_enter_minutes";
  @SerializedName(SERIALIZED_NAME_FREE_ENTER_MINUTES)
  private String freeEnterMinutes;

  public static final String SERIALIZED_NAME_IN_TIME = "in_time";
  @SerializedName(SERIALIZED_NAME_IN_TIME)
  private String inTime;

  public static final String SERIALIZED_NAME_IS_ENCRYPT_PLATE_NO = "is_encrypt_plate_no";
  @SerializedName(SERIALIZED_NAME_IS_ENCRYPT_PLATE_NO)
  private Boolean isEncryptPlateNo;

  public static final String SERIALIZED_NAME_NEED_CHARGE = "need_charge";
  @SerializedName(SERIALIZED_NAME_NEED_CHARGE)
  private Boolean needCharge;

  public static final String SERIALIZED_NAME_OPEN_APPID = "open_appid";
  @SerializedName(SERIALIZED_NAME_OPEN_APPID)
  private String openAppid;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_OUT_SERIAL_NO = "out_serial_no";
  @SerializedName(SERIALIZED_NAME_OUT_SERIAL_NO)
  private String outSerialNo;

  public static final String SERIALIZED_NAME_PARKING_ID = "parking_id";
  @SerializedName(SERIALIZED_NAME_PARKING_ID)
  private String parkingId;

  public static final String SERIALIZED_NAME_PLATE_COLOR = "plate_color";
  @SerializedName(SERIALIZED_NAME_PLATE_COLOR)
  private String plateColor;

  public static final String SERIALIZED_NAME_PLATE_NO = "plate_no";
  @SerializedName(SERIALIZED_NAME_PLATE_NO)
  private String plateNo;

  public static final String SERIALIZED_NAME_SERVICE_URL = "service_url";
  @SerializedName(SERIALIZED_NAME_SERVICE_URL)
  private String serviceUrl;

  public AlipayCommerceTransportParkingEnterinfoSyncModel() { 
  }

  public AlipayCommerceTransportParkingEnterinfoSyncModel agreementQuery(Boolean agreementQuery) {
    
    this.agreementQuery = agreementQuery;
    return this;
  }

   /**
   * 是否启用车牌代扣状态查询功能，true为启用，false为停用
   * @return agreementQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否启用车牌代扣状态查询功能，true为启用，false为停用")

  public Boolean getAgreementQuery() {
    return agreementQuery;
  }


  public void setAgreementQuery(Boolean agreementQuery) {
    this.agreementQuery = agreementQuery;
  }


  public AlipayCommerceTransportParkingEnterinfoSyncModel freeEnterMinutes(String freeEnterMinutes) {
    
    this.freeEnterMinutes = freeEnterMinutes;
    return this;
  }

   /**
   * 当前停车场的入场免费时长分钟数
   * @return freeEnterMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15", value = "当前停车场的入场免费时长分钟数")

  public String getFreeEnterMinutes() {
    return freeEnterMinutes;
  }


  public void setFreeEnterMinutes(String freeEnterMinutes) {
    this.freeEnterMinutes = freeEnterMinutes;
  }


  public AlipayCommerceTransportParkingEnterinfoSyncModel inTime(String inTime) {
    
    this.inTime = inTime;
    return this;
  }

   /**
   * 车辆入场的时间，格式\&quot;YYYY-MM-DD HH:mm:ss\&quot;，24小时制，请保证服务器时间准确，入场时间不应晚于当前网络时间
   * @return inTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-07-24 03:07:50", value = "车辆入场的时间，格式\"YYYY-MM-DD HH:mm:ss\"，24小时制，请保证服务器时间准确，入场时间不应晚于当前网络时间")

  public String getInTime() {
    return inTime;
  }


  public void setInTime(String inTime) {
    this.inTime = inTime;
  }


  public AlipayCommerceTransportParkingEnterinfoSyncModel isEncryptPlateNo(Boolean isEncryptPlateNo) {
    
    this.isEncryptPlateNo = isEncryptPlateNo;
    return this;
  }

   /**
   * 车牌是否加密，true为加密，false为不加密，默认为false
   * @return isEncryptPlateNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "车牌是否加密，true为加密，false为不加密，默认为false")

  public Boolean getIsEncryptPlateNo() {
    return isEncryptPlateNo;
  }


  public void setIsEncryptPlateNo(Boolean isEncryptPlateNo) {
    this.isEncryptPlateNo = isEncryptPlateNo;
  }


  public AlipayCommerceTransportParkingEnterinfoSyncModel needCharge(Boolean needCharge) {
    
    this.needCharge = needCharge;
    return this;
  }

   /**
   * 当前行程是否需要计费。true：需要，false：不需要。不传默认为true。
   * @return needCharge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "当前行程是否需要计费。true：需要，false：不需要。不传默认为true。")

  public Boolean getNeedCharge() {
    return needCharge;
  }


  public void setNeedCharge(Boolean needCharge) {
    this.needCharge = needCharge;
  }


  public AlipayCommerceTransportParkingEnterinfoSyncModel openAppid(String openAppid) {
    
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


  public AlipayCommerceTransportParkingEnterinfoSyncModel openId(String openId) {
    
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


  public AlipayCommerceTransportParkingEnterinfoSyncModel outSerialNo(String outSerialNo) {
    
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


  public AlipayCommerceTransportParkingEnterinfoSyncModel parkingId(String parkingId) {
    
    this.parkingId = parkingId;
    return this;
  }

   /**
   * 支付宝停车平台ID，由支付宝定义的该停车场标识，同一个isv或商户范围内唯一。通过 alipay.eco.mycar.parking.parkinglotinfo.create (录入停车场信息)接口获取。
   * @return parkingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015042321001004720200028594", value = "支付宝停车平台ID，由支付宝定义的该停车场标识，同一个isv或商户范围内唯一。通过 alipay.eco.mycar.parking.parkinglotinfo.create (录入停车场信息)接口获取。")

  public String getParkingId() {
    return parkingId;
  }


  public void setParkingId(String parkingId) {
    this.parkingId = parkingId;
  }


  public AlipayCommerceTransportParkingEnterinfoSyncModel plateColor(String plateColor) {
    
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


  public AlipayCommerceTransportParkingEnterinfoSyncModel plateNo(String plateNo) {
    
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


  public AlipayCommerceTransportParkingEnterinfoSyncModel serviceUrl(String serviceUrl) {
    
    this.serviceUrl = serviceUrl;
    return this;
  }

   /**
   * 停车服务页面地址。 1、服务商停车服务页面地址必须是支付宝小程序URL（无需转换https），详见：https://opendocs.alipay.com/support/01rb18#URL%20%E6%A0%BC%E5%BC%8F  2、若服务商没有服务链接，可传输支付宝停车官方小程序的服务链接：alipays://platformapi/startapp?appId&#x3D;2021001102642986&amp;page&#x3D;pages%2Fparking-fee%2Findex  3、若此次对接的是无感支付，则服务链接传输为：alipays://platformapi/startapp?appId&#x3D;2021001102642986&amp;page&#x3D;%2Fpages%2Fparking-bill%2Findex
   * @return serviceUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alipays://xxxxx", value = "停车服务页面地址。 1、服务商停车服务页面地址必须是支付宝小程序URL（无需转换https），详见：https://opendocs.alipay.com/support/01rb18#URL%20%E6%A0%BC%E5%BC%8F  2、若服务商没有服务链接，可传输支付宝停车官方小程序的服务链接：alipays://platformapi/startapp?appId=2021001102642986&page=pages%2Fparking-fee%2Findex  3、若此次对接的是无感支付，则服务链接传输为：alipays://platformapi/startapp?appId=2021001102642986&page=%2Fpages%2Fparking-bill%2Findex")

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
    AlipayCommerceTransportParkingEnterinfoSyncModel alipayCommerceTransportParkingEnterinfoSyncModel = (AlipayCommerceTransportParkingEnterinfoSyncModel) o;
    return Objects.equals(this.agreementQuery, alipayCommerceTransportParkingEnterinfoSyncModel.agreementQuery) &&
        Objects.equals(this.freeEnterMinutes, alipayCommerceTransportParkingEnterinfoSyncModel.freeEnterMinutes) &&
        Objects.equals(this.inTime, alipayCommerceTransportParkingEnterinfoSyncModel.inTime) &&
        Objects.equals(this.isEncryptPlateNo, alipayCommerceTransportParkingEnterinfoSyncModel.isEncryptPlateNo) &&
        Objects.equals(this.needCharge, alipayCommerceTransportParkingEnterinfoSyncModel.needCharge) &&
        Objects.equals(this.openAppid, alipayCommerceTransportParkingEnterinfoSyncModel.openAppid) &&
        Objects.equals(this.openId, alipayCommerceTransportParkingEnterinfoSyncModel.openId) &&
        Objects.equals(this.outSerialNo, alipayCommerceTransportParkingEnterinfoSyncModel.outSerialNo) &&
        Objects.equals(this.parkingId, alipayCommerceTransportParkingEnterinfoSyncModel.parkingId) &&
        Objects.equals(this.plateColor, alipayCommerceTransportParkingEnterinfoSyncModel.plateColor) &&
        Objects.equals(this.plateNo, alipayCommerceTransportParkingEnterinfoSyncModel.plateNo) &&
        Objects.equals(this.serviceUrl, alipayCommerceTransportParkingEnterinfoSyncModel.serviceUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementQuery, freeEnterMinutes, inTime, isEncryptPlateNo, needCharge, openAppid, openId, outSerialNo, parkingId, plateColor, plateNo, serviceUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceTransportParkingEnterinfoSyncModel {\n");
    sb.append("    agreementQuery: ").append(toIndentedString(agreementQuery)).append("\n");
    sb.append("    freeEnterMinutes: ").append(toIndentedString(freeEnterMinutes)).append("\n");
    sb.append("    inTime: ").append(toIndentedString(inTime)).append("\n");
    sb.append("    isEncryptPlateNo: ").append(toIndentedString(isEncryptPlateNo)).append("\n");
    sb.append("    needCharge: ").append(toIndentedString(needCharge)).append("\n");
    sb.append("    openAppid: ").append(toIndentedString(openAppid)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    outSerialNo: ").append(toIndentedString(outSerialNo)).append("\n");
    sb.append("    parkingId: ").append(toIndentedString(parkingId)).append("\n");
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
    openapiFields.add("agreement_query");
    openapiFields.add("free_enter_minutes");
    openapiFields.add("in_time");
    openapiFields.add("is_encrypt_plate_no");
    openapiFields.add("need_charge");
    openapiFields.add("open_appid");
    openapiFields.add("open_id");
    openapiFields.add("out_serial_no");
    openapiFields.add("parking_id");
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
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceTransportParkingEnterinfoSyncModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceTransportParkingEnterinfoSyncModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceTransportParkingEnterinfoSyncModel is not found in the empty JSON string", AlipayCommerceTransportParkingEnterinfoSyncModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayCommerceTransportParkingEnterinfoSyncModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayCommerceTransportParkingEnterinfoSyncModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("free_enter_minutes") != null && !jsonObj.get("free_enter_minutes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `free_enter_minutes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("free_enter_minutes").toString()));
      }
      if (jsonObj.get("in_time") != null && !jsonObj.get("in_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `in_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("in_time").toString()));
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
      if (jsonObj.get("parking_id") != null && !jsonObj.get("parking_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parking_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parking_id").toString()));
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
       if (!AlipayCommerceTransportParkingEnterinfoSyncModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceTransportParkingEnterinfoSyncModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceTransportParkingEnterinfoSyncModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceTransportParkingEnterinfoSyncModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceTransportParkingEnterinfoSyncModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceTransportParkingEnterinfoSyncModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayCommerceTransportParkingEnterinfoSyncModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayCommerceTransportParkingEnterinfoSyncModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceTransportParkingEnterinfoSyncModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceTransportParkingEnterinfoSyncModel
  */
  public static AlipayCommerceTransportParkingEnterinfoSyncModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceTransportParkingEnterinfoSyncModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceTransportParkingEnterinfoSyncModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

