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
import com.alipay.v3.model.SearchAbilityOrderData;
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
 * AbilityPageQueryDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AbilityPageQueryDTO {
  public static final String SERIALIZED_NAME_PAGE_DATA = "page_data";
  @SerializedName(SERIALIZED_NAME_PAGE_DATA)
  private List<SearchAbilityOrderData> pageData = null;

  public static final String SERIALIZED_NAME_PAGE_NUM = "page_num";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private String pageNum;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private String pageSize;

  public static final String SERIALIZED_NAME_TOTAL_NUMBER = "total_number";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUMBER)
  private Integer totalNumber;

  public AbilityPageQueryDTO() { 
  }

  public AbilityPageQueryDTO pageData(List<SearchAbilityOrderData> pageData) {
    
    this.pageData = pageData;
    return this;
  }

  public AbilityPageQueryDTO addPageDataItem(SearchAbilityOrderData pageDataItem) {
    if (this.pageData == null) {
      this.pageData = new ArrayList<>();
    }
    this.pageData.add(pageDataItem);
    return this;
  }

   /**
   * 搜索运营列表的分页数据
   * @return pageData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "搜索运营列表的分页数据")

  public List<SearchAbilityOrderData> getPageData() {
    return pageData;
  }


  public void setPageData(List<SearchAbilityOrderData> pageData) {
    this.pageData = pageData;
  }


  public AbilityPageQueryDTO pageNum(String pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * 当前页码，默认第一页
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "当前页码，默认第一页")

  public String getPageNum() {
    return pageNum;
  }


  public void setPageNum(String pageNum) {
    this.pageNum = pageNum;
  }


  public AbilityPageQueryDTO pageSize(String pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 每页记录数，默认10
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "每页记录数，默认10")

  public String getPageSize() {
    return pageSize;
  }


  public void setPageSize(String pageSize) {
    this.pageSize = pageSize;
  }


  public AbilityPageQueryDTO totalNumber(Integer totalNumber) {
    
    this.totalNumber = totalNumber;
    return this;
  }

   /**
   * 记录总数
   * @return totalNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "记录总数")

  public Integer getTotalNumber() {
    return totalNumber;
  }


  public void setTotalNumber(Integer totalNumber) {
    this.totalNumber = totalNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbilityPageQueryDTO abilityPageQueryDTO = (AbilityPageQueryDTO) o;
    return Objects.equals(this.pageData, abilityPageQueryDTO.pageData) &&
        Objects.equals(this.pageNum, abilityPageQueryDTO.pageNum) &&
        Objects.equals(this.pageSize, abilityPageQueryDTO.pageSize) &&
        Objects.equals(this.totalNumber, abilityPageQueryDTO.totalNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageData, pageNum, pageSize, totalNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbilityPageQueryDTO {\n");
    sb.append("    pageData: ").append(toIndentedString(pageData)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalNumber: ").append(toIndentedString(totalNumber)).append("\n");
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
    openapiFields.add("page_data");
    openapiFields.add("page_num");
    openapiFields.add("page_size");
    openapiFields.add("total_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AbilityPageQueryDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AbilityPageQueryDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AbilityPageQueryDTO is not found in the empty JSON string", AbilityPageQueryDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AbilityPageQueryDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AbilityPageQueryDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraypageData = jsonObj.getAsJsonArray("page_data");
      if (jsonArraypageData != null) {
        // ensure the json data is an array
        if (!jsonObj.get("page_data").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `page_data` to be an array in the JSON string but got `%s`", jsonObj.get("page_data").toString()));
        }

        // validate the optional field `page_data` (array)
        for (int i = 0; i < jsonArraypageData.size(); i++) {
          SearchAbilityOrderData.validateJsonObject(jsonArraypageData.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("page_num") != null && !jsonObj.get("page_num").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_num` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_num").toString()));
      }
      if (jsonObj.get("page_size") != null && !jsonObj.get("page_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_size").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AbilityPageQueryDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AbilityPageQueryDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AbilityPageQueryDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AbilityPageQueryDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<AbilityPageQueryDTO>() {
           @Override
           public void write(JsonWriter out, AbilityPageQueryDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AbilityPageQueryDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AbilityPageQueryDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AbilityPageQueryDTO
  * @throws IOException if the JSON string is invalid with respect to AbilityPageQueryDTO
  */
  public static AbilityPageQueryDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AbilityPageQueryDTO.class);
  }

 /**
  * Convert an instance of AbilityPageQueryDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

