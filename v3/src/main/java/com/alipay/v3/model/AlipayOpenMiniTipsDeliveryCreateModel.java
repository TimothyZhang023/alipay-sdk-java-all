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
 * AlipayOpenMiniTipsDeliveryCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniTipsDeliveryCreateModel {
  public static final String SERIALIZED_NAME_DELIVERY_CONTENT = "delivery_content";
  @SerializedName(SERIALIZED_NAME_DELIVERY_CONTENT)
  private String deliveryContent;

  public static final String SERIALIZED_NAME_DELIVERY_NAME = "delivery_name";
  @SerializedName(SERIALIZED_NAME_DELIVERY_NAME)
  private String deliveryName;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_MATCH_TYPE = "match_type";
  @SerializedName(SERIALIZED_NAME_MATCH_TYPE)
  private String matchType;

  public static final String SERIALIZED_NAME_MATCH_URL = "match_url";
  @SerializedName(SERIALIZED_NAME_MATCH_URL)
  private String matchUrl;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public AlipayOpenMiniTipsDeliveryCreateModel() { 
  }

  public AlipayOpenMiniTipsDeliveryCreateModel deliveryContent(String deliveryContent) {
    
    this.deliveryContent = deliveryContent;
    return this;
  }

   /**
   * 收藏引导文案内容，不得超过14个字
   * @return deliveryContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "点击收藏，下次使用更方便", value = "收藏引导文案内容，不得超过14个字")

  public String getDeliveryContent() {
    return deliveryContent;
  }


  public void setDeliveryContent(String deliveryContent) {
    this.deliveryContent = deliveryContent;
  }


  public AlipayOpenMiniTipsDeliveryCreateModel deliveryName(String deliveryName) {
    
    this.deliveryName = deliveryName;
    return this;
  }

   /**
   * 收藏引导活动名称
   * @return deliveryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "收藏引导首页投放活动", value = "收藏引导活动名称")

  public String getDeliveryName() {
    return deliveryName;
  }


  public void setDeliveryName(String deliveryName) {
    this.deliveryName = deliveryName;
  }


  public AlipayOpenMiniTipsDeliveryCreateModel endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 活动结束时间
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-12-31 15:23:43", value = "活动结束时间")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public AlipayOpenMiniTipsDeliveryCreateModel matchType(String matchType) {
    
    this.matchType = matchType;
    return this;
  }

   /**
   * 匹配类型
   * @return matchType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TARGETURL", value = "匹配类型")

  public String getMatchType() {
    return matchType;
  }


  public void setMatchType(String matchType) {
    this.matchType = matchType;
  }


  public AlipayOpenMiniTipsDeliveryCreateModel matchUrl(String matchUrl) {
    
    this.matchUrl = matchUrl;
    return this;
  }

   /**
   * 目标页面地址
   * @return matchUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/page/web", value = "目标页面地址")

  public String getMatchUrl() {
    return matchUrl;
  }


  public void setMatchUrl(String matchUrl) {
    this.matchUrl = matchUrl;
  }


  public AlipayOpenMiniTipsDeliveryCreateModel startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 活动开始时间
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-11-25 15:23:43", value = "活动开始时间")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniTipsDeliveryCreateModel alipayOpenMiniTipsDeliveryCreateModel = (AlipayOpenMiniTipsDeliveryCreateModel) o;
    return Objects.equals(this.deliveryContent, alipayOpenMiniTipsDeliveryCreateModel.deliveryContent) &&
        Objects.equals(this.deliveryName, alipayOpenMiniTipsDeliveryCreateModel.deliveryName) &&
        Objects.equals(this.endTime, alipayOpenMiniTipsDeliveryCreateModel.endTime) &&
        Objects.equals(this.matchType, alipayOpenMiniTipsDeliveryCreateModel.matchType) &&
        Objects.equals(this.matchUrl, alipayOpenMiniTipsDeliveryCreateModel.matchUrl) &&
        Objects.equals(this.startTime, alipayOpenMiniTipsDeliveryCreateModel.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryContent, deliveryName, endTime, matchType, matchUrl, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniTipsDeliveryCreateModel {\n");
    sb.append("    deliveryContent: ").append(toIndentedString(deliveryContent)).append("\n");
    sb.append("    deliveryName: ").append(toIndentedString(deliveryName)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    matchUrl: ").append(toIndentedString(matchUrl)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("delivery_content");
    openapiFields.add("delivery_name");
    openapiFields.add("end_time");
    openapiFields.add("match_type");
    openapiFields.add("match_url");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniTipsDeliveryCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniTipsDeliveryCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniTipsDeliveryCreateModel is not found in the empty JSON string", AlipayOpenMiniTipsDeliveryCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniTipsDeliveryCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniTipsDeliveryCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("delivery_content") != null && !jsonObj.get("delivery_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delivery_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delivery_content").toString()));
      }
      if (jsonObj.get("delivery_name") != null && !jsonObj.get("delivery_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delivery_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delivery_name").toString()));
      }
      if (jsonObj.get("end_time") != null && !jsonObj.get("end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_time").toString()));
      }
      if (jsonObj.get("match_type") != null && !jsonObj.get("match_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `match_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("match_type").toString()));
      }
      if (jsonObj.get("match_url") != null && !jsonObj.get("match_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `match_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("match_url").toString()));
      }
      if (jsonObj.get("start_time") != null && !jsonObj.get("start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_time").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniTipsDeliveryCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniTipsDeliveryCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniTipsDeliveryCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniTipsDeliveryCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniTipsDeliveryCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniTipsDeliveryCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniTipsDeliveryCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniTipsDeliveryCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniTipsDeliveryCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniTipsDeliveryCreateModel
  */
  public static AlipayOpenMiniTipsDeliveryCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniTipsDeliveryCreateModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniTipsDeliveryCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

