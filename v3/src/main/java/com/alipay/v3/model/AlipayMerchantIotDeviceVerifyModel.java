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
 * AlipayMerchantIotDeviceVerifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMerchantIotDeviceVerifyModel {
  public static final String SERIALIZED_NAME_BIZ_TID = "biz_tid";
  @SerializedName(SERIALIZED_NAME_BIZ_TID)
  private String bizTid;

  public static final String SERIALIZED_NAME_DEVICE_ID_TYPE = "device_id_type";
  @SerializedName(SERIALIZED_NAME_DEVICE_ID_TYPE)
  private String deviceIdType;

  public static final String SERIALIZED_NAME_DEVICE_SN = "device_sn";
  @SerializedName(SERIALIZED_NAME_DEVICE_SN)
  private String deviceSn;

  public static final String SERIALIZED_NAME_MERCHANT_TYPE = "merchant_type";
  @SerializedName(SERIALIZED_NAME_MERCHANT_TYPE)
  private String merchantType;

  public static final String SERIALIZED_NAME_PID = "pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private String pid;

  public static final String SERIALIZED_NAME_SMID = "smid";
  @SerializedName(SERIALIZED_NAME_SMID)
  private String smid;

  public static final String SERIALIZED_NAME_SUPPLIER_ID = "supplier_id";
  @SerializedName(SERIALIZED_NAME_SUPPLIER_ID)
  private String supplierId;

  public AlipayMerchantIotDeviceVerifyModel() { 
  }

  public AlipayMerchantIotDeviceVerifyModel bizTid(String bizTid) {
    
    this.bizTid = bizTid;
    return this;
  }

   /**
   * 设备 ID ，device_id_type 为 ID 时填写。
   * @return bizTid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01017gV1CZ1XxASNbqkTJqchletNyVXtsKy1PAs4FKZ6tjRMqyMG2Zk", value = "设备 ID ，device_id_type 为 ID 时填写。")

  public String getBizTid() {
    return bizTid;
  }


  public void setBizTid(String bizTid) {
    this.bizTid = bizTid;
  }


  public AlipayMerchantIotDeviceVerifyModel deviceIdType(String deviceIdType) {
    
    this.deviceIdType = deviceIdType;
    return this;
  }

   /**
   * 可选方式 [ID,SN]。ID-使用biztid作为设备唯一识别标识；SN-使用supplier_id、device_sn联合作为设备唯一识别标识。由于不同机型的supplier_id不同，推荐使用 ID 。
   * @return deviceIdType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SN", value = "可选方式 [ID,SN]。ID-使用biztid作为设备唯一识别标识；SN-使用supplier_id、device_sn联合作为设备唯一识别标识。由于不同机型的supplier_id不同，推荐使用 ID 。")

  public String getDeviceIdType() {
    return deviceIdType;
  }


  public void setDeviceIdType(String deviceIdType) {
    this.deviceIdType = deviceIdType;
  }


  public AlipayMerchantIotDeviceVerifyModel deviceSn(String deviceSn) {
    
    this.deviceSn = deviceSn;
    return this;
  }

   /**
   * 设备序列号 ，device_id_type 为 SN 时填写。需配合supplier_id使用。
   * @return deviceSn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "QCF420190316000107", value = "设备序列号 ，device_id_type 为 SN 时填写。需配合supplier_id使用。")

  public String getDeviceSn() {
    return deviceSn;
  }


  public void setDeviceSn(String deviceSn) {
    this.deviceSn = deviceSn;
  }


  public AlipayMerchantIotDeviceVerifyModel merchantType(String merchantType) {
    
    this.merchantType = merchantType;
    return this;
  }

   /**
   * 商户类型，直连商户填写direct，间连商户填写indirect
   * @return merchantType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "indirect", value = "商户类型，直连商户填写direct，间连商户填写indirect")

  public String getMerchantType() {
    return merchantType;
  }


  public void setMerchantType(String merchantType) {
    this.merchantType = merchantType;
  }


  public AlipayMerchantIotDeviceVerifyModel pid(String pid) {
    
    this.pid = pid;
    return this;
  }

   /**
   * 直连场景填写商户收单pid，间连场景不填
   * @return pid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088101112139885", value = "直连场景填写商户收单pid，间连场景不填")

  public String getPid() {
    return pid;
  }


  public void setPid(String pid) {
    this.pid = pid;
  }


  public AlipayMerchantIotDeviceVerifyModel smid(String smid) {
    
    this.smid = smid;
    return this;
  }

   /**
   * 直连场景不填，间连场景填写商户收单smid
   * @return smid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088101112139886", value = "直连场景不填，间连场景填写商户收单smid")

  public String getSmid() {
    return smid;
  }


  public void setSmid(String smid) {
    this.smid = smid;
  }


  public AlipayMerchantIotDeviceVerifyModel supplierId(String supplierId) {
    
    this.supplierId = supplierId;
    return this;
  }

   /**
   * 设备供应商ID ，device_id_type 为 SN 时填写。需注意不同机型的供应商ID可能不同。
   * @return supplierId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201812271300540049", value = "设备供应商ID ，device_id_type 为 SN 时填写。需注意不同机型的供应商ID可能不同。")

  public String getSupplierId() {
    return supplierId;
  }


  public void setSupplierId(String supplierId) {
    this.supplierId = supplierId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMerchantIotDeviceVerifyModel alipayMerchantIotDeviceVerifyModel = (AlipayMerchantIotDeviceVerifyModel) o;
    return Objects.equals(this.bizTid, alipayMerchantIotDeviceVerifyModel.bizTid) &&
        Objects.equals(this.deviceIdType, alipayMerchantIotDeviceVerifyModel.deviceIdType) &&
        Objects.equals(this.deviceSn, alipayMerchantIotDeviceVerifyModel.deviceSn) &&
        Objects.equals(this.merchantType, alipayMerchantIotDeviceVerifyModel.merchantType) &&
        Objects.equals(this.pid, alipayMerchantIotDeviceVerifyModel.pid) &&
        Objects.equals(this.smid, alipayMerchantIotDeviceVerifyModel.smid) &&
        Objects.equals(this.supplierId, alipayMerchantIotDeviceVerifyModel.supplierId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizTid, deviceIdType, deviceSn, merchantType, pid, smid, supplierId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMerchantIotDeviceVerifyModel {\n");
    sb.append("    bizTid: ").append(toIndentedString(bizTid)).append("\n");
    sb.append("    deviceIdType: ").append(toIndentedString(deviceIdType)).append("\n");
    sb.append("    deviceSn: ").append(toIndentedString(deviceSn)).append("\n");
    sb.append("    merchantType: ").append(toIndentedString(merchantType)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    smid: ").append(toIndentedString(smid)).append("\n");
    sb.append("    supplierId: ").append(toIndentedString(supplierId)).append("\n");
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
    openapiFields.add("biz_tid");
    openapiFields.add("device_id_type");
    openapiFields.add("device_sn");
    openapiFields.add("merchant_type");
    openapiFields.add("pid");
    openapiFields.add("smid");
    openapiFields.add("supplier_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMerchantIotDeviceVerifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMerchantIotDeviceVerifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMerchantIotDeviceVerifyModel is not found in the empty JSON string", AlipayMerchantIotDeviceVerifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMerchantIotDeviceVerifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMerchantIotDeviceVerifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("biz_tid") != null && !jsonObj.get("biz_tid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_tid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_tid").toString()));
      }
      if (jsonObj.get("device_id_type") != null && !jsonObj.get("device_id_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device_id_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device_id_type").toString()));
      }
      if (jsonObj.get("device_sn") != null && !jsonObj.get("device_sn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device_sn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device_sn").toString()));
      }
      if (jsonObj.get("merchant_type") != null && !jsonObj.get("merchant_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_type").toString()));
      }
      if (jsonObj.get("pid") != null && !jsonObj.get("pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pid").toString()));
      }
      if (jsonObj.get("smid") != null && !jsonObj.get("smid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `smid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("smid").toString()));
      }
      if (jsonObj.get("supplier_id") != null && !jsonObj.get("supplier_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `supplier_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("supplier_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMerchantIotDeviceVerifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMerchantIotDeviceVerifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMerchantIotDeviceVerifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMerchantIotDeviceVerifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMerchantIotDeviceVerifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayMerchantIotDeviceVerifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMerchantIotDeviceVerifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMerchantIotDeviceVerifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMerchantIotDeviceVerifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMerchantIotDeviceVerifyModel
  */
  public static AlipayMerchantIotDeviceVerifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMerchantIotDeviceVerifyModel.class);
  }

 /**
  * Convert an instance of AlipayMerchantIotDeviceVerifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

