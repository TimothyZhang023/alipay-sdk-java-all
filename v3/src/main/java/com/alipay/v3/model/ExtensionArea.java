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
 * ExtensionArea
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExtensionArea {
  public static final String SERIALIZED_NAME_GOTO_URL = "goto_url";
  @SerializedName(SERIALIZED_NAME_GOTO_URL)
  private String gotoUrl;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public ExtensionArea() { 
  }

  public ExtensionArea gotoUrl(String gotoUrl) {
    
    this.gotoUrl = gotoUrl;
    return this;
  }

   /**
   * 跳转链接，当type为\&quot;image\&quot;时必传，必须是https或alipays开头的url链接。已废弃
   * @return gotoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "跳转链接，当type为\"image\"时必传，必须是https或alipays开头的url链接。已废弃")

  public String getGotoUrl() {
    return gotoUrl;
  }


  public void setGotoUrl(String gotoUrl) {
    this.gotoUrl = gotoUrl;
  }


  public ExtensionArea height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * 扩展区高度，当type值为\&quot;h5\&quot;时必填，取值范围为200-500的整数
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "扩展区高度，当type值为\"h5\"时必填，取值范围为200-500的整数")

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public ExtensionArea name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 扩展区名字
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "扩展区名字")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ExtensionArea type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 扩展区类型，当前支持的值为h5，表示扩展区内容类型为h5。
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "扩展区类型，当前支持的值为h5，表示扩展区内容类型为h5。")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ExtensionArea url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 扩展区url，传入h5页面url，必须是https开头的链接
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "扩展区url，传入h5页面url，必须是https开头的链接")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionArea extensionArea = (ExtensionArea) o;
    return Objects.equals(this.gotoUrl, extensionArea.gotoUrl) &&
        Objects.equals(this.height, extensionArea.height) &&
        Objects.equals(this.name, extensionArea.name) &&
        Objects.equals(this.type, extensionArea.type) &&
        Objects.equals(this.url, extensionArea.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gotoUrl, height, name, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionArea {\n");
    sb.append("    gotoUrl: ").append(toIndentedString(gotoUrl)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("goto_url");
    openapiFields.add("height");
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExtensionArea
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ExtensionArea.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExtensionArea is not found in the empty JSON string", ExtensionArea.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ExtensionArea.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExtensionArea` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("goto_url") != null && !jsonObj.get("goto_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goto_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goto_url").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExtensionArea.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExtensionArea' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExtensionArea> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExtensionArea.class));

       return (TypeAdapter<T>) new TypeAdapter<ExtensionArea>() {
           @Override
           public void write(JsonWriter out, ExtensionArea value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExtensionArea read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExtensionArea given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExtensionArea
  * @throws IOException if the JSON string is invalid with respect to ExtensionArea
  */
  public static ExtensionArea fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExtensionArea.class);
  }

 /**
  * Convert an instance of ExtensionArea to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

