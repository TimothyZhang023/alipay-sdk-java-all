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
 * ShopRecommendInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ShopRecommendInfo {
  public static final String SERIALIZED_NAME_RECOMMEND = "recommend";
  @SerializedName(SERIALIZED_NAME_RECOMMEND)
  private String recommend;

  public static final String SERIALIZED_NAME_RECOMMEND_ADDRESS = "recommend_address";
  @SerializedName(SERIALIZED_NAME_RECOMMEND_ADDRESS)
  private String recommendAddress;

  public static final String SERIALIZED_NAME_RECOMMEND_LATITUDE = "recommend_latitude";
  @SerializedName(SERIALIZED_NAME_RECOMMEND_LATITUDE)
  private String recommendLatitude;

  public static final String SERIALIZED_NAME_RECOMMEND_LONGTITUDE = "recommend_longtitude";
  @SerializedName(SERIALIZED_NAME_RECOMMEND_LONGTITUDE)
  private String recommendLongtitude;

  public static final String SERIALIZED_NAME_RECOMMEND_NAME = "recommend_name";
  @SerializedName(SERIALIZED_NAME_RECOMMEND_NAME)
  private String recommendName;

  public static final String SERIALIZED_NAME_UNCONFIDENCE_REASON = "unconfidence_reason";
  @SerializedName(SERIALIZED_NAME_UNCONFIDENCE_REASON)
  private String unconfidenceReason;

  public ShopRecommendInfo() { 
  }

  public ShopRecommendInfo recommend(String recommend) {
    
    this.recommend = recommend;
    return this;
  }

   /**
   * 门店修改建议
   * @return recommend
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "请修改店名为真实经营的门店名称，如有分店，请修改成品牌（分店名），如大润发（杭州西溪店）", value = "门店修改建议")

  public String getRecommend() {
    return recommend;
  }


  public void setRecommend(String recommend) {
    this.recommend = recommend;
  }


  public ShopRecommendInfo recommendAddress(String recommendAddress) {
    
    this.recommendAddress = recommendAddress;
    return this;
  }

   /**
   * 推荐详细地址
   * @return recommendAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "杭州市西湖区**路**号", value = "推荐详细地址")

  public String getRecommendAddress() {
    return recommendAddress;
  }


  public void setRecommendAddress(String recommendAddress) {
    this.recommendAddress = recommendAddress;
  }


  public ShopRecommendInfo recommendLatitude(String recommendLatitude) {
    
    this.recommendLatitude = recommendLatitude;
    return this;
  }

   /**
   * 推荐纬度
   * @return recommendLatitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30.111", value = "推荐纬度")

  public String getRecommendLatitude() {
    return recommendLatitude;
  }


  public void setRecommendLatitude(String recommendLatitude) {
    this.recommendLatitude = recommendLatitude;
  }


  public ShopRecommendInfo recommendLongtitude(String recommendLongtitude) {
    
    this.recommendLongtitude = recommendLongtitude;
    return this;
  }

   /**
   * 推荐经度
   * @return recommendLongtitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "120.3333", value = "推荐经度")

  public String getRecommendLongtitude() {
    return recommendLongtitude;
  }


  public void setRecommendLongtitude(String recommendLongtitude) {
    this.recommendLongtitude = recommendLongtitude;
  }


  public ShopRecommendInfo recommendName(String recommendName) {
    
    this.recommendName = recommendName;
    return this;
  }

   /**
   * 推荐门店名称
   * @return recommendName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "大润发（杭州西溪店）", value = "推荐门店名称")

  public String getRecommendName() {
    return recommendName;
  }


  public void setRecommendName(String recommendName) {
    this.recommendName = recommendName;
  }


  public ShopRecommendInfo unconfidenceReason(String unconfidenceReason) {
    
    this.unconfidenceReason = unconfidenceReason;
    return this;
  }

   /**
   * 门店不置信原因
   * @return unconfidenceReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "店名不准确", value = "门店不置信原因")

  public String getUnconfidenceReason() {
    return unconfidenceReason;
  }


  public void setUnconfidenceReason(String unconfidenceReason) {
    this.unconfidenceReason = unconfidenceReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopRecommendInfo shopRecommendInfo = (ShopRecommendInfo) o;
    return Objects.equals(this.recommend, shopRecommendInfo.recommend) &&
        Objects.equals(this.recommendAddress, shopRecommendInfo.recommendAddress) &&
        Objects.equals(this.recommendLatitude, shopRecommendInfo.recommendLatitude) &&
        Objects.equals(this.recommendLongtitude, shopRecommendInfo.recommendLongtitude) &&
        Objects.equals(this.recommendName, shopRecommendInfo.recommendName) &&
        Objects.equals(this.unconfidenceReason, shopRecommendInfo.unconfidenceReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recommend, recommendAddress, recommendLatitude, recommendLongtitude, recommendName, unconfidenceReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopRecommendInfo {\n");
    sb.append("    recommend: ").append(toIndentedString(recommend)).append("\n");
    sb.append("    recommendAddress: ").append(toIndentedString(recommendAddress)).append("\n");
    sb.append("    recommendLatitude: ").append(toIndentedString(recommendLatitude)).append("\n");
    sb.append("    recommendLongtitude: ").append(toIndentedString(recommendLongtitude)).append("\n");
    sb.append("    recommendName: ").append(toIndentedString(recommendName)).append("\n");
    sb.append("    unconfidenceReason: ").append(toIndentedString(unconfidenceReason)).append("\n");
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
    openapiFields.add("recommend");
    openapiFields.add("recommend_address");
    openapiFields.add("recommend_latitude");
    openapiFields.add("recommend_longtitude");
    openapiFields.add("recommend_name");
    openapiFields.add("unconfidence_reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShopRecommendInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ShopRecommendInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShopRecommendInfo is not found in the empty JSON string", ShopRecommendInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ShopRecommendInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShopRecommendInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("recommend") != null && !jsonObj.get("recommend").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recommend` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recommend").toString()));
      }
      if (jsonObj.get("recommend_address") != null && !jsonObj.get("recommend_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recommend_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recommend_address").toString()));
      }
      if (jsonObj.get("recommend_latitude") != null && !jsonObj.get("recommend_latitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recommend_latitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recommend_latitude").toString()));
      }
      if (jsonObj.get("recommend_longtitude") != null && !jsonObj.get("recommend_longtitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recommend_longtitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recommend_longtitude").toString()));
      }
      if (jsonObj.get("recommend_name") != null && !jsonObj.get("recommend_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recommend_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recommend_name").toString()));
      }
      if (jsonObj.get("unconfidence_reason") != null && !jsonObj.get("unconfidence_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unconfidence_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unconfidence_reason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShopRecommendInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShopRecommendInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShopRecommendInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShopRecommendInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ShopRecommendInfo>() {
           @Override
           public void write(JsonWriter out, ShopRecommendInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShopRecommendInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShopRecommendInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShopRecommendInfo
  * @throws IOException if the JSON string is invalid with respect to ShopRecommendInfo
  */
  public static ShopRecommendInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShopRecommendInfo.class);
  }

 /**
  * Convert an instance of ShopRecommendInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

