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
 * ItemExtInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ItemExtInfo {
  public static final String SERIALIZED_NAME_EXT_KEY = "ext_key";
  @SerializedName(SERIALIZED_NAME_EXT_KEY)
  private String extKey;

  public static final String SERIALIZED_NAME_EXT_VALUE = "ext_value";
  @SerializedName(SERIALIZED_NAME_EXT_VALUE)
  private String extValue;

  public ItemExtInfo() { 
  }

  public ItemExtInfo extKey(String extKey) {
    
    this.extKey = extKey;
    return this;
  }

   /**
   * 扩展信息的key
   * @return extKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "扩展信息的key")

  public String getExtKey() {
    return extKey;
  }


  public void setExtKey(String extKey) {
    this.extKey = extKey;
  }


  public ItemExtInfo extValue(String extValue) {
    
    this.extValue = extValue;
    return this;
  }

   /**
   * 扩展信息的值
   * @return extValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "扩展信息的值")

  public String getExtValue() {
    return extValue;
  }


  public void setExtValue(String extValue) {
    this.extValue = extValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemExtInfo itemExtInfo = (ItemExtInfo) o;
    return Objects.equals(this.extKey, itemExtInfo.extKey) &&
        Objects.equals(this.extValue, itemExtInfo.extValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extKey, extValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemExtInfo {\n");
    sb.append("    extKey: ").append(toIndentedString(extKey)).append("\n");
    sb.append("    extValue: ").append(toIndentedString(extValue)).append("\n");
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
    openapiFields.add("ext_key");
    openapiFields.add("ext_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ItemExtInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ItemExtInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ItemExtInfo is not found in the empty JSON string", ItemExtInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ItemExtInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ItemExtInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("ext_key") != null && !jsonObj.get("ext_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_key").toString()));
      }
      if (jsonObj.get("ext_value") != null && !jsonObj.get("ext_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ItemExtInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ItemExtInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ItemExtInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ItemExtInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ItemExtInfo>() {
           @Override
           public void write(JsonWriter out, ItemExtInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ItemExtInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ItemExtInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ItemExtInfo
  * @throws IOException if the JSON string is invalid with respect to ItemExtInfo
  */
  public static ItemExtInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ItemExtInfo.class);
  }

 /**
  * Convert an instance of ItemExtInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

