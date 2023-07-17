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
import com.alipay.v3.model.TemplateActionMiniAppUrlDTO;
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
 * TemplateActionInfoDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TemplateActionInfoDTO {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_MINI_APP_URL = "mini_app_url";
  @SerializedName(SERIALIZED_NAME_MINI_APP_URL)
  private TemplateActionMiniAppUrlDTO miniAppUrl;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_URL_TYPE = "url_type";
  @SerializedName(SERIALIZED_NAME_URL_TYPE)
  private String urlType;

  public TemplateActionInfoDTO() { 
  }

  public TemplateActionInfoDTO code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * 行动点业务CODE，商户自定义
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "行动点业务CODE，商户自定义")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public TemplateActionInfoDTO miniAppUrl(TemplateActionMiniAppUrlDTO miniAppUrl) {
    
    this.miniAppUrl = miniAppUrl;
    return this;
  }

   /**
   * Get miniAppUrl
   * @return miniAppUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TemplateActionMiniAppUrlDTO getMiniAppUrl() {
    return miniAppUrl;
  }


  public void setMiniAppUrl(TemplateActionMiniAppUrlDTO miniAppUrl) {
    this.miniAppUrl = miniAppUrl;
  }


  public TemplateActionInfoDTO text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * 行动点展示文案
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "行动点展示文案")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public TemplateActionInfoDTO url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 行动点跳转链接，当url_type取\&quot;url\&quot;或不填时必填
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "行动点跳转链接，当url_type取\"url\"或不填时必填")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public TemplateActionInfoDTO urlType(String urlType) {
    
    this.urlType = urlType;
    return this;
  }

   /**
   * 跳转链接类型，当前支持url和miniAppUrl，不填则默认为url类型：  url：对应填写url参数，支持http(s)和支付宝schema地址等；  miniAppUrl: 对应填写mini_app_url参数，跳转至指定的支付宝小程序页面
   * @return urlType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "跳转链接类型，当前支持url和miniAppUrl，不填则默认为url类型：  url：对应填写url参数，支持http(s)和支付宝schema地址等；  miniAppUrl: 对应填写mini_app_url参数，跳转至指定的支付宝小程序页面")

  public String getUrlType() {
    return urlType;
  }


  public void setUrlType(String urlType) {
    this.urlType = urlType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateActionInfoDTO templateActionInfoDTO = (TemplateActionInfoDTO) o;
    return Objects.equals(this.code, templateActionInfoDTO.code) &&
        Objects.equals(this.miniAppUrl, templateActionInfoDTO.miniAppUrl) &&
        Objects.equals(this.text, templateActionInfoDTO.text) &&
        Objects.equals(this.url, templateActionInfoDTO.url) &&
        Objects.equals(this.urlType, templateActionInfoDTO.urlType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, miniAppUrl, text, url, urlType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateActionInfoDTO {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    miniAppUrl: ").append(toIndentedString(miniAppUrl)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    urlType: ").append(toIndentedString(urlType)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("mini_app_url");
    openapiFields.add("text");
    openapiFields.add("url");
    openapiFields.add("url_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TemplateActionInfoDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TemplateActionInfoDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateActionInfoDTO is not found in the empty JSON string", TemplateActionInfoDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TemplateActionInfoDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TemplateActionInfoDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("code") != null && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      // validate the optional field `mini_app_url`
      if (jsonObj.getAsJsonObject("mini_app_url") != null) {
        TemplateActionMiniAppUrlDTO.validateJsonObject(jsonObj.getAsJsonObject("mini_app_url"));
      }
      if (jsonObj.get("text") != null && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (jsonObj.get("url_type") != null && !jsonObj.get("url_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateActionInfoDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateActionInfoDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateActionInfoDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateActionInfoDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateActionInfoDTO>() {
           @Override
           public void write(JsonWriter out, TemplateActionInfoDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TemplateActionInfoDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TemplateActionInfoDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TemplateActionInfoDTO
  * @throws IOException if the JSON string is invalid with respect to TemplateActionInfoDTO
  */
  public static TemplateActionInfoDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateActionInfoDTO.class);
  }

 /**
  * Convert an instance of TemplateActionInfoDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

