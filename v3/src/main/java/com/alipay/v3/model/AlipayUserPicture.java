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
 * AlipayUserPicture
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayUserPicture {
  public static final String SERIALIZED_NAME_PICTURE_TYPE = "picture_type";
  @SerializedName(SERIALIZED_NAME_PICTURE_TYPE)
  private String pictureType;

  public static final String SERIALIZED_NAME_PICTURE_URL = "picture_url";
  @SerializedName(SERIALIZED_NAME_PICTURE_URL)
  private String pictureUrl;

  public AlipayUserPicture() { 
  }

  public AlipayUserPicture pictureType(String pictureType) {
    
    this.pictureType = pictureType;
    return this;
  }

   /**
   * 图片类型，包括身份证正反面、营业执照等
   * @return pictureType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "图片类型，包括身份证正反面、营业执照等")

  public String getPictureType() {
    return pictureType;
  }


  public void setPictureType(String pictureType) {
    this.pictureType = pictureType;
  }


  public AlipayUserPicture pictureUrl(String pictureUrl) {
    
    this.pictureUrl = pictureUrl;
    return this;
  }

   /**
   * 用于调用alipay.user.certify.image.fetch接口，获取图片资源
   * @return pictureUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用于调用alipay.user.certify.image.fetch接口，获取图片资源")

  public String getPictureUrl() {
    return pictureUrl;
  }


  public void setPictureUrl(String pictureUrl) {
    this.pictureUrl = pictureUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayUserPicture alipayUserPicture = (AlipayUserPicture) o;
    return Objects.equals(this.pictureType, alipayUserPicture.pictureType) &&
        Objects.equals(this.pictureUrl, alipayUserPicture.pictureUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pictureType, pictureUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayUserPicture {\n");
    sb.append("    pictureType: ").append(toIndentedString(pictureType)).append("\n");
    sb.append("    pictureUrl: ").append(toIndentedString(pictureUrl)).append("\n");
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
    openapiFields.add("picture_type");
    openapiFields.add("picture_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayUserPicture
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayUserPicture.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayUserPicture is not found in the empty JSON string", AlipayUserPicture.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayUserPicture.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayUserPicture` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("picture_type") != null && !jsonObj.get("picture_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `picture_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("picture_type").toString()));
      }
      if (jsonObj.get("picture_url") != null && !jsonObj.get("picture_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `picture_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("picture_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayUserPicture.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayUserPicture' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayUserPicture> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayUserPicture.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayUserPicture>() {
           @Override
           public void write(JsonWriter out, AlipayUserPicture value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayUserPicture read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayUserPicture given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayUserPicture
  * @throws IOException if the JSON string is invalid with respect to AlipayUserPicture
  */
  public static AlipayUserPicture fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayUserPicture.class);
  }

 /**
  * Convert an instance of AlipayUserPicture to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

