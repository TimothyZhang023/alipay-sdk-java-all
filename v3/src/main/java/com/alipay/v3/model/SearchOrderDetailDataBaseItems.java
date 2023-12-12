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
 * SearchOrderDetailDataBaseItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchOrderDetailDataBaseItems {
  public static final String SERIALIZED_NAME_CAN_SEARCH = "can_search";
  @SerializedName(SERIALIZED_NAME_CAN_SEARCH)
  private String canSearch;

  public static final String SERIALIZED_NAME_DESC = "desc";
  @SerializedName(SERIALIZED_NAME_DESC)
  private String desc;

  public static final String SERIALIZED_NAME_IMG = "img";
  @SerializedName(SERIALIZED_NAME_IMG)
  private String img;

  public static final String SERIALIZED_NAME_KEY_WORD = "key_word";
  @SerializedName(SERIALIZED_NAME_KEY_WORD)
  private String keyWord;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_SERV_CAN_SEARCH = "serv_can_search";
  @SerializedName(SERIALIZED_NAME_SERV_CAN_SEARCH)
  private String servCanSearch;

  public static final String SERIALIZED_NAME_SERV_SEARCH_KEYWORDS = "serv_search_keywords";
  @SerializedName(SERIALIZED_NAME_SERV_SEARCH_KEYWORDS)
  private String servSearchKeywords;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public SearchOrderDetailDataBaseItems() { 
  }

  public SearchOrderDetailDataBaseItems canSearch(String canSearch) {
    
    this.canSearch = canSearch;
    return this;
  }

   /**
   * 搜索可见性
   * @return canSearch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "搜索可见性")

  public String getCanSearch() {
    return canSearch;
  }


  public void setCanSearch(String canSearch) {
    this.canSearch = canSearch;
  }


  public SearchOrderDetailDataBaseItems desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * 描述信息
   * @return desc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "描述信息", value = "描述信息")

  public String getDesc() {
    return desc;
  }


  public void setDesc(String desc) {
    this.desc = desc;
  }


  public SearchOrderDetailDataBaseItems img(String img) {
    
    this.img = img;
    return this;
  }

   /**
   * img地址
   * @return img
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://appstoreisvpic.alipayobjects.com/prod/37945fc8-d09b-4b3a-a472-4673c55e9dc9.png", value = "img地址")

  public String getImg() {
    return img;
  }


  public void setImg(String img) {
    this.img = img;
  }


  public SearchOrderDetailDataBaseItems keyWord(String keyWord) {
    
    this.keyWord = keyWord;
    return this;
  }

   /**
   * 关键词
   * @return keyWord
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "测试", value = "关键词")

  public String getKeyWord() {
    return keyWord;
  }


  public void setKeyWord(String keyWord) {
    this.keyWord = keyWord;
  }


  public SearchOrderDetailDataBaseItems name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 应用名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "测试1", value = "应用名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SearchOrderDetailDataBaseItems region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * 基础工单详情region
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "基础工单详情region")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public SearchOrderDetailDataBaseItems servCanSearch(String servCanSearch) {
    
    this.servCanSearch = servCanSearch;
    return this;
  }

   /**
   * 搜索可见性
   * @return servCanSearch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "搜索可见性")

  public String getServCanSearch() {
    return servCanSearch;
  }


  public void setServCanSearch(String servCanSearch) {
    this.servCanSearch = servCanSearch;
  }


  public SearchOrderDetailDataBaseItems servSearchKeywords(String servSearchKeywords) {
    
    this.servSearchKeywords = servSearchKeywords;
    return this;
  }

   /**
   * 搜索关键词
   * @return servSearchKeywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "搜索", value = "搜索关键词")

  public String getServSearchKeywords() {
    return servSearchKeywords;
  }


  public void setServSearchKeywords(String servSearchKeywords) {
    this.servSearchKeywords = servSearchKeywords;
  }


  public SearchOrderDetailDataBaseItems templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * 模板id
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WALLET-SEARCH@boxFunctionCommon", value = "模板id")

  public String getTemplateId() {
    return templateId;
  }


  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  public SearchOrderDetailDataBaseItems url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 跳转url链接
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://appstoreisvpic.alipayobjects.com/prod", value = "跳转url链接")

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
    SearchOrderDetailDataBaseItems searchOrderDetailDataBaseItems = (SearchOrderDetailDataBaseItems) o;
    return Objects.equals(this.canSearch, searchOrderDetailDataBaseItems.canSearch) &&
        Objects.equals(this.desc, searchOrderDetailDataBaseItems.desc) &&
        Objects.equals(this.img, searchOrderDetailDataBaseItems.img) &&
        Objects.equals(this.keyWord, searchOrderDetailDataBaseItems.keyWord) &&
        Objects.equals(this.name, searchOrderDetailDataBaseItems.name) &&
        Objects.equals(this.region, searchOrderDetailDataBaseItems.region) &&
        Objects.equals(this.servCanSearch, searchOrderDetailDataBaseItems.servCanSearch) &&
        Objects.equals(this.servSearchKeywords, searchOrderDetailDataBaseItems.servSearchKeywords) &&
        Objects.equals(this.templateId, searchOrderDetailDataBaseItems.templateId) &&
        Objects.equals(this.url, searchOrderDetailDataBaseItems.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canSearch, desc, img, keyWord, name, region, servCanSearch, servSearchKeywords, templateId, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchOrderDetailDataBaseItems {\n");
    sb.append("    canSearch: ").append(toIndentedString(canSearch)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    img: ").append(toIndentedString(img)).append("\n");
    sb.append("    keyWord: ").append(toIndentedString(keyWord)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    servCanSearch: ").append(toIndentedString(servCanSearch)).append("\n");
    sb.append("    servSearchKeywords: ").append(toIndentedString(servSearchKeywords)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
    openapiFields.add("can_search");
    openapiFields.add("desc");
    openapiFields.add("img");
    openapiFields.add("key_word");
    openapiFields.add("name");
    openapiFields.add("region");
    openapiFields.add("serv_can_search");
    openapiFields.add("serv_search_keywords");
    openapiFields.add("template_id");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchOrderDetailDataBaseItems
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SearchOrderDetailDataBaseItems.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchOrderDetailDataBaseItems is not found in the empty JSON string", SearchOrderDetailDataBaseItems.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SearchOrderDetailDataBaseItems.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchOrderDetailDataBaseItems` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("can_search") != null && !jsonObj.get("can_search").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `can_search` to be a primitive type in the JSON string but got `%s`", jsonObj.get("can_search").toString()));
      }
      if (jsonObj.get("desc") != null && !jsonObj.get("desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("desc").toString()));
      }
      if (jsonObj.get("img") != null && !jsonObj.get("img").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `img` to be a primitive type in the JSON string but got `%s`", jsonObj.get("img").toString()));
      }
      if (jsonObj.get("key_word") != null && !jsonObj.get("key_word").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key_word` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key_word").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("region") != null && !jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
      if (jsonObj.get("serv_can_search") != null && !jsonObj.get("serv_can_search").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serv_can_search` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serv_can_search").toString()));
      }
      if (jsonObj.get("serv_search_keywords") != null && !jsonObj.get("serv_search_keywords").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serv_search_keywords` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serv_search_keywords").toString()));
      }
      if (jsonObj.get("template_id") != null && !jsonObj.get("template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_id").toString()));
      }
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchOrderDetailDataBaseItems.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchOrderDetailDataBaseItems' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchOrderDetailDataBaseItems> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchOrderDetailDataBaseItems.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchOrderDetailDataBaseItems>() {
           @Override
           public void write(JsonWriter out, SearchOrderDetailDataBaseItems value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchOrderDetailDataBaseItems read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchOrderDetailDataBaseItems given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchOrderDetailDataBaseItems
  * @throws IOException if the JSON string is invalid with respect to SearchOrderDetailDataBaseItems
  */
  public static SearchOrderDetailDataBaseItems fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchOrderDetailDataBaseItems.class);
  }

 /**
  * Convert an instance of SearchOrderDetailDataBaseItems to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

