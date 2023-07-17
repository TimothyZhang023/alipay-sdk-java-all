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
import com.alipay.v3.model.TimeRestrictInfo;
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
 * VoucherRelativePeriodInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherRelativePeriodInfo {
  public static final String SERIALIZED_NAME_TIME_RESTRICT_INFO = "time_restrict_info";
  @SerializedName(SERIALIZED_NAME_TIME_RESTRICT_INFO)
  private TimeRestrictInfo timeRestrictInfo;

  public static final String SERIALIZED_NAME_VALID_DAYS_AFTER_RECEIVE = "valid_days_after_receive";
  @SerializedName(SERIALIZED_NAME_VALID_DAYS_AFTER_RECEIVE)
  private Integer validDaysAfterReceive;

  public static final String SERIALIZED_NAME_WAIT_DAYS_AFTER_RECEIVE = "wait_days_after_receive";
  @SerializedName(SERIALIZED_NAME_WAIT_DAYS_AFTER_RECEIVE)
  private Integer waitDaysAfterReceive;

  public VoucherRelativePeriodInfo() { 
  }

  public VoucherRelativePeriodInfo timeRestrictInfo(TimeRestrictInfo timeRestrictInfo) {
    
    this.timeRestrictInfo = timeRestrictInfo;
    return this;
  }

   /**
   * Get timeRestrictInfo
   * @return timeRestrictInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TimeRestrictInfo getTimeRestrictInfo() {
    return timeRestrictInfo;
  }


  public void setTimeRestrictInfo(TimeRestrictInfo timeRestrictInfo) {
    this.timeRestrictInfo = timeRestrictInfo;
  }


  public VoucherRelativePeriodInfo validDaysAfterReceive(Integer validDaysAfterReceive) {
    
    this.validDaysAfterReceive = validDaysAfterReceive;
    return this;
  }

   /**
   * 券生效后 N 天内可以使用。 可以配合wait_days_after_receive 字段使用。
   * @return validDaysAfterReceive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券生效后 N 天内可以使用。 可以配合wait_days_after_receive 字段使用。")

  public Integer getValidDaysAfterReceive() {
    return validDaysAfterReceive;
  }


  public void setValidDaysAfterReceive(Integer validDaysAfterReceive) {
    this.validDaysAfterReceive = validDaysAfterReceive;
  }


  public VoucherRelativePeriodInfo waitDaysAfterReceive(Integer waitDaysAfterReceive) {
    
    this.waitDaysAfterReceive = waitDaysAfterReceive;
    return this;
  }

   /**
   * 用户领券后需要等待 N 天，券才可以生效。  字段值为 0 表示用户领券后立刻生效。
   * @return waitDaysAfterReceive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户领券后需要等待 N 天，券才可以生效。  字段值为 0 表示用户领券后立刻生效。")

  public Integer getWaitDaysAfterReceive() {
    return waitDaysAfterReceive;
  }


  public void setWaitDaysAfterReceive(Integer waitDaysAfterReceive) {
    this.waitDaysAfterReceive = waitDaysAfterReceive;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherRelativePeriodInfo voucherRelativePeriodInfo = (VoucherRelativePeriodInfo) o;
    return Objects.equals(this.timeRestrictInfo, voucherRelativePeriodInfo.timeRestrictInfo) &&
        Objects.equals(this.validDaysAfterReceive, voucherRelativePeriodInfo.validDaysAfterReceive) &&
        Objects.equals(this.waitDaysAfterReceive, voucherRelativePeriodInfo.waitDaysAfterReceive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeRestrictInfo, validDaysAfterReceive, waitDaysAfterReceive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherRelativePeriodInfo {\n");
    sb.append("    timeRestrictInfo: ").append(toIndentedString(timeRestrictInfo)).append("\n");
    sb.append("    validDaysAfterReceive: ").append(toIndentedString(validDaysAfterReceive)).append("\n");
    sb.append("    waitDaysAfterReceive: ").append(toIndentedString(waitDaysAfterReceive)).append("\n");
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
    openapiFields.add("time_restrict_info");
    openapiFields.add("valid_days_after_receive");
    openapiFields.add("wait_days_after_receive");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherRelativePeriodInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherRelativePeriodInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherRelativePeriodInfo is not found in the empty JSON string", VoucherRelativePeriodInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VoucherRelativePeriodInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherRelativePeriodInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `time_restrict_info`
      if (jsonObj.getAsJsonObject("time_restrict_info") != null) {
        TimeRestrictInfo.validateJsonObject(jsonObj.getAsJsonObject("time_restrict_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherRelativePeriodInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherRelativePeriodInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherRelativePeriodInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherRelativePeriodInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherRelativePeriodInfo>() {
           @Override
           public void write(JsonWriter out, VoucherRelativePeriodInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherRelativePeriodInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherRelativePeriodInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherRelativePeriodInfo
  * @throws IOException if the JSON string is invalid with respect to VoucherRelativePeriodInfo
  */
  public static VoucherRelativePeriodInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherRelativePeriodInfo.class);
  }

 /**
  * Convert an instance of VoucherRelativePeriodInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

