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
 * JointAccountQuotaRespDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JointAccountQuotaRespDTO {
  public static final String SERIALIZED_NAME_CUSTOM_BEGIN_DATE = "custom_begin_date";
  @SerializedName(SERIALIZED_NAME_CUSTOM_BEGIN_DATE)
  private String customBeginDate;

  public static final String SERIALIZED_NAME_CUSTOM_END_DATE = "custom_end_date";
  @SerializedName(SERIALIZED_NAME_CUSTOM_END_DATE)
  private String customEndDate;

  public static final String SERIALIZED_NAME_QUOTA_DIMENSION = "quota_dimension";
  @SerializedName(SERIALIZED_NAME_QUOTA_DIMENSION)
  private String quotaDimension;

  public static final String SERIALIZED_NAME_QUOTA_REMAIN = "quota_remain";
  @SerializedName(SERIALIZED_NAME_QUOTA_REMAIN)
  private String quotaRemain;

  public static final String SERIALIZED_NAME_QUOTA_REMAIN_COUNT = "quota_remain_count";
  @SerializedName(SERIALIZED_NAME_QUOTA_REMAIN_COUNT)
  private String quotaRemainCount;

  public static final String SERIALIZED_NAME_QUOTA_TOTAL = "quota_total";
  @SerializedName(SERIALIZED_NAME_QUOTA_TOTAL)
  private String quotaTotal;

  public static final String SERIALIZED_NAME_QUOTA_USED = "quota_used";
  @SerializedName(SERIALIZED_NAME_QUOTA_USED)
  private String quotaUsed;

  public JointAccountQuotaRespDTO() { 
  }

  public JointAccountQuotaRespDTO customBeginDate(String customBeginDate) {
    
    this.customBeginDate = customBeginDate;
    return this;
  }

   /**
   * 额度生效起始日期，精确到分钟。 格式：yyyy-MM-dd HH:mm
   * @return customBeginDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "额度生效起始日期，精确到分钟。 格式：yyyy-MM-dd HH:mm")

  public String getCustomBeginDate() {
    return customBeginDate;
  }


  public void setCustomBeginDate(String customBeginDate) {
    this.customBeginDate = customBeginDate;
  }


  public JointAccountQuotaRespDTO customEndDate(String customEndDate) {
    
    this.customEndDate = customEndDate;
    return this;
  }

   /**
   * 额度失效结束日期，精确到分钟。 格式：yyyy-MM-dd HH:mm
   * @return customEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "额度失效结束日期，精确到分钟。 格式：yyyy-MM-dd HH:mm")

  public String getCustomEndDate() {
    return customEndDate;
  }


  public void setCustomEndDate(String customEndDate) {
    this.customEndDate = customEndDate;
  }


  public JointAccountQuotaRespDTO quotaDimension(String quotaDimension) {
    
    this.quotaDimension = quotaDimension;
    return this;
  }

   /**
   * 额度维度
   * @return quotaDimension
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "额度维度")

  public String getQuotaDimension() {
    return quotaDimension;
  }


  public void setQuotaDimension(String quotaDimension) {
    this.quotaDimension = quotaDimension;
  }


  public JointAccountQuotaRespDTO quotaRemain(String quotaRemain) {
    
    this.quotaRemain = quotaRemain;
    return this;
  }

   /**
   * 剩余额度
   * @return quotaRemain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "剩余额度")

  public String getQuotaRemain() {
    return quotaRemain;
  }


  public void setQuotaRemain(String quotaRemain) {
    this.quotaRemain = quotaRemain;
  }


  public JointAccountQuotaRespDTO quotaRemainCount(String quotaRemainCount) {
    
    this.quotaRemainCount = quotaRemainCount;
    return this;
  }

   /**
   * 展示额度剩余可用次数，-1表示无限次
   * @return quotaRemainCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "展示额度剩余可用次数，-1表示无限次")

  public String getQuotaRemainCount() {
    return quotaRemainCount;
  }


  public void setQuotaRemainCount(String quotaRemainCount) {
    this.quotaRemainCount = quotaRemainCount;
  }


  public JointAccountQuotaRespDTO quotaTotal(String quotaTotal) {
    
    this.quotaTotal = quotaTotal;
    return this;
  }

   /**
   * 协议额度
   * @return quotaTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "协议额度")

  public String getQuotaTotal() {
    return quotaTotal;
  }


  public void setQuotaTotal(String quotaTotal) {
    this.quotaTotal = quotaTotal;
  }


  public JointAccountQuotaRespDTO quotaUsed(String quotaUsed) {
    
    this.quotaUsed = quotaUsed;
    return this;
  }

   /**
   * 已用额度
   * @return quotaUsed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "已用额度")

  public String getQuotaUsed() {
    return quotaUsed;
  }


  public void setQuotaUsed(String quotaUsed) {
    this.quotaUsed = quotaUsed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JointAccountQuotaRespDTO jointAccountQuotaRespDTO = (JointAccountQuotaRespDTO) o;
    return Objects.equals(this.customBeginDate, jointAccountQuotaRespDTO.customBeginDate) &&
        Objects.equals(this.customEndDate, jointAccountQuotaRespDTO.customEndDate) &&
        Objects.equals(this.quotaDimension, jointAccountQuotaRespDTO.quotaDimension) &&
        Objects.equals(this.quotaRemain, jointAccountQuotaRespDTO.quotaRemain) &&
        Objects.equals(this.quotaRemainCount, jointAccountQuotaRespDTO.quotaRemainCount) &&
        Objects.equals(this.quotaTotal, jointAccountQuotaRespDTO.quotaTotal) &&
        Objects.equals(this.quotaUsed, jointAccountQuotaRespDTO.quotaUsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customBeginDate, customEndDate, quotaDimension, quotaRemain, quotaRemainCount, quotaTotal, quotaUsed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JointAccountQuotaRespDTO {\n");
    sb.append("    customBeginDate: ").append(toIndentedString(customBeginDate)).append("\n");
    sb.append("    customEndDate: ").append(toIndentedString(customEndDate)).append("\n");
    sb.append("    quotaDimension: ").append(toIndentedString(quotaDimension)).append("\n");
    sb.append("    quotaRemain: ").append(toIndentedString(quotaRemain)).append("\n");
    sb.append("    quotaRemainCount: ").append(toIndentedString(quotaRemainCount)).append("\n");
    sb.append("    quotaTotal: ").append(toIndentedString(quotaTotal)).append("\n");
    sb.append("    quotaUsed: ").append(toIndentedString(quotaUsed)).append("\n");
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
    openapiFields.add("custom_begin_date");
    openapiFields.add("custom_end_date");
    openapiFields.add("quota_dimension");
    openapiFields.add("quota_remain");
    openapiFields.add("quota_remain_count");
    openapiFields.add("quota_total");
    openapiFields.add("quota_used");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JointAccountQuotaRespDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JointAccountQuotaRespDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JointAccountQuotaRespDTO is not found in the empty JSON string", JointAccountQuotaRespDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JointAccountQuotaRespDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JointAccountQuotaRespDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("custom_begin_date") != null && !jsonObj.get("custom_begin_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_begin_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_begin_date").toString()));
      }
      if (jsonObj.get("custom_end_date") != null && !jsonObj.get("custom_end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_end_date").toString()));
      }
      if (jsonObj.get("quota_dimension") != null && !jsonObj.get("quota_dimension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quota_dimension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quota_dimension").toString()));
      }
      if (jsonObj.get("quota_remain") != null && !jsonObj.get("quota_remain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quota_remain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quota_remain").toString()));
      }
      if (jsonObj.get("quota_remain_count") != null && !jsonObj.get("quota_remain_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quota_remain_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quota_remain_count").toString()));
      }
      if (jsonObj.get("quota_total") != null && !jsonObj.get("quota_total").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quota_total` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quota_total").toString()));
      }
      if (jsonObj.get("quota_used") != null && !jsonObj.get("quota_used").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quota_used` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quota_used").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JointAccountQuotaRespDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JointAccountQuotaRespDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JointAccountQuotaRespDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JointAccountQuotaRespDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<JointAccountQuotaRespDTO>() {
           @Override
           public void write(JsonWriter out, JointAccountQuotaRespDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JointAccountQuotaRespDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JointAccountQuotaRespDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JointAccountQuotaRespDTO
  * @throws IOException if the JSON string is invalid with respect to JointAccountQuotaRespDTO
  */
  public static JointAccountQuotaRespDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JointAccountQuotaRespDTO.class);
  }

 /**
  * Convert an instance of JointAccountQuotaRespDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

