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
import java.util.ArrayList;
import java.util.List;

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
 * AlipayOpenSearchAppkeywordApplyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenSearchAppkeywordApplyModel {
  public static final String SERIALIZED_NAME_CONFIG_ID = "config_id";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private String configId;

  public static final String SERIALIZED_NAME_KEY_WORDS = "key_words";
  @SerializedName(SERIALIZED_NAME_KEY_WORDS)
  private List<String> keyWords = null;

  public static final String SERIALIZED_NAME_TARGET_APPID = "target_appid";
  @SerializedName(SERIALIZED_NAME_TARGET_APPID)
  private String targetAppid;

  public AlipayOpenSearchAppkeywordApplyModel() { 
  }

  public AlipayOpenSearchAppkeywordApplyModel configId(String configId) {
    
    this.configId = configId;
    return this;
  }

   /**
   * 关键词配置id，由支付宝生成，关键词申请通过后会通知接口返回，也可以申请单状态获取
   * @return configId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20221108000000245181", value = "关键词配置id，由支付宝生成，关键词申请通过后会通知接口返回，也可以申请单状态获取")

  public String getConfigId() {
    return configId;
  }


  public void setConfigId(String configId) {
    this.configId = configId;
  }


  public AlipayOpenSearchAppkeywordApplyModel keyWords(List<String> keyWords) {
    
    this.keyWords = keyWords;
    return this;
  }

  public AlipayOpenSearchAppkeywordApplyModel addKeyWordsItem(String keyWordsItem) {
    if (this.keyWords == null) {
      this.keyWords = new ArrayList<>();
    }
    this.keyWords.add(keyWordsItem);
    return this;
  }

   /**
   * 提报的关键词
   * @return keyWords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"关键词1\",\"关键词2\"]", value = "提报的关键词")

  public List<String> getKeyWords() {
    return keyWords;
  }


  public void setKeyWords(List<String> keyWords) {
    this.keyWords = keyWords;
  }


  public AlipayOpenSearchAppkeywordApplyModel targetAppid(String targetAppid) {
    
    this.targetAppid = targetAppid;
    return this;
  }

   /**
   * 小程序id
   * @return targetAppid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021001120654127", value = "小程序id")

  public String getTargetAppid() {
    return targetAppid;
  }


  public void setTargetAppid(String targetAppid) {
    this.targetAppid = targetAppid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenSearchAppkeywordApplyModel alipayOpenSearchAppkeywordApplyModel = (AlipayOpenSearchAppkeywordApplyModel) o;
    return Objects.equals(this.configId, alipayOpenSearchAppkeywordApplyModel.configId) &&
        Objects.equals(this.keyWords, alipayOpenSearchAppkeywordApplyModel.keyWords) &&
        Objects.equals(this.targetAppid, alipayOpenSearchAppkeywordApplyModel.targetAppid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configId, keyWords, targetAppid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenSearchAppkeywordApplyModel {\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    keyWords: ").append(toIndentedString(keyWords)).append("\n");
    sb.append("    targetAppid: ").append(toIndentedString(targetAppid)).append("\n");
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
    openapiFields.add("config_id");
    openapiFields.add("key_words");
    openapiFields.add("target_appid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenSearchAppkeywordApplyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenSearchAppkeywordApplyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenSearchAppkeywordApplyModel is not found in the empty JSON string", AlipayOpenSearchAppkeywordApplyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenSearchAppkeywordApplyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenSearchAppkeywordApplyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("config_id") != null && !jsonObj.get("config_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `config_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("config_id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("key_words") != null && !jsonObj.get("key_words").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `key_words` to be an array in the JSON string but got `%s`", jsonObj.get("key_words").toString()));
      }
      if (jsonObj.get("target_appid") != null && !jsonObj.get("target_appid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_appid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_appid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenSearchAppkeywordApplyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenSearchAppkeywordApplyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenSearchAppkeywordApplyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenSearchAppkeywordApplyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenSearchAppkeywordApplyModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenSearchAppkeywordApplyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenSearchAppkeywordApplyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenSearchAppkeywordApplyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenSearchAppkeywordApplyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenSearchAppkeywordApplyModel
  */
  public static AlipayOpenSearchAppkeywordApplyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenSearchAppkeywordApplyModel.class);
  }

 /**
  * Convert an instance of AlipayOpenSearchAppkeywordApplyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

