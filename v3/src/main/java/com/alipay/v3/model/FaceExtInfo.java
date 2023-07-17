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
 * FaceExtInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FaceExtInfo {
  public static final String SERIALIZED_NAME_MAX_AGE = "max_age";
  @SerializedName(SERIALIZED_NAME_MAX_AGE)
  private String maxAge;

  public static final String SERIALIZED_NAME_MIN_AGE = "min_age";
  @SerializedName(SERIALIZED_NAME_MIN_AGE)
  private String minAge;

  public static final String SERIALIZED_NAME_QUERY_TYPE = "query_type";
  @SerializedName(SERIALIZED_NAME_QUERY_TYPE)
  private String queryType;

  public FaceExtInfo() { 
  }

  public FaceExtInfo maxAge(String maxAge) {
    
    this.maxAge = maxAge;
    return this;
  }

   /**
   * 年龄区间判断的上限，闭区间
   * @return maxAge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30", value = "年龄区间判断的上限，闭区间")

  public String getMaxAge() {
    return maxAge;
  }


  public void setMaxAge(String maxAge) {
    this.maxAge = maxAge;
  }


  public FaceExtInfo minAge(String minAge) {
    
    this.minAge = minAge;
    return this;
  }

   /**
   * 年龄区间判断的下限，闭区间
   * @return minAge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "年龄区间判断的下限，闭区间")

  public String getMinAge() {
    return minAge;
  }


  public void setMinAge(String minAge) {
    this.minAge = minAge;
  }


  public FaceExtInfo queryType(String queryType) {
    
    this.queryType = queryType;
    return this;
  }

   /**
   * query_type不填, 返回uid  query_type&#x3D;1, 返回手机号  query_type&#x3D;2, 返回图片
   * @return queryType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1;2;3等", value = "query_type不填, 返回uid  query_type=1, 返回手机号  query_type=2, 返回图片")

  public String getQueryType() {
    return queryType;
  }


  public void setQueryType(String queryType) {
    this.queryType = queryType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaceExtInfo faceExtInfo = (FaceExtInfo) o;
    return Objects.equals(this.maxAge, faceExtInfo.maxAge) &&
        Objects.equals(this.minAge, faceExtInfo.minAge) &&
        Objects.equals(this.queryType, faceExtInfo.queryType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxAge, minAge, queryType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaceExtInfo {\n");
    sb.append("    maxAge: ").append(toIndentedString(maxAge)).append("\n");
    sb.append("    minAge: ").append(toIndentedString(minAge)).append("\n");
    sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
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
    openapiFields.add("max_age");
    openapiFields.add("min_age");
    openapiFields.add("query_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FaceExtInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FaceExtInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FaceExtInfo is not found in the empty JSON string", FaceExtInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FaceExtInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FaceExtInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("max_age") != null && !jsonObj.get("max_age").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `max_age` to be a primitive type in the JSON string but got `%s`", jsonObj.get("max_age").toString()));
      }
      if (jsonObj.get("min_age") != null && !jsonObj.get("min_age").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `min_age` to be a primitive type in the JSON string but got `%s`", jsonObj.get("min_age").toString()));
      }
      if (jsonObj.get("query_type") != null && !jsonObj.get("query_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `query_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("query_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FaceExtInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FaceExtInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FaceExtInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FaceExtInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<FaceExtInfo>() {
           @Override
           public void write(JsonWriter out, FaceExtInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FaceExtInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FaceExtInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FaceExtInfo
  * @throws IOException if the JSON string is invalid with respect to FaceExtInfo
  */
  public static FaceExtInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FaceExtInfo.class);
  }

 /**
  * Convert an instance of FaceExtInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

