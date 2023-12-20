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
 * AlipayIserviceCcmSwArticleBatchqueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayIserviceCcmSwArticleBatchqueryModel {
  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private Integer categoryId;

  public static final String SERIALIZED_NAME_CCS_INSTANCE_ID = "ccs_instance_id";
  @SerializedName(SERIALIZED_NAME_CCS_INSTANCE_ID)
  private String ccsInstanceId;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_IDS = "ids";
  @SerializedName(SERIALIZED_NAME_IDS)
  private List<Integer> ids = null;

  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<String> keywords = null;

  public static final String SERIALIZED_NAME_LIBRARY_ID = "library_id";
  @SerializedName(SERIALIZED_NAME_LIBRARY_ID)
  private Integer libraryId;

  public static final String SERIALIZED_NAME_PAGE_NUM = "page_num";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private Integer pageNum;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_SEARCH_ALL_CATEGORY = "search_all_category";
  @SerializedName(SERIALIZED_NAME_SEARCH_ALL_CATEGORY)
  private Boolean searchAllCategory;

  public static final String SERIALIZED_NAME_SEARCH_CATEGORY_TYPE = "search_category_type";
  @SerializedName(SERIALIZED_NAME_SEARCH_CATEGORY_TYPE)
  private String searchCategoryType;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public AlipayIserviceCcmSwArticleBatchqueryModel() { 
  }

  public AlipayIserviceCcmSwArticleBatchqueryModel categoryId(Integer categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * 所属类目ID，如果search_all_category为true则不用填
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "所属类目ID，如果search_all_category为true则不用填")

  public Integer getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }


  public AlipayIserviceCcmSwArticleBatchqueryModel ccsInstanceId(String ccsInstanceId) {
    
    this.ccsInstanceId = ccsInstanceId;
    return this;
  }

   /**
   * 子部门ID，不传为默认部门
   * @return ccsInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ZPNASDK", value = "子部门ID，不传为默认部门")

  public String getCcsInstanceId() {
    return ccsInstanceId;
  }


  public void setCcsInstanceId(String ccsInstanceId) {
    this.ccsInstanceId = ccsInstanceId;
  }


  public AlipayIserviceCcmSwArticleBatchqueryModel endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 结束时间，并且开始时间不能为空
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-12-31 23:59:59", value = "结束时间，并且开始时间不能为空")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public AlipayIserviceCcmSwArticleBatchqueryModel ids(List<Integer> ids) {
    
    this.ids = ids;
    return this;
  }

  public AlipayIserviceCcmSwArticleBatchqueryModel addIdsItem(Integer idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * 文章ID集合
   * @return ids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[1,12]", value = "文章ID集合")

  public List<Integer> getIds() {
    return ids;
  }


  public void setIds(List<Integer> ids) {
    this.ids = ids;
  }


  public AlipayIserviceCcmSwArticleBatchqueryModel keyword(String keyword) {
    
    this.keyword = keyword;
    return this;
  }

   /**
   * 关键字
   * @return keyword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "支付宝", value = "关键字")

  public String getKeyword() {
    return keyword;
  }


  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public AlipayIserviceCcmSwArticleBatchqueryModel keywords(List<String> keywords) {
    
    this.keywords = keywords;
    return this;
  }

  public AlipayIserviceCcmSwArticleBatchqueryModel addKeywordsItem(String keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * 标签
   * @return keywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"关键\",\"核心\"]", value = "标签")

  public List<String> getKeywords() {
    return keywords;
  }


  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }


  public AlipayIserviceCcmSwArticleBatchqueryModel libraryId(Integer libraryId) {
    
    this.libraryId = libraryId;
    return this;
  }

   /**
   * 知识库ID
   * @return libraryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "知识库ID")

  public Integer getLibraryId() {
    return libraryId;
  }


  public void setLibraryId(Integer libraryId) {
    this.libraryId = libraryId;
  }


  public AlipayIserviceCcmSwArticleBatchqueryModel pageNum(Integer pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * 页数，page_size不能为空
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "页数，page_size不能为空")

  public Integer getPageNum() {
    return pageNum;
  }


  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }


  public AlipayIserviceCcmSwArticleBatchqueryModel pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 页大小，page_num不能为空
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "页大小，page_num不能为空")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayIserviceCcmSwArticleBatchqueryModel searchAllCategory(Boolean searchAllCategory) {
    
    this.searchAllCategory = searchAllCategory;
    return this;
  }

   /**
   * 是否搜索所有类目，如果为true则不用填写category_id值
   * @return searchAllCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否搜索所有类目，如果为true则不用填写category_id值")

  public Boolean getSearchAllCategory() {
    return searchAllCategory;
  }


  public void setSearchAllCategory(Boolean searchAllCategory) {
    this.searchAllCategory = searchAllCategory;
  }


  public AlipayIserviceCcmSwArticleBatchqueryModel searchCategoryType(String searchCategoryType) {
    
    this.searchCategoryType = searchCategoryType;
    return this;
  }

   /**
   * Current（搜索当前节点）； Children（搜索当前节点以及子节点）
   * @return searchCategoryType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Current", value = "Current（搜索当前节点）； Children（搜索当前节点以及子节点）")

  public String getSearchCategoryType() {
    return searchCategoryType;
  }


  public void setSearchCategoryType(String searchCategoryType) {
    this.searchCategoryType = searchCategoryType;
  }


  public AlipayIserviceCcmSwArticleBatchqueryModel startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 开始时间，并且结束时间不能为空
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-12-31 00:00:01", value = "开始时间，并且结束时间不能为空")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public AlipayIserviceCcmSwArticleBatchqueryModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 状态，PUBLISHED（已发布），UNPUBLISH（未发布），EXPIRED（失效），DELETED（已删除）
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PUBLISHED", value = "状态，PUBLISHED（已发布），UNPUBLISH（未发布），EXPIRED（失效），DELETED（已删除）")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayIserviceCcmSwArticleBatchqueryModel alipayIserviceCcmSwArticleBatchqueryModel = (AlipayIserviceCcmSwArticleBatchqueryModel) o;
    return Objects.equals(this.categoryId, alipayIserviceCcmSwArticleBatchqueryModel.categoryId) &&
        Objects.equals(this.ccsInstanceId, alipayIserviceCcmSwArticleBatchqueryModel.ccsInstanceId) &&
        Objects.equals(this.endTime, alipayIserviceCcmSwArticleBatchqueryModel.endTime) &&
        Objects.equals(this.ids, alipayIserviceCcmSwArticleBatchqueryModel.ids) &&
        Objects.equals(this.keyword, alipayIserviceCcmSwArticleBatchqueryModel.keyword) &&
        Objects.equals(this.keywords, alipayIserviceCcmSwArticleBatchqueryModel.keywords) &&
        Objects.equals(this.libraryId, alipayIserviceCcmSwArticleBatchqueryModel.libraryId) &&
        Objects.equals(this.pageNum, alipayIserviceCcmSwArticleBatchqueryModel.pageNum) &&
        Objects.equals(this.pageSize, alipayIserviceCcmSwArticleBatchqueryModel.pageSize) &&
        Objects.equals(this.searchAllCategory, alipayIserviceCcmSwArticleBatchqueryModel.searchAllCategory) &&
        Objects.equals(this.searchCategoryType, alipayIserviceCcmSwArticleBatchqueryModel.searchCategoryType) &&
        Objects.equals(this.startTime, alipayIserviceCcmSwArticleBatchqueryModel.startTime) &&
        Objects.equals(this.status, alipayIserviceCcmSwArticleBatchqueryModel.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, ccsInstanceId, endTime, ids, keyword, keywords, libraryId, pageNum, pageSize, searchAllCategory, searchCategoryType, startTime, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayIserviceCcmSwArticleBatchqueryModel {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    ccsInstanceId: ").append(toIndentedString(ccsInstanceId)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    libraryId: ").append(toIndentedString(libraryId)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    searchAllCategory: ").append(toIndentedString(searchAllCategory)).append("\n");
    sb.append("    searchCategoryType: ").append(toIndentedString(searchCategoryType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("category_id");
    openapiFields.add("ccs_instance_id");
    openapiFields.add("end_time");
    openapiFields.add("ids");
    openapiFields.add("keyword");
    openapiFields.add("keywords");
    openapiFields.add("library_id");
    openapiFields.add("page_num");
    openapiFields.add("page_size");
    openapiFields.add("search_all_category");
    openapiFields.add("search_category_type");
    openapiFields.add("start_time");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayIserviceCcmSwArticleBatchqueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayIserviceCcmSwArticleBatchqueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayIserviceCcmSwArticleBatchqueryModel is not found in the empty JSON string", AlipayIserviceCcmSwArticleBatchqueryModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayIserviceCcmSwArticleBatchqueryModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayIserviceCcmSwArticleBatchqueryModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("ccs_instance_id") != null && !jsonObj.get("ccs_instance_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ccs_instance_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ccs_instance_id").toString()));
      }
      if (jsonObj.get("end_time") != null && !jsonObj.get("end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_time").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("ids") != null && !jsonObj.get("ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ids` to be an array in the JSON string but got `%s`", jsonObj.get("ids").toString()));
      }
      if (jsonObj.get("keyword") != null && !jsonObj.get("keyword").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyword` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyword").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("keywords") != null && !jsonObj.get("keywords").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `keywords` to be an array in the JSON string but got `%s`", jsonObj.get("keywords").toString()));
      }
      if (jsonObj.get("search_category_type") != null && !jsonObj.get("search_category_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `search_category_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("search_category_type").toString()));
      }
      if (jsonObj.get("start_time") != null && !jsonObj.get("start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_time").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayIserviceCcmSwArticleBatchqueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayIserviceCcmSwArticleBatchqueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayIserviceCcmSwArticleBatchqueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayIserviceCcmSwArticleBatchqueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayIserviceCcmSwArticleBatchqueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayIserviceCcmSwArticleBatchqueryModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayIserviceCcmSwArticleBatchqueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayIserviceCcmSwArticleBatchqueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayIserviceCcmSwArticleBatchqueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayIserviceCcmSwArticleBatchqueryModel
  */
  public static AlipayIserviceCcmSwArticleBatchqueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayIserviceCcmSwArticleBatchqueryModel.class);
  }

 /**
  * Convert an instance of AlipayIserviceCcmSwArticleBatchqueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

