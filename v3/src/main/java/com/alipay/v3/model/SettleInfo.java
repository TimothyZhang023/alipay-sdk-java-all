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
import com.alipay.v3.model.SettleDetailInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * SettleInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SettleInfo {
  public static final String SERIALIZED_NAME_SETTLE_DETAIL_INFOS = "settle_detail_infos";
  @SerializedName(SERIALIZED_NAME_SETTLE_DETAIL_INFOS)
  private List<SettleDetailInfo> settleDetailInfos = null;

  public static final String SERIALIZED_NAME_SETTLE_PERIOD_TIME = "settle_period_time";
  @SerializedName(SERIALIZED_NAME_SETTLE_PERIOD_TIME)
  private String settlePeriodTime;

  public SettleInfo() { 
  }

  public SettleInfo settleDetailInfos(List<SettleDetailInfo> settleDetailInfos) {
    
    this.settleDetailInfos = settleDetailInfos;
    return this;
  }

  public SettleInfo addSettleDetailInfosItem(SettleDetailInfo settleDetailInfosItem) {
    if (this.settleDetailInfos == null) {
      this.settleDetailInfos = new ArrayList<>();
    }
    this.settleDetailInfos.add(settleDetailInfosItem);
    return this;
  }

   /**
   * 结算详细信息，json数组，目前只支持一条。
   * @return settleDetailInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "结算详细信息，json数组，目前只支持一条。")

  public List<SettleDetailInfo> getSettleDetailInfos() {
    return settleDetailInfos;
  }


  public void setSettleDetailInfos(List<SettleDetailInfo> settleDetailInfos) {
    this.settleDetailInfos = settleDetailInfos;
  }


  public SettleInfo settlePeriodTime(String settlePeriodTime) {
    
    this.settlePeriodTime = settlePeriodTime;
    return this;
  }

   /**
   * 该笔订单的超期自动确认结算时间，到达期限后，将自动确认结算。此字段只在签约账期结算模式时有效。取值范围：1d～365d。d-天。 该参数数值不接受小数点。
   * @return settlePeriodTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该笔订单的超期自动确认结算时间，到达期限后，将自动确认结算。此字段只在签约账期结算模式时有效。取值范围：1d～365d。d-天。 该参数数值不接受小数点。")

  public String getSettlePeriodTime() {
    return settlePeriodTime;
  }


  public void setSettlePeriodTime(String settlePeriodTime) {
    this.settlePeriodTime = settlePeriodTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettleInfo settleInfo = (SettleInfo) o;
    return Objects.equals(this.settleDetailInfos, settleInfo.settleDetailInfos) &&
        Objects.equals(this.settlePeriodTime, settleInfo.settlePeriodTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settleDetailInfos, settlePeriodTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettleInfo {\n");
    sb.append("    settleDetailInfos: ").append(toIndentedString(settleDetailInfos)).append("\n");
    sb.append("    settlePeriodTime: ").append(toIndentedString(settlePeriodTime)).append("\n");
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
    openapiFields.add("settle_detail_infos");
    openapiFields.add("settle_period_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SettleInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SettleInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SettleInfo is not found in the empty JSON string", SettleInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SettleInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SettleInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraysettleDetailInfos = jsonObj.getAsJsonArray("settle_detail_infos");
      if (jsonArraysettleDetailInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("settle_detail_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `settle_detail_infos` to be an array in the JSON string but got `%s`", jsonObj.get("settle_detail_infos").toString()));
        }

        // validate the optional field `settle_detail_infos` (array)
        for (int i = 0; i < jsonArraysettleDetailInfos.size(); i++) {
          SettleDetailInfo.validateJsonObject(jsonArraysettleDetailInfos.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("settle_period_time") != null && !jsonObj.get("settle_period_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settle_period_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settle_period_time").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SettleInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SettleInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SettleInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SettleInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SettleInfo>() {
           @Override
           public void write(JsonWriter out, SettleInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SettleInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SettleInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SettleInfo
  * @throws IOException if the JSON string is invalid with respect to SettleInfo
  */
  public static SettleInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SettleInfo.class);
  }

 /**
  * Convert an instance of SettleInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

