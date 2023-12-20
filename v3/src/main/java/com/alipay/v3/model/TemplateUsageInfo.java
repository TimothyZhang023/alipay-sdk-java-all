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
 * TemplateUsageInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TemplateUsageInfo {
  public static final String SERIALIZED_NAME_APP_VERSION = "app_version";
  @SerializedName(SERIALIZED_NAME_APP_VERSION)
  private String appVersion;

  public static final String SERIALIZED_NAME_MINI_APP_ID = "mini_app_id";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID)
  private String miniAppId;

  public TemplateUsageInfo() { 
  }

  public TemplateUsageInfo appVersion(String appVersion) {
    
    this.appVersion = appVersion;
    return this;
  }

   /**
   * 商家小程序版本号
   * @return appVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.0.1", value = "商家小程序版本号")

  public String getAppVersion() {
    return appVersion;
  }


  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }


  public TemplateUsageInfo miniAppId(String miniAppId) {
    
    this.miniAppId = miniAppId;
    return this;
  }

   /**
   * 商家小程序appId
   * @return miniAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018011111111111", value = "商家小程序appId")

  public String getMiniAppId() {
    return miniAppId;
  }


  public void setMiniAppId(String miniAppId) {
    this.miniAppId = miniAppId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateUsageInfo templateUsageInfo = (TemplateUsageInfo) o;
    return Objects.equals(this.appVersion, templateUsageInfo.appVersion) &&
        Objects.equals(this.miniAppId, templateUsageInfo.miniAppId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appVersion, miniAppId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateUsageInfo {\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    miniAppId: ").append(toIndentedString(miniAppId)).append("\n");
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
    openapiFields.add("app_version");
    openapiFields.add("mini_app_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TemplateUsageInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TemplateUsageInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateUsageInfo is not found in the empty JSON string", TemplateUsageInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TemplateUsageInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TemplateUsageInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("app_version") != null && !jsonObj.get("app_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_version").toString()));
      }
      if (jsonObj.get("mini_app_id") != null && !jsonObj.get("mini_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateUsageInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateUsageInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateUsageInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateUsageInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateUsageInfo>() {
           @Override
           public void write(JsonWriter out, TemplateUsageInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TemplateUsageInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TemplateUsageInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TemplateUsageInfo
  * @throws IOException if the JSON string is invalid with respect to TemplateUsageInfo
  */
  public static TemplateUsageInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateUsageInfo.class);
  }

 /**
  * Convert an instance of TemplateUsageInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

