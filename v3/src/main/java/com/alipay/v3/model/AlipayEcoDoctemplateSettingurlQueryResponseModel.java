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
 * AlipayEcoDoctemplateSettingurlQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEcoDoctemplateSettingurlQueryResponseModel {
  public static final String SERIALIZED_NAME_SETTING_URL = "setting_url";
  @SerializedName(SERIALIZED_NAME_SETTING_URL)
  private String settingUrl;

  public AlipayEcoDoctemplateSettingurlQueryResponseModel() { 
  }

  public AlipayEcoDoctemplateSettingurlQueryResponseModel settingUrl(String settingUrl) {
    
    this.settingUrl = settingUrl;
    return this;
  }

   /**
   * 模板设置地址
   * @return settingUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://t.tsign.cn/9rT0KvuVQdDJ", value = "模板设置地址")

  public String getSettingUrl() {
    return settingUrl;
  }


  public void setSettingUrl(String settingUrl) {
    this.settingUrl = settingUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEcoDoctemplateSettingurlQueryResponseModel alipayEcoDoctemplateSettingurlQueryResponseModel = (AlipayEcoDoctemplateSettingurlQueryResponseModel) o;
    return Objects.equals(this.settingUrl, alipayEcoDoctemplateSettingurlQueryResponseModel.settingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settingUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEcoDoctemplateSettingurlQueryResponseModel {\n");
    sb.append("    settingUrl: ").append(toIndentedString(settingUrl)).append("\n");
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
    openapiFields.add("setting_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEcoDoctemplateSettingurlQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEcoDoctemplateSettingurlQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEcoDoctemplateSettingurlQueryResponseModel is not found in the empty JSON string", AlipayEcoDoctemplateSettingurlQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEcoDoctemplateSettingurlQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEcoDoctemplateSettingurlQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("setting_url") != null && !jsonObj.get("setting_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `setting_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("setting_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEcoDoctemplateSettingurlQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEcoDoctemplateSettingurlQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEcoDoctemplateSettingurlQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEcoDoctemplateSettingurlQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEcoDoctemplateSettingurlQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEcoDoctemplateSettingurlQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEcoDoctemplateSettingurlQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEcoDoctemplateSettingurlQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEcoDoctemplateSettingurlQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEcoDoctemplateSettingurlQueryResponseModel
  */
  public static AlipayEcoDoctemplateSettingurlQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEcoDoctemplateSettingurlQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEcoDoctemplateSettingurlQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

