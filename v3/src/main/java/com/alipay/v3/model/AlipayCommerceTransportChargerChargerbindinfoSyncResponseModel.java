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
 * AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel {
  public static final String SERIALIZED_NAME_EQUIP_ID = "equip_id";
  @SerializedName(SERIALIZED_NAME_EQUIP_ID)
  private String equipId;

  public static final String SERIALIZED_NAME_FAIL_REASON = "fail_reason";
  @SerializedName(SERIALIZED_NAME_FAIL_REASON)
  private String failReason;

  public static final String SERIALIZED_NAME_RESULT_STATUS = "result_status";
  @SerializedName(SERIALIZED_NAME_RESULT_STATUS)
  private String resultStatus;

  public AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel() { 
  }

  public AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel equipId(String equipId) {
    
    this.equipId = equipId;
    return this;
  }

   /**
   * 商户同步的充电桩设备编码
   * @return equipId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "234h78890900000", value = "商户同步的充电桩设备编码")

  public String getEquipId() {
    return equipId;
  }


  public void setEquipId(String equipId) {
    this.equipId = equipId;
  }


  public AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel failReason(String failReason) {
    
    this.failReason = failReason;
    return this;
  }

   /**
   * 绑定关系结果接收失败原因
   * @return failReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "设备状态不存在", value = "绑定关系结果接收失败原因")

  public String getFailReason() {
    return failReason;
  }


  public void setFailReason(String failReason) {
    this.failReason = failReason;
  }


  public AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel resultStatus(String resultStatus) {
    
    this.resultStatus = resultStatus;
    return this;
  }

   /**
   * 0：成功 1：拒绝
   * @return resultStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "0：成功 1：拒绝")

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
    AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel alipayCommerceTransportChargerChargerbindinfoSyncResponseModel = (AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel) o;
    return Objects.equals(this.equipId, alipayCommerceTransportChargerChargerbindinfoSyncResponseModel.equipId) &&
        Objects.equals(this.failReason, alipayCommerceTransportChargerChargerbindinfoSyncResponseModel.failReason) &&
        Objects.equals(this.resultStatus, alipayCommerceTransportChargerChargerbindinfoSyncResponseModel.resultStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(equipId, failReason, resultStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel {\n");
    sb.append("    equipId: ").append(toIndentedString(equipId)).append("\n");
    sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
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
    openapiFields.add("equip_id");
    openapiFields.add("fail_reason");
    openapiFields.add("result_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel is not found in the empty JSON string", AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("equip_id") != null && !jsonObj.get("equip_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `equip_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("equip_id").toString()));
      }
      if (jsonObj.get("fail_reason") != null && !jsonObj.get("fail_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fail_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fail_reason").toString()));
      }
      if (jsonObj.get("result_status") != null && !jsonObj.get("result_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result_status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel
  */
  public static AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

