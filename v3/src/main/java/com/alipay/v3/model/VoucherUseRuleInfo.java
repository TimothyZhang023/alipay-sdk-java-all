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
import com.alipay.v3.model.VoucherUseTimeInfo;
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
 * VoucherUseRuleInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherUseRuleInfo {
  public static final String SERIALIZED_NAME_QUANTITY_LIMIT_PER_USER = "quantity_limit_per_user";
  @SerializedName(SERIALIZED_NAME_QUANTITY_LIMIT_PER_USER)
  private Integer quantityLimitPerUser;

  public static final String SERIALIZED_NAME_QUANTITY_LIMIT_PER_USER_PERIOD_TYPE = "quantity_limit_per_user_period_type";
  @SerializedName(SERIALIZED_NAME_QUANTITY_LIMIT_PER_USER_PERIOD_TYPE)
  private String quantityLimitPerUserPeriodType;

  public static final String SERIALIZED_NAME_VOUCHER_MAX_USE_TIMES = "voucher_max_use_times";
  @SerializedName(SERIALIZED_NAME_VOUCHER_MAX_USE_TIMES)
  private Integer voucherMaxUseTimes;

  public static final String SERIALIZED_NAME_VOUCHER_USE_EXT_INFO = "voucher_use_ext_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_USE_EXT_INFO)
  private String voucherUseExtInfo;

  public static final String SERIALIZED_NAME_VOUCHER_USE_TIME_INFO = "voucher_use_time_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_USE_TIME_INFO)
  private VoucherUseTimeInfo voucherUseTimeInfo;

  public VoucherUseRuleInfo() { 
  }

  public VoucherUseRuleInfo quantityLimitPerUser(Integer quantityLimitPerUser) {
    
    this.quantityLimitPerUser = quantityLimitPerUser;
    return this;
  }

   /**
   * 核销次数限制。
   * @return quantityLimitPerUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "核销次数限制。")

  public Integer getQuantityLimitPerUser() {
    return quantityLimitPerUser;
  }


  public void setQuantityLimitPerUser(Integer quantityLimitPerUser) {
    this.quantityLimitPerUser = quantityLimitPerUser;
  }


  public VoucherUseRuleInfo quantityLimitPerUserPeriodType(String quantityLimitPerUserPeriodType) {
    
    this.quantityLimitPerUserPeriodType = quantityLimitPerUserPeriodType;
    return this;
  }

   /**
   * 周期限领配置,限制每人在固定周期内领取张数(voucher_quantity_limit_per_user),默认LIFE_CYCLE
   * @return quantityLimitPerUserPeriodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "周期限领配置,限制每人在固定周期内领取张数(voucher_quantity_limit_per_user),默认LIFE_CYCLE")

  public String getQuantityLimitPerUserPeriodType() {
    return quantityLimitPerUserPeriodType;
  }


  public void setQuantityLimitPerUserPeriodType(String quantityLimitPerUserPeriodType) {
    this.quantityLimitPerUserPeriodType = quantityLimitPerUserPeriodType;
  }


  public VoucherUseRuleInfo voucherMaxUseTimes(Integer voucherMaxUseTimes) {
    
    this.voucherMaxUseTimes = voucherMaxUseTimes;
    return this;
  }

   /**
   * 券最大核销次数。
   * @return voucherMaxUseTimes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券最大核销次数。")

  public Integer getVoucherMaxUseTimes() {
    return voucherMaxUseTimes;
  }


  public void setVoucherMaxUseTimes(Integer voucherMaxUseTimes) {
    this.voucherMaxUseTimes = voucherMaxUseTimes;
  }


  public VoucherUseRuleInfo voucherUseExtInfo(String voucherUseExtInfo) {
    
    this.voucherUseExtInfo = voucherUseExtInfo;
    return this;
  }

   /**
   * 自定义扩展信息
   * @return voucherUseExtInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "自定义扩展信息")

  public String getVoucherUseExtInfo() {
    return voucherUseExtInfo;
  }


  public void setVoucherUseExtInfo(String voucherUseExtInfo) {
    this.voucherUseExtInfo = voucherUseExtInfo;
  }


  public VoucherUseRuleInfo voucherUseTimeInfo(VoucherUseTimeInfo voucherUseTimeInfo) {
    
    this.voucherUseTimeInfo = voucherUseTimeInfo;
    return this;
  }

   /**
   * Get voucherUseTimeInfo
   * @return voucherUseTimeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherUseTimeInfo getVoucherUseTimeInfo() {
    return voucherUseTimeInfo;
  }


  public void setVoucherUseTimeInfo(VoucherUseTimeInfo voucherUseTimeInfo) {
    this.voucherUseTimeInfo = voucherUseTimeInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherUseRuleInfo voucherUseRuleInfo = (VoucherUseRuleInfo) o;
    return Objects.equals(this.quantityLimitPerUser, voucherUseRuleInfo.quantityLimitPerUser) &&
        Objects.equals(this.quantityLimitPerUserPeriodType, voucherUseRuleInfo.quantityLimitPerUserPeriodType) &&
        Objects.equals(this.voucherMaxUseTimes, voucherUseRuleInfo.voucherMaxUseTimes) &&
        Objects.equals(this.voucherUseExtInfo, voucherUseRuleInfo.voucherUseExtInfo) &&
        Objects.equals(this.voucherUseTimeInfo, voucherUseRuleInfo.voucherUseTimeInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantityLimitPerUser, quantityLimitPerUserPeriodType, voucherMaxUseTimes, voucherUseExtInfo, voucherUseTimeInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherUseRuleInfo {\n");
    sb.append("    quantityLimitPerUser: ").append(toIndentedString(quantityLimitPerUser)).append("\n");
    sb.append("    quantityLimitPerUserPeriodType: ").append(toIndentedString(quantityLimitPerUserPeriodType)).append("\n");
    sb.append("    voucherMaxUseTimes: ").append(toIndentedString(voucherMaxUseTimes)).append("\n");
    sb.append("    voucherUseExtInfo: ").append(toIndentedString(voucherUseExtInfo)).append("\n");
    sb.append("    voucherUseTimeInfo: ").append(toIndentedString(voucherUseTimeInfo)).append("\n");
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
    openapiFields.add("quantity_limit_per_user");
    openapiFields.add("quantity_limit_per_user_period_type");
    openapiFields.add("voucher_max_use_times");
    openapiFields.add("voucher_use_ext_info");
    openapiFields.add("voucher_use_time_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherUseRuleInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherUseRuleInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherUseRuleInfo is not found in the empty JSON string", VoucherUseRuleInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VoucherUseRuleInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherUseRuleInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("quantity_limit_per_user_period_type") != null && !jsonObj.get("quantity_limit_per_user_period_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quantity_limit_per_user_period_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quantity_limit_per_user_period_type").toString()));
      }
      if (jsonObj.get("voucher_use_ext_info") != null && !jsonObj.get("voucher_use_ext_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_use_ext_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_use_ext_info").toString()));
      }
      // validate the optional field `voucher_use_time_info`
      if (jsonObj.getAsJsonObject("voucher_use_time_info") != null) {
        VoucherUseTimeInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_use_time_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherUseRuleInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherUseRuleInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherUseRuleInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherUseRuleInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherUseRuleInfo>() {
           @Override
           public void write(JsonWriter out, VoucherUseRuleInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherUseRuleInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherUseRuleInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherUseRuleInfo
  * @throws IOException if the JSON string is invalid with respect to VoucherUseRuleInfo
  */
  public static VoucherUseRuleInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherUseRuleInfo.class);
  }

 /**
  * Convert an instance of VoucherUseRuleInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

